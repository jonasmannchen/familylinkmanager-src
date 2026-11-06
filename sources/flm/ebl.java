package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ebl extends ebj {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    ebl(String str, String str2, int i, String str3) {
        this.b = (String) eel.a(str, "class name");
        this.c = (String) eel.a(str2, "method name");
        this.d = i;
        this.e = str3;
    }

    @Override // flm.ebj
    public final String a() {
        return this.b.replace('/', '.');
    }

    @Override // flm.ebj
    public final String b() {
        return this.c;
    }

    @Override // flm.ebj
    public final int c() {
        return this.d & 65535;
    }

    @Override // flm.ebj
    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ebl)) {
            return false;
        }
        ebl eblVar = (ebl) obj;
        return this.b.equals(eblVar.b) && this.c.equals(eblVar.c) && this.d == eblVar.d;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = ((((this.b.hashCode() + 4867) * 31) + this.c.hashCode()) * 31) + this.d;
        }
        return this.f;
    }
}
