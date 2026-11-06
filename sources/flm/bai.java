package flm;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bai {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final int CONNECT_STATE_LOCAL_CONNECTING = 3;
    public static final int CONNECT_STATE_REMOTE_CONNECTING = 2;
    public static final boolean DBG = false;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final aqb[] EMPTY_FEATURES_ARRAY = new aqb[0];
    public static final String FEATURE_GOOGLE_ME = "service_googleme";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", FEATURE_GOOGLE_ME};
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    public static final String TAG = "GmsClient";
    public volatile bbe connectionInfo;
    public long lastConnectedTime;
    public int lastFailedStatusCode;
    public long lastFailedTime;
    public int lastSuspendedCause;
    public long lastSuspendedTime;
    public final aqf mApiAvailability;
    public final ArrayList mCallbackProxyList;
    public int mConnectState;
    public baq mConnection;
    public final bak mConnectionCallbacks;
    public final bal mConnectionFailedListener;
    public bao mConnectionProgressReportCallbacks;
    public final Context mContext;
    public bcb mCurrentServiceEndpoint;
    public AtomicInteger mDisconnectCount;
    public final int mGCoreServiceId;
    public final Handler mHandler;
    public boolean mLocalServiceFailedConnect;
    public final Object mLock;
    public final Looper mLooper;
    public final String mRealClientName;
    public apx mRemoteServiceFailedResult;
    public IInterface mService;
    public bcn mServiceBroker;
    public final Object mServiceBrokerLock;
    public final bbv mSupervisor;

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public abstract String getServiceDescriptor();

    public abstract String getStartServiceAction();

    protected bai(Context context, Looper looper, int i, bak bakVar, bal balVar, String str) {
        this(context, looper, bbv.getInstance(context), aqf.d, i, (bak) bdi.checkNotNull(bakVar), (bal) bdi.checkNotNull(balVar), str);
    }

    protected bai(Context context, Looper looper, bbv bbvVar, aqf aqfVar, int i, bak bakVar, bal balVar, String str) {
        this.mLock = new Object();
        this.mServiceBrokerLock = new Object();
        this.mCallbackProxyList = new ArrayList();
        this.mConnectState = 1;
        this.mRemoteServiceFailedResult = null;
        this.mLocalServiceFailedConnect = false;
        this.connectionInfo = null;
        this.mDisconnectCount = new AtomicInteger(0);
        this.mContext = (Context) bdi.checkNotNull(context, "Context must not be null");
        this.mLooper = (Looper) bdi.checkNotNull(looper, "Looper must not be null");
        this.mSupervisor = (bbv) bdi.checkNotNull(bbvVar, "Supervisor must not be null");
        this.mApiAvailability = (aqf) bdi.checkNotNull(aqfVar, "API availability must not be null");
        this.mHandler = new bam(this, looper);
        this.mGCoreServiceId = i;
        this.mConnectionCallbacks = bakVar;
        this.mConnectionFailedListener = balVar;
        this.mRealClientName = str;
    }

    protected bai(Context context, Handler handler, bbv bbvVar, aqf aqfVar, int i, bak bakVar, bal balVar) {
        this.mLock = new Object();
        this.mServiceBrokerLock = new Object();
        this.mCallbackProxyList = new ArrayList();
        this.mConnectState = 1;
        this.mRemoteServiceFailedResult = null;
        this.mLocalServiceFailedConnect = false;
        this.connectionInfo = null;
        this.mDisconnectCount = new AtomicInteger(0);
        this.mContext = (Context) bdi.checkNotNull(context, "Context must not be null");
        this.mHandler = (Handler) bdi.checkNotNull(handler, "Handler must not be null");
        this.mLooper = handler.getLooper();
        this.mSupervisor = (bbv) bdi.checkNotNull(bbvVar, "Supervisor must not be null");
        this.mApiAvailability = (aqf) bdi.checkNotNull(aqfVar, "API availability must not be null");
        this.mGCoreServiceId = i;
        this.mConnectionCallbacks = bakVar;
        this.mConnectionFailedListener = balVar;
        this.mRealClientName = null;
    }

    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    protected int getServiceBindFlags() {
        return bbv.DEFAULT_BIND_FLAGS;
    }

    protected final String getRealClientName() {
        return this.mRealClientName == null ? this.mContext.getClass().getName() : this.mRealClientName;
    }

    protected String getLocalStartServiceAction() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionInfo(bbe bbeVar) {
        this.connectionInfo = bbeVar;
    }

    public void setConnectionInfoForTesting(bbe bbeVar) {
        setConnectionInfo(bbeVar);
    }

    public final aqb[] getAvailableFeatures() {
        bbe bbeVar = this.connectionInfo;
        if (bbeVar == null) {
            return null;
        }
        return bbeVar.getAvailableFeatures();
    }

    protected void onConnectedLocked(IInterface iInterface) {
        this.lastConnectedTime = System.currentTimeMillis();
    }

    protected void onConnectionSuspended(int i) {
        this.lastSuspendedCause = i;
        this.lastSuspendedTime = System.currentTimeMillis();
    }

    protected void onConnectionFailed(apx apxVar) {
        this.lastFailedStatusCode = apxVar.c;
        this.lastFailedTime = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectState(int i, IInterface iInterface) {
        bdi.checkArgument((i == 4) == (iInterface != null));
        synchronized (this.mLock) {
            this.mConnectState = i;
            this.mService = iInterface;
            onSetConnectState(i, iInterface);
            switch (i) {
                case 1:
                    unbindServiceLocked();
                    break;
                case 2:
                case 3:
                    bindServiceLocked();
                    break;
                case 4:
                    onConnectedLocked(iInterface);
                    break;
            }
        }
    }

    void onSetConnectState(int i, IInterface iInterface) {
    }

    private void bindServiceLocked() {
        if (this.mConnection != null && this.mCurrentServiceEndpoint != null) {
            String startAction = this.mCurrentServiceEndpoint.getStartAction();
            String packageName = this.mCurrentServiceEndpoint.getPackageName();
            Log.e(TAG, new StringBuilder(String.valueOf(startAction).length() + 70 + String.valueOf(packageName).length()).append("Calling connect() while still connected, missing disconnect() for ").append(startAction).append(" on ").append(packageName).toString());
            this.mSupervisor.unbindService(this.mCurrentServiceEndpoint.getStartAction(), this.mCurrentServiceEndpoint.getPackageName(), this.mCurrentServiceEndpoint.getBindFlags(), this.mConnection, getRealClientName());
            this.mDisconnectCount.incrementAndGet();
        }
        this.mConnection = new baq(this, this.mDisconnectCount.get());
        this.mCurrentServiceEndpoint = getServiceEndpoint();
        if (!this.mSupervisor.bindService(this.mCurrentServiceEndpoint.getStartAction(), this.mCurrentServiceEndpoint.getPackageName(), this.mCurrentServiceEndpoint.getBindFlags(), this.mConnection, getRealClientName())) {
            String startAction2 = this.mCurrentServiceEndpoint.getStartAction();
            String packageName2 = this.mCurrentServiceEndpoint.getPackageName();
            Log.e(TAG, new StringBuilder(String.valueOf(startAction2).length() + 34 + String.valueOf(packageName2).length()).append("unable to connect to service: ").append(startAction2).append(" on ").append(packageName2).toString());
            onPostServiceBindingHandler(16, null, this.mDisconnectCount.get());
        }
    }

    private void unbindServiceLocked() {
        if (this.mConnection != null) {
            this.mSupervisor.unbindService(this.mCurrentServiceEndpoint.getStartAction(), this.mCurrentServiceEndpoint.getPackageName(), this.mCurrentServiceEndpoint.getBindFlags(), this.mConnection, getRealClientName());
            this.mConnection = null;
        }
    }

    private bcb getServiceEndpoint() {
        if (this.mConnectState == 3 && getLocalStartServiceAction() != null) {
            return new bcb(getContext().getPackageName(), getLocalStartServiceAction(), true, getServiceBindFlags());
        }
        return new bcb(getStartServicePackage(), getStartServiceAction(), false, getServiceBindFlags());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean compareAndSetConnectState(int i, int i2, IInterface iInterface) {
        boolean z;
        synchronized (this.mLock) {
            if (this.mConnectState != i) {
                z = false;
            } else {
                setConnectState(i2, iInterface);
                z = true;
            }
        }
        return z;
    }

    public void checkAvailabilityAndConnect() {
        int iA = this.mApiAvailability.a(this.mContext, getMinApkVersion());
        if (iA != 0) {
            setConnectState(1, null);
            triggerNotAvailable(new bar(this), iA, null);
        } else {
            connect(new bar(this));
        }
    }

    public void connect(bao baoVar) {
        this.mConnectionProgressReportCallbacks = (bao) bdi.checkNotNull(baoVar, "Connection progress callbacks cannot be null.");
        setConnectState(2, null);
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mConnectState == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mConnectState == 2 || this.mConnectState == 3;
        }
        return z;
    }

    private boolean isConnectingLocally() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mConnectState == 3;
        }
        return z;
    }

    public void disconnect() {
        this.mDisconnectCount.incrementAndGet();
        synchronized (this.mCallbackProxyList) {
            int size = this.mCallbackProxyList.size();
            for (int i = 0; i < size; i++) {
                ((ban) this.mCallbackProxyList.get(i)).removeListener();
            }
            this.mCallbackProxyList.clear();
        }
        synchronized (this.mServiceBrokerLock) {
            this.mServiceBroker = null;
        }
        setConnectState(1, null);
    }

    public void triggerConnectionSuspended(int i) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(6, this.mDisconnectCount.get(), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerServiceNotAvailable(int i) {
        int i2;
        if (isConnectingLocally()) {
            i2 = 5;
            this.mLocalServiceFailedConnect = true;
        } else {
            i2 = 4;
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(i2, this.mDisconnectCount.get(), i));
    }

    protected void triggerNotAvailable(bao baoVar, int i, PendingIntent pendingIntent) {
        this.mConnectionProgressReportCallbacks = (bao) bdi.checkNotNull(baoVar, "Connection progress callbacks cannot be null.");
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, this.mDisconnectCount.get(), i, pendingIntent));
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final Looper getLooper() {
        return this.mLooper;
    }

    public Account getAccount() {
        return null;
    }

    public aqb[] getRequiredFeatures() {
        return EMPTY_FEATURES_ARRAY;
    }

    public aqb[] getApiFeatures() {
        return EMPTY_FEATURES_ARRAY;
    }

    public final Account getAccountOrDefault() {
        return getAccount() != null ? getAccount() : new Account(DEFAULT_ACCOUNT, "com.google");
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, i2, -1, new bas(this, i, iBinder, bundle)));
    }

    protected void onPostServiceBindingHandler(int i, Bundle bundle, int i2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(7, i2, -1, new bat(this, i, bundle)));
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final Handler getHandlerForTesting() {
        return this.mHandler;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.mLock) {
            if (this.mConnectState == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            bdi.checkState(this.mService != null, "Client is connected but service is null");
            iInterface = this.mService;
        }
        return iInterface;
    }

    public final void setServiceForTesting(IInterface iInterface) {
        setConnectState(iInterface != null ? 4 : 1, iInterface);
    }

    public final void setServiceBrokerForTesting(bcn bcnVar) {
        synchronized (this.mServiceBrokerLock) {
            this.mServiceBroker = bcnVar;
        }
    }

    public final bcn getServiceBrokerForTesting() {
        bcn bcnVar;
        synchronized (this.mServiceBrokerLock) {
            bcnVar = this.mServiceBroker;
        }
        return bcnVar;
    }

    @Deprecated
    public final void doCallbackDEPRECATED(ban banVar) {
        synchronized (this.mCallbackProxyList) {
            this.mCallbackProxyList.add(banVar);
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, this.mDisconnectCount.get(), -1, banVar));
    }

    int getCallbackProxyListSizeForTest() {
        int size;
        synchronized (this.mCallbackProxyList) {
            size = this.mCallbackProxyList.size();
        }
        return size;
    }

    public void getRemoteService(bcd bcdVar, Set set) {
        bbn extraArgs = new bbn(this.mGCoreServiceId).setCallingPackage(this.mContext.getPackageName()).setExtraArgs(getGetServiceRequestExtraArgs());
        if (set != null) {
            extraArgs.setScopes(set);
        }
        if (requiresSignIn()) {
            extraArgs.setClientRequestedAccount(getAccountOrDefault()).setAuthenticatedAccount(bcdVar);
        } else if (requiresAccount()) {
            extraArgs.setClientRequestedAccount(getAccount());
        }
        extraArgs.setClientRequiredFeatures(getRequiredFeatures());
        extraArgs.setClientApiFeatures(getApiFeatures());
        try {
            synchronized (this.mServiceBrokerLock) {
                try {
                    if (this.mServiceBroker != null) {
                        this.mServiceBroker.getService(new bap(this, this.mDisconnectCount.get()), extraArgs);
                    } else {
                        Log.w(TAG, "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w(TAG, "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(1);
        } catch (RemoteException e2) {
            e = e2;
            Log.w(TAG, "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.mDisconnectCount.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w(TAG, "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.mDisconnectCount.get());
        }
    }

    protected boolean enableLocalFallback() {
        return false;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void onUserSignOut(bau bauVar) {
        bauVar.onSignOutComplete();
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean providesSignIn() {
        return false;
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    protected Set getScopes() {
        return Collections.EMPTY_SET;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        bcn bcnVar;
        synchronized (this.mLock) {
            i = this.mConnectState;
            iInterface = this.mService;
        }
        synchronized (this.mServiceBrokerLock) {
            bcnVar = this.mServiceBroker;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("REMOTE_CONNECTING");
                break;
            case 3:
                printWriter.print("LOCAL_CONNECTING");
                break;
            case 4:
                printWriter.print("CONNECTED");
                break;
            case 5:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (bcnVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(bcnVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.lastConnectedTime > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.lastConnectedTime;
            String str2 = simpleDateFormat.format(new Date(this.lastConnectedTime));
            printWriterAppend.println(new StringBuilder(String.valueOf(str2).length() + 21).append(j).append(" ").append(str2).toString());
        }
        if (this.lastSuspendedTime > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            switch (this.lastSuspendedCause) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append((CharSequence) String.valueOf(this.lastSuspendedCause));
                    break;
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.lastSuspendedTime;
            String str3 = simpleDateFormat.format(new Date(this.lastSuspendedTime));
            printWriterAppend2.println(new StringBuilder(String.valueOf(str3).length() + 21).append(j2).append(" ").append(str3).toString());
        }
        if (this.lastFailedTime > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) atl.a(this.lastFailedStatusCode));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.lastFailedTime;
            String str4 = simpleDateFormat.format(new Date(this.lastFailedTime));
            printWriterAppend3.println(new StringBuilder(String.valueOf(str4).length() + 21).append(j3).append(" ").append(str4).toString());
        }
    }

    public IBinder getServiceBrokerBinder() {
        IBinder iBinderAsBinder;
        synchronized (this.mServiceBrokerLock) {
            iBinderAsBinder = this.mServiceBroker == null ? null : this.mServiceBroker.asBinder();
        }
        return iBinderAsBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLocalServicePresent() {
        if (this.mLocalServiceFailedConnect || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public String getEndpointPackageName() {
        if (isConnected() && this.mCurrentServiceEndpoint != null) {
            return this.mCurrentServiceEndpoint.getPackageName();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getMinApkVersion() {
        return aqf.c;
    }
}
