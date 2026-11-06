package flm;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ctx extends ctk {
    private final /* synthetic */ Account a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ctx(atp atpVar, Account account) {
        super(atpVar);
        this.a = account;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public final /* synthetic */ void doExecute(asy asyVar) {
        ctv ctvVar = (ctv) asyVar;
        Account account = this.a;
        ctvVar.checkConnected();
        setResult((aty) new cua(Status.a, ((cts) ctvVar.getService()).a(account)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ aty createFailedResult(Status status) {
        return new cua(status, null);
    }
}
