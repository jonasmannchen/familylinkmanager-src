package flm;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.chimera.AsyncTaskLoader;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzn extends AsyncTaskLoader {
    private AtomicBoolean a;

    bzn(Context context) {
        super(context);
        this.a = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Void loadInBackground() {
        if (!this.a.getAndSet(true)) {
            bsr bsrVarA = bsq.a(getContext());
            try {
                try {
                    bsrVarA.a().revokeSupervision();
                } catch (RemoteException | bxi e) {
                    btv.c("MemberSpvsn", e, "Failed to revoke supervision!", new Object[0]);
                    this.a.set(false);
                    bsq.a(getContext(), bsrVarA);
                }
                return null;
            } finally {
                bsq.a(getContext(), bsrVarA);
            }
        }
        return null;
    }
}
