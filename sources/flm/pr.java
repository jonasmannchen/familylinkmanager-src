package flm;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pr {
    public char a;
    public float[] b;

    pr(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }

    pr(pr prVar) {
        this.a = prVar.a;
        this.b = pp.a(prVar.b, 0, prVar.b.length);
    }

    public static void a(pr[] prVarArr, Path path) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float[] fArr = new float[6];
        char c = 'm';
        int i2 = 0;
        while (true) {
            int i3 = i2;
            char c2 = c;
            if (i3 < prVarArr.length) {
                char c3 = prVarArr[i3].a;
                float[] fArr2 = prVarArr[i3].b;
                float f10 = fArr[0];
                float f11 = fArr[1];
                float f12 = fArr[2];
                float f13 = fArr[3];
                float f14 = fArr[4];
                float f15 = fArr[5];
                switch (c3) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'L':
                    case 'M':
                    case 'T':
                    case 'l':
                    case 'm':
                    case 't':
                        i = 2;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f14, f15);
                        f13 = f15;
                        f12 = f14;
                        f11 = f15;
                        f10 = f14;
                        i = 2;
                        break;
                    default:
                        i = 2;
                        break;
                }
                int i4 = 0;
                float f16 = f15;
                float f17 = f14;
                float f18 = f11;
                float f19 = f10;
                while (i4 < fArr2.length) {
                    switch (c3) {
                        case 'A':
                            a(path, f19, f18, fArr2[i4 + 5], fArr2[i4 + 6], fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                            f12 = fArr2[i4 + 5];
                            f13 = fArr2[i4 + 6];
                            f = f16;
                            f2 = f17;
                            f3 = f13;
                            f4 = f12;
                            break;
                        case 'C':
                            path.cubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3], fArr2[i4 + 4], fArr2[i4 + 5]);
                            float f20 = fArr2[i4 + 4];
                            float f21 = fArr2[i4 + 5];
                            f12 = fArr2[i4 + 2];
                            f13 = fArr2[i4 + 3];
                            f3 = f21;
                            f4 = f20;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'H':
                            path.lineTo(fArr2[i4], f18);
                            f = f16;
                            f3 = f18;
                            f4 = fArr2[i4];
                            f2 = f17;
                            break;
                        case 'L':
                            path.lineTo(fArr2[i4], fArr2[i4 + 1]);
                            float f22 = fArr2[i4];
                            f3 = fArr2[i4 + 1];
                            f4 = f22;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'M':
                            f2 = fArr2[i4];
                            f = fArr2[i4 + 1];
                            if (i4 > 0) {
                                path.lineTo(fArr2[i4], fArr2[i4 + 1]);
                                f3 = f;
                                f4 = f2;
                                f = f16;
                                f2 = f17;
                            } else {
                                path.moveTo(fArr2[i4], fArr2[i4 + 1]);
                                f3 = f;
                                f4 = f2;
                            }
                            break;
                        case 'Q':
                            path.quadTo(fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3]);
                            f12 = fArr2[i4];
                            f13 = fArr2[i4 + 1];
                            float f23 = fArr2[i4 + 2];
                            f3 = fArr2[i4 + 3];
                            f4 = f23;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'S':
                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                f7 = (2.0f * f18) - f13;
                                f8 = (2.0f * f19) - f12;
                            } else {
                                f7 = f18;
                                f8 = f19;
                            }
                            path.cubicTo(f8, f7, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3]);
                            f12 = fArr2[i4];
                            f13 = fArr2[i4 + 1];
                            float f24 = fArr2[i4 + 2];
                            f3 = fArr2[i4 + 3];
                            f4 = f24;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'T':
                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                f19 = (2.0f * f19) - f12;
                                f18 = (2.0f * f18) - f13;
                            }
                            path.quadTo(f19, f18, fArr2[i4], fArr2[i4 + 1]);
                            float f25 = fArr2[i4];
                            f13 = f18;
                            f12 = f19;
                            f3 = fArr2[i4 + 1];
                            f4 = f25;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'V':
                            path.lineTo(f19, fArr2[i4]);
                            f2 = f17;
                            f3 = fArr2[i4];
                            f4 = f19;
                            f = f16;
                            break;
                        case 'a':
                            a(path, f19, f18, fArr2[i4 + 5] + f19, fArr2[i4 + 6] + f18, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                            f12 = f19 + fArr2[i4 + 5];
                            f13 = f18 + fArr2[i4 + 6];
                            f = f16;
                            f2 = f17;
                            f3 = f13;
                            f4 = f12;
                            break;
                        case 'c':
                            path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3], fArr2[i4 + 4], fArr2[i4 + 5]);
                            f12 = f19 + fArr2[i4 + 2];
                            f13 = f18 + fArr2[i4 + 3];
                            float f26 = f19 + fArr2[i4 + 4];
                            f3 = f18 + fArr2[i4 + 5];
                            f4 = f26;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'h':
                            path.rLineTo(fArr2[i4], 0.0f);
                            f = f16;
                            f3 = f18;
                            f4 = f19 + fArr2[i4];
                            f2 = f17;
                            break;
                        case 'l':
                            path.rLineTo(fArr2[i4], fArr2[i4 + 1]);
                            float f27 = f19 + fArr2[i4];
                            f3 = f18 + fArr2[i4 + 1];
                            f4 = f27;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'm':
                            f2 = f19 + fArr2[i4];
                            f = f18 + fArr2[i4 + 1];
                            if (i4 > 0) {
                                path.rLineTo(fArr2[i4], fArr2[i4 + 1]);
                                f3 = f;
                                f4 = f2;
                                f = f16;
                                f2 = f17;
                            } else {
                                path.rMoveTo(fArr2[i4], fArr2[i4 + 1]);
                                f3 = f;
                                f4 = f2;
                            }
                            break;
                        case 'q':
                            path.rQuadTo(fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3]);
                            f12 = f19 + fArr2[i4];
                            f13 = f18 + fArr2[i4 + 1];
                            float f28 = f19 + fArr2[i4 + 2];
                            f3 = f18 + fArr2[i4 + 3];
                            f4 = f28;
                            f = f16;
                            f2 = f17;
                            break;
                        case 's':
                            float f29 = 0.0f;
                            if (c2 != 'c' && c2 != 's' && c2 != 'C' && c2 != 'S') {
                                f9 = 0.0f;
                            } else {
                                f29 = f18 - f13;
                                f9 = f19 - f12;
                            }
                            path.rCubicTo(f9, f29, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3]);
                            f12 = f19 + fArr2[i4];
                            f13 = f18 + fArr2[i4 + 1];
                            float f30 = f19 + fArr2[i4 + 2];
                            f3 = f18 + fArr2[i4 + 3];
                            f4 = f30;
                            f = f16;
                            f2 = f17;
                            break;
                        case 't':
                            if (c2 != 'q' && c2 != 't' && c2 != 'Q' && c2 != 'T') {
                                f5 = 0.0f;
                                f6 = 0.0f;
                            } else {
                                f5 = f18 - f13;
                                f6 = f19 - f12;
                            }
                            path.rQuadTo(f6, f5, fArr2[i4], fArr2[i4 + 1]);
                            f12 = f19 + f6;
                            f13 = f18 + f5;
                            float f31 = f19 + fArr2[i4];
                            f3 = f18 + fArr2[i4 + 1];
                            f4 = f31;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'v':
                            path.rLineTo(0.0f, fArr2[i4]);
                            f2 = f17;
                            f3 = f18 + fArr2[i4];
                            f4 = f19;
                            f = f16;
                            break;
                        default:
                            f = f16;
                            f2 = f17;
                            f3 = f18;
                            f4 = f19;
                            break;
                    }
                    i4 += i;
                    f16 = f;
                    f17 = f2;
                    f18 = f3;
                    f19 = f4;
                    c2 = c3;
                }
                fArr[0] = f19;
                fArr[1] = f18;
                fArr[2] = f12;
                fArr[3] = f13;
                fArr[4] = f17;
                fArr[5] = f16;
                c = prVarArr[i3].a;
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    private static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        while (true) {
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = ((((double) f) * dCos) + (((double) f2) * dSin)) / ((double) f5);
            double d4 = ((((double) (-f)) * dSin) + (((double) f2) * dCos)) / ((double) f6);
            double d5 = ((((double) f3) * dCos) + (((double) f4) * dSin)) / ((double) f5);
            double d6 = ((((double) (-f3)) * dSin) + (((double) f4) * dCos)) / ((double) f6);
            double d7 = d3 - d5;
            double d8 = d4 - d6;
            double d9 = (d3 + d5) / 2.0d;
            double d10 = (d4 + d6) / 2.0d;
            double d11 = (d7 * d7) + (d8 * d8);
            if (d11 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d12 = (1.0d / d11) - 0.25d;
            if (d12 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d11);
                float fSqrt = (float) (Math.sqrt(d11) / 1.99999d);
                f5 *= fSqrt;
                f6 *= fSqrt;
            } else {
                double dSqrt = Math.sqrt(d12);
                double d13 = d7 * dSqrt;
                double d14 = d8 * dSqrt;
                if (z == z2) {
                    d = d9 - d14;
                    d2 = d13 + d10;
                } else {
                    d = d14 + d9;
                    d2 = d10 - d13;
                }
                double dAtan2 = Math.atan2(d4 - d2, d3 - d);
                double dAtan3 = Math.atan2(d6 - d2, d5 - d) - dAtan2;
                if (z2 != (dAtan3 >= 0.0d)) {
                    if (dAtan3 > 0.0d) {
                        dAtan3 -= 6.283185307179586d;
                    } else {
                        dAtan3 += 6.283185307179586d;
                    }
                }
                double d15 = d * ((double) f5);
                double d16 = d2 * ((double) f6);
                double d17 = (d15 * dCos) - (d16 * dSin);
                double d18 = (d15 * dSin) + (d16 * dCos);
                double d19 = f5;
                double d20 = f6;
                int iCeil = (int) Math.ceil(Math.abs((4.0d * dAtan3) / 3.141592653589793d));
                double dCos2 = Math.cos(radians);
                double dSin2 = Math.sin(radians);
                double dCos3 = Math.cos(dAtan2);
                double dSin3 = Math.sin(dAtan2);
                double d21 = (((-d19) * dCos2) * dSin3) - ((d20 * dSin2) * dCos3);
                double d22 = (dCos3 * d20 * dCos2) + (dSin3 * (-d19) * dSin2);
                double d23 = dAtan3 / ((double) iCeil);
                int i = 0;
                double d24 = f2;
                double d25 = f;
                double d26 = dAtan2;
                while (i < iCeil) {
                    double d27 = d26 + d23;
                    double dSin4 = Math.sin(d27);
                    double dCos4 = Math.cos(d27);
                    double d28 = (((d19 * dCos2) * dCos4) + d17) - ((d20 * dSin2) * dSin4);
                    double d29 = (d20 * dCos2 * dSin4) + (d19 * dSin2 * dCos4) + d18;
                    double d30 = (((-d19) * dCos2) * dSin4) - ((d20 * dSin2) * dCos4);
                    double d31 = (dSin4 * (-d19) * dSin2) + (dCos4 * d20 * dCos2);
                    double dTan = Math.tan((d27 - d26) / 2.0d);
                    double dSin5 = (Math.sin(d27 - d26) * (Math.sqrt((dTan * (3.0d * dTan)) + 4.0d) - 1.0d)) / 3.0d;
                    path.rLineTo(0.0f, 0.0f);
                    path.cubicTo((float) ((d21 * dSin5) + d25), (float) ((d22 * dSin5) + d24), (float) (d28 - (dSin5 * d30)), (float) (d29 - (dSin5 * d31)), (float) d28, (float) d29);
                    i++;
                    d22 = d31;
                    d21 = d30;
                    d26 = d27;
                    d24 = d29;
                    d25 = d28;
                }
                return;
            }
        }
    }
}
