package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chu {
    public final eta a;
    public final int b;
    public boolean c;
    private boolean d;

    public chu(eta etaVar, boolean z, int i) {
        this.a = etaVar;
        this.c = z;
        this.b = i;
    }

    public final boolean a() {
        return bbz.GOOGLE_NOW_PACKAGE_NAME.equals(this.a.b);
    }

    public final boolean b() {
        dvl.b(a());
        return this.d;
    }

    public final void a(boolean z) {
        dvl.b(a());
        this.d = z;
    }
}
