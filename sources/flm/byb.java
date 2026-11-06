package flm;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byb extends AsyncTaskLoader {
    private boolean a;
    private String b;

    byb(Context context) {
        super(context);
        this.a = false;
        this.b = null;
    }

    protected final void onStartLoading() {
        if (this.a) {
            deliverResult(dvi.c(this.b));
        }
        if (takeContentChanged() || !this.a) {
            forceLoad();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dvi loadInBackground() {
        bsr bsrVarA = bsq.a(getContext());
        try {
            this.b = bsrVarA.a().getStoredSupervisedAccountName();
            btv.b("TimeLimit", "Get supervised account:%s", this.b);
            this.a = true;
        } catch (Exception e) {
            btv.d("TimeLimit", "Failed to get supervised account, ignore", new Object[0]);
        } finally {
            bsq.a(getContext(), bsrVarA);
        }
        return dvi.c(this.b);
    }

    protected final void onReset() {
        super.onReset();
        this.a = false;
        this.b = null;
    }
}
