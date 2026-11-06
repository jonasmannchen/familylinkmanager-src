package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class a extends e {
    private static volatile a a;
    private e c = new d();
    private e b = this.c;

    private a() {
    }

    public static a a() {
        if (a != null) {
            return a;
        }
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
        }
        return a;
    }

    @Override // flm.e
    public final void a(Runnable runnable) {
        this.b.a(runnable);
    }

    @Override // flm.e
    public final void b(Runnable runnable) {
        this.b.b(runnable);
    }

    @Override // flm.e
    public final boolean b() {
        return this.b.b();
    }

    static {
        new b();
        new c();
    }
}
