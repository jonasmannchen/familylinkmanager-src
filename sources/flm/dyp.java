package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dyp extends eaj {
    private final /* synthetic */ dvc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dyp(Iterator it, dvc dvcVar) {
        super(it);
        this.b = dvcVar;
    }

    @Override // flm.eaj
    final Object a(Object obj) {
        return this.b.a(obj);
    }
}
