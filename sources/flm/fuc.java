package flm;

import java.util.BitSet;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fuc {
    private static final BitSet c;
    public final String a;
    public final byte[] b;
    private final String d;

    public static fuc a(String str, fub fubVar) {
        return new fua(str, fubVar);
    }

    abstract Object a(byte[] bArr);

    abstract byte[] a(Object obj);

    public static fuc a(String str, ftz ftzVar) {
        return new fty(str, false, ftzVar);
    }

    static fuc a(String str, boolean z, fue fueVar) {
        return new fud(str, z, fueVar);
    }

    fuc(String str, boolean z) {
        this.d = (String) dvl.a(str, "name");
        String lowerCase = this.d.toLowerCase(Locale.ROOT);
        dvl.a(lowerCase, "name");
        dvl.a(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        for (int i = 0; i < lowerCase.length(); i++) {
            char cCharAt = lowerCase.charAt(i);
            if ((!z || cCharAt != ':' || i != 0) && !c.get(cCharAt)) {
                throw new IllegalArgumentException(dvy.a("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
            }
        }
        this.a = lowerCase;
        this.b = this.a.getBytes(dva.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((fuc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String str = this.a;
        return new StringBuilder(String.valueOf(str).length() + 12).append("Key{name='").append(str).append("'}").toString();
    }

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        for (char c3 = 'a'; c3 <= 'z'; c3 = (char) (c3 + 1)) {
            bitSet.set(c3);
        }
        c = bitSet;
    }
}
