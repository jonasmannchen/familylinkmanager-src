package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cty extends ctk {
    private final /* synthetic */ ctn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cty(atp atpVar, ctn ctnVar) {
        super(atpVar);
        this.a = ctnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public final /* synthetic */ void doExecute(asy asyVar) {
        int i;
        ctv ctvVar = (ctv) asyVar;
        ctn ctnVar = this.a;
        ctvVar.checkConnected();
        if (ctnVar.a == null) {
            throw new IllegalArgumentException();
        }
        ctq ctqVarA = ((cts) ctvVar.getService()).a(ctnVar);
        switch (ctqVarA.a) {
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
        setResult((aty) new cub(new Status(i), ctqVarA.b));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ aty createFailedResult(Status status) {
        return new cub(status, -1L);
    }
}
