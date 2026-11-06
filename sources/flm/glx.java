package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class glx {
    glx() {
    }

    public abstract String a();

    public static glx a(String str) {
        boolean z = !str.isEmpty() && str.length() <= 255 && gkw.a(str);
        String strValueOf = String.valueOf(str);
        gkx.a(z, strValueOf.length() != 0 ? "Invalid TagKey name: ".concat(strValueOf) : new String("Invalid TagKey name: "));
        return new glm(str);
    }
}
