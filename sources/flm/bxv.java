package flm;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxv extends AsyncTaskLoader {
    bxv(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean loadInBackground() {
        boolean z;
        bsr bsrVarA = bsq.a(getContext());
        try {
            bsrVarA.a().unlockTimeLimit();
            z = true;
        } catch (Exception e) {
            btv.c("TimeLimit", e, "Failed to unlock time limit.", new Object[0]);
            z = false;
        } finally {
            bsq.a(getContext(), bsrVarA);
        }
        return z;
    }
}
