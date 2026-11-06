package flm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.kids.database.SupervisionDatabase;
import com.google.android.gms.kids.internal.IKidsCursorWindowCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdt extends bol {
    private final IKidsCursorWindowCallback b;

    public cdt(IKidsCursorWindowCallback iKidsCursorWindowCallback) {
        super(42, "getAppliedTimeLimit");
        this.b = iKidsCursorWindowCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bol
    public final void a() {
        fee feeVar;
        SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
        try {
            bwg bwgVarB = supervisionDatabaseH.l().b(fdc.TYPE_TIME_LIMIT, "");
            dvl.a(bwgVarB);
            fco fcoVar = (fco) fin.b(fco.c, bwgVarB.f);
            if (fcoVar.b == null) {
                feeVar = fee.f;
            } else {
                feeVar = fcoVar.b;
            }
            this.b.onStatusCursorWindow(Status.a, cas.a(byv.a(supervisionDatabaseH, feeVar)));
        } catch (fjg e) {
            btv.c("KidsService", e, "getAppliedTimeLimit fails", new Object[0]);
            btt.a("KidsService", e, "getAppliedTimeLimit fails", new Object[0]);
            this.b.onStatusCursorWindow(Status.c, null);
        }
    }
}
