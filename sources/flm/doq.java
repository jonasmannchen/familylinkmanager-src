package flm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class doq implements dos {
    private static final int[] a = {0, 4, 8, 10, 12, 14, 16, 18, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100, 150, bbx.LOG_WTF_CONNECTIONS_THRESHOLD, 300, 400, 500, 600, 700, 800, 900, 1000};
    private final int[] b = new int[a.length];
    private int c;
    private int d;
    private int e;
    private int f;

    doq() {
    }

    @Override // flm.dos
    public final void a(int i, int i2) {
        dse.a(i >= 0);
        this.d++;
        if (i > i2) {
            this.c++;
        }
        int[] iArr = this.b;
        int iBinarySearch = Arrays.binarySearch(a, i);
        if (iBinarySearch < 0) {
            iBinarySearch = -(iBinarySearch + 2);
        }
        iArr[iBinarySearch] = iArr[iBinarySearch] + 1;
        this.e = Math.max(this.e, i);
        this.f += i;
    }

    @Override // flm.dos
    public final boolean a() {
        return this.d != 0;
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
    @Override // flm.dos
    public final gsh b() {
        if (!a()) {
            return null;
        }
        gsi gsiVar = (gsi) ((fio) gsh.h.a(dp.au, (Object) null));
        int i = this.c;
        gsiVar.c();
        gsh gshVar = (gsh) gsiVar.a;
        gshVar.a |= 1;
        gshVar.b = i;
        int i2 = this.d;
        gsiVar.c();
        gsh gshVar2 = (gsh) gsiVar.a;
        gshVar2.a |= 2;
        gshVar2.c = i2;
        int i3 = this.f;
        gsiVar.c();
        gsh gshVar3 = (gsh) gsiVar.a;
        gshVar3.a |= 8;
        gshVar3.e = i3;
        int i4 = this.e;
        gsiVar.c();
        gsh gshVar4 = (gsh) gsiVar.a;
        gshVar4.a |= 4;
        gshVar4.d = i4;
        int[] iArr = this.b;
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < a.length; i5++) {
            if (iArr[i5] > 0) {
                boolean z = i5 + 1 == a.length;
                int i6 = iArr[i5];
                int i7 = a[i5];
                Integer numValueOf = z ? null : Integer.valueOf(a[i5 + 1] - 1);
                dse.a(i6 > 0);
                gsg gsgVar = (gsg) ((fio) gsf.e.a(dp.au, (Object) null));
                gsgVar.c();
                gsf gsfVar = (gsf) gsgVar.a;
                gsfVar.a |= 2;
                gsfVar.c = i7;
                gsgVar.c();
                gsf gsfVar2 = (gsf) gsgVar.a;
                gsfVar2.a |= 1;
                gsfVar2.b = i6;
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    gsgVar.c();
                    gsf gsfVar3 = (gsf) gsgVar.a;
                    gsfVar3.a |= 4;
                    gsfVar3.d = iIntValue;
                }
                arrayList.add((gsf) ((fin) gsgVar.h()));
            }
        }
        List listAsList = Arrays.asList((gsf[]) arrayList.toArray(new gsf[0]));
        gsiVar.c();
        gsh gshVar5 = (gsh) gsiVar.a;
        if (!gshVar5.f.a()) {
            gshVar5.f = fin.a(gshVar5.f);
        }
        List list = gshVar5.f;
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
        return (gsh) ((fin) gsiVar.h());
    }
}
