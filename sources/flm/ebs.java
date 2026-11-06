package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebs {
    public final String a;
    public final boolean b;
    private final Class c;

    public static ebs a(String str, Class cls) {
        return new ebs(str, cls, false);
    }

    private ebs(String str, Class cls, boolean z) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        }
        if (!eel.a(str.charAt(0))) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "identifier must start with an ASCII letter: ".concat(strValueOf) : new String("identifier must start with an ASCII letter: "));
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!eel.a(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                String strValueOf2 = String.valueOf(str);
                throw new IllegalArgumentException(strValueOf2.length() != 0 ? "identifier must contain only ASCII letters, digits or underscore: ".concat(strValueOf2) : new String("identifier must contain only ASCII letters, digits or underscore: "));
            }
        }
        this.a = str;
        this.c = (Class) eel.a(cls, "class");
        this.b = false;
    }

    public final Object a(Object obj) {
        return this.c.cast(obj);
    }

    public final String toString() {
        String name = getClass().getName();
        String str = this.a;
        String name2 = this.c.getName();
        return new StringBuilder(String.valueOf(name).length() + 3 + String.valueOf(str).length() + String.valueOf(name2).length()).append(name).append("/").append(str).append("[").append(name2).append("]").toString();
    }
}
