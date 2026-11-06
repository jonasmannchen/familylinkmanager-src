package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gun {
    private static gum a;
    private static long b;

    private gun() {
    }

    static gum a() {
        synchronized (gun.class) {
            if (a != null) {
                gum gumVar = a;
                a = gumVar.f;
                gumVar.f = null;
                b -= 8192;
                return gumVar;
            }
            return new gum();
        }
    }

    static void a(gum gumVar) {
        if (gumVar.f != null || gumVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (!gumVar.d) {
            synchronized (gun.class) {
                if (b + 8192 <= 65536) {
                    b += 8192;
                    gumVar.f = a;
                    gumVar.c = 0;
                    gumVar.b = 0;
                    a = gumVar;
                }
            }
        }
    }
}
