package flm;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gco {
    private static final Logger a = Logger.getLogger(gco.class.getName());

    private gco() {
    }

    public static Object a(String str) {
        eje ejeVar = new eje(new StringReader(str));
        try {
            return a(ejeVar);
        } finally {
            try {
                ejeVar.close();
            } catch (IOException e) {
                a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e);
            }
        }
    }

    private static Object a(eje ejeVar) throws IOException {
        double d;
        String str;
        String strA;
        boolean z = true;
        dvl.b(ejeVar.a(), "unexpected end of JSON");
        switch (ejeVar.b().ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                int iC = ejeVar.c;
                if (iC == 0) {
                    iC = ejeVar.c();
                }
                if (iC == 3) {
                    ejeVar.a(1);
                    ejeVar.i[ejeVar.g - 1] = 0;
                    ejeVar.c = 0;
                    ArrayList arrayList = new ArrayList();
                    while (ejeVar.a()) {
                        arrayList.add(a(ejeVar));
                    }
                    z = ejeVar.b() == ejg.END_ARRAY;
                    String strValueOf = String.valueOf(ejeVar.f());
                    dvl.b(z, strValueOf.length() != 0 ? "Bad token: ".concat(strValueOf) : new String("Bad token: "));
                    int iC2 = ejeVar.c;
                    if (iC2 == 0) {
                        iC2 = ejeVar.c();
                    }
                    if (iC2 == 4) {
                        ejeVar.g--;
                        int[] iArr = ejeVar.i;
                        int i = ejeVar.g - 1;
                        iArr[i] = iArr[i] + 1;
                        ejeVar.c = 0;
                        return Collections.unmodifiableList(arrayList);
                    }
                    throw new IllegalStateException("Expected END_ARRAY but was " + ejeVar.b() + ejeVar.e());
                }
                throw new IllegalStateException("Expected BEGIN_ARRAY but was " + ejeVar.b() + ejeVar.e());
            case 1:
            case 3:
            case 4:
            default:
                String strValueOf2 = String.valueOf(ejeVar.f());
                throw new IllegalStateException(strValueOf2.length() != 0 ? "Bad token: ".concat(strValueOf2) : new String("Bad token: "));
            case 2:
                int iC3 = ejeVar.c;
                if (iC3 == 0) {
                    iC3 = ejeVar.c();
                }
                if (iC3 == 1) {
                    ejeVar.a(3);
                    ejeVar.c = 0;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (ejeVar.a()) {
                        int iC4 = ejeVar.c;
                        if (iC4 == 0) {
                            iC4 = ejeVar.c();
                        }
                        if (iC4 == 14) {
                            strA = ejeVar.d();
                        } else if (iC4 == 12) {
                            strA = ejeVar.a('\'');
                        } else if (iC4 == 13) {
                            strA = ejeVar.a('\"');
                        } else {
                            throw new IllegalStateException("Expected a name but was " + ejeVar.b() + ejeVar.e());
                        }
                        ejeVar.c = 0;
                        ejeVar.h[ejeVar.g - 1] = strA;
                        linkedHashMap.put(strA, a(ejeVar));
                    }
                    z = ejeVar.b() == ejg.END_OBJECT;
                    String strValueOf3 = String.valueOf(ejeVar.f());
                    dvl.b(z, strValueOf3.length() != 0 ? "Bad token: ".concat(strValueOf3) : new String("Bad token: "));
                    int iC5 = ejeVar.c;
                    if (iC5 == 0) {
                        iC5 = ejeVar.c();
                    }
                    if (iC5 == 2) {
                        ejeVar.g--;
                        ejeVar.h[ejeVar.g] = null;
                        int[] iArr2 = ejeVar.i;
                        int i2 = ejeVar.g - 1;
                        iArr2[i2] = iArr2[i2] + 1;
                        ejeVar.c = 0;
                        return Collections.unmodifiableMap(linkedHashMap);
                    }
                    throw new IllegalStateException("Expected END_OBJECT but was " + ejeVar.b() + ejeVar.e());
                }
                throw new IllegalStateException("Expected BEGIN_OBJECT but was " + ejeVar.b() + ejeVar.e());
            case 5:
                int iC6 = ejeVar.c;
                if (iC6 == 0) {
                    iC6 = ejeVar.c();
                }
                if (iC6 == 10) {
                    str = ejeVar.d();
                } else if (iC6 == 8) {
                    str = ejeVar.a('\'');
                } else if (iC6 == 9) {
                    str = ejeVar.a('\"');
                } else if (iC6 == 11) {
                    str = ejeVar.f;
                    ejeVar.f = null;
                } else if (iC6 == 15) {
                    str = Long.toString(ejeVar.d);
                } else if (iC6 == 16) {
                    str = new String(ejeVar.a, ejeVar.b, ejeVar.e);
                    ejeVar.b += ejeVar.e;
                } else {
                    throw new IllegalStateException("Expected a string but was " + ejeVar.b() + ejeVar.e());
                }
                ejeVar.c = 0;
                int[] iArr3 = ejeVar.i;
                int i3 = ejeVar.g - 1;
                iArr3[i3] = iArr3[i3] + 1;
                return str;
            case 6:
                int iC7 = ejeVar.c;
                if (iC7 == 0) {
                    iC7 = ejeVar.c();
                }
                if (iC7 == 15) {
                    ejeVar.c = 0;
                    int[] iArr4 = ejeVar.i;
                    int i4 = ejeVar.g - 1;
                    iArr4[i4] = iArr4[i4] + 1;
                    d = ejeVar.d;
                } else {
                    if (iC7 == 16) {
                        ejeVar.f = new String(ejeVar.a, ejeVar.b, ejeVar.e);
                        ejeVar.b += ejeVar.e;
                    } else if (iC7 == 8 || iC7 == 9) {
                        ejeVar.f = ejeVar.a(iC7 == 8 ? '\'' : '\"');
                    } else if (iC7 == 10) {
                        ejeVar.f = ejeVar.d();
                    } else if (iC7 != 11) {
                        throw new IllegalStateException("Expected a double but was " + ejeVar.b() + ejeVar.e());
                    }
                    ejeVar.c = 11;
                    double d2 = Double.parseDouble(ejeVar.f);
                    if (Double.isNaN(d2) || Double.isInfinite(d2)) {
                        throw new ejh("JSON forbids NaN and infinities: " + d2 + ejeVar.e());
                    }
                    ejeVar.f = null;
                    ejeVar.c = 0;
                    int[] iArr5 = ejeVar.i;
                    int i5 = ejeVar.g - 1;
                    iArr5[i5] = iArr5[i5] + 1;
                    d = d2;
                }
                return Double.valueOf(d);
            case 7:
                int iC8 = ejeVar.c;
                if (iC8 == 0) {
                    iC8 = ejeVar.c();
                }
                if (iC8 == 5) {
                    ejeVar.c = 0;
                    int[] iArr6 = ejeVar.i;
                    int i6 = ejeVar.g - 1;
                    iArr6[i6] = iArr6[i6] + 1;
                } else if (iC8 == 6) {
                    ejeVar.c = 0;
                    int[] iArr7 = ejeVar.i;
                    int i7 = ejeVar.g - 1;
                    iArr7[i7] = iArr7[i7] + 1;
                    z = false;
                } else {
                    throw new IllegalStateException("Expected a boolean but was " + ejeVar.b() + ejeVar.e());
                }
                return Boolean.valueOf(z);
            case 8:
                int iC9 = ejeVar.c;
                if (iC9 == 0) {
                    iC9 = ejeVar.c();
                }
                if (iC9 == 7) {
                    ejeVar.c = 0;
                    int[] iArr8 = ejeVar.i;
                    int i8 = ejeVar.g - 1;
                    iArr8[i8] = iArr8[i8] + 1;
                    return null;
                }
                throw new IllegalStateException("Expected null but was " + ejeVar.b() + ejeVar.e());
        }
    }
}
