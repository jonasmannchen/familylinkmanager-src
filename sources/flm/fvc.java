package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvc {
    public static final List a;
    public static final fvc b;
    public static final fvc c;
    public static final fvc d;
    public static final fvc e;
    public static final fvc f;
    public static final fvc g;
    public static final fvc h;
    public static final fvc i;
    public static final fvc j;
    public static final fuc k;
    public static final fuc l;
    private static final fue p;
    public final fvd m;
    public final String n;
    public final Throwable o;

    public static fvc a(int i2) {
        return (i2 < 0 || i2 > a.size()) ? d.a(new StringBuilder(24).append("Unknown code ").append(i2).toString()) : (fvc) a.get(i2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    static fvc a(byte[] bArr) {
        int i2;
        String strValueOf;
        String str;
        char c2 = 1;
        int i3 = 0;
        if (bArr.length == 1 && bArr[0] == 48) {
            return b;
        }
        switch (bArr.length) {
            case 1:
                c2 = 0;
                if (bArr[c2] >= 48 && bArr[c2] <= 57 && (i2 = i3 + (bArr[c2] - 48)) < a.size()) {
                    return (fvc) a.get(i2);
                }
                fvc fvcVar = d;
                strValueOf = String.valueOf(new String(bArr, dva.a));
                if (strValueOf.length() != 0) {
                    str = "Unknown code ".concat(strValueOf);
                } else {
                    str = new String("Unknown code ");
                }
                return fvcVar.a(str);
            case 2:
                if (bArr[0] >= 48 && bArr[0] <= 57) {
                    i3 = ((bArr[0] - 48) * 10) + 0;
                    if (bArr[c2] >= 48) {
                        return (fvc) a.get(i2);
                    }
                }
            default:
                fvc fvcVar2 = d;
                strValueOf = String.valueOf(new String(bArr, dva.a));
                if (strValueOf.length() != 0) {
                    str = "Unknown code ".concat(strValueOf);
                } else {
                    str = new String("Unknown code ");
                }
                return fvcVar2.a(str);
        }
    }

    public static fvc a(Throwable th) {
        for (Throwable cause = (Throwable) dvl.a(th, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof fvg) {
                return ((fvg) cause).a;
            }
            if (cause instanceof fvh) {
                return ((fvh) cause).a;
            }
        }
        return d.b(th);
    }

    static String a(fvc fvcVar) {
        if (fvcVar.n == null) {
            return fvcVar.m.toString();
        }
        String strValueOf = String.valueOf(fvcVar.m);
        String str = fvcVar.n;
        return new StringBuilder(String.valueOf(strValueOf).length() + 2 + String.valueOf(str).length()).append(strValueOf).append(": ").append(str).toString();
    }

    private fvc(fvd fvdVar) {
        this(fvdVar, null, null);
    }

    private fvc(fvd fvdVar, String str, Throwable th) {
        this.m = (fvd) dvl.a(fvdVar, "code");
        this.n = str;
        this.o = th;
    }

    public final fvc b(Throwable th) {
        return dvh.a(this.o, th) ? this : new fvc(this.m, this.n, th);
    }

    public final fvc a(String str) {
        return dvh.a(this.n, str) ? this : new fvc(this.m, str, this.o);
    }

    public final fvc b(String str) {
        if (str != null) {
            if (this.n == null) {
                return new fvc(this.m, str, this.o);
            }
            fvd fvdVar = this.m;
            String str2 = this.n;
            return new fvc(fvdVar, new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length()).append(str2).append("\n").append(str).toString(), this.o);
        }
        return this;
    }

    public final boolean a() {
        return fvd.OK == this.m;
    }

    public final fvh b() {
        return new fvh(this);
    }

    public final fvg c() {
        return new fvg(this);
    }

    public final String toString() {
        return dve.a(this).a("code", this.m.name()).a("description", this.n).a("cause", this.o != null ? dwe.c(this.o) : this.o).toString();
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (fvd fvdVar : fvd.values()) {
            fvc fvcVar = (fvc) treeMap.put(Integer.valueOf(fvdVar.r), new fvc(fvdVar));
            if (fvcVar != null) {
                String strName = fvcVar.m.name();
                String strName2 = fvdVar.name();
                throw new IllegalStateException(new StringBuilder(String.valueOf(strName).length() + 34 + String.valueOf(strName2).length()).append("Code value duplication between ").append(strName).append(" & ").append(strName2).toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        b = fvd.OK.a();
        c = fvd.CANCELLED.a();
        d = fvd.UNKNOWN.a();
        fvd.INVALID_ARGUMENT.a();
        e = fvd.DEADLINE_EXCEEDED.a();
        fvd.NOT_FOUND.a();
        fvd.ALREADY_EXISTS.a();
        f = fvd.PERMISSION_DENIED.a();
        g = fvd.UNAUTHENTICATED.a();
        h = fvd.RESOURCE_EXHAUSTED.a();
        fvd.FAILED_PRECONDITION.a();
        fvd.ABORTED.a();
        fvd.OUT_OF_RANGE.a();
        fvd.UNIMPLEMENTED.a();
        i = fvd.INTERNAL.a();
        j = fvd.UNAVAILABLE.a();
        fvd.DATA_LOSS.a();
        k = fuc.a("grpc-status", false, new fve());
        p = new fvf();
        l = fuc.a("grpc-message", false, p);
    }
}
