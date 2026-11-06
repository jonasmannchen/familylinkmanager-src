package flm;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cuq extends cue {
    private final /* synthetic */ Account a;
    private final /* synthetic */ cui b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cuq(atp atpVar, Account account, cui cuiVar) {
        super(atpVar);
        this.a = account;
        this.b = cuiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public final /* synthetic */ void doExecute(asy asyVar) {
        cus cusVar = (cus) asyVar;
        String str = this.a.name;
        cui cuiVar = this.b;
        cusVar.checkConnected();
        ((cul) cusVar.getService()).a(str, cuiVar);
        setResult((aty) Status.a);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ aty createFailedResult(Status status) {
        return status;
    }
}
