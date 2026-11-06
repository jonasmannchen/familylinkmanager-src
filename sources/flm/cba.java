package flm;

import android.os.Bundle;
import com.google.android.gms.kids.database.SupervisionDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cba implements cat {
    @Override // flm.cat
    public final void a(Bundle bundle) throws bxj {
        if (bsy.a()) {
            List listA = bts.a();
            listA.remove(bts.c());
            List listA2 = dyu.a(listA, cbb.a);
            bvf bvfVarQ = SupervisionDatabase.h().q();
            bvfVarQ.b(listA2);
            if (listA2.isEmpty()) {
                return;
            }
            final long jB = btj.b();
            List listA3 = a(listA2);
            bvfVarQ.a(dyu.a(listA3, new dvc(jB) { // from class: flm.cbc
                private final long a;

                {
                    this.a = jB;
                }

                @Override // flm.dvc
                public final Object a(Object obj) {
                    long j = this.a;
                    evt evtVar = (evt) obj;
                    String str = evtVar.b;
                    evv evvVarA = evv.a(evtVar.c);
                    if (evvVarA == null) {
                        evvVarA = evv.UNKNOWN_CONSENT_STATUS;
                    }
                    return new bvi(str, evvVarA == evv.VALID, j);
                }
            }));
            listA2.removeAll(dyu.a(listA3, cbd.a));
            if (listA2.isEmpty()) {
                return;
            }
            btt.r();
            bvfVarQ.a(dyu.a(listA2, new dvc(jB) { // from class: flm.cbe
                private final long a;

                {
                    this.a = jB;
                }

                @Override // flm.dvc
                public final Object a(Object obj) {
                    return new bvi((String) obj, false, this.a);
                }
            }));
        }
    }

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
    private static List a(List list) throws bxj {
        try {
            ezx ezxVar = (ezx) ((fio) ezw.e.a(dp.au, (Object) null));
            eww ewwVar = (eww) ((fio) ewv.c.a(dp.au, (Object) null));
            String strA = btl.a();
            ewwVar.c();
            ewv ewvVar = (ewv) ewwVar.a;
            if (strA == null) {
                throw new NullPointerException();
            }
            ewvVar.a |= 1;
            ewvVar.b = strA;
            ezxVar.c();
            ezw ezwVar = (ezw) ezxVar.a;
            ezwVar.c = (ewv) ((fin) ewwVar.h());
            ezwVar.a |= 4;
            ezxVar.c();
            ezw ezwVar2 = (ezw) ezxVar.a;
            if ("me" == 0) {
                throw new NullPointerException();
            }
            ezwVar2.a |= 2;
            ezwVar2.b = "me";
            ezxVar.c();
            ezw ezwVar3 = (ezw) ezxVar.a;
            if (!ezwVar3.d.a()) {
                ezwVar3.d = fin.a(ezwVar3.d);
            }
            List list2 = ezwVar3.d;
            fiv.a(list);
            if (list instanceof fjo) {
                List listD = ((fjo) list).d();
                fjo fjoVar = (fjo) list2;
                int size = list2.size();
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
            } else if (list instanceof fkp) {
                list2.addAll(list);
            } else {
                if ((list2 instanceof ArrayList) && (list instanceof Collection)) {
                    ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
                }
                int size3 = list2.size();
                for (Object obj2 : list) {
                    if (obj2 == null) {
                        String string2 = new StringBuilder(37).append("Element at index ").append(list2.size() - size3).append(" is null.").toString();
                        for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                            list2.remove(size4);
                        }
                        throw new NullPointerException(string2);
                    }
                    list2.add(obj2);
                }
            }
            ezw ezwVar4 = (ezw) ((fin) ezxVar.h());
            car carVarA = cal.a();
            baw bawVarD = cal.d();
            if (car.j == null) {
                car.j = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/ListSecondaryAccountConsentStatuses", gkn.a(ezw.e), gkn.a(ezy.c));
            }
            return ((ezy) carVarA.a.a(car.j, bawVarD, ezwVar4, 10000L, TimeUnit.MILLISECONDS)).b;
        } catch (alt e) {
            e = e;
            throw new bxj("Error occurred while making gRPC call to ListSecondaryAccountConsentStatuses", e);
        } catch (fvg e2) {
            e = e2;
            throw new bxj("Error occurred while making gRPC call to ListSecondaryAccountConsentStatuses", e);
        }
    }
}
