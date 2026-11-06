package flm;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fmz {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Object b;

    public static boolean a(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length || objArr[i2] != null) {
                int i3 = i;
                while (i3 < length2 && objArr2[i3] == null) {
                    i3++;
                }
                boolean z = i2 >= length;
                boolean z2 = i3 >= length2;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !objArr[i2].equals(objArr2[i3])) {
                    return false;
                }
                i = i3 + 1;
                i2++;
            } else {
                i2++;
            }
        }
    }

    public static int a(Object[] objArr) {
        int iHashCode = 0;
        int length = objArr == null ? 0 : objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                iHashCode = (iHashCode * 31) + obj.hashCode();
            }
        }
        return iHashCode;
    }

    public static void a(fmv fmvVar, fmv fmvVar2) {
        if (fmvVar.g != null) {
            fmvVar2.g = (fmx) fmvVar.g.clone();
        }
    }

    static {
        Charset.forName("ISO-8859-1");
        b = new Object();
    }
}
