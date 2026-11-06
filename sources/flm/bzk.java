package flm;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.chimera.AsyncTaskLoader;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzk extends AsyncTaskLoader {
    private buh a;

    bzk(Context context) {
        super(context);
    }

    protected final void onStartLoading() {
        if (this.a != null) {
            deliverResult(this.a);
        } else {
            forceLoad();
        }
    }

    private final buh a() {
        buh buhVar;
        Context context = getContext();
        bsr bsrVarA = bsq.a(context);
        try {
            try {
                final String storedSupervisedAccountName = bsrVarA.a().getStoredSupervisedAccountName();
                buhVar = (buh) dyk.c(bug.a(context), new dvm(storedSupervisedAccountName) { // from class: flm.bzl
                    private final String a;

                    {
                        this.a = storedSupervisedAccountName;
                    }

                    @Override // flm.dvm
                    public final boolean a(Object obj) {
                        return ((buh) obj).b.equals(this.a);
                    }
                }).c();
            } catch (RemoteException | alt | bxi | IOException e) {
                btv.c("MemberSpvsn", e, "Failed to retrieve the supervised account info", new Object[0]);
                bsq.a(context, bsrVarA);
                buhVar = null;
            }
            return buhVar;
        } finally {
            bsq.a(context, bsrVarA);
        }
    }

    public final void onContentChanged() {
        this.a = null;
        super.onContentChanged();
    }

    protected final void onReset() {
        this.a = null;
    }

    public final /* synthetic */ Object loadInBackground() {
        this.a = a();
        return this.a;
    }
}
