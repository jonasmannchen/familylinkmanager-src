package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class def implements ddu {
    private final Status a;
    private final ddw b;

    def(Status status, ddw ddwVar) {
        this.a = status;
        this.b = ddwVar;
    }

    @Override // flm.aty
    public final Status b() {
        return this.a;
    }

    @Override // flm.ddt
    public final boolean a() {
        bdi.checkNotNull(this.b);
        return this.b.a == 1;
    }

    public final String toString() {
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.b.a == 1);
        return String.format("OptInOptionsResultImpl[%s]", objArr);
    }
}
