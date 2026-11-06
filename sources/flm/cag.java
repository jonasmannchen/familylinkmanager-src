package flm;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cag extends AsyncTaskLoader {
    cag(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean loadInBackground() {
        boolean z;
        btv.c("MemberSpvsn", "Sending OptOutSupervisionRequest", new Object[0]);
        bsr bsrVarA = bsq.a(getContext());
        try {
            IKidsInternalService iKidsInternalServiceA = bsrVarA.a();
            iKidsInternalServiceA.optOutSupervision();
            iKidsInternalServiceA.setMemberSvExitState(3);
            z = true;
        } catch (Exception e) {
            btv.c("MemberSpvsn", e, "Error occurred while opting out of supervision.", new Object[0]);
            z = false;
        } finally {
            bsq.a(getContext(), bsrVarA);
        }
        return z;
    }
}
