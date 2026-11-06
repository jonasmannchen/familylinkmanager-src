package flm;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eco extends eeg implements eec {
    private static final Locale d = Locale.ROOT;
    private final Object[] e;
    private final StringBuilder f;
    private int g;

    public static void a(ecf ecfVar, ecp ecpVar) {
        String string;
        eci eciVarL = ecfVar.l();
        Throwable th = (Throwable) eciVarL.b(ebg.a);
        boolean z = eciVarL.a() == 0 || (eciVarL.a() == 1 && th != null);
        if (ecfVar.h() == null) {
            string = a(ecfVar.j());
            if (!z) {
                string = a(new StringBuilder(string), eciVarL);
            }
        } else {
            eco ecoVar = new eco(ecfVar.h(), ecfVar.i());
            ecoVar.a.a.a(ecoVar);
            if ((ecoVar.b & (ecoVar.b + 1)) != 0 || (ecoVar.c > 31 && ecoVar.b != -1)) {
                String str = String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(ecoVar.b ^ (-1))));
                String str2 = ecoVar.a.b;
                throw new eei(str);
            }
            StringBuilder sb = (StringBuilder) ecoVar.c();
            if (ecfVar.i().length > ecoVar.c + 1) {
                sb.append(" [ERROR: UNUSED LOG ARGUMENTS]");
            }
            string = z ? sb.toString() : a(sb, eciVarL);
        }
        ecpVar.a(ecfVar.d(), string, th);
    }

    public static String a(Object obj) {
        String string;
        if (obj != null) {
            try {
                if (!obj.getClass().isArray()) {
                    string = String.valueOf(obj);
                } else if (obj instanceof int[]) {
                    string = Arrays.toString((int[]) obj);
                } else if (obj instanceof long[]) {
                    string = Arrays.toString((long[]) obj);
                } else if (obj instanceof byte[]) {
                    string = Arrays.toString((byte[]) obj);
                } else if (obj instanceof char[]) {
                    string = Arrays.toString((char[]) obj);
                } else if (obj instanceof short[]) {
                    string = Arrays.toString((short[]) obj);
                } else if (obj instanceof float[]) {
                    string = Arrays.toString((float[]) obj);
                } else if (obj instanceof double[]) {
                    string = Arrays.toString((double[]) obj);
                } else if (obj instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) obj);
                } else {
                    string = Arrays.toString((Object[]) obj);
                }
                return string;
            } catch (RuntimeException e) {
                return a(obj, e);
            }
        }
        return "null";
    }

    private static void a(Formattable formattable, StringBuilder sb, ebw ebwVar) {
        int i;
        int i2 = ebwVar.b & 162;
        if (i2 != 0) {
            i = ((i2 & 2) != 0 ? 4 : 0) | ((i2 & 128) != 0 ? 2 : 0) | ((i2 & 32) != 0 ? 1 : 0);
        } else {
            i = i2;
        }
        int length = sb.length();
        Formatter formatter = new Formatter(sb, d);
        try {
            formattable.formatTo(formatter, i, ebwVar.c, ebwVar.d);
        } catch (RuntimeException e) {
            sb.setLength(length);
            try {
                formatter.out().append(a(formattable, e));
            } catch (IOException e2) {
            }
        }
    }

    private static String a(Object obj, RuntimeException runtimeException) {
        String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (RuntimeException e) {
            simpleName = e.getClass().getSimpleName();
        }
        String name = obj.getClass().getName();
        return new StringBuilder(String.valueOf(name).length() + 16 + String.valueOf(simpleName).length()).append("{").append(name).append("@").append(System.identityHashCode(obj)).append(": ").append(simpleName).append("}").toString();
    }

    private static String a(StringBuilder sb, eci eciVar) {
        ecd ecdVar = new ecd("[CONTEXT ", " ]", sb);
        ecq ecqVar = null;
        for (int i = 0; i < eciVar.a(); i++) {
            ebs ebsVarA = eciVar.a(i);
            if (!ebsVarA.equals(ebg.a)) {
                if (ebsVarA.equals(ebg.f)) {
                    ecqVar = (ecq) ebg.f.a(eciVar.b(i));
                } else {
                    ecdVar.a(ebsVarA.a, eciVar.b(i));
                }
            }
        }
        if (ecqVar != null) {
            ecqVar.a(ecdVar);
        }
        ecdVar.a();
        return sb.toString();
    }

    private eco(ecx ecxVar, Object[] objArr) {
        super(ecxVar);
        this.f = new StringBuilder();
        this.g = 0;
        this.e = (Object[]) eel.a(objArr, "log arguments");
    }

    @Override // flm.eeg
    public final void a(int i, int i2, eeb eebVar) {
        this.a.a.a(this.f, this.a.b, this.g, i);
        Object[] objArr = this.e;
        if (eebVar.a < objArr.length) {
            Object obj = objArr[eebVar.a];
            if (obj != null) {
                eebVar.a(this, obj);
            } else {
                b();
            }
        } else {
            a();
        }
        this.g = i2;
    }

    @Override // flm.eec
    public final void a(Object obj, ebv ebvVar, ebw ebwVar) {
        ebw ebwVar2;
        if (ebvVar.h.a(obj)) {
            StringBuilder sb = this.f;
            switch (ebvVar.ordinal()) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    if (!(obj instanceof Formattable)) {
                        if (ebwVar.a()) {
                            sb.append(a(obj));
                            return;
                        }
                    } else {
                        a((Formattable) obj, sb, ebwVar);
                        return;
                    }
                case 1:
                case 3:
                    if (ebwVar.a()) {
                        sb.append(obj);
                        return;
                    }
                    break;
                case 2:
                    if (ebwVar.a()) {
                        if (obj instanceof Character) {
                            sb.append(obj);
                            return;
                        }
                        int iIntValue = ((Number) obj).intValue();
                        if (Character.isBmpCodePoint(iIntValue)) {
                            sb.append((char) iIntValue);
                            return;
                        } else {
                            sb.append(Character.toChars(iIntValue));
                            return;
                        }
                    }
                    break;
                case 5:
                    if (ebwVar.a()) {
                        ebwVar2 = ebwVar;
                    } else {
                        int i = ebwVar.b & 128;
                        if (i == 0) {
                            ebwVar2 = ebw.a;
                        } else {
                            ebwVar2 = (i == ebwVar.b && -1 == ebwVar.c && -1 == ebwVar.d) ? ebwVar : new ebw(i, -1, -1);
                        }
                    }
                    if (ebwVar2.equals(ebwVar)) {
                        Number number = (Number) obj;
                        boolean zB = ebwVar.b();
                        long jLongValue = number.longValue();
                        if (number instanceof Long) {
                            a(sb, jLongValue, zB);
                            return;
                        }
                        if (number instanceof Integer) {
                            a(sb, jLongValue & 4294967295L, zB);
                            return;
                        }
                        if (number instanceof Byte) {
                            a(sb, jLongValue & 255, zB);
                            return;
                        }
                        if (number instanceof Short) {
                            a(sb, jLongValue & 65535, zB);
                            return;
                        }
                        if (number instanceof BigInteger) {
                            String string = ((BigInteger) number).toString(16);
                            if (zB) {
                                string = string.toUpperCase(d);
                            }
                            sb.append(string);
                            return;
                        }
                        String strValueOf = String.valueOf(number.getClass());
                        throw new RuntimeException(new StringBuilder(String.valueOf(strValueOf).length() + 25).append("unsupported number type: ").append(strValueOf).toString());
                    }
                    break;
            }
            String string2 = ebvVar.j;
            if (!ebwVar.a()) {
                char c = ebvVar.g;
                if (ebwVar.b()) {
                    c = (char) (c & 65503);
                }
                string2 = ebwVar.a(new StringBuilder("%")).append(c).toString();
            }
            sb.append(String.format(d, string2, obj));
            return;
        }
        a(this.f, obj, ebvVar.j);
    }

    @Override // flm.eec
    public final void a(Object obj, edz edzVar, ebw ebwVar) {
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            this.f.append(String.format(d, ebwVar.a(new StringBuilder("%")).append(ebwVar.b() ? 'T' : 't').append(edzVar.b).toString(), obj));
        } else {
            a(this.f, obj, new StringBuilder(3).append("%t").append(edzVar.b).toString());
        }
    }

    @Override // flm.eec
    public final void a() {
        this.f.append("[ERROR: MISSING LOG ARGUMENT]");
    }

    @Override // flm.eec
    public final void b() {
        this.f.append("null");
    }

    private static void a(StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append("0");
            return;
        }
        String str = z ? "0123456789ABCDEF" : "0123456789abcdef";
        for (int iNumberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); iNumberOfLeadingZeros >= 0; iNumberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> iNumberOfLeadingZeros) & 15)));
        }
    }

    private static void a(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=").append(str).append(", type=").append(obj.getClass().getCanonicalName()).append(", value=").append(a(obj)).append("]");
    }

    @Override // flm.eeg
    public final /* synthetic */ Object c() {
        this.a.a.a(this.f, this.a.b, this.g, this.a.b.length());
        return this.f;
    }
}
