package flm;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.chimera.AsyncTaskLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzw extends AsyncTaskLoader {
    bzw(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer loadInBackground() {
        int iValueOf;
        btv.c("MemberSpvsn", "check geller state", new Object[0]);
        bsr bsrVarA = null;
        try {
            try {
                bsrVarA = bsq.a(getContext());
                iValueOf = Integer.valueOf(bsrVarA.a().getMemberSvExitState());
            } catch (RemoteException | bxi e) {
                btv.c("MemberSpvsn", e, "Error getting member supervision exit state", new Object[0]);
                iValueOf = 0;
                if (bsrVarA != null) {
                    bsq.a(getContext(), bsrVarA);
                }
            }
            return iValueOf;
        } finally {
            if (bsrVarA != null) {
                bsq.a(getContext(), bsrVarA);
            }
        }
    }
}
