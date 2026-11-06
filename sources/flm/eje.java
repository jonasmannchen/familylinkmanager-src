package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eje implements Closeable {
    private static final char[] j = ")]}'\n".toCharArray();
    public long d;
    public int e;
    public String f;
    public int g;
    public String[] h;
    public int[] i;
    private final Reader k;
    private boolean l = false;
    public final char[] a = new char[1024];
    public int b = 0;
    private int m = 0;
    private int n = 0;
    private int o = 0;
    public int c = 0;
    private int[] p = new int[32];

    public eje(Reader reader) {
        this.g = 0;
        int[] iArr = this.p;
        int i = this.g;
        this.g = i + 1;
        iArr[i] = 6;
        this.h = new String[32];
        this.i = new int[32];
        this.k = reader;
    }

    public final boolean a() throws IOException {
        int iC = this.c;
        if (iC == 0) {
            iC = c();
        }
        return (iC == 2 || iC == 4) ? false : true;
    }

    public final ejg b() throws IOException {
        int iC = this.c;
        if (iC == 0) {
            iC = c();
        }
        switch (iC) {
            case 1:
                return ejg.BEGIN_OBJECT;
            case 2:
                return ejg.END_OBJECT;
            case 3:
                return ejg.BEGIN_ARRAY;
            case 4:
                return ejg.END_ARRAY;
            case 5:
            case 6:
                return ejg.BOOLEAN;
            case 7:
                return ejg.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return ejg.STRING;
            case 12:
            case 13:
            case 14:
                return ejg.NAME;
            case 15:
            case 16:
                return ejg.NUMBER;
            case 17:
                return ejg.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:121:0x01be  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01df  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e3 A[PHI: r0 r1
  0x01e3: PHI (r0v53 int) = (r0v52 int), (r0v84 int) binds: [B:120:0x01bc, B:131:0x01df] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r1v46 int) = (r1v45 int), (r1v48 int) binds: [B:120:0x01bc, B:131:0x01df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:144:0x0208  */
    /* JADX WARN: Code duplicated, block: B:146:0x020b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0211  */
    /* JADX WARN: Code duplicated, block: B:150:0x0214  */
    /* JADX WARN: Code duplicated, block: B:152:0x021a  */
    /* JADX WARN: Code duplicated, block: B:154:0x021d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0226  */
    /* JADX WARN: Code duplicated, block: B:160:0x0229  */
    /* JADX WARN: Code duplicated, block: B:188:0x0280  */
    /* JADX WARN: Code duplicated, block: B:190:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x029e  */
    /* JADX WARN: Code duplicated, block: B:199:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:203:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:205:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:208:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:211:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    public final int c() throws IOException {
        String str;
        String str2;
        int i;
        char[] cArr;
        boolean z;
        boolean z2;
        char c;
        int i2;
        int i3;
        int i4;
        char c2;
        int i5;
        char c3;
        boolean z3;
        boolean z4;
        int i6 = this.p[this.g - 1];
        if (i6 == 1) {
            this.p[this.g - 1] = 2;
        } else if (i6 == 2) {
            switch (a(true)) {
                case 44:
                    break;
                case 59:
                    throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                case 93:
                    this.c = 4;
                    return 4;
                default:
                    throw a("Unterminated array");
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                this.p[this.g - 1] = 4;
                if (i6 == 5) {
                    switch (a(true)) {
                        case 44:
                            break;
                        case 59:
                            throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                        case 125:
                            this.c = 2;
                            return 2;
                        default:
                            throw a("Unterminated object");
                    }
                }
                switch (a(true)) {
                    case 34:
                        this.c = 13;
                        return 13;
                    case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                    case 125:
                        if (i6 != 5) {
                            this.c = 2;
                            return 2;
                        }
                        throw a("Expected name");
                    default:
                        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            }
            if (i6 == 4) {
                this.p[this.g - 1] = 5;
                switch (a(true)) {
                    case 58:
                        break;
                    case 59:
                    case 60:
                    default:
                        throw a("Expected ':'");
                    case 61:
                        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            } else if (i6 == 6) {
                this.p[this.g - 1] = 7;
            } else {
                if (i6 == 7) {
                    if (a(false) == -1) {
                        this.c = 17;
                        return 17;
                    }
                    throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                if (i6 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        switch (a(true)) {
            case 34:
                this.c = 9;
                return 9;
            case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
            case 44:
            case 59:
                break;
            case 91:
                this.c = 3;
                return 3;
            case 93:
                if (i6 == 1) {
                    this.c = 4;
                    return 4;
                }
                break;
            case 123:
                this.c = 1;
                return 1;
            default:
                this.b--;
                char c4 = this.a[this.b];
                if (c4 == 't' || c4 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i = 5;
                } else if (c4 == 'f' || c4 == 'F') {
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                } else {
                    if (c4 == 'n' || c4 == 'N') {
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                    } else {
                        i = 0;
                    }
                    if (i != 0) {
                        cArr = this.a;
                        int i7 = this.b;
                        long j2 = 0;
                        z = false;
                        z2 = true;
                        c = 0;
                        i2 = 0;
                        i3 = this.m;
                        i4 = i7;
                        while (true) {
                            if (i4 + i2 != i3) {
                                if (i2 == cArr.length) {
                                    i5 = 0;
                                } else {
                                    if (b(i2 + 1)) {
                                        i4 = this.b;
                                        i3 = this.m;
                                        c2 = cArr[i4 + i2];
                                        switch (c2) {
                                            case '+':
                                                if (c == 5) {
                                                    c3 = 6;
                                                    z3 = z2;
                                                    z4 = z;
                                                    i2++;
                                                    z = z4;
                                                    z2 = z3;
                                                    c = c3;
                                                } else {
                                                    i5 = 0;
                                                }
                                                break;
                                            case '-':
                                                if (c == 0) {
                                                    c3 = 1;
                                                    boolean z5 = z2;
                                                    z4 = true;
                                                    z3 = z5;
                                                } else if (c == 5) {
                                                    c3 = 6;
                                                    z3 = z2;
                                                    z4 = z;
                                                } else {
                                                    i5 = 0;
                                                }
                                                i2++;
                                                z = z4;
                                                z2 = z3;
                                                c = c3;
                                                break;
                                            case '.':
                                                if (c == 2) {
                                                    c3 = 3;
                                                    z3 = z2;
                                                    z4 = z;
                                                    i2++;
                                                    z = z4;
                                                    z2 = z3;
                                                    c = c3;
                                                } else {
                                                    i5 = 0;
                                                }
                                                break;
                                            case 'E':
                                            case 'e':
                                                if (c != 2) {
                                                }
                                                c3 = 5;
                                                z3 = z2;
                                                z4 = z;
                                                i2++;
                                                z = z4;
                                                z2 = z3;
                                                c = c3;
                                                break;
                                            default:
                                                if (c2 >= '0') {
                                                }
                                                if (b(c2)) {
                                                    i5 = 0;
                                                }
                                                break;
                                        }
                                    }
                                    if (c != 2) {
                                        if (c != 2) {
                                            this.e = i2;
                                            i5 = 16;
                                            this.c = 16;
                                        } else {
                                            this.e = i2;
                                            i5 = 16;
                                            this.c = 16;
                                        }
                                    } else if (c != 2) {
                                        this.e = i2;
                                        i5 = 16;
                                        this.c = 16;
                                    } else {
                                        this.e = i2;
                                        i5 = 16;
                                        this.c = 16;
                                    }
                                }
                            } else {
                                c2 = cArr[i4 + i2];
                                switch (c2) {
                                    case '+':
                                        if (c == 5) {
                                            c3 = 6;
                                            z3 = z2;
                                            z4 = z;
                                            i2++;
                                            z = z4;
                                            z2 = z3;
                                            c = c3;
                                        } else {
                                            i5 = 0;
                                        }
                                        break;
                                    case '-':
                                        if (c == 0) {
                                            c3 = 1;
                                            boolean z6 = z2;
                                            z4 = true;
                                            z3 = z6;
                                        } else if (c == 5) {
                                            c3 = 6;
                                            z3 = z2;
                                            z4 = z;
                                        } else {
                                            i5 = 0;
                                        }
                                        i2++;
                                        z = z4;
                                        z2 = z3;
                                        c = c3;
                                        break;
                                    case '.':
                                        if (c == 2) {
                                            c3 = 3;
                                            z3 = z2;
                                            z4 = z;
                                            i2++;
                                            z = z4;
                                            z2 = z3;
                                            c = c3;
                                        } else {
                                            i5 = 0;
                                        }
                                        break;
                                    case 'E':
                                    case 'e':
                                        if (c != 2 || c == 4) {
                                            c3 = 5;
                                            z3 = z2;
                                            z4 = z;
                                            i2++;
                                            z = z4;
                                            z2 = z3;
                                            c = c3;
                                        } else {
                                            i5 = 0;
                                        }
                                        break;
                                    default:
                                        if (c2 >= '0' || c2 > '9') {
                                            if (b(c2)) {
                                                i5 = 0;
                                            } else if (c != 2 && z2 && (j2 != Long.MIN_VALUE || z)) {
                                                if (!z) {
                                                    j2 = -j2;
                                                }
                                                this.d = j2;
                                                this.b += i2;
                                                i5 = 15;
                                                this.c = 15;
                                            } else if (c != 2 || c == 4 || c == 7) {
                                                this.e = i2;
                                                i5 = 16;
                                                this.c = 16;
                                            } else {
                                                i5 = 0;
                                            }
                                        } else {
                                            if (c == 1 || c == 0) {
                                                j2 = -(c2 - '0');
                                                c3 = 2;
                                                z3 = z2;
                                                z4 = z;
                                            } else if (c == 2) {
                                                if (j2 == 0) {
                                                    i5 = 0;
                                                } else {
                                                    long j3 = (10 * j2) - ((long) (c2 - '0'));
                                                    boolean z7 = (j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2)) & z2;
                                                    z4 = z;
                                                    j2 = j3;
                                                    char c5 = c;
                                                    z3 = z7;
                                                    c3 = c5;
                                                }
                                                break;
                                            } else if (c == 3) {
                                                c3 = 4;
                                                z3 = z2;
                                                z4 = z;
                                            } else if (c == 5 || c == 6) {
                                                c3 = 7;
                                                z3 = z2;
                                                z4 = z;
                                            } else {
                                                c3 = c;
                                                z3 = z2;
                                                z4 = z;
                                            }
                                            i2++;
                                            z = z4;
                                            z2 = z3;
                                            c = c3;
                                        }
                                        break;
                                }
                            }
                            if (i5 == 0) {
                                return i5;
                            }
                            if (!b(this.a[this.b])) {
                                throw a("Expected value");
                            }
                            throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                        }
                    }
                    return i;
                }
                int length = str.length();
                int i8 = 1;
                while (true) {
                    if (i8 < length) {
                        if (this.b + i8 >= this.m && !b(i8 + 1)) {
                            i = 0;
                        } else {
                            char c6 = this.a[this.b + i8];
                            if (c6 != str.charAt(i8) && c6 != str2.charAt(i8)) {
                                i = 0;
                            } else {
                                i8++;
                            }
                        }
                    } else if ((this.b + length < this.m || b(length + 1)) && b(this.a[this.b + length])) {
                        i = 0;
                    } else {
                        this.b += length;
                        this.c = i;
                    }
                }
                if (i != 0) {
                    cArr = this.a;
                    int i9 = this.b;
                    long j4 = 0;
                    z = false;
                    z2 = true;
                    c = 0;
                    i2 = 0;
                    i3 = this.m;
                    i4 = i9;
                    while (true) {
                        if (i4 + i2 != i3) {
                            if (i2 == cArr.length) {
                                i5 = 0;
                            } else {
                                if (b(i2 + 1)) {
                                    i4 = this.b;
                                    i3 = this.m;
                                    c2 = cArr[i4 + i2];
                                    switch (c2) {
                                        case '+':
                                            if (c == 5) {
                                                c3 = 6;
                                                z3 = z2;
                                                z4 = z;
                                                i2++;
                                                z = z4;
                                                z2 = z3;
                                                c = c3;
                                            } else {
                                                i5 = 0;
                                            }
                                            break;
                                        case '-':
                                            if (c == 0) {
                                                c3 = 1;
                                                boolean z8 = z2;
                                                z4 = true;
                                                z3 = z8;
                                            } else if (c == 5) {
                                                c3 = 6;
                                                z3 = z2;
                                                z4 = z;
                                            } else {
                                                i5 = 0;
                                            }
                                            i2++;
                                            z = z4;
                                            z2 = z3;
                                            c = c3;
                                            break;
                                        case '.':
                                            if (c == 2) {
                                                c3 = 3;
                                                z3 = z2;
                                                z4 = z;
                                                i2++;
                                                z = z4;
                                                z2 = z3;
                                                c = c3;
                                            } else {
                                                i5 = 0;
                                            }
                                            break;
                                        case 'E':
                                        case 'e':
                                            if (c != 2) {
                                            }
                                            c3 = 5;
                                            z3 = z2;
                                            z4 = z;
                                            i2++;
                                            z = z4;
                                            z2 = z3;
                                            c = c3;
                                            break;
                                        default:
                                            if (c2 >= '0') {
                                            }
                                            if (b(c2)) {
                                                i5 = 0;
                                            }
                                            break;
                                    }
                                }
                                if (c != 2) {
                                    if (c != 2) {
                                        this.e = i2;
                                        i5 = 16;
                                        this.c = 16;
                                    } else {
                                        this.e = i2;
                                        i5 = 16;
                                        this.c = 16;
                                    }
                                } else if (c != 2) {
                                    this.e = i2;
                                    i5 = 16;
                                    this.c = 16;
                                } else {
                                    this.e = i2;
                                    i5 = 16;
                                    this.c = 16;
                                }
                            }
                        } else {
                            c2 = cArr[i4 + i2];
                            switch (c2) {
                                case '+':
                                    if (c == 5) {
                                        c3 = 6;
                                        z3 = z2;
                                        z4 = z;
                                        i2++;
                                        z = z4;
                                        z2 = z3;
                                        c = c3;
                                    } else {
                                        i5 = 0;
                                    }
                                    break;
                                case '-':
                                    if (c == 0) {
                                        c3 = 1;
                                        boolean z9 = z2;
                                        z4 = true;
                                        z3 = z9;
                                    } else if (c == 5) {
                                        c3 = 6;
                                        z3 = z2;
                                        z4 = z;
                                    } else {
                                        i5 = 0;
                                    }
                                    i2++;
                                    z = z4;
                                    z2 = z3;
                                    c = c3;
                                    break;
                                case '.':
                                    if (c == 2) {
                                        c3 = 3;
                                        z3 = z2;
                                        z4 = z;
                                        i2++;
                                        z = z4;
                                        z2 = z3;
                                        c = c3;
                                    } else {
                                        i5 = 0;
                                    }
                                    break;
                                case 'E':
                                case 'e':
                                    if (c != 2) {
                                    }
                                    c3 = 5;
                                    z3 = z2;
                                    z4 = z;
                                    i2++;
                                    z = z4;
                                    z2 = z3;
                                    c = c3;
                                    break;
                                default:
                                    if (c2 >= '0') {
                                    }
                                    if (b(c2)) {
                                        i5 = 0;
                                    } else if (c != 2) {
                                        if (c != 2) {
                                            this.e = i2;
                                            i5 = 16;
                                            this.c = 16;
                                        } else {
                                            this.e = i2;
                                            i5 = 16;
                                            this.c = 16;
                                        }
                                    } else if (c != 2) {
                                        this.e = i2;
                                        i5 = 16;
                                        this.c = 16;
                                    } else {
                                        this.e = i2;
                                        i5 = 16;
                                        this.c = 16;
                                    }
                                    break;
                            }
                        }
                        if (i5 == 0) {
                            return i5;
                        }
                        if (!b(this.a[this.b])) {
                            throw a("Expected value");
                        }
                        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                }
                return i;
        }
        if (i6 == 1 || i6 == 2) {
            throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
        throw a("Unexpected value");
    }

    private final boolean b(char c) throws IOException {
        switch (c) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case '{':
            case '}':
                return false;
            case '#':
            case '/':
            case ';':
            case '=':
            case '\\':
                throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
            default:
                return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String a(char c) throws IOException {
        int i;
        char[] cArr = this.a;
        StringBuilder sb = new StringBuilder();
        do {
            int i2 = this.b;
            int i3 = this.m;
            int i4 = i2;
            while (i4 < i3) {
                int i5 = i4 + 1;
                char c2 = cArr[i4];
                if (c2 == c) {
                    this.b = i5;
                    sb.append(cArr, i2, (i5 - i2) - 1);
                    return sb.toString();
                }
                if (c2 == '\\') {
                    this.b = i5;
                    sb.append(cArr, i2, (i5 - i2) - 1);
                    if (this.b == this.m && !b(1)) {
                        throw a("Unterminated escape sequence");
                    }
                    char[] cArr2 = this.a;
                    int i6 = this.b;
                    this.b = i6 + 1;
                    char c3 = cArr2[i6];
                    switch (c3) {
                        case '\n':
                            this.n++;
                            this.o = this.b;
                            sb.append(c3);
                            i2 = this.b;
                            i3 = this.m;
                            i4 = i2;
                            break;
                        case '\"':
                        case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                        case '/':
                        case '\\':
                            sb.append(c3);
                            i2 = this.b;
                            i3 = this.m;
                            i4 = i2;
                            break;
                        case 'b':
                            c3 = '\b';
                            sb.append(c3);
                            i2 = this.b;
                            i3 = this.m;
                            i4 = i2;
                            break;
                        case 'f':
                            c3 = '\f';
                            sb.append(c3);
                            i2 = this.b;
                            i3 = this.m;
                            i4 = i2;
                            break;
                        case 'n':
                            c3 = '\n';
                            sb.append(c3);
                            i2 = this.b;
                            i3 = this.m;
                            i4 = i2;
                            break;
                        case 'r':
                            c3 = '\r';
                            sb.append(c3);
                            i2 = this.b;
                            i3 = this.m;
                            i4 = i2;
                            break;
                        case 't':
                            c3 = '\t';
                            sb.append(c3);
                            i2 = this.b;
                            i3 = this.m;
                            i4 = i2;
                            break;
                        case 'u':
                            if (this.b + 4 > this.m && !b(4)) {
                                throw a("Unterminated escape sequence");
                            }
                            int i7 = this.b;
                            int i8 = i7 + 4;
                            c3 = 0;
                            for (int i9 = i7; i9 < i8; i9++) {
                                char c4 = this.a[i9];
                                char c5 = (char) (c3 << 4);
                                if (c4 >= '0' && c4 <= '9') {
                                    i = c4 - '0';
                                } else if (c4 >= 'a' && c4 <= 'f') {
                                    i = (c4 - 'a') + 10;
                                } else if (c4 >= 'A' && c4 <= 'F') {
                                    i = (c4 - 'A') + 10;
                                } else {
                                    throw new NumberFormatException("\\u" + new String(this.a, this.b, 4));
                                }
                                c3 = (char) (c5 + i);
                            }
                            this.b += 4;
                            sb.append(c3);
                            i2 = this.b;
                            i3 = this.m;
                            i4 = i2;
                            break;
                            break;
                        default:
                            throw a("Invalid escape sequence");
                    }
                } else {
                    if (c2 == '\n') {
                        this.n++;
                        this.o = i5;
                    }
                    i4 = i5;
                }
            }
            sb.append(cArr, i2, i4 - i2);
            this.b = i4;
        } while (b(1));
        throw a("Unterminated string");
    }

    public final String d() throws IOException {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            if (this.b + i < this.m) {
                switch (this.a[this.b + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                    default:
                        i++;
                        continue;
                }
            } else if (i < this.a.length) {
                if (!b(i + 1)) {
                }
            } else {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.a, this.b, i);
                this.b = i + this.b;
                if (b(1)) {
                    i = 0;
                } else {
                    i = 0;
                }
            }
        }
        if (sb == null) {
            string = new String(this.a, this.b, i);
        } else {
            sb.append(this.a, this.b, i);
            string = sb.toString();
        }
        this.b = i + this.b;
        return string;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c = 0;
        this.p[0] = 8;
        this.g = 1;
        this.k.close();
    }

    public final void a(int i) {
        if (this.g == this.p.length) {
            int[] iArr = new int[this.g << 1];
            int[] iArr2 = new int[this.g << 1];
            String[] strArr = new String[this.g << 1];
            System.arraycopy(this.p, 0, iArr, 0, this.g);
            System.arraycopy(this.i, 0, iArr2, 0, this.g);
            System.arraycopy(this.h, 0, strArr, 0, this.g);
            this.p = iArr;
            this.i = iArr2;
            this.h = strArr;
        }
        int[] iArr3 = this.p;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr3[i2] = i;
    }

    private final boolean b(int i) throws IOException {
        char[] cArr = this.a;
        this.o -= this.b;
        if (this.m != this.b) {
            this.m -= this.b;
            System.arraycopy(cArr, this.b, cArr, 0, this.m);
        } else {
            this.m = 0;
        }
        this.b = 0;
        do {
            int i2 = this.k.read(cArr, this.m, cArr.length - this.m);
            if (i2 == -1) {
                return false;
            }
            this.m = i2 + this.m;
            if (this.n == 0 && this.o == 0 && this.m > 0 && cArr[0] == 65279) {
                this.b++;
                this.o++;
                i++;
            }
        } while (this.m < i);
        return true;
    }

    private final int a(boolean z) throws IOException {
        char[] cArr = this.a;
        int i = this.b;
        int i2 = this.m;
        while (true) {
            if (i == i2) {
                this.b = i;
                if (b(1)) {
                    i = this.b;
                    i2 = this.m;
                } else {
                    if (z) {
                        throw new EOFException("End of input" + e());
                    }
                    return -1;
                }
            }
            i++;
            char c = cArr[i];
            if (c == '\n') {
                this.n++;
                this.o = i;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.b = i;
                    if (i == i2) {
                        this.b--;
                        boolean zB = b(2);
                        this.b++;
                        if (!zB) {
                            return c;
                        }
                    }
                    throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                if (c == '#') {
                    this.b = i;
                    throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                this.b = i;
                return c;
            }
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + e();
    }

    public final String e() {
        return " at line " + (this.n + 1) + " column " + ((this.b - this.o) + 1) + " path " + f();
    }

    public final String f() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.p[i2]) {
                case 1:
                case 2:
                    sb.append('[').append(this.i[i2]).append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    if (this.h[i2] != null) {
                        sb.append(this.h[i2]);
                    }
                    break;
            }
        }
        return sb.toString();
    }

    private final IOException a(String str) throws ejh {
        throw new ejh(str + e());
    }

    static {
        new ejf();
    }
}
