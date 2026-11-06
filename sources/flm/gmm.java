package flm;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gmm extends gnl {
    private final List a;

    gmm(List list) {
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.a = list;
    }

    @Override // flm.gnl
    public final List a() {
        return this.a;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(strValueOf).length() + 20).append("Tracestate{entries=").append(strValueOf).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gnl) {
            return this.a.equals(((gnl) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }
}
