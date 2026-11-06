package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class glm extends glx {
    private final String a;

    glm(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
    }

    @Override // flm.glx
    public final String a() {
        return this.a;
    }

    public final String toString() {
        String str = this.a;
        return new StringBuilder(String.valueOf(str).length() + 13).append("TagKey{name=").append(str).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof glx) {
            return this.a.equals(((glx) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }
}
