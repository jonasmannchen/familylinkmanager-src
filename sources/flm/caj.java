package flm;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class caj extends AsyncTaskLoader {
    private final String a;
    private Boolean b;

    caj(Context context, String str) {
        super(context);
        this.a = str;
        this.b = null;
    }

    protected final void onStartLoading() {
        if (this.b != null) {
            deliverResult(this.b);
        }
    }

    protected final void onForceLoad() {
        deliverResult(null);
        super.onForceLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean loadInBackground() {
        if (this.b == null) {
            bsr bsrVarA = bsq.a(getContext());
            try {
                this.b = Boolean.valueOf(bsrVarA.a().verifyParentAccessCode(this.a));
            } catch (Throwable th) {
                this.b = false;
                btv.c("MemberSpvsn", th, "verify parent access code failed", new Object[0]);
            } finally {
                bsq.a(getContext(), bsrVarA);
            }
        }
        return this.b;
    }
}
