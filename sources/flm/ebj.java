package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ebj {
    public static final ebj a = new ebk();

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder("LogSite{ class=").append(a()).append(", method=").append(b()).append(", line=").append(c());
        if (d() != null) {
            sbAppend.append(", file=").append(d());
        }
        return sbAppend.append(" }").toString();
    }

    @Deprecated
    public static ebj a(String str, String str2, int i, String str3) {
        return new ebl(str, str2, i, str3);
    }
}
