package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ger extends ftq {
    private final frj a;
    private final ftv b;
    private final fuf c;

    ger(fuf fufVar, ftv ftvVar, frj frjVar) {
        this.c = (fuf) dvl.a(fufVar, "method");
        this.b = (ftv) dvl.a(ftvVar, "headers");
        this.a = (frj) dvl.a(frjVar, "callOptions");
    }

    @Override // flm.ftq
    public final ftv b() {
        return this.b;
    }

    @Override // flm.ftq
    public final frj a() {
        return this.a;
    }

    @Override // flm.ftq
    public final fuf c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ger gerVar = (ger) obj;
        return dvh.a(this.a, gerVar.a) && dvh.a(this.b, gerVar.b) && dvh.a(this.c, gerVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(strValueOf).length() + 31 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length()).append("[method=").append(strValueOf).append(" headers=").append(strValueOf2).append(" callOptions=").append(strValueOf3).append("]").toString();
    }
}
