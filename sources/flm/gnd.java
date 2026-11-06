package flm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnd {
    public static final List a;
    public static final gnd b;
    public static final gnd c;
    public static final gnd d;
    public static final gnd e;
    public static final gnd f;
    public static final gnd g;
    public static final gnd h;
    public static final gnd i;
    public static final gnd j;
    public static final gnd k;
    public static final gnd l;
    public static final gnd m;
    public static final gnd n;
    public static final gnd o;
    public static final gnd p;
    public static final gnd q;
    public static final gnd r;
    public final gne s;
    public final String t;

    public gnd(gne gneVar, String str) {
        this.s = (gne) gkx.a((Object) gneVar, "canonicalCode");
        this.t = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gnd)) {
            return false;
        }
        gnd gndVar = (gnd) obj;
        return this.s == gndVar.s && gkx.a((Object) this.t, (Object) gndVar.t);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.s, this.t});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.s);
        String str = this.t;
        return new StringBuilder(String.valueOf(strValueOf).length() + 36 + String.valueOf(str).length()).append("Status{canonicalCode=").append(strValueOf).append(", description=").append(str).append("}").toString();
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (gne gneVar : gne.values()) {
            gnd gndVar = (gnd) treeMap.put(Integer.valueOf(gneVar.r), new gnd(gneVar, null));
            if (gndVar != null) {
                String strName = gndVar.s.name();
                String strName2 = gneVar.name();
                throw new IllegalStateException(new StringBuilder(String.valueOf(strName).length() + 34 + String.valueOf(strName2).length()).append("Code value duplication between ").append(strName).append(" & ").append(strName2).toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        b = gne.OK.a();
        c = gne.CANCELLED.a();
        d = gne.UNKNOWN.a();
        e = gne.INVALID_ARGUMENT.a();
        f = gne.DEADLINE_EXCEEDED.a();
        g = gne.NOT_FOUND.a();
        h = gne.ALREADY_EXISTS.a();
        i = gne.PERMISSION_DENIED.a();
        j = gne.UNAUTHENTICATED.a();
        k = gne.RESOURCE_EXHAUSTED.a();
        l = gne.FAILED_PRECONDITION.a();
        m = gne.ABORTED.a();
        n = gne.OUT_OF_RANGE.a();
        o = gne.UNIMPLEMENTED.a();
        p = gne.INTERNAL.a();
        q = gne.UNAVAILABLE.a();
        r = gne.DATA_LOSS.a();
    }
}
