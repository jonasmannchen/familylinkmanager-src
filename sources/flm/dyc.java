package flm;

import java.util.AbstractMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dyc extends dxm {
    private final /* synthetic */ dyb a;

    dyc(dyb dybVar) {
        this.a = dybVar;
    }

    @Override // flm.dxi
    final boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.a.size();
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        return new AbstractMap.SimpleImmutableEntry(this.a.a.b.e().get(i), this.a.a.c.get(i));
    }
}
