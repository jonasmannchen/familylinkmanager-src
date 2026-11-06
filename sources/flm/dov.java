package flm;

import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dov {
    public final String a;
    public final int b;

    public dov(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dov)) {
            return false;
        }
        dov dovVar = (dov) obj;
        return this.a.equals(dovVar.a) && this.b == dovVar.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return String.format("{path: %s, retainedHeapSizeBytes: %d}", this.a, Integer.valueOf(this.b));
    }
}
