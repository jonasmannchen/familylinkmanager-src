package flm;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byk extends AsyncTaskLoader {
    byk(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean loadInBackground() {
        boolean z;
        btv.b("TimeLimit", "AccountInterceptor: RemoveSupervision", new Object[0]);
        bsr bsrVarA = bsq.a(getContext());
        try {
            bsrVarA.a().revokeSupervision();
            z = true;
        } catch (Exception e) {
            btv.c("TimeLimit", e, "Failed to revoke supervision!", new Object[0]);
            z = false;
        } finally {
            bsq.a(getContext(), bsrVarA);
        }
        return z;
    }

    protected final void onForceLoad() {
        deliverResult(null);
        super.onForceLoad();
    }
}
