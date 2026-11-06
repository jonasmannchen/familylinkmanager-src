package flm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgq implements Runnable {
    private final AtomicInteger a = new AtomicInteger(0);
    private final /* synthetic */ dgp b;

    dgq(dgp dgpVar) {
        this.b = dgpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.h_() && this.a.getAndIncrement() < this.b.c) {
            dgp dgpVar = this.b;
            gts gtsVar = (gts) ((fio) gtr.y.a(dp.au, (Object) null));
            HashSet<StackTraceElement[]> hashSet = new HashSet(Thread.getAllStackTraces().values());
            gpe gpeVar = (gpe) ((fio) gpd.b.a(dp.au, (Object) null));
            for (StackTraceElement[] stackTraceElementArr : hashSet) {
                gpi gpiVar = (gpi) ((fio) gph.b.a(dp.au, (Object) null));
                ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    gpg gpgVar = (gpg) ((fio) gpf.c.a(dp.au, (Object) null));
                    String className = stackTraceElement.getClassName();
                    String methodName = stackTraceElement.getMethodName();
                    String string = new StringBuilder(String.valueOf(className).length() + 1 + String.valueOf(methodName).length()).append(className).append(".").append(methodName).toString();
                    gpgVar.c();
                    gpf gpfVar = (gpf) gpgVar.a;
                    if (string == null) {
                        throw new NullPointerException();
                    }
                    gpfVar.a |= 1;
                    gpfVar.b = string;
                    arrayList.add((gpf) ((fin) gpgVar.h()));
                }
                gpiVar.c();
                gph gphVar = (gph) gpiVar.a;
                if (!gphVar.a.a()) {
                    gphVar.a = fin.a(gphVar.a);
                }
                List list = gphVar.a;
                fiv.a(arrayList);
                if (arrayList instanceof fjo) {
                    List listD = ((fjo) arrayList).d();
                    fjo fjoVar = (fjo) list;
                    int size = list.size();
                    for (Object obj : listD) {
                        if (obj == null) {
                            String string2 = new StringBuilder(37).append("Element at index ").append(fjoVar.size() - size).append(" is null.").toString();
                            for (int size2 = fjoVar.size() - 1; size2 >= size; size2--) {
                                fjoVar.remove(size2);
                            }
                            throw new NullPointerException(string2);
                        }
                        if (obj instanceof fgy) {
                            fjoVar.a((fgy) obj);
                        } else {
                            fjoVar.add((String) obj);
                        }
                    }
                } else if (arrayList instanceof fkp) {
                    list.addAll(arrayList);
                } else {
                    if ((list instanceof ArrayList) && (arrayList instanceof Collection)) {
                        ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
                    }
                    int size3 = list.size();
                    for (Object obj2 : arrayList) {
                        if (obj2 == null) {
                            String string3 = new StringBuilder(37).append("Element at index ").append(list.size() - size3).append(" is null.").toString();
                            for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                                list.remove(size4);
                            }
                            throw new NullPointerException(string3);
                        }
                        list.add(obj2);
                    }
                }
                gph gphVar2 = (gph) ((fin) gpiVar.h());
                gpeVar.c();
                gpd gpdVar = (gpd) gpeVar.a;
                if (gphVar2 == null) {
                    throw new NullPointerException();
                }
                if (!gpdVar.a.a()) {
                    gpdVar.a = fin.a(gpdVar.a);
                }
                gpdVar.a.add(gphVar2);
            }
            gpd gpdVar2 = (gpd) ((fin) gpeVar.h());
            gtsVar.c();
            gtr gtrVar = (gtr) gtsVar.a;
            if (gpdVar2 == null) {
                throw new NullPointerException();
            }
            gtrVar.r = gpdVar2;
            gtrVar.a |= 131072;
            dgpVar.a((gtr) ((fin) gtsVar.h()));
        }
        if (this.a.get() >= this.b.c) {
            this.b.a(false);
        }
    }
}
