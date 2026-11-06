package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dxy extends dxj {
    private Object[] d;

    public dxy() {
        super(4);
    }

    @Override // flm.dxj, flm.dxk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public dxy b(Object obj) {
        dvl.a(obj);
        this.d = null;
        super.b(obj);
        return this;
    }

    @Override // flm.dxj, flm.dxk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dxy a(Object... objArr) {
        super.a(objArr);
        return this;
    }

    @Override // flm.dxk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dxy a(Iterator it) {
        dvl.a(it);
        while (it.hasNext()) {
        }
        return this;
    }

    @Override // flm.dxj
    /* JADX INFO: renamed from: a */
    public /* synthetic */ dxj b(Object obj) {
        return (dxy) b(obj);
    }
}
