package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class glc extends gla {
    glc() {
        super((byte) 0);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public static glc a(String str, String str2, String str3) {
        gkx.a(gkw.a(str) && str.length() <= 255, "Name should be a ASCII string with a length no greater than 255 characters.");
        return new gkz(str, str2, str3);
    }
}
