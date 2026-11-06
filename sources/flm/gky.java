package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gky extends glb {
    private final String a;
    private final String b;
    private final String c;

    gky(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.c = str3;
    }

    @Override // flm.glb
    public final String a() {
        return this.a;
    }

    @Override // flm.glb
    public final String b() {
        return this.b;
    }

    @Override // flm.glb
    public final String c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        return new StringBuilder(String.valueOf(str).length() + 41 + String.valueOf(str2).length() + String.valueOf(str3).length()).append("MeasureDouble{name=").append(str).append(", description=").append(str2).append(", unit=").append(str3).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof glb)) {
            return false;
        }
        glb glbVar = (glb) obj;
        return this.a.equals(glbVar.a()) && this.b.equals(glbVar.b()) && this.c.equals(glbVar.c());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
