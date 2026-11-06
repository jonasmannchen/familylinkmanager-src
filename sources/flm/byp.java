package flm;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byp extends AsyncTaskLoader {
    private final Context a;
    private final String b;
    private Boolean c;

    byp(Context context, String str) {
        super(context.getApplicationContext());
        this.a = context.getApplicationContext();
        this.b = str;
        this.c = null;
    }

    protected final void onStartLoading() {
        if (this.c != null) {
            deliverResult(this.c);
        }
    }

    protected final void onForceLoad() {
        deliverResult(null);
        super.onForceLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean loadInBackground() {
        if (this.c == null) {
            bsr bsrVarA = bsq.a(this.a);
            try {
                this.c = Boolean.valueOf(bsrVarA.a().verifyParentAccessCode(this.b));
            } catch (Exception e) {
                this.c = false;
                btv.c("TimeLimit", e, "verify parent access code failed", new Object[0]);
            } finally {
                bsq.a(this.a, bsrVarA);
            }
        }
        return this.c;
    }
}
