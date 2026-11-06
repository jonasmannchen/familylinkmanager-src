package flm;

import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bjs extends bkh {
    private final /* synthetic */ bjo a;
    private final /* synthetic */ bjq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bjs(atp atpVar, bjo bjoVar, bjq bjqVar) {
        super(atpVar);
        this.a = bjoVar;
        this.b = bjqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.auv
    public final /* synthetic */ void doExecute(asy asyVar) {
        bku bkuVar;
        bki bkiVar = (bki) asyVar;
        bkb bkbVar = (bkb) this.a;
        bjq bjqVar = this.b;
        bdi.checkState(!(bjqVar == null));
        bkiVar.checkConnected();
        bky bkyVar = (bky) bkiVar.getService();
        bkm bkmVarA = bkm.a(this, (bkt) null);
        String str = bkiVar.b.b;
        String str2 = bkiVar.b.a;
        String str3 = bkiVar.b.d;
        if (bjqVar == null) {
            bkuVar = null;
        } else {
            ale aleVarA = bkiVar.a();
            IInterface iInterfaceA = (IInterface) aleVarA.c.get(bjqVar);
            if (iInterfaceA == null) {
                iInterfaceA = aleVarA.b.a(bjqVar, aleVarA.a);
                aleVarA.c.put(bjqVar, iInterfaceA);
            }
            bkuVar = (bku) iInterfaceA;
        }
        bkyVar.a(bkmVarA, str, str2, str3, bkbVar, null, bkuVar, null);
    }
}
