package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cur implements cuh {
    private final Status a;
    private final cug b;

    cur(Status status, cug cugVar) {
        this.a = status;
        this.b = cugVar;
    }

    @Override // flm.aty
    public final Status b() {
        return this.a;
    }

    @Override // flm.cug
    public final boolean a() {
        return this.b.a();
    }

    @Override // flm.cug
    public final boolean c() {
        return this.b.c();
    }
}
