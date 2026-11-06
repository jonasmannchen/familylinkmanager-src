package flm;

import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pp {
    static float[] a(float[] fArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, Math.min(i2, length));
        return fArr2;
    }

    public static Path a(String str) {
        Path path = new Path();
        pr[] prVarArrB = b(str);
        if (prVarArrB != null) {
            try {
                pr.a(prVarArrB, path);
                return path;
            } catch (RuntimeException e) {
                throw new RuntimeException("Error in parsing " + str, e);
            }
        }
        return null;
    }

    public static pr[] b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                    break;
                }
                i++;
            }
            String strTrim = str.substring(i2, i).trim();
            if (strTrim.length() > 0) {
                a(arrayList, strTrim.charAt(0), c(strTrim));
            }
            i++;
            i2 = i;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            a(arrayList, str.charAt(i2), new float[0]);
        }
        return (pr[]) arrayList.toArray(new pr[arrayList.size()]);
    }

    public static pr[] a(pr[] prVarArr) {
        if (prVarArr == null) {
            return null;
        }
        pr[] prVarArr2 = new pr[prVarArr.length];
        for (int i = 0; i < prVarArr.length; i++) {
            prVarArr2[i] = new pr(prVarArr[i]);
        }
        return prVarArr2;
    }

    public static boolean a(pr[] prVarArr, pr[] prVarArr2) {
        if (prVarArr == null || prVarArr2 == null || prVarArr.length != prVarArr2.length) {
            return false;
        }
        for (int i = 0; i < prVarArr.length; i++) {
            if (prVarArr[i].a != prVarArr2[i].a || prVarArr[i].b.length != prVarArr2[i].b.length) {
                return false;
            }
        }
        return true;
    }

    private static void a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new pr(c, fArr));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e A[Catch: NumberFormatException -> 0x008b, TryCatch #0 {NumberFormatException -> 0x008b, blocks: (B:8:0x0015, B:10:0x0028, B:11:0x002f, B:13:0x0035, B:14:0x0039, B:17:0x0041, B:21:0x0050, B:24:0x005d, B:26:0x0068, B:28:0x006e, B:29:0x007a, B:32:0x0081, B:33:0x0085), top: B:39:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x007e A[SYNTHETIC] */
    private static float[] c(String str) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            pq pqVar = new pq();
            int length = str.length();
            int i2 = 1;
            int i3 = 0;
            while (i2 < length) {
                pqVar.b = false;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                int i4 = i2;
                while (i4 < str.length()) {
                    switch (str.charAt(i4)) {
                        case ' ':
                        case ',':
                            z2 = z5;
                            z = true;
                            z3 = false;
                            break;
                        case '-':
                            if (i4 == i2 || z4) {
                                z = z6;
                                z2 = z5;
                                z3 = false;
                            } else {
                                pqVar.b = true;
                                z2 = z5;
                                z = true;
                                z3 = false;
                            }
                            break;
                        case '.':
                            if (!z5) {
                                z3 = false;
                                z = z6;
                                z2 = true;
                            } else {
                                pqVar.b = true;
                                z2 = z5;
                                z = true;
                                z3 = false;
                            }
                            break;
                        case 'E':
                        case 'e':
                            z = z6;
                            z2 = z5;
                            z3 = true;
                            break;
                        default:
                            z = z6;
                            z2 = z5;
                            z3 = false;
                            break;
                    }
                    if (!z) {
                        i4++;
                        boolean z7 = z3;
                        z5 = z2;
                        z6 = z;
                        z4 = z7;
                    } else {
                        pqVar.a = i4;
                        i = pqVar.a;
                        if (i2 < i) {
                            i3++;
                            fArr[i3] = Float.parseFloat(str.substring(i2, i));
                        } else {
                            i3 = i3;
                        }
                        i2 = pqVar.b ? i : i + 1;
                    }
                }
                pqVar.a = i4;
                i = pqVar.a;
                if (i2 < i) {
                    i3++;
                    fArr[i3] = Float.parseFloat(str.substring(i2, i));
                } else {
                    i3 = i3;
                }
                if (pqVar.b) {
                }
            }
            return a(fArr, 0, i3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }
}
