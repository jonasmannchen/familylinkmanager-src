package flm;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class guf implements Serializable, Comparable {
    public static final long serialVersionUID = 1;
    public final byte[] b;
    public transient int c;
    private transient String e;
    private static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final guf a = a(new byte[0]);

    guf(byte[] bArr) {
        this.b = bArr;
    }

    public static guf a(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new guf((byte[]) bArr.clone());
    }

    public static guf a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        guf gufVar = new guf(str.getBytes(gut.a));
        gufVar.e = str;
        return gufVar;
    }

    public String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.b, gut.a);
        this.e = str2;
        return str2;
    }

    public String b() {
        return gub.a(this.b);
    }

    public String c() {
        char[] cArr = new char[this.b.length << 1];
        int i = 0;
        for (byte b : this.b) {
            int i2 = i + 1;
            cArr[i] = d[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = d[b & 15];
        }
        return new String(cArr);
    }

    public guf d() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.b.length) {
                byte b = this.b[i2];
                if (b >= 65 && b <= 90) {
                    byte[] bArr = (byte[]) this.b.clone();
                    bArr[i2] = (byte) (b + 32);
                    for (int i3 = i2 + 1; i3 < bArr.length; i3++) {
                        byte b2 = bArr[i3];
                        if (b2 >= 65 && b2 <= 90) {
                            bArr[i3] = (byte) (b2 + 32);
                        }
                    }
                    return new guf(bArr);
                }
                i = i2 + 1;
            } else {
                return this;
            }
        }
    }

    public guf a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (i2 > this.b.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.b.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i != 0 || i2 != this.b.length) {
            byte[] bArr = new byte[i3];
            System.arraycopy(this.b, i, bArr, 0, i3);
            return new guf(bArr);
        }
        return this;
    }

    public byte a(int i) {
        return this.b[i];
    }

    public int e() {
        return this.b.length;
    }

    public byte[] f() {
        return (byte[]) this.b.clone();
    }

    public void a(guc gucVar) {
        gucVar.b(this.b, 0, this.b.length);
    }

    public boolean a(int i, guf gufVar, int i2, int i3) {
        return gufVar.a(0, this.b, 0, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= this.b.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && gut.a(this.b, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof guf) && ((guf) obj).e() == this.b.length && ((guf) obj).a(0, this.b, 0, this.b.length);
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.b);
        this.c = iHashCode;
        return iHashCode;
    }

    public String toString() {
        if (this.b.length == 0) {
            return "[size=0]";
        }
        String strA = a();
        int length = strA.length();
        int i = 0;
        int length2 = 0;
        while (true) {
            if (length2 < length) {
                if (i != 64) {
                    int iCodePointAt = strA.codePointAt(length2);
                    if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                        length2 = -1;
                        break;
                    }
                    i++;
                    length2 += Character.charCount(iCodePointAt);
                } else {
                    break;
                }
            } else {
                length2 = strA.length();
                break;
            }
        }
        if (length2 == -1) {
            if (this.b.length <= 64) {
                return "[hex=" + c() + "]";
            }
            return "[size=" + this.b.length + " hex=" + a(0, 64).c() + "…]";
        }
        String strReplace = strA.substring(0, length2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (length2 < strA.length()) {
            return "[size=" + this.b.length + " text=" + strReplace + "…]";
        }
        return "[text=" + strReplace + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int i = objectInputStream.readInt();
        if (objectInputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + i);
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        guf gufVar = new guf(bArr);
        try {
            Field declaredField = guf.class.getDeclaredField("b");
            declaredField.setAccessible(true);
            declaredField.set(this, gufVar.b);
        } catch (IllegalAccessException e) {
            throw new AssertionError();
        } catch (NoSuchFieldException e2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        guf gufVar = (guf) obj;
        int iE = e();
        int iE2 = gufVar.e();
        int iMin = Math.min(iE, iE2);
        for (int i = 0; i < iMin; i++) {
            int iA = a(i) & 255;
            int iA2 = gufVar.a(i) & 255;
            if (iA != iA2) {
                return iA < iA2 ? -1 : 1;
            }
        }
        if (iE == iE2) {
            return 0;
        }
        return iE >= iE2 ? 1 : -1;
    }
}
