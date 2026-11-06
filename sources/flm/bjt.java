package flm;

import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bjt extends bkh {
    private final /* synthetic */ bjq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bjt(atp atpVar, bjq bjqVar) {
        super(atpVar);
        this.a = bjqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public final /* synthetic */ void doExecute(asy asyVar) {
        bke bkeVar;
        bki bkiVar = (bki) asyVar;
        bjq bjqVar = this.a;
        bdi.checkState(!(bjqVar == null));
        bkiVar.checkConnected();
        if (bjqVar != null) {
            bke bkeVar2 = (bke) ((IInterface) bkiVar.a().c.remove(bjqVar));
            if (bkeVar2 == null) {
                bki.a(this, 0);
                return;
            }
            bkeVar = bkeVar2;
        } else {
            bkeVar = null;
        }
        ((bky) bkiVar.getService()).a(bkm.a(this, new bkj(bkeVar)), bkiVar.b.b, bkiVar.b.a, bkiVar.b.d, bkeVar, null);
    }
}
