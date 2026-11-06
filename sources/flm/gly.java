package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gly {
    gly() {
    }

    public abstract String a();

    public static gly a(String str) {
        boolean z = str.length() <= 255 && gkw.a(str);
        String strValueOf = String.valueOf(str);
        gkx.a(z, strValueOf.length() != 0 ? "Invalid TagValue: ".concat(strValueOf) : new String("Invalid TagValue: "));
        return new gln(str);
    }
}
