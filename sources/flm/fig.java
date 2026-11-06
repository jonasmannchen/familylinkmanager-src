package flm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fig {
    public static final fig d = new fig((byte) 0);
    public boolean b;
    public boolean c = false;
    public final flb a = flb.a(16);

    private fig() {
    }

    private fig(byte b) {
        a();
    }

    public final void a() {
        if (!this.b) {
            this.a.a();
            this.b = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fig)) {
            return false;
        }
        return this.a.equals(((fig) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator b() {
        return this.c ? new fjl(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public final Object a(fih fihVar) {
        Object obj = this.a.get(fihVar);
        if (obj instanceof fjj) {
            return fjj.a();
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [flm.flb] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(fih fihVar, Object obj) {
        ?? arrayList;
        if (fihVar.d()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                a(fihVar.b(), obj2);
            }
        } else {
            a(fihVar.b(), obj);
            arrayList = obj;
        }
        if (arrayList instanceof fjj) {
            this.c = true;
        }
        this.a.put(fihVar, arrayList);
    }

    static void a(fmj fmjVar, Object obj) {
        boolean z = false;
        fiv.a(obj);
        switch (fmjVar.s.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof fgy) || (obj instanceof byte[])) {
                    z = true;
                }
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof fiy)) {
                    z = true;
                }
                break;
            case 8:
                if ((obj instanceof fke) || (obj instanceof fjj)) {
                    z = true;
                }
                break;
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final boolean c() {
        for (int i = 0; i < this.a.b(); i++) {
            if (!c(this.a.b(i))) {
                return false;
            }
        }
        Iterator it = this.a.c().iterator();
        while (it.hasNext()) {
            if (!c((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(Map.Entry entry) {
        fih fihVar = (fih) entry.getKey();
        if (fihVar.c() == fmo.MESSAGE) {
            if (fihVar.d()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((fke) it.next()).f()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof fke) {
                    if (!((fke) value).f()) {
                        return false;
                    }
                } else {
                    if (value instanceof fjj) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static Object a(Object obj) {
        if (obj instanceof fkk) {
            return ((fkk) obj).c();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    final void a(Map.Entry entry) {
        fke fkeVarH;
        fih fihVar = (fih) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof fjj) {
            value = fjj.a();
        }
        if (fihVar.d()) {
            Object objA = a(fihVar);
            if (objA == null) {
                objA = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objA).add(a(it.next()));
            }
            this.a.put(fihVar, objA);
            return;
        }
        if (fihVar.c() == fmo.MESSAGE) {
            Object objA2 = a(fihVar);
            if (objA2 == null) {
                this.a.put(fihVar, a(value));
                return;
            }
            if (objA2 instanceof fkk) {
                fkeVarH = fihVar.g();
            } else {
                ((fke) objA2).k();
                fkeVarH = fihVar.f().h();
            }
            this.a.put(fihVar, fkeVarH);
            return;
        }
        this.a.put(fihVar, a(value));
    }

    static void a(fhp fhpVar, fmj fmjVar, int i, Object obj) {
        if (fmjVar == fmj.j) {
            if (fiv.a((fke) obj)) {
                fhpVar.a(i, 3);
                ((fke) obj).a(fhpVar);
            } else {
                fhpVar.a(i, 3);
                ((fke) obj).a(fhpVar);
                fhpVar.a(i, 4);
                return;
            }
        }
        fhpVar.a(i, fmjVar.t);
        switch (fmjVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                fhpVar.a(((Double) obj).doubleValue());
                break;
            case 1:
                fhpVar.a(((Float) obj).floatValue());
                break;
            case 2:
                fhpVar.a(((Long) obj).longValue());
                break;
            case 3:
                fhpVar.a(((Long) obj).longValue());
                break;
            case 4:
                fhpVar.b(((Integer) obj).intValue());
                break;
            case 5:
                fhpVar.c(((Long) obj).longValue());
                break;
            case 6:
                fhpVar.e(((Integer) obj).intValue());
                break;
            case 7:
                fhpVar.a(((Boolean) obj).booleanValue());
                break;
            case 8:
                if (obj instanceof fgy) {
                    fhpVar.a((fgy) obj);
                } else {
                    fhpVar.a((String) obj);
                }
                break;
            case 9:
                ((fke) obj).a(fhpVar);
                break;
            case 10:
                fhpVar.a((fke) obj);
                break;
            case 11:
                if (obj instanceof fgy) {
                    fhpVar.a((fgy) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    fhpVar.d(bArr, 0, bArr.length);
                }
                break;
            case 12:
                fhpVar.c(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof fiy) {
                    fhpVar.b(((fiy) obj).a());
                } else {
                    fhpVar.b(((Integer) obj).intValue());
                }
                break;
            case 14:
                fhpVar.e(((Integer) obj).intValue());
                break;
            case 15:
                fhpVar.c(((Long) obj).longValue());
                break;
            case 16:
                fhpVar.d(((Integer) obj).intValue());
                break;
            case 17:
                fhpVar.b(((Long) obj).longValue());
                break;
        }
    }

    static int b(Map.Entry entry) {
        fih fihVar = (fih) entry.getKey();
        Object value = entry.getValue();
        if (fihVar.c() == fmo.MESSAGE && !fihVar.d() && !fihVar.e()) {
            if (value instanceof fjj) {
                return fhp.b(((fih) entry.getKey()).a(), (fjj) value);
            }
            return fhp.d(((fih) entry.getKey()).a(), (fke) value);
        }
        return b(fihVar, value);
    }

    static int a(fmj fmjVar, int i, Object obj) {
        int iF = fhp.f(i);
        return ((fmjVar != fmj.j || fiv.a((fke) obj)) ? iF : iF << 1) + b(fmjVar, obj);
    }

    private static int b(fmj fmjVar, Object obj) {
        switch (fmjVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                ((Double) obj).doubleValue();
                return fhp.f();
            case 1:
                ((Float) obj).floatValue();
                return fhp.e();
            case 2:
                return fhp.d(((Long) obj).longValue());
            case 3:
                return fhp.e(((Long) obj).longValue());
            case 4:
                return fhp.g(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return fhp.c();
            case 6:
                ((Integer) obj).intValue();
                return fhp.a();
            case 7:
                ((Boolean) obj).booleanValue();
                return fhp.g();
            case 8:
                if (obj instanceof fgy) {
                    return fhp.b((fgy) obj);
                }
                return fhp.b((String) obj);
            case 9:
                return fhp.c((fke) obj);
            case 10:
                if (obj instanceof fjj) {
                    return fhp.a((fjj) obj);
                }
                return fhp.b((fke) obj);
            case 11:
                if (obj instanceof fgy) {
                    return fhp.b((fgy) obj);
                }
                return fhp.b((byte[]) obj);
            case 12:
                return fhp.h(((Integer) obj).intValue());
            case 13:
                if (obj instanceof fiy) {
                    return fhp.j(((fiy) obj).a());
                }
                return fhp.j(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return fhp.b();
            case 15:
                ((Long) obj).longValue();
                return fhp.d();
            case 16:
                return fhp.i(((Integer) obj).intValue());
            case 17:
                return fhp.f(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int b(fih fihVar, Object obj) {
        int iA = 0;
        fmj fmjVarB = fihVar.b();
        int iA2 = fihVar.a();
        if (fihVar.d()) {
            if (fihVar.e()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    iA += b(fmjVarB, it.next());
                }
                return fhp.l(iA) + fhp.f(iA2) + iA;
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                iA += a(fmjVarB, iA2, it2.next());
            }
            return iA;
        }
        return a(fmjVarB, iA2, obj);
    }

    public final /* synthetic */ Object clone() {
        fig figVar = new fig();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.b()) {
                break;
            }
            Map.Entry entryB = this.a.b(i2);
            figVar.a((fih) entryB.getKey(), entryB.getValue());
            i = i2 + 1;
        }
        for (Map.Entry entry : this.a.c()) {
            figVar.a((fih) entry.getKey(), entry.getValue());
        }
        figVar.c = this.c;
        return figVar;
    }
}
