package flm;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cup extends cue {
    private final /* synthetic */ Account a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cup(atp atpVar, Account account) {
        super(atpVar);
        this.a = account;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public final /* synthetic */ void doExecute(asy asyVar) {
        cus cusVar = (cus) asyVar;
        String str = this.a.name;
        cusVar.checkConnected();
        setResult((aty) new cur(Status.a, ((cul) cusVar.getService()).a(str)));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ aty createFailedResult(Status status) {
        return new cur(status, null);
    }
}
