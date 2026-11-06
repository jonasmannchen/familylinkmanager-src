package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gln extends gly {
    private final String a;

    gln(String str) {
        if (str == null) {
            throw new NullPointerException("Null asString");
        }
        this.a = str;
    }

    @Override // flm.gly
    public final String a() {
        return this.a;
    }

    public final String toString() {
        String str = this.a;
        return new StringBuilder(String.valueOf(str).length() + 19).append("TagValue{asString=").append(str).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gly) {
            return this.a.equals(((gly) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }
}
