package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjz {
    public static final guf a = guf.a(":status");
    public static final guf b = guf.a(":method");
    public static final guf c = guf.a(":path");
    public static final guf d = guf.a(":scheme");
    public static final guf e = guf.a(":authority");
    public final guf f;
    public final guf g;
    public final int h;

    public gjz(String str, String str2) {
        this(guf.a(str), guf.a(str2));
    }

    public gjz(guf gufVar, String str) {
        this(gufVar, guf.a(str));
    }

    public gjz(guf gufVar, guf gufVar2) {
        this.f = gufVar;
        this.g = gufVar2;
        this.h = gufVar.e() + 32 + gufVar2.e();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gjz)) {
            return false;
        }
        gjz gjzVar = (gjz) obj;
        return this.f.equals(gjzVar.f) && this.g.equals(gjzVar.g);
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f.a(), this.g.a());
    }

    static {
        guf.a(":host");
        guf.a(":version");
    }
}
