package flm;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.chimera.AsyncTaskLoader;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cab extends AsyncTaskLoader {
    cab(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dvi loadInBackground() {
        dvi dviVarB;
        Context context = getContext();
        bsr bsrVarA = bsq.a(context);
        try {
            try {
                String storedSupervisedAccountName = bsrVarA.a().getStoredSupervisedAccountName();
                if (TextUtils.isEmpty(storedSupervisedAccountName)) {
                    dviVarB = dur.a;
                    bsq.a(context, bsrVarA);
                } else {
                    String str = storedSupervisedAccountName;
                    for (buh buhVar : bug.a(context)) {
                        str = buhVar.b.equals(storedSupervisedAccountName) ? buhVar.d : str;
                    }
                    dviVarB = dvi.b(str);
                    bsq.a(context, bsrVarA);
                }
                return dviVarB;
            } catch (RemoteException | alt | bxi | IOException e) {
                throw new IllegalStateException("Failed to load user name", e);
            }
        } catch (Throwable th) {
            bsq.a(context, bsrVarA);
            throw th;
        }
    }
}
