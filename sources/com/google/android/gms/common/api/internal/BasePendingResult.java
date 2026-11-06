package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import flm.atp;
import flm.att;
import flm.atu;
import flm.atv;
import flm.aty;
import flm.atz;
import flm.aub;
import flm.auc;
import flm.auf;
import flm.avb;
import flm.avc;
import flm.avd;
import flm.ayl;
import flm.ayr;
import flm.bcg;
import flm.bdi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult extends att {
    public static final String TAG = "BasePendingResult";
    public static final ThreadLocal sTransformRunning = new avb();
    public final WeakReference mApiClient;
    public atz mCallback;
    public bcg mCancelToken;
    public boolean mCanceled;
    public volatile boolean mConsumed;
    public final AtomicReference mConsumedCallback;
    public boolean mForcedFailure;
    public final avc mHandler;
    public boolean mIsInChain;
    public final CountDownLatch mLatch;
    public aty mResult;

    @KeepName
    public avd mResultGuardian;
    public Integer mResultId;
    public Status mStatus;
    public final ArrayList mStatusListeners;
    public final Object mSyncToken;
    public volatile ayl mTransformRoot;

    @Deprecated
    BasePendingResult() {
        this.mSyncToken = new Object();
        this.mLatch = new CountDownLatch(1);
        this.mStatusListeners = new ArrayList();
        this.mConsumedCallback = new AtomicReference();
        this.mIsInChain = false;
        this.mHandler = new avc(Looper.getMainLooper());
        this.mApiClient = new WeakReference(null);
    }

    public abstract aty createFailedResult(Status status);

    public BasePendingResult(atp atpVar) {
        this.mSyncToken = new Object();
        this.mLatch = new CountDownLatch(1);
        this.mStatusListeners = new ArrayList();
        this.mConsumedCallback = new AtomicReference();
        this.mIsInChain = false;
        this.mHandler = new avc(atpVar != null ? atpVar.a() : Looper.getMainLooper());
        this.mApiClient = new WeakReference(atpVar);
    }

    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.mSyncToken = new Object();
        this.mLatch = new CountDownLatch(1);
        this.mStatusListeners = new ArrayList();
        this.mConsumedCallback = new AtomicReference();
        this.mIsInChain = false;
        this.mHandler = new avc(looper);
        this.mApiClient = new WeakReference(null);
    }

    public BasePendingResult(avc avcVar) {
        this.mSyncToken = new Object();
        this.mLatch = new CountDownLatch(1);
        this.mStatusListeners = new ArrayList();
        this.mConsumedCallback = new AtomicReference();
        this.mIsInChain = false;
        this.mHandler = (avc) bdi.checkNotNull(avcVar, "CallbackHandler must not be null");
        this.mApiClient = new WeakReference(null);
    }

    public final boolean isReady() {
        return this.mLatch.getCount() == 0;
    }

    @Override // flm.att
    public final aty await() {
        bdi.checkNotMainThread("await must not be called on the UI thread");
        bdi.checkState(!this.mConsumed, "Result has already been consumed");
        bdi.checkState(this.mTransformRoot == null, "Cannot await if then() has been called.");
        try {
            this.mLatch.await();
        } catch (InterruptedException e) {
            forceFailureUnlessReady(Status.b);
        }
        bdi.checkState(isReady(), "Result is not ready.");
        return get();
    }

    @Override // flm.att
    public final aty await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            bdi.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        bdi.checkState(!this.mConsumed, "Result has already been consumed.");
        bdi.checkState(this.mTransformRoot == null, "Cannot await if then() has been called.");
        try {
            if (!this.mLatch.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.d);
            }
        } catch (InterruptedException e) {
            forceFailureUnlessReady(Status.b);
        }
        bdi.checkState(isReady(), "Result is not ready.");
        return get();
    }

    @Override // flm.att
    public final void setResultCallback(atz atzVar) {
        synchronized (this.mSyncToken) {
            try {
                if (atzVar == null) {
                    this.mCallback = null;
                    return;
                }
                bdi.checkState(!this.mConsumed, "Result has already been consumed.");
                bdi.checkState(this.mTransformRoot == null, "Cannot set callbacks if then() has been called.");
                if (!isCanceled()) {
                    if (isReady()) {
                        this.mHandler.a(atzVar, get());
                    } else {
                        this.mCallback = atzVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // flm.att
    public final void setResultCallback(atz atzVar, long j, TimeUnit timeUnit) {
        synchronized (this.mSyncToken) {
            try {
                if (atzVar == null) {
                    this.mCallback = null;
                    return;
                }
                bdi.checkState(!this.mConsumed, "Result has already been consumed.");
                bdi.checkState(this.mTransformRoot == null, "Cannot set callbacks if then() has been called.");
                if (!isCanceled()) {
                    if (isReady()) {
                        this.mHandler.a(atzVar, get());
                    } else {
                        this.mCallback = atzVar;
                        avc avcVar = this.mHandler;
                        avcVar.sendMessageDelayed(avcVar.obtainMessage(2, this), timeUnit.toMillis(j));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // flm.att
    public final void addStatusListener(atu atuVar) {
        bdi.checkArgument(atuVar != null, "Callback cannot be null.");
        synchronized (this.mSyncToken) {
            if (isReady()) {
                atuVar.onComplete(this.mStatus);
            } else {
                this.mStatusListeners.add(atuVar);
            }
        }
    }

    @Override // flm.att
    public void cancel() {
        synchronized (this.mSyncToken) {
            if (!this.mCanceled && !this.mConsumed) {
                if (this.mCancelToken != null) {
                    try {
                        this.mCancelToken.cancel();
                    } catch (RemoteException e) {
                    }
                }
                maybeReleaseResult(this.mResult);
                this.mCanceled = true;
                setResultAndNotifyListeners(createFailedResult(Status.e));
            }
        }
    }

    public boolean cancelUnlessTransform() {
        boolean zIsCanceled;
        synchronized (this.mSyncToken) {
            if (((atp) this.mApiClient.get()) == null || !this.mIsInChain) {
                cancel();
            }
            zIsCanceled = isCanceled();
        }
        return zIsCanceled;
    }

    @Override // flm.att
    public boolean isCanceled() {
        boolean z;
        synchronized (this.mSyncToken) {
            z = this.mCanceled;
        }
        return z;
    }

    @Override // flm.att
    public auf then(auc aucVar) {
        auf aufVarA;
        bdi.checkState(!this.mConsumed, "Result has already been consumed.");
        synchronized (this.mSyncToken) {
            bdi.checkState(this.mTransformRoot == null, "Cannot call then() twice.");
            bdi.checkState(this.mCallback == null, "Cannot call then() if callbacks are set.");
            bdi.checkState(this.mCanceled ? false : true, "Cannot call then() if result was canceled.");
            this.mIsInChain = true;
            this.mTransformRoot = new ayl(this.mApiClient);
            aufVarA = this.mTransformRoot.a(aucVar);
            if (isReady()) {
                this.mHandler.a(this.mTransformRoot, get());
            } else {
                this.mCallback = this.mTransformRoot;
            }
        }
        return aufVarA;
    }

    public final void setResult(aty atyVar) {
        synchronized (this.mSyncToken) {
            if (this.mForcedFailure || this.mCanceled || (isReady() && allowMultipleSetResult())) {
                maybeReleaseResult(atyVar);
                return;
            }
            bdi.checkState(!isReady(), "Results have already been set");
            bdi.checkState(this.mConsumed ? false : true, "Result has already been consumed");
            setResultAndNotifyListeners(atyVar);
        }
    }

    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.mSyncToken) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.mForcedFailure = true;
            }
        }
    }

    private void onResultConsumed() {
        ayr ayrVar = (ayr) this.mConsumedCallback.getAndSet(null);
        if (ayrVar != null) {
            ayrVar.a(this);
        }
    }

    public void setResultConsumedCallback(ayr ayrVar) {
        this.mConsumedCallback.set(ayrVar);
    }

    public void clearResultCallback() {
        setResultCallback(null);
    }

    @Override // flm.att
    public Integer getResultId() {
        return this.mResultId;
    }

    @Override // flm.att
    public void setResultId(int i) {
        bdi.checkArgument(this.mResultId == null, "PendingResult should only be stored once.");
        this.mResultId = Integer.valueOf(i);
    }

    protected final void setCancelToken(bcg bcgVar) {
        synchronized (this.mSyncToken) {
            this.mCancelToken = bcgVar;
        }
    }

    public void maybeMarkChain() {
        this.mIsInChain = this.mIsInChain || ((Boolean) sTransformRunning.get()).booleanValue();
    }

    private aty get() {
        aty atyVar;
        synchronized (this.mSyncToken) {
            bdi.checkState(this.mConsumed ? false : true, "Result has already been consumed.");
            bdi.checkState(isReady(), "Result is not ready.");
            atyVar = this.mResult;
            this.mResult = null;
            this.mCallback = null;
            this.mConsumed = true;
        }
        onResultConsumed();
        return atyVar;
    }

    @Override // flm.att
    public void store(aub aubVar, int i) {
        bdi.checkNotNull(aubVar, "ResultStore must not be null.");
        synchronized (this.mSyncToken) {
            bdi.checkState(!this.mConsumed, "Result has already been consumed.");
            aub.a();
        }
    }

    boolean allowMultipleSetResult() {
        return false;
    }

    private void setResultAndNotifyListeners(aty atyVar) {
        this.mResult = atyVar;
        this.mCancelToken = null;
        this.mLatch.countDown();
        this.mStatus = this.mResult.b();
        if (this.mCanceled) {
            this.mCallback = null;
        } else if (this.mCallback == null) {
            if (this.mResult instanceof atv) {
                this.mResultGuardian = new avd(this);
            }
        } else {
            this.mHandler.removeMessages(2);
            this.mHandler.a(this.mCallback, get());
        }
        ArrayList arrayList = this.mStatusListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((atu) obj).onComplete(this.mStatus);
        }
        this.mStatusListeners.clear();
    }

    public static void maybeReleaseResult(aty atyVar) {
        if (atyVar instanceof atv) {
            try {
                ((atv) atyVar).a();
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(atyVar);
                Log.w(TAG, new StringBuilder(String.valueOf(strValueOf).length() + 18).append("Unable to release ").append(strValueOf).toString(), e);
            }
        }
    }
}
