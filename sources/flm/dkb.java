package flm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dkb {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static gsx a() {
        try {
            dkh dkhVar = dkg.a;
            gsz[] gszVarArr = (gsz[]) new dkf().a(gtv.INIT_ALL, dkhVar.a, dkhVar.e).a(gtv.INIT_SHUTDOWN, dkhVar.a, dkhVar.b).a(gtv.INIT_CONFIGS, dkhVar.b, dkhVar.c).a(gtv.INIT_FLAGS, dkhVar.c, dkhVar.d).a.toArray(new gsz[0]);
            if (gszVarArr == null || gszVarArr.length == 0) {
                return null;
            }
            gsy gsyVar = (gsy) ((fio) gsx.b.a(dp.au, (Object) null));
            List listAsList = Arrays.asList(gszVarArr);
            gsyVar.c();
            gsx gsxVar = (gsx) gsyVar.a;
            if (!gsxVar.a.a()) {
                gsxVar.a = fin.a(gsxVar.a);
            }
            List list = gsxVar.a;
            fiv.a(listAsList);
            if (listAsList instanceof fjo) {
                List listD = ((fjo) listAsList).d();
                fjo fjoVar = (fjo) list;
                int size = list.size();
                for (Object obj : listD) {
                    if (obj == null) {
                        String string = new StringBuilder(37).append("Element at index ").append(fjoVar.size() - size).append(" is null.").toString();
                        for (int size2 = fjoVar.size() - 1; size2 >= size; size2--) {
                            fjoVar.remove(size2);
                        }
                        throw new NullPointerException(string);
                    }
                    if (obj instanceof fgy) {
                        fjoVar.a((fgy) obj);
                    } else {
                        fjoVar.add((String) obj);
                    }
                }
            } else if (listAsList instanceof fkp) {
                list.addAll(listAsList);
            } else {
                if ((list instanceof ArrayList) && (listAsList instanceof Collection)) {
                    ((ArrayList) list).ensureCapacity(listAsList.size() + list.size());
                }
                int size3 = list.size();
                for (Object obj2 : listAsList) {
                    if (obj2 == null) {
                        String string2 = new StringBuilder(37).append("Element at index ").append(list.size() - size3).append(" is null.").toString();
                        for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                            list.remove(size4);
                        }
                        throw new NullPointerException(string2);
                    }
                    list.add(obj2);
                }
            }
            return (gsx) ((fin) gsyVar.h());
        } catch (RuntimeException e) {
            dkm.b("PrimesForPrimes", "Exception getting Primes Init timers", e, new Object[0]);
            return null;
        }
    }
}
