package flm;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fmy implements Cloneable {
    public fmw a;
    public Object b;
    public List c = new ArrayList();

    fmy() {
    }

    final int a() {
        int length = 0;
        if (this.b != null) {
            fmw fmwVar = this.a;
            Object obj = this.b;
            if (fmwVar.b) {
                int length2 = Array.getLength(obj);
                for (int i = 0; i < length2; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        length += fmwVar.a(obj2);
                    }
                }
                return length;
            }
            return fmwVar.a(obj);
        }
        Iterator it = this.c.iterator();
        while (true) {
            int i2 = length;
            if (!it.hasNext()) {
                return i2;
            }
            fnd fndVar = (fnd) it.next();
            length = fndVar.b.length + fmt.d(fndVar.a) + 0 + i2;
        }
    }

    final void a(fmt fmtVar) throws fmu {
        if (this.b != null) {
            fmw fmwVar = this.a;
            Object obj = this.b;
            if (fmwVar.b) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        fmwVar.a(obj2, fmtVar);
                    }
                }
                return;
            }
            fmwVar.a(obj, fmtVar);
            return;
        }
        for (fnd fndVar : this.c) {
            fmtVar.c(fndVar.a);
            fmtVar.a(fndVar.b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fmy)) {
            return false;
        }
        fmy fmyVar = (fmy) obj;
        if (this.b != null && fmyVar.b != null) {
            if (this.a != fmyVar.a) {
                return false;
            }
            if (!this.a.a.isArray()) {
                return this.b.equals(fmyVar.b);
            }
            if (this.b instanceof byte[]) {
                return Arrays.equals((byte[]) this.b, (byte[]) fmyVar.b);
            }
            if (this.b instanceof int[]) {
                return Arrays.equals((int[]) this.b, (int[]) fmyVar.b);
            }
            if (this.b instanceof long[]) {
                return Arrays.equals((long[]) this.b, (long[]) fmyVar.b);
            }
            if (this.b instanceof float[]) {
                return Arrays.equals((float[]) this.b, (float[]) fmyVar.b);
            }
            if (this.b instanceof double[]) {
                return Arrays.equals((double[]) this.b, (double[]) fmyVar.b);
            }
            if (this.b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.b, (boolean[]) fmyVar.b);
            }
            return Arrays.deepEquals((Object[]) this.b, (Object[]) fmyVar.b);
        }
        if (this.c != null && fmyVar.c != null) {
            return this.c.equals(fmyVar.c);
        }
        try {
            return Arrays.equals(c(), fmyVar.c());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(c()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private final byte[] c() throws fmu {
        byte[] bArr = new byte[a()];
        a(fmt.a(bArr, 0, bArr.length));
        return bArr;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fmy clone() {
        int i = 0;
        fmy fmyVar = new fmy();
        try {
            fmyVar.a = this.a;
            if (this.c == null) {
                fmyVar.c = null;
            } else {
                fmyVar.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof fnb) {
                    fmyVar.b = (fnb) ((fnb) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    fmyVar.b = ((byte[]) this.b).clone();
                } else if (this.b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.b;
                    byte[][] bArr2 = new byte[bArr.length][];
                    fmyVar.b = bArr2;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        bArr2[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.b instanceof boolean[]) {
                    fmyVar.b = ((boolean[]) this.b).clone();
                } else if (this.b instanceof int[]) {
                    fmyVar.b = ((int[]) this.b).clone();
                } else if (this.b instanceof long[]) {
                    fmyVar.b = ((long[]) this.b).clone();
                } else if (this.b instanceof float[]) {
                    fmyVar.b = ((float[]) this.b).clone();
                } else if (this.b instanceof double[]) {
                    fmyVar.b = ((double[]) this.b).clone();
                } else if (this.b instanceof fnb[]) {
                    fnb[] fnbVarArr = (fnb[]) this.b;
                    fnb[] fnbVarArr2 = new fnb[fnbVarArr.length];
                    fmyVar.b = fnbVarArr2;
                    while (true) {
                        int i3 = i;
                        if (i3 >= fnbVarArr.length) {
                            break;
                        }
                        fnbVarArr2[i3] = (fnb) fnbVarArr[i3].clone();
                        i = i3 + 1;
                    }
                }
            }
            return fmyVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
