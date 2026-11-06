package flm;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fku extends fgy {
    public static final int[] c;
    public static final long serialVersionUID = 1;
    public final fgy d;
    public final fgy e;
    private final int f;
    private final int g;
    private final int h;

    fku(fgy fgyVar, fgy fgyVar2) {
        this.d = fgyVar;
        this.e = fgyVar2;
        this.g = fgyVar.b();
        this.f = this.g + fgyVar2.b();
        this.h = Math.max(fgyVar.f(), fgyVar2.f()) + 1;
    }

    static fgy a(fgy fgyVar, fgy fgyVar2) {
        if (fgyVar2.b() != 0) {
            if (fgyVar.b() == 0) {
                return fgyVar2;
            }
            int iB = fgyVar2.b() + fgyVar.b();
            if (iB < 128) {
                return b(fgyVar, fgyVar2);
            }
            if (fgyVar instanceof fku) {
                fku fkuVar = (fku) fgyVar;
                if (fkuVar.e.b() + fgyVar2.b() < 128) {
                    return new fku(fkuVar.d, b(fkuVar.e, fgyVar2));
                }
                if (fkuVar.d.f() > fkuVar.e.f() && fkuVar.f() > fgyVar2.f()) {
                    return new fku(fkuVar.d, new fku(fkuVar.e, fgyVar2));
                }
            }
            if (iB >= c[Math.max(fgyVar.f(), fgyVar2.f()) + 1]) {
                return new fku(fgyVar, fgyVar2);
            }
            fkw fkwVar = new fkw();
            fkwVar.a(fgyVar);
            fkwVar.a(fgyVar2);
            fgy fkuVar2 = (fgy) fkwVar.a.pop();
            while (!fkwVar.a.isEmpty()) {
                fkuVar2 = new fku((fgy) fkwVar.a.pop(), fkuVar2);
            }
            return fkuVar2;
        }
        return fgyVar;
    }

    private static fgy b(fgy fgyVar, fgy fgyVar2) {
        int iB = fgyVar.b();
        int iB2 = fgyVar2.b();
        byte[] bArr = new byte[iB + iB2];
        fgyVar.a(bArr, 0, 0, iB);
        fgyVar2.a(bArr, 0, iB, iB2);
        return fgy.b(bArr);
    }

    @Override // flm.fgy
    public final byte a(int i) {
        b(i, this.f);
        return b(i);
    }

    @Override // flm.fgy
    final byte b(int i) {
        return i < this.g ? this.d.b(i) : this.e.b(i - this.g);
    }

    @Override // flm.fgy
    public final int b() {
        return this.f;
    }

    @Override // flm.fgy
    /* JADX INFO: renamed from: a */
    public final fhf iterator() {
        return new fkv(this);
    }

    @Override // flm.fgy
    protected final int f() {
        return this.h;
    }

    @Override // flm.fgy
    protected final boolean g() {
        return this.f >= c[this.h];
    }

    @Override // flm.fgy
    public final fgy a(int i, int i2) {
        int iC = c(i, i2, this.f);
        if (iC == 0) {
            return fgy.a;
        }
        if (iC != this.f) {
            if (i2 <= this.g) {
                return this.d.a(i, i2);
            }
            if (i >= this.g) {
                return this.e.a(i - this.g, i2 - this.g);
            }
            fgy fgyVar = this.d;
            return new fku(fgyVar.a(i, fgyVar.b()), this.e.a(0, i2 - this.g));
        }
        return this;
    }

    @Override // flm.fgy
    protected final void b(byte[] bArr, int i, int i2, int i3) {
        if (i + i3 <= this.g) {
            this.d.b(bArr, i, i2, i3);
        } else {
            if (i >= this.g) {
                this.e.b(bArr, i - this.g, i2, i3);
                return;
            }
            int i4 = this.g - i;
            this.d.b(bArr, i, i2, i4);
            this.e.b(bArr, 0, i2 + i4, i3 - i4);
        }
    }

    @Override // flm.fgy
    final void a(fgx fgxVar) {
        this.d.a(fgxVar);
        this.e.a(fgxVar);
    }

    @Override // flm.fgy
    protected final String a(Charset charset) {
        return new String(c(), charset);
    }

    @Override // flm.fgy
    public final boolean e() {
        return this.e.a(this.d.a(0, 0, this.g), 0, this.e.b()) == 0;
    }

    @Override // flm.fgy
    protected final int a(int i, int i2, int i3) {
        if (i2 + i3 <= this.g) {
            return this.d.a(i, i2, i3);
        }
        if (i2 >= this.g) {
            return this.e.a(i, i2 - this.g, i3);
        }
        int i4 = this.g - i2;
        return this.e.a(this.d.a(i, i2, i4), 0, i3 - i4);
    }

    @Override // flm.fgy
    public final boolean equals(Object obj) {
        boolean zA;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fgy)) {
            return false;
        }
        fgy fgyVar = (fgy) obj;
        if (this.f != fgyVar.b()) {
            return false;
        }
        if (this.f == 0) {
            return true;
        }
        int i = this.b;
        int i2 = fgyVar.b;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        fkx fkxVar = new fkx(this);
        fhh fhhVar = (fhh) fkxVar.next();
        fkx fkxVar2 = new fkx(fgyVar);
        fhh fhhVar2 = (fhh) fkxVar2.next();
        int i3 = 0;
        fhh fhhVar3 = fhhVar;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int iB = fhhVar3.b() - i4;
            int iB2 = fhhVar2.b() - i3;
            int iMin = Math.min(iB, iB2);
            if (i4 == 0) {
                zA = fhhVar3.a(fhhVar2, i3, iMin);
            } else {
                zA = fhhVar2.a(fhhVar3, i4, iMin);
            }
            if (!zA) {
                return false;
            }
            i5 += iMin;
            if (i5 >= this.f) {
                if (i5 == this.f) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iB) {
                fhhVar3 = (fhh) fkxVar.next();
                i4 = 0;
            } else {
                i4 += iMin;
            }
            if (iMin == iB2) {
                fhhVar3 = fhhVar3;
                fhhVar2 = (fhh) fkxVar2.next();
                i3 = 0;
            } else {
                fhhVar3 = fhhVar3;
                i3 += iMin;
            }
        }
    }

    @Override // flm.fgy
    protected final int b(int i, int i2, int i3) {
        if (i2 + i3 <= this.g) {
            return this.d.b(i, i2, i3);
        }
        if (i2 >= this.g) {
            return this.e.b(i, i2 - this.g, i3);
        }
        int i4 = this.g - i2;
        return this.e.b(this.d.b(i, i2, i4), 0, i3 - i4);
    }

    final Object writeReplace() {
        return fgy.b(c());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // flm.fgy, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    static {
        int i = 1;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        c = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 < c.length) {
                c[i5] = ((Integer) arrayList.get(i5)).intValue();
                i4 = i5 + 1;
            } else {
                return;
            }
        }
    }
}
