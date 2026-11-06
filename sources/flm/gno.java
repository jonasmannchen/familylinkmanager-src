package flm;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gno extends gnt {
    private final Map a;
    private final Map b;

    gno(Map map, Map map2) {
        if (map == null) {
            throw new NullPointerException("Null numbersOfLatencySampledSpans");
        }
        this.a = map;
        if (map2 == null) {
            throw new NullPointerException("Null numbersOfErrorSampledSpans");
        }
        this.b = map2;
    }

    @Override // flm.gnt
    public final Map a() {
        return this.a;
    }

    @Override // flm.gnt
    public final Map b() {
        return this.b;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 78 + String.valueOf(strValueOf2).length()).append("PerSpanNameSummary{numbersOfLatencySampledSpans=").append(strValueOf).append(", numbersOfErrorSampledSpans=").append(strValueOf2).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gnt)) {
            return false;
        }
        gnt gntVar = (gnt) obj;
        return this.a.equals(gntVar.a()) && this.b.equals(gntVar.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
