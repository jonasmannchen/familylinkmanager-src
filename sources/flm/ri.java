package flm;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ri {
    private final boolean f;
    private final int g;
    private final rl h;
    public static final rl a = rm.c;
    private static final String d = Character.toString(8206);
    private static final String e = Character.toString(8207);
    public static final ri b = new ri(false, 2, a);
    public static final ri c = new ri(true, 2, a);

    public static ri a() {
        rj rjVar = new rj();
        if (rjVar.b == 2 && rjVar.c == a) {
            return rjVar.a ? c : b;
        }
        return new ri(rjVar.a, rjVar.b, rjVar.c);
    }

    ri(boolean z, int i, rl rlVar) {
        this.f = z;
        this.g = i;
        this.h = rlVar;
    }

    public final String a(String str) {
        String str2;
        String str3;
        SpannableStringBuilder spannableStringBuilder = null;
        rl rlVar = this.h;
        if (str == null) {
            return null;
        }
        if (str != null) {
            boolean zA = rlVar.a(str, 0, str.length());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if ((this.g & 2) != 0) {
                boolean zA2 = (zA ? rm.b : rm.a).a(str, 0, str.length());
                if (!this.f && (zA2 || b(str) == 1)) {
                    str3 = d;
                } else if (this.f && (!zA2 || b(str) == -1)) {
                    str3 = e;
                } else {
                    str3 = "";
                }
                spannableStringBuilder2.append((CharSequence) str3);
            }
            if (zA != this.f) {
                spannableStringBuilder2.append(zA ? (char) 8235 : (char) 8234);
                spannableStringBuilder2.append((CharSequence) str);
                spannableStringBuilder2.append((char) 8236);
            } else {
                spannableStringBuilder2.append((CharSequence) str);
            }
            boolean zA3 = (zA ? rm.b : rm.a).a(str, 0, str.length());
            if (!this.f && (zA3 || a((CharSequence) str) == 1)) {
                str2 = d;
            } else if (this.f && (!zA3 || a((CharSequence) str) == -1)) {
                str2 = e;
            } else {
                str2 = "";
            }
            spannableStringBuilder2.append((CharSequence) str2);
            spannableStringBuilder = spannableStringBuilder2;
        }
        return spannableStringBuilder.toString();
    }

    static boolean a(Locale locale) {
        return rs.a(locale) == 1;
    }

    private static int a(CharSequence charSequence) {
        rk rkVar = new rk(charSequence, false);
        rkVar.d = rkVar.c;
        int i = 0;
        int i2 = 0;
        while (rkVar.d > 0) {
            switch (rkVar.a()) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    if (i2 == 0) {
                        return -1;
                    }
                    if (i == 0) {
                        i = i2;
                    }
                    break;
                case 1:
                case 2:
                    if (i2 == 0) {
                        return 1;
                    }
                    if (i == 0) {
                        i = i2;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                default:
                    if (i == 0) {
                        i = i2;
                    }
                    break;
                case 9:
                    break;
                case 14:
                case 15:
                    if (i == i2) {
                        return -1;
                    }
                    i2--;
                    break;
                case 16:
                case 17:
                    if (i == i2) {
                        return 1;
                    }
                    i2--;
                    break;
                case 18:
                    i2++;
                    break;
            }
        }
        return 0;
    }

    private static int b(CharSequence charSequence) {
        byte bA;
        rk rkVar = new rk(charSequence, false);
        rkVar.d = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (rkVar.d < rkVar.c && i == 0) {
            rkVar.e = rkVar.a.charAt(rkVar.d);
            if (Character.isHighSurrogate(rkVar.e)) {
                int iCodePointAt = Character.codePointAt(rkVar.a, rkVar.d);
                rkVar.d += Character.charCount(iCodePointAt);
                bA = Character.getDirectionality(iCodePointAt);
            } else {
                rkVar.d++;
                bA = rk.a(rkVar.e);
                if (rkVar.b) {
                    if (rkVar.e == '<') {
                        int i4 = rkVar.d;
                        while (true) {
                            if (rkVar.d < rkVar.c) {
                                CharSequence charSequence2 = rkVar.a;
                                int i5 = rkVar.d;
                                rkVar.d = i5 + 1;
                                rkVar.e = charSequence2.charAt(i5);
                                if (rkVar.e == '>') {
                                    bA = 12;
                                } else if (rkVar.e == '\"' || rkVar.e == '\'') {
                                    char c2 = rkVar.e;
                                    while (rkVar.d < rkVar.c) {
                                        CharSequence charSequence3 = rkVar.a;
                                        int i6 = rkVar.d;
                                        rkVar.d = i6 + 1;
                                        char cCharAt = charSequence3.charAt(i6);
                                        rkVar.e = cCharAt;
                                        if (cCharAt == c2) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                rkVar.d = i4;
                                rkVar.e = '<';
                                bA = 13;
                            }
                        }
                    } else if (rkVar.e == '&') {
                        while (rkVar.d < rkVar.c) {
                            CharSequence charSequence4 = rkVar.a;
                            int i7 = rkVar.d;
                            rkVar.d = i7 + 1;
                            char cCharAt2 = charSequence4.charAt(i7);
                            rkVar.e = cCharAt2;
                            if (cCharAt2 == ';') {
                                bA = 12;
                            }
                        }
                        bA = 12;
                    }
                }
            }
            switch (bA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    if (i3 == 0) {
                        return -1;
                    }
                    i = i3;
                    break;
                case 1:
                case 2:
                    if (i3 == 0) {
                        return 1;
                    }
                    i = i3;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                default:
                    i = i3;
                    break;
                case 9:
                    break;
                case 14:
                case 15:
                    i3++;
                    i2 = -1;
                    break;
                case 16:
                case 17:
                    i3++;
                    i2 = 1;
                    break;
                case 18:
                    i3--;
                    i2 = 0;
                    break;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i2 != 0) {
            return i2;
        }
        while (rkVar.d > 0) {
            switch (rkVar.a()) {
                case 14:
                case 15:
                    if (i == i3) {
                        return -1;
                    }
                    i3--;
                    break;
                    break;
                case 16:
                case 17:
                    if (i == i3) {
                        return 1;
                    }
                    i3--;
                    break;
                case 18:
                    i3++;
                    break;
            }
        }
        return 0;
    }
}
