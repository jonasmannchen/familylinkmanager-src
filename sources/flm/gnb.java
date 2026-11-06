package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnb {
    public final gni a;
    private final gnh d;
    private final gnc e;
    private static final gnl c = new gnm(gnm.b).a;
    public static final gnb b = new gnb(gnh.a, gnc.a, gni.a, c);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gnb)) {
            return false;
        }
        gnb gnbVar = (gnb) obj;
        return this.d.equals(gnbVar.d) && this.e.equals(gnbVar.e) && this.a.equals(gnbVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.a});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.e);
        String strValueOf3 = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(strValueOf).length() + 45 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length()).append("SpanContext{traceId=").append(strValueOf).append(", spanId=").append(strValueOf2).append(", traceOptions=").append(strValueOf3).append("}").toString();
    }

    private gnb(gnh gnhVar, gnc gncVar, gni gniVar, gnl gnlVar) {
        this.d = gnhVar;
        this.e = gncVar;
        this.a = gniVar;
    }
}
