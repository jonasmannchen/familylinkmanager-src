package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ctz extends ctk {
    private final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ctz(atp atpVar, long j) {
        super(atpVar);
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public final /* synthetic */ void doExecute(asy asyVar) {
        int i;
        ctv ctvVar = (ctv) asyVar;
        long j = this.a;
        ctvVar.checkConnected();
        switch (((cts) ctvVar.getService()).a(j)) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                i = 0;
                break;
            case 2:
                i = 3505;
                break;
            case 3:
                i = 3504;
                break;
            case 4:
                i = 3500;
                break;
            case 5:
                i = 3508;
                break;
            case 6:
                i = 3509;
                break;
            case bbx.LOG_WTF_CLIENTS_PER_CONNECTION_THRESHOLD /* 100 */:
                i = 3506;
                break;
            default:
                i = 8;
                break;
        }
        setResult((aty) new Status(i));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ aty createFailedResult(Status status) {
        return status;
    }
}
