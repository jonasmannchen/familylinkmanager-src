package flm;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fmw {
    public final Class a;
    public final boolean b;
    private final int c;
    private final int d;
    private final fin e;

    public fmw(int i, Class cls, int i2, boolean z) {
        this(i, cls, null, i2, false);
    }

    private fmw(int i, Class cls, fin finVar, int i2, boolean z) {
        this.c = i;
        this.a = cls;
        this.d = i2;
        this.b = z;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmw)) {
            return false;
        }
        fmw fmwVar = (fmw) obj;
        return this.c == fmwVar.c && this.a == fmwVar.a && this.d == fmwVar.d && this.b == fmwVar.b;
    }

    public final int hashCode() {
        return (this.b ? 1 : 0) + ((((((this.c + 1147) * 31) + this.a.hashCode()) * 31) + this.d) * 31);
    }

    final Object a(List list) {
        Object objCast;
        if (list == null) {
            return null;
        }
        if (this.b) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                fnd fndVar = (fnd) list.get(i);
                if (fndVar.b.length != 0) {
                    byte[] bArr = fndVar.b;
                    arrayList.add(a(fms.a(bArr, 0, bArr.length)));
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                Object objCast2 = this.a.cast(Array.newInstance(this.a.getComponentType(), size));
                for (int i2 = 0; i2 < size; i2++) {
                    Array.set(objCast2, i2, arrayList.get(i2));
                }
                return objCast2;
            }
            objCast = null;
        } else {
            if (list.isEmpty()) {
                return null;
            }
            fnd fndVar2 = (fnd) list.get(list.size() - 1);
            Class cls = this.a;
            byte[] bArr2 = fndVar2.b;
            objCast = cls.cast(a(fms.a(bArr2, 0, bArr2.length)));
        }
        return objCast;
    }

    private final Object a(fms fmsVar) {
        Class<?> componentType = this.b ? this.a.getComponentType() : this.a;
        try {
            switch (this.c) {
                case 10:
                    if (this.e != null) {
                        return fmsVar.a((fko) this.e.a(dp.aw, (Object) null), this.d >>> 3);
                    }
                    fnb fnbVar = (fnb) componentType.newInstance();
                    int i = this.d >>> 3;
                    if (fmsVar.f >= fmsVar.g) {
                        throw fna.d();
                    }
                    fmsVar.f++;
                    fnbVar.a(fmsVar);
                    fmsVar.a((i << 3) | 4);
                    fmsVar.f--;
                    return fnbVar;
                case 11:
                    if (this.e != null) {
                        return fmsVar.a((fko) this.e.a(dp.aw, (Object) null));
                    }
                    fnb fnbVar2 = (fnb) componentType.newInstance();
                    fmsVar.a(fnbVar2);
                    return fnbVar2;
                default:
                    throw new IllegalArgumentException(new StringBuilder(24).append("Unknown type ").append(this.c).toString());
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Error reading extension field", e);
        } catch (IllegalAccessException e2) {
            String strValueOf = String.valueOf(componentType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 33).append("Error creating instance of class ").append(strValueOf).toString(), e2);
        } catch (InstantiationException e3) {
            String strValueOf2 = String.valueOf(componentType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf2).length() + 33).append("Error creating instance of class ").append(strValueOf2).toString(), e3);
        }
    }

    protected final void a(Object obj, fmt fmtVar) {
        try {
            fmtVar.c(this.d);
            switch (this.c) {
                case 10:
                    int i = this.d >>> 3;
                    if (this.e == null) {
                        ((fnb) obj).a(fmtVar);
                    } else {
                        fhp fhpVarA = fmtVar.a();
                        ((fke) obj).a(fhpVarA);
                        fhpVarA.h();
                        fmtVar.b = fmtVar.a.position();
                    }
                    fmtVar.c(i, 4);
                    return;
                case 11:
                    if (this.e == null) {
                        fmtVar.a((fnb) obj);
                        return;
                    }
                    fke fkeVar = (fke) obj;
                    fmtVar.c(fkeVar.g());
                    fhp fhpVarA2 = fmtVar.a();
                    fkeVar.a(fhpVarA2);
                    fhpVarA2.h();
                    fmtVar.b = fmtVar.a.position();
                    return;
                default:
                    throw new IllegalArgumentException(new StringBuilder(24).append("Unknown type ").append(this.c).toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    protected final int a(Object obj) {
        int i = this.d >>> 3;
        switch (this.c) {
            case 10:
                if (this.e == null) {
                    return (fmt.b(i) << 1) + ((fnb) obj).d();
                }
                return fhp.e(i, (fke) obj);
            case 11:
                if (this.e == null) {
                    return fmt.b(i, (fnb) obj);
                }
                return fhp.c(i, (fke) obj);
            default:
                throw new IllegalArgumentException(new StringBuilder(24).append("Unknown type ").append(this.c).toString());
        }
    }
}
