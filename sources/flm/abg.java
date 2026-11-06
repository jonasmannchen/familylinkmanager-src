package flm;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abg implements afc {
    public final ArrayList a;
    public final ArrayList b;
    private sk c;
    private final abh d;
    private final boolean e;
    private final afb f;
    private int g;

    public abg(abh abhVar) {
        this(abhVar, false);
    }

    private abg(abh abhVar, boolean z) {
        this.c = new sl(30);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.g = 0;
        this.d = abhVar;
        this.e = false;
        this.f = new afb(this);
    }

    public final void a() {
        a(this.a);
        a(this.b);
        this.g = 0;
    }

    public final void b() {
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        afb afbVar = this.f;
        ArrayList arrayList = this.a;
        while (true) {
            boolean z3 = false;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((abi) arrayList.get(size)).a == 8) {
                        if (z3) {
                            i = size;
                        } else {
                            z2 = z3;
                        }
                    } else {
                        z2 = true;
                    }
                    size--;
                    z3 = z2;
                } else {
                    i = -1;
                }
            }
            if (i != -1) {
                int i5 = i + 1;
                abi abiVar = (abi) arrayList.get(i);
                abi abiVar2 = (abi) arrayList.get(i5);
                switch (abiVar2.a) {
                    case 1:
                        int i6 = 0;
                        if (abiVar.d < abiVar2.b) {
                            i6 = -1;
                        }
                        if (abiVar.b < abiVar2.b) {
                            i6++;
                        }
                        if (abiVar2.b <= abiVar.b) {
                            abiVar.b += abiVar2.d;
                        }
                        if (abiVar2.b <= abiVar.d) {
                            abiVar.d += abiVar2.d;
                        }
                        abiVar2.b = i6 + abiVar2.b;
                        arrayList.set(i, abiVar2);
                        arrayList.set(i5, abiVar);
                        break;
                    case 2:
                        abi abiVarA = null;
                        boolean z4 = false;
                        if (abiVar.b < abiVar.d) {
                            z = false;
                            if (abiVar2.b == abiVar.b && abiVar2.d == abiVar.d - abiVar.b) {
                                z4 = true;
                            }
                        } else {
                            z = true;
                            if (abiVar2.b == abiVar.d + 1 && abiVar2.d == abiVar.b - abiVar.d) {
                                z4 = true;
                            }
                        }
                        if (abiVar.d < abiVar2.b) {
                            abiVar2.b--;
                        } else if (abiVar.d < abiVar2.b + abiVar2.d) {
                            abiVar2.d--;
                            abiVar.a = 2;
                            abiVar.d = 1;
                            if (abiVar2.d == 0) {
                                arrayList.remove(i5);
                                afbVar.a.a(abiVar2);
                            }
                            break;
                        }
                        if (abiVar.b <= abiVar2.b) {
                            abiVar2.b++;
                        } else if (abiVar.b < abiVar2.b + abiVar2.d) {
                            abiVarA = afbVar.a.a(2, abiVar.b + 1, (abiVar2.b + abiVar2.d) - abiVar.b, null);
                            abiVar2.d = abiVar.b - abiVar2.b;
                        }
                        if (z4) {
                            arrayList.set(i, abiVar2);
                            arrayList.remove(i5);
                            afbVar.a.a(abiVar);
                        } else {
                            if (z) {
                                if (abiVarA != null) {
                                    if (abiVar.b > abiVarA.b) {
                                        abiVar.b -= abiVarA.d;
                                    }
                                    if (abiVar.d > abiVarA.b) {
                                        abiVar.d -= abiVarA.d;
                                    }
                                }
                                if (abiVar.b > abiVar2.b) {
                                    abiVar.b -= abiVar2.d;
                                }
                                if (abiVar.d > abiVar2.b) {
                                    abiVar.d -= abiVar2.d;
                                }
                            } else {
                                if (abiVarA != null) {
                                    if (abiVar.b >= abiVarA.b) {
                                        abiVar.b -= abiVarA.d;
                                    }
                                    if (abiVar.d >= abiVarA.b) {
                                        abiVar.d -= abiVarA.d;
                                    }
                                }
                                if (abiVar.b >= abiVar2.b) {
                                    abiVar.b -= abiVar2.d;
                                }
                                if (abiVar.d >= abiVar2.b) {
                                    abiVar.d -= abiVar2.d;
                                }
                            }
                            arrayList.set(i, abiVar2);
                            if (abiVar.b != abiVar.d) {
                                arrayList.set(i5, abiVar);
                            } else {
                                arrayList.remove(i5);
                            }
                            if (abiVarA != null) {
                                arrayList.add(i, abiVarA);
                            }
                        }
                        break;
                    case 4:
                        abi abiVarA2 = null;
                        abi abiVarA3 = null;
                        if (abiVar.d < abiVar2.b) {
                            abiVar2.b--;
                        } else if (abiVar.d < abiVar2.b + abiVar2.d) {
                            abiVar2.d--;
                            abiVarA2 = afbVar.a.a(4, abiVar.b, 1, abiVar2.c);
                        }
                        if (abiVar.b <= abiVar2.b) {
                            abiVar2.b++;
                        } else if (abiVar.b < abiVar2.b + abiVar2.d) {
                            int i7 = (abiVar2.b + abiVar2.d) - abiVar.b;
                            abiVarA3 = afbVar.a.a(4, abiVar.b + 1, i7, abiVar2.c);
                            abiVar2.d -= i7;
                        }
                        arrayList.set(i5, abiVar);
                        if (abiVar2.d > 0) {
                            arrayList.set(i, abiVar2);
                        } else {
                            arrayList.remove(i);
                            afbVar.a.a(abiVar2);
                        }
                        if (abiVarA2 != null) {
                            arrayList.add(i, abiVarA2);
                        }
                        if (abiVarA3 != null) {
                            arrayList.add(i, abiVarA3);
                        }
                        break;
                }
            } else {
                int size2 = this.a.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    abi abiVarA4 = (abi) this.a.get(i8);
                    switch (abiVarA4.a) {
                        case 1:
                            c(abiVarA4);
                            break;
                        case 2:
                            int i9 = abiVarA4.b;
                            int i10 = abiVarA4.d + abiVarA4.b;
                            byte b2 = -1;
                            int i11 = abiVarA4.b;
                            int i12 = 0;
                            while (i11 < i10) {
                                boolean z5 = false;
                                if (this.d.a(i11) != null || b(i11)) {
                                    if (b2 == 0) {
                                        b(a(2, i9, i12, null));
                                        z5 = true;
                                    }
                                    b2 = 1;
                                } else {
                                    if (b2 == 1) {
                                        c(a(2, i9, i12, null));
                                        z5 = true;
                                    }
                                    b2 = 0;
                                }
                                if (z5) {
                                    i4 = i11 - i12;
                                    i2 = i10 - i12;
                                    i3 = 1;
                                } else {
                                    int i13 = i11;
                                    i2 = i10;
                                    i3 = i12 + 1;
                                    i4 = i13;
                                }
                                i12 = i3;
                                i10 = i2;
                                i11 = i4 + 1;
                            }
                            if (i12 != abiVarA4.d) {
                                a(abiVarA4);
                                abiVarA4 = a(2, i9, i12, null);
                            }
                            if (b2 == 0) {
                                b(abiVarA4);
                            } else {
                                c(abiVarA4);
                            }
                            break;
                        case 4:
                            int i14 = abiVarA4.b;
                            int i15 = abiVarA4.b + abiVarA4.d;
                            int i16 = abiVarA4.b;
                            int i17 = 0;
                            int i18 = i14;
                            byte b3 = -1;
                            while (i16 < i15) {
                                if (this.d.a(i16) != null || b(i16)) {
                                    if (b3 == 0) {
                                        b(a(4, i18, i17, abiVarA4.c));
                                        i17 = 0;
                                        i18 = i16;
                                    }
                                    b = 1;
                                } else {
                                    if (b3 == 1) {
                                        c(a(4, i18, i17, abiVarA4.c));
                                        i17 = 0;
                                        i18 = i16;
                                    }
                                    b = 0;
                                }
                                i16++;
                                i17++;
                                i18 = i18;
                                b3 = b;
                            }
                            if (i17 != abiVarA4.d) {
                                Object obj = abiVarA4.c;
                                a(abiVarA4);
                                abiVarA4 = a(4, i18, i17, obj);
                            }
                            if (b3 == 0) {
                                b(abiVarA4);
                            } else {
                                c(abiVarA4);
                            }
                            break;
                        case 8:
                            c(abiVarA4);
                            break;
                    }
                }
                this.a.clear();
                return;
            }
        }
    }

    public final void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.d.b((abi) this.b.get(i));
        }
        a(this.b);
        this.g = 0;
    }

    private final void b(abi abiVar) {
        int i;
        boolean z;
        if (abiVar.a == 1 || abiVar.a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iB = b(abiVar.b, abiVar.a);
        int i2 = abiVar.b;
        switch (abiVar.a) {
            case 2:
                i = 0;
                break;
            case 3:
            default:
                throw new IllegalArgumentException("op should be remove or update." + abiVar);
            case 4:
                i = 1;
                break;
        }
        int i3 = 1;
        int i4 = iB;
        int i5 = i2;
        for (int i6 = 1; i6 < abiVar.d; i6++) {
            int iB2 = b(abiVar.b + (i * i6), abiVar.a);
            switch (abiVar.a) {
                case 2:
                    z = iB2 == i4;
                    break;
                case 3:
                default:
                    z = false;
                    break;
                case 4:
                    z = iB2 == i4 + 1;
                    break;
            }
            if (z) {
                i3++;
            } else {
                abi abiVarA = a(abiVar.a, i4, i3, abiVar.c);
                a(abiVarA, i5);
                a(abiVarA);
                if (abiVar.a == 4) {
                    i5 += i3;
                }
                i3 = 1;
                i4 = iB2;
            }
        }
        Object obj = abiVar.c;
        a(abiVar);
        if (i3 > 0) {
            abi abiVarA2 = a(abiVar.a, i4, i3, obj);
            a(abiVarA2, i5);
            a(abiVarA2);
        }
    }

    private final void a(abi abiVar, int i) {
        this.d.a(abiVar);
        switch (abiVar.a) {
            case 2:
                this.d.a(i, abiVar.d);
                return;
            case 3:
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            case 4:
                this.d.a(i, abiVar.d, abiVar.c);
                return;
        }
    }

    private final int b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = this.b.size() - 1;
        int i6 = i;
        while (size >= 0) {
            abi abiVar = (abi) this.b.get(size);
            if (abiVar.a == 8) {
                if (abiVar.b < abiVar.d) {
                    i4 = abiVar.b;
                    i5 = abiVar.d;
                } else {
                    i4 = abiVar.d;
                    i5 = abiVar.b;
                }
                if (i6 >= i4 && i6 <= i5) {
                    if (i4 == abiVar.b) {
                        if (i2 == 1) {
                            abiVar.d++;
                        } else if (i2 == 2) {
                            abiVar.d--;
                        }
                        i3 = i6 + 1;
                    } else {
                        if (i2 == 1) {
                            abiVar.b++;
                        } else if (i2 == 2) {
                            abiVar.b--;
                        }
                        i3 = i6 - 1;
                    }
                } else if (i6 >= abiVar.b) {
                    i3 = i6;
                } else if (i2 == 1) {
                    abiVar.b++;
                    abiVar.d++;
                    i3 = i6;
                } else {
                    if (i2 == 2) {
                        abiVar.b--;
                        abiVar.d--;
                    }
                    i3 = i6;
                }
            } else if (abiVar.b <= i6) {
                if (abiVar.a == 1) {
                    i3 = i6 - abiVar.d;
                } else {
                    i3 = abiVar.a == 2 ? abiVar.d + i6 : i6;
                }
            } else if (i2 == 1) {
                abiVar.b++;
                i3 = i6;
            } else if (i2 == 2) {
                abiVar.b--;
            }
            size--;
            i6 = i3;
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            abi abiVar2 = (abi) this.b.get(size2);
            if (abiVar2.a == 8) {
                if (abiVar2.d == abiVar2.b || abiVar2.d < 0) {
                    this.b.remove(size2);
                    a(abiVar2);
                }
            } else if (abiVar2.d <= 0) {
                this.b.remove(size2);
                a(abiVar2);
            }
        }
        return i6;
    }

    private final boolean b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            abi abiVar = (abi) this.b.get(i2);
            if (abiVar.a == 8) {
                if (a(abiVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (abiVar.a == 1) {
                int i3 = abiVar.b + abiVar.d;
                for (int i4 = abiVar.b; i4 < i3; i4++) {
                    if (a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private final void c(abi abiVar) {
        this.b.add(abiVar);
        switch (abiVar.a) {
            case 1:
                this.d.c(abiVar.b, abiVar.d);
                return;
            case 2:
                this.d.b(abiVar.b, abiVar.d);
                return;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                throw new IllegalArgumentException("Unknown update op type for " + abiVar);
            case 4:
                this.d.a(abiVar.b, abiVar.d, abiVar.c);
                return;
            case 8:
                this.d.d(abiVar.b, abiVar.d);
                return;
        }
    }

    public final boolean d() {
        return this.a.size() > 0;
    }

    public final boolean a(int i) {
        return (i & 0) != 0;
    }

    final int a(int i, int i2) {
        int size = this.b.size();
        int i3 = i;
        while (i2 < size) {
            abi abiVar = (abi) this.b.get(i2);
            if (abiVar.a == 8) {
                if (abiVar.b == i3) {
                    i3 = abiVar.d;
                } else {
                    if (abiVar.b < i3) {
                        i3--;
                    }
                    if (abiVar.d <= i3) {
                        i3++;
                    }
                }
            } else if (abiVar.b > i3) {
                continue;
            } else if (abiVar.a == 2) {
                if (i3 < abiVar.b + abiVar.d) {
                    return -1;
                }
                i3 -= abiVar.d;
            } else if (abiVar.a == 1) {
                i3 += abiVar.d;
            }
            i2++;
        }
        return i3;
    }

    public final void e() {
        c();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            abi abiVar = (abi) this.a.get(i);
            switch (abiVar.a) {
                case 1:
                    this.d.b(abiVar);
                    this.d.c(abiVar.b, abiVar.d);
                    break;
                case 2:
                    this.d.b(abiVar);
                    this.d.a(abiVar.b, abiVar.d);
                    break;
                case 4:
                    this.d.b(abiVar);
                    this.d.a(abiVar.b, abiVar.d, abiVar.c);
                    break;
                case 8:
                    this.d.b(abiVar);
                    this.d.d(abiVar.b, abiVar.d);
                    break;
            }
        }
        a(this.a);
        this.g = 0;
    }

    @Override // flm.afc
    public final abi a(int i, int i2, int i3, Object obj) {
        abi abiVar = (abi) this.c.a();
        if (abiVar == null) {
            return new abi(i, i2, i3, obj);
        }
        abiVar.a = i;
        abiVar.b = i2;
        abiVar.d = i3;
        abiVar.c = obj;
        return abiVar;
    }

    @Override // flm.afc
    public final void a(abi abiVar) {
        if (!this.e) {
            abiVar.c = null;
            this.c.a(abiVar);
        }
    }

    private final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((abi) list.get(i));
        }
        list.clear();
    }
}
