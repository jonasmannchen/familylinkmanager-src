package flm;

import java.util.AbstractMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dzx extends dxm {
    private final /* synthetic */ dzw a;

    dzx(dzw dzwVar) {
        this.a = dzwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }

    @Override // flm.dxi
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        dvl.a(i, this.a.c);
        return new AbstractMap.SimpleImmutableEntry(this.a.a[(i * 2) + this.a.b], this.a.a[(i * 2) + (this.a.b ^ 1)]);
    }
}
