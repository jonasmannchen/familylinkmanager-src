package flm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnx {
    public static boolean a(dnt dntVar) {
        return !(dntVar instanceof dnp);
    }

    public static dof a(dod dodVar) {
        return dnu.a(dodVar, Collections.emptyList(), Arrays.asList("java.lang.Class"), Collections.emptyList());
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
    public final gqu a(dof dofVar, dod dodVar) {
        int size;
        gqv gqvVar = (gqv) ((fio) gqu.h.a(dp.au, (Object) null));
        List arrayList = new ArrayList(dofVar.a.b);
        doi doiVar = new doi();
        dom domVarB = dofVar.a.b();
        while (domVarB.a()) {
            dnp dnpVar = (dnp) domVarB.b;
            doiVar.a(domVarB.a, arrayList.size());
            gqn gqnVar = (gqn) ((fio) gqm.f.a(dp.au, (Object) null));
            String strC = dnpVar.c(dodVar);
            gqnVar.c();
            gqm gqmVar = (gqm) gqnVar.a;
            if (strC == null) {
                throw new NullPointerException();
            }
            gqmVar.a |= 2;
            gqmVar.c = strC;
            int i = dnpVar.i;
            gqnVar.c();
            gqm gqmVar2 = (gqm) gqnVar.a;
            gqmVar2.a |= 4;
            gqmVar2.e = i;
            arrayList.add((gqm) ((fin) gqnVar.h()));
        }
        dom domVarB2 = dofVar.a.b();
        while (domVarB2.a()) {
            dnp dnpVar2 = (dnp) domVarB2.b;
            int iB = doiVar.b(domVarB2.a);
            gqm gqmVar3 = (gqm) arrayList.get(iB);
            fio fioVar = (fio) gqmVar3.a(dp.au, (Object) null);
            fioVar.a((fin) gqmVar3);
            gqn gqnVar2 = (gqn) fioVar;
            if (dnpVar2.g != null) {
                int iB2 = doiVar.b(dnpVar2.g.e(dodVar)) + 1;
                gqnVar2.c();
                gqm gqmVar4 = (gqm) gqnVar2.a;
                gqmVar4.a |= 1;
                gqmVar4.b = iB2;
            } else {
                gqnVar2.c();
                gqm gqmVar5 = (gqm) gqnVar2.a;
                gqmVar5.a &= -2;
                gqmVar5.b = 0;
            }
            arrayList.set(iB, (gqm) ((fin) gqnVar2.h()));
        }
        List arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        dom domVarB3 = dofVar.b.b();
        while (domVarB3.a()) {
            if (domVarB3.b instanceof dnq) {
                doiVar.a(domVarB3.a, arrayList2.size());
                dnq dnqVar = (dnq) domVarB3.b;
                gqp gqpVar = (gqp) ((fio) gqo.d.a(dp.au, (Object) null));
                int iB3 = doiVar.b(dnqVar.a.e(dodVar)) + 1;
                gqpVar.c();
                gqo gqoVar = (gqo) gqpVar.a;
                gqoVar.a |= 1;
                gqoVar.b = iB3;
                arrayList2.add((gqo) ((fin) gqpVar.h()));
            } else if (domVarB3.b instanceof dno) {
                doiVar.a(domVarB3.a, arrayList3.size());
                dno dnoVar = (dno) domVarB3.b;
                gql gqlVar = (gql) ((fio) gqk.d.a(dp.au, (Object) null));
                int iB4 = doiVar.b(dnoVar.a.e(dodVar)) + 1;
                gqlVar.c();
                gqk gqkVar = (gqk) gqlVar.a;
                gqkVar.a |= 1;
                gqkVar.b = iB4;
                arrayList3.add((gqk) ((fin) gqlVar.h()));
            } else if (domVarB3.b instanceof dnw) {
                doiVar.a(domVarB3.a, ((gqu) gqvVar.a).e.size());
                dnw dnwVar = (dnw) domVarB3.b;
                gqx gqxVar = (gqx) ((fio) gqw.d.a(dp.au, (Object) null));
                int iA = dnwVar.a(dodVar);
                gqxVar.c();
                gqw gqwVar = (gqw) gqxVar.a;
                gqwVar.a |= 2;
                gqwVar.c = iA;
                gqy gqyVarA = gqy.a(dnwVar.c(dodVar));
                if (gqyVarA != null) {
                    gqxVar.c();
                    gqw gqwVar2 = (gqw) gqxVar.a;
                    if (gqyVarA == null) {
                        throw new NullPointerException();
                    }
                    gqwVar2.a |= 1;
                    gqwVar2.b = gqyVarA.a;
                }
                gqw gqwVar3 = (gqw) ((fin) gqxVar.h());
                gqvVar.c();
                gqu gquVar = (gqu) gqvVar.a;
                if (gqwVar3 == null) {
                    throw new NullPointerException();
                }
                if (!gquVar.e.a()) {
                    gquVar.e = fin.a(gquVar.e);
                }
                gquVar.e.add(gqwVar3);
            } else {
                continue;
            }
        }
        dok dokVar = dofVar.a;
        dok dokVar2 = dofVar.b;
        dom domVarB4 = dokVar2.b();
        while (domVarB4.a()) {
            dnt dntVar = (dnt) domVarB4.b;
            if (!(dntVar instanceof dnw)) {
                List listA = a(dodVar, doiVar, dokVar2, dokVar, (dnt) domVarB4.b, arrayList.size(), arrayList2.size(), arrayList3.size());
                int iB5 = doiVar.b(domVarB4.a);
                if (iB5 < 0) {
                    continue;
                } else if (dntVar instanceof dnq) {
                    gqo gqoVar2 = (gqo) arrayList2.get(iB5);
                    fio fioVar2 = (fio) gqoVar2.a(dp.au, (Object) null);
                    fioVar2.a((fin) gqoVar2);
                    gqp gqpVar2 = (gqp) fioVar2;
                    gqpVar2.c();
                    ((gqo) gqpVar2.a).c = gqo.h();
                    gqpVar2.c();
                    gqo gqoVar3 = (gqo) gqpVar2.a;
                    if (!gqoVar3.c.a()) {
                        gqoVar3.c = fin.a(gqoVar3.c);
                    }
                    List list = gqoVar3.c;
                    fiv.a(listA);
                    if (listA instanceof fjo) {
                        List listD = ((fjo) listA).d();
                        fjo fjoVar = (fjo) list;
                        int size2 = list.size();
                        for (Object obj : listD) {
                            if (obj == null) {
                                String string = new StringBuilder(37).append("Element at index ").append(fjoVar.size() - size2).append(" is null.").toString();
                                for (int size3 = fjoVar.size() - 1; size3 >= size2; size3--) {
                                    fjoVar.remove(size3);
                                }
                                throw new NullPointerException(string);
                            }
                            if (obj instanceof fgy) {
                                fjoVar.a((fgy) obj);
                            } else {
                                fjoVar.add((String) obj);
                            }
                        }
                    } else if (listA instanceof fkp) {
                        list.addAll(listA);
                    } else {
                        if ((list instanceof ArrayList) && (listA instanceof Collection)) {
                            ((ArrayList) list).ensureCapacity(listA.size() + list.size());
                        }
                        int size4 = list.size();
                        for (Object obj2 : listA) {
                            if (obj2 == null) {
                                String string2 = new StringBuilder(37).append("Element at index ").append(list.size() - size4).append(" is null.").toString();
                                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                                    list.remove(size5);
                                }
                                throw new NullPointerException(string2);
                            }
                            list.add(obj2);
                        }
                    }
                    arrayList2.set(iB5, (gqo) ((fin) gqpVar2.h()));
                } else if (dntVar instanceof dno) {
                    gqk gqkVar2 = (gqk) arrayList3.get(iB5);
                    fio fioVar3 = (fio) gqkVar2.a(dp.au, (Object) null);
                    fioVar3.a((fin) gqkVar2);
                    gql gqlVar2 = (gql) fioVar3;
                    gqlVar2.c();
                    ((gqk) gqlVar2.a).c = gqk.h();
                    gqlVar2.c();
                    gqk gqkVar3 = (gqk) gqlVar2.a;
                    if (!gqkVar3.c.a()) {
                        gqkVar3.c = fin.a(gqkVar3.c);
                    }
                    List list2 = gqkVar3.c;
                    fiv.a(listA);
                    if (listA instanceof fjo) {
                        List listD2 = ((fjo) listA).d();
                        fjo fjoVar2 = (fjo) list2;
                        int size6 = list2.size();
                        for (Object obj3 : listD2) {
                            if (obj3 == null) {
                                String string3 = new StringBuilder(37).append("Element at index ").append(fjoVar2.size() - size6).append(" is null.").toString();
                                for (int size7 = fjoVar2.size() - 1; size7 >= size6; size7--) {
                                    fjoVar2.remove(size7);
                                }
                                throw new NullPointerException(string3);
                            }
                            if (obj3 instanceof fgy) {
                                fjoVar2.a((fgy) obj3);
                            } else {
                                fjoVar2.add((String) obj3);
                            }
                        }
                    } else if (listA instanceof fkp) {
                        list2.addAll(listA);
                    } else {
                        if ((list2 instanceof ArrayList) && (listA instanceof Collection)) {
                            ((ArrayList) list2).ensureCapacity(listA.size() + list2.size());
                        }
                        int size8 = list2.size();
                        for (Object obj4 : listA) {
                            if (obj4 == null) {
                                String string4 = new StringBuilder(37).append("Element at index ").append(list2.size() - size8).append(" is null.").toString();
                                for (int size9 = list2.size() - 1; size9 >= size8; size9--) {
                                    list2.remove(size9);
                                }
                                throw new NullPointerException(string4);
                            }
                            list2.add(obj4);
                        }
                    }
                    arrayList3.set(iB5, (gqk) ((fin) gqlVar2.h()));
                } else {
                    continue;
                }
            }
        }
        dom domVarB5 = dokVar.b();
        while (domVarB5.a()) {
            List listA2 = a(dodVar, doiVar, dokVar2, dokVar, (dnt) domVarB5.b, arrayList.size(), arrayList2.size(), arrayList3.size());
            int iB6 = doiVar.b(domVarB5.a);
            gqm gqmVar6 = (gqm) arrayList.get(iB6);
            fio fioVar4 = (fio) gqmVar6.a(dp.au, (Object) null);
            fioVar4.a((fin) gqmVar6);
            gqn gqnVar3 = (gqn) fioVar4;
            gqnVar3.c();
            ((gqm) gqnVar3.a).d = gqm.h();
            gqnVar3.c();
            gqm gqmVar7 = (gqm) gqnVar3.a;
            if (!gqmVar7.d.a()) {
                gqmVar7.d = fin.a(gqmVar7.d);
            }
            List list3 = gqmVar7.d;
            fiv.a(listA2);
            if (listA2 instanceof fjo) {
                List listD3 = ((fjo) listA2).d();
                fjo fjoVar3 = (fjo) list3;
                int size10 = list3.size();
                for (Object obj5 : listD3) {
                    if (obj5 == null) {
                        String string5 = new StringBuilder(37).append("Element at index ").append(fjoVar3.size() - size10).append(" is null.").toString();
                        for (int size11 = fjoVar3.size() - 1; size11 >= size10; size11--) {
                            fjoVar3.remove(size11);
                        }
                        throw new NullPointerException(string5);
                    }
                    if (obj5 instanceof fgy) {
                        fjoVar3.a((fgy) obj5);
                    } else {
                        fjoVar3.add((String) obj5);
                    }
                }
            } else if (listA2 instanceof fkp) {
                list3.addAll(listA2);
            } else {
                if ((list3 instanceof ArrayList) && (listA2 instanceof Collection)) {
                    ((ArrayList) list3).ensureCapacity(listA2.size() + list3.size());
                }
                int size12 = list3.size();
                for (Object obj6 : listA2) {
                    if (obj6 == null) {
                        String string6 = new StringBuilder(37).append("Element at index ").append(list3.size() - size12).append(" is null.").toString();
                        for (int size13 = list3.size() - 1; size13 >= size12; size13--) {
                            list3.remove(size13);
                        }
                        throw new NullPointerException(string6);
                    }
                    list3.add(obj6);
                }
            }
            arrayList.set(iB6, (gqm) ((fin) gqnVar3.h()));
        }
        dok dokVar3 = new dok();
        for (dnt dntVar2 : dofVar.c) {
            int iB7 = doiVar.b(dntVar2.e(dodVar));
            if (dntVar2 instanceof dnp) {
                size = iB7 + 1;
            } else if (dntVar2 instanceof dnq) {
                size = iB7 + arrayList.size() + 1;
            } else if (dntVar2 instanceof dno) {
                size = iB7 + arrayList.size() + 1 + arrayList2.size();
            } else if (dntVar2 instanceof dnw) {
                size = iB7 + arrayList.size() + 1 + arrayList2.size() + arrayList3.size();
            }
            if (!dokVar3.c(dntVar2.p)) {
                dokVar3.a(dntVar2.p, new ArrayList());
            }
            ((List) dokVar3.b(dntVar2.p)).add(Integer.valueOf(size));
        }
        gqvVar.c();
        gqu gquVar2 = (gqu) gqvVar.a;
        if (!gquVar2.b.a()) {
            gquVar2.b = fin.a(gquVar2.b);
        }
        List list4 = gquVar2.b;
        fiv.a(arrayList);
        if (arrayList instanceof fjo) {
            List listD4 = ((fjo) arrayList).d();
            fjo fjoVar4 = (fjo) list4;
            int size14 = list4.size();
            for (Object obj7 : listD4) {
                if (obj7 == null) {
                    String string7 = new StringBuilder(37).append("Element at index ").append(fjoVar4.size() - size14).append(" is null.").toString();
                    for (int size15 = fjoVar4.size() - 1; size15 >= size14; size15--) {
                        fjoVar4.remove(size15);
                    }
                    throw new NullPointerException(string7);
                }
                if (obj7 instanceof fgy) {
                    fjoVar4.a((fgy) obj7);
                } else {
                    fjoVar4.add((String) obj7);
                }
            }
        } else if (arrayList instanceof fkp) {
            list4.addAll(arrayList);
        } else {
            if ((list4 instanceof ArrayList) && (arrayList instanceof Collection)) {
                ((ArrayList) list4).ensureCapacity(arrayList.size() + list4.size());
            }
            int size16 = list4.size();
            for (Object obj8 : arrayList) {
                if (obj8 == null) {
                    String string8 = new StringBuilder(37).append("Element at index ").append(list4.size() - size16).append(" is null.").toString();
                    for (int size17 = list4.size() - 1; size17 >= size16; size17--) {
                        list4.remove(size17);
                    }
                    throw new NullPointerException(string8);
                }
                list4.add(obj8);
            }
        }
        gqvVar.c();
        gqu gquVar3 = (gqu) gqvVar.a;
        if (!gquVar3.c.a()) {
            gquVar3.c = fin.a(gquVar3.c);
        }
        List list5 = gquVar3.c;
        fiv.a(arrayList2);
        if (arrayList2 instanceof fjo) {
            List listD5 = ((fjo) arrayList2).d();
            fjo fjoVar5 = (fjo) list5;
            int size18 = list5.size();
            for (Object obj9 : listD5) {
                if (obj9 == null) {
                    String string9 = new StringBuilder(37).append("Element at index ").append(fjoVar5.size() - size18).append(" is null.").toString();
                    for (int size19 = fjoVar5.size() - 1; size19 >= size18; size19--) {
                        fjoVar5.remove(size19);
                    }
                    throw new NullPointerException(string9);
                }
                if (obj9 instanceof fgy) {
                    fjoVar5.a((fgy) obj9);
                } else {
                    fjoVar5.add((String) obj9);
                }
            }
        } else if (arrayList2 instanceof fkp) {
            list5.addAll(arrayList2);
        } else {
            if ((list5 instanceof ArrayList) && (arrayList2 instanceof Collection)) {
                ((ArrayList) list5).ensureCapacity(arrayList2.size() + list5.size());
            }
            int size20 = list5.size();
            for (Object obj10 : arrayList2) {
                if (obj10 == null) {
                    String string10 = new StringBuilder(37).append("Element at index ").append(list5.size() - size20).append(" is null.").toString();
                    for (int size21 = list5.size() - 1; size21 >= size20; size21--) {
                        list5.remove(size21);
                    }
                    throw new NullPointerException(string10);
                }
                list5.add(obj10);
            }
        }
        gqvVar.c();
        gqu gquVar4 = (gqu) gqvVar.a;
        if (!gquVar4.d.a()) {
            gquVar4.d = fin.a(gquVar4.d);
        }
        List list6 = gquVar4.d;
        fiv.a(arrayList3);
        if (arrayList3 instanceof fjo) {
            List listD6 = ((fjo) arrayList3).d();
            fjo fjoVar6 = (fjo) list6;
            int size22 = list6.size();
            for (Object obj11 : listD6) {
                if (obj11 == null) {
                    String string11 = new StringBuilder(37).append("Element at index ").append(fjoVar6.size() - size22).append(" is null.").toString();
                    for (int size23 = fjoVar6.size() - 1; size23 >= size22; size23--) {
                        fjoVar6.remove(size23);
                    }
                    throw new NullPointerException(string11);
                }
                if (obj11 instanceof fgy) {
                    fjoVar6.a((fgy) obj11);
                } else {
                    fjoVar6.add((String) obj11);
                }
            }
        } else if (arrayList3 instanceof fkp) {
            list6.addAll(arrayList3);
        } else {
            if ((list6 instanceof ArrayList) && (arrayList3 instanceof Collection)) {
                ((ArrayList) list6).ensureCapacity(arrayList3.size() + list6.size());
            }
            int size24 = list6.size();
            for (Object obj12 : arrayList3) {
                if (obj12 == null) {
                    String string12 = new StringBuilder(37).append("Element at index ").append(list6.size() - size24).append(" is null.").toString();
                    for (int size25 = list6.size() - 1; size25 >= size24; size25--) {
                        list6.remove(size25);
                    }
                    throw new NullPointerException(string12);
                }
                list6.add(obj12);
            }
        }
        dom domVarB6 = dokVar3.b();
        while (domVarB6.a()) {
            grb grbVar = (grb) ((fio) gra.d.a(dp.au, (Object) null));
            grc grcVarA = grc.a(domVarB6.a);
            if (grcVarA != null) {
                grbVar.c();
                gra graVar = (gra) grbVar.a;
                if (grcVarA == null) {
                    throw new NullPointerException();
                }
                graVar.a |= 1;
                graVar.b = grcVarA.a;
            }
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= ((List) domVarB6.b).size()) {
                    break;
                }
                int iIntValue = ((Integer) ((List) domVarB6.b).get(i3)).intValue();
                grbVar.c();
                gra graVar2 = (gra) grbVar.a;
                if (!graVar2.c.a()) {
                    graVar2.c = fin.a(graVar2.c);
                }
                graVar2.c.d(iIntValue);
                i2 = i3 + 1;
            }
            gqvVar.c();
            gqu gquVar5 = (gqu) gqvVar.a;
            if (!gquVar5.f.a()) {
                gquVar5.f = fin.a(gquVar5.f);
            }
            gquVar5.f.add((gra) ((fin) grbVar.h()));
        }
        return (gqu) ((fin) gqvVar.h());
    }

    private static List a(dod dodVar, doi doiVar, dok dokVar, dok dokVar2, dnt dntVar, int i, int i2, int i3) {
        int iA = dntVar.a(dodVar);
        ArrayList arrayList = new ArrayList(iA);
        for (int i4 = 0; i4 < iA; i4++) {
            int iA2 = dntVar.a(dodVar, i4);
            if (iA2 != 0) {
                dnt dntVar2 = (dnt) dokVar.b(iA2);
                if (dntVar2 == null) {
                    dntVar2 = (dnt) dokVar2.b(iA2);
                }
                int iB = doiVar.b(iA2);
                if (dntVar2 != null && iB != -1) {
                    if (dntVar2 instanceof dnp) {
                        arrayList.add(Integer.valueOf(iB + 1));
                    } else if (dntVar2 instanceof dnq) {
                        arrayList.add(Integer.valueOf(iB + i + 1));
                    } else if (dntVar2 instanceof dno) {
                        arrayList.add(Integer.valueOf(iB + i + i2 + 1));
                    } else if (dntVar2 instanceof dnw) {
                        arrayList.add(Integer.valueOf(iB + i + i2 + i3 + 1));
                    }
                }
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static void b(dof dofVar, dod dodVar) {
        dny.a(dodVar, dofVar);
        dom domVarB = dofVar.b.b();
        while (domVarB.a()) {
            if (((dnt) domVarB.b).l != null) {
                if (((dnt) domVarB.b).q.equals("app") && !(((dnt) domVarB.b).l instanceof dnp) && !((dnt) domVarB.b).l.q.equals("app")) {
                    ((dnt) domVarB.b).p = 255;
                    ((dnt) domVarB.b).o |= 1;
                    dofVar.c.add((dnt) domVarB.b);
                }
            } else if ((((dnt) domVarB.b).o & 1) == 0) {
                dofVar.b.a(domVarB.a);
            }
        }
        dom domVarB2 = dofVar.b.b();
        while (domVarB2.a()) {
            if (!((dnt) domVarB2.b).q.equals("app")) {
                dofVar.b.a(domVarB2.a);
            }
        }
        Iterator it = dofVar.c.iterator();
        while (it.hasNext()) {
            dnt dntVar = (dnt) it.next();
            if (dntVar.q != null && !dntVar.q.equals("app")) {
                it.remove();
            }
        }
    }
}
