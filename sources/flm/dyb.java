package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dyb extends dxv {
    public final /* synthetic */ dya a;

    dyb(dya dyaVar) {
        this.a = dyaVar;
    }

    @Override // flm.dxi
    /* JADX INFO: renamed from: a */
    public final eau iterator() {
        return (eau) e().iterator();
    }

    @Override // flm.dxx
    final dxm i() {
        return new dyc(this);
    }

    @Override // flm.dxv
    final dxs g() {
        return this.a;
    }

    @Override // flm.dxx, flm.dxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
