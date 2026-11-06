package flm;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.RemoteException;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitLockdownFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzx extends AsyncTaskLoader {
    private CountDownTimer a;

    bzx(Context context) {
        super(context);
    }

    protected final void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    protected final void onStopLoading() {
        super.onStopLoading();
        if (this.a != null) {
            this.a.cancel();
            this.a = null;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void deliverResult(bzg bzgVar) {
        super.deliverResult(bzgVar);
        if (bzgVar != null && bzgVar.b > 0 && this.a == null && bzgVar.d) {
            this.a = new bzz(this, bzgVar.b, MemberSvExitLockdownFragment.a, bzgVar).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bzg loadInBackground() {
        bsr bsrVarA = bsq.a(getContext());
        try {
            try {
                bzg bzgVar = (bzg) btc.a(bsrVarA.a().getLockdownInfo(), bzy.a);
                bsq.a(getContext(), bsrVarA);
                return bzgVar;
            } catch (RemoteException | bxi | fjg e) {
                throw new IllegalStateException("Failed to load millis remaining", e);
            }
        } catch (Throwable th) {
            bsq.a(getContext(), bsrVarA);
            throw th;
        }
    }
}
