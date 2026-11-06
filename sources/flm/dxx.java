package flm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dxx extends dxi implements Set {
    private transient dxm a;

    private static dxx a(Object obj) {
        return new eag(obj);
    }

    public static dxx a(int i, Object... objArr) {
        while (true) {
            switch (i) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    return eaa.a;
                case 1:
                    return a(objArr[0]);
                default:
                    int iA = a(i);
                    Object[] objArr2 = new Object[iA];
                    int i2 = iA - 1;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i; i5++) {
                        Object objA = dzn.a(objArr[i5], i5);
                        int iHashCode = objA.hashCode();
                        int iA2 = dxe.a(iHashCode);
                        while (true) {
                            int i6 = iA2 & i2;
                            Object obj = objArr2[i6];
                            if (obj == null) {
                                objArr[i3] = objA;
                                objArr2[i6] = objA;
                                i4 += iHashCode;
                                i3++;
                            }
                            if (obj.equals(objA)) {
                            }
                            iA2++;
                            break;
                            break;
                        }
                    }
                    Arrays.fill(objArr, i3, i, (Object) null);
                    if (i3 == 1) {
                        return new eag(objArr[0], i4);
                    }
                    if (a(i3) >= iA / 2) {
                        int length = objArr.length;
                        return new eaa(i3 < (length >> 2) + (length >> 1) ? Arrays.copyOf(objArr, i3) : objArr, i4, objArr2, i2, i3);
                    }
                    i = i3;
                    break;
                    break;
            }
        }
    }

    static int a(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit <<= 1;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        dvl.a(iMax < 1073741824, "collection too large");
        return 1073741824;
    }

    public static dxx a(Collection collection) {
        if ((collection instanceof dxx) && !(collection instanceof SortedSet)) {
            dxx dxxVar = (dxx) collection;
            if (!dxxVar.f()) {
                return dxxVar;
            }
        }
        Object[] array = collection.toArray();
        return a(array.length, array);
    }

    public static dxx a(Object[] objArr) {
        switch (objArr.length) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return eaa.a;
            case 1:
                return a(objArr[0]);
            default:
                return a(objArr.length, (Object[]) objArr.clone());
        }
    }

    dxx() {
    }

    boolean h() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof dxx) && h() && ((dxx) obj).h() && hashCode() != obj.hashCode()) {
            return false;
        }
        return eae.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return eae.a(this);
    }

    @Override // flm.dxi
    public dxm e() {
        dxm dxmVar = this.a;
        if (dxmVar != null) {
            return dxmVar;
        }
        dxm dxmVarI = i();
        this.a = dxmVarI;
        return dxmVarI;
    }

    dxm i() {
        return dxm.b(toArray());
    }

    @Override // flm.dxi
    Object writeReplace() {
        return new dxz(toArray());
    }

    @Override // flm.dxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
