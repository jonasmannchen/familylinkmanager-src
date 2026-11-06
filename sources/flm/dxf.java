package flm;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dxf extends dxs implements Map {
    dxf() {
    }

    public abstract dxf a();

    @Override // flm.dxs
    Object writeReplace() {
        return new dxh(this);
    }

    @Override // flm.dxs
    final /* synthetic */ dxi b() {
        throw new AssertionError("should never be called");
    }

    @Override // flm.dxs
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dxi values() {
        return (dxx) values();
    }

    @Override // flm.dxs, java.util.Map
    public /* synthetic */ Collection values() {
        return (dxx) a().keySet();
    }
}
