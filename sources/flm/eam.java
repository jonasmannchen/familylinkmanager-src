package flm;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eam extends dxb implements Set {
    private final Collection a;

    eam(Collection collection) {
        this.a = collection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.dxb
    /* JADX INFO: renamed from: a */
    public final Collection b() {
        return this.a;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return eae.a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return eae.a(this, obj);
    }

    @Override // flm.dxb, flm.dxd
    protected final /* synthetic */ Object b() {
        return b();
    }
}
