package flm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enj extends fio implements fkg {
    enj() {
        super(eni.d);
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
    public final enj a(Iterable iterable) {
        c();
        eni eniVar = (eni) this.a;
        if (!eniVar.b.a()) {
            fjf fjfVar = eniVar.b;
            int size = fjfVar.size();
            eniVar.b = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        List list = eniVar.b;
        fiv.a(iterable);
        if (iterable instanceof fjo) {
            List listD = ((fjo) iterable).d();
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
        } else if (iterable instanceof fkp) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
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
        return this;
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
    public final enj b(Iterable iterable) {
        c();
        eni eniVar = (eni) this.a;
        if (!eniVar.c.a()) {
            fjf fjfVar = eniVar.c;
            int size = fjfVar.size();
            eniVar.c = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        List list = eniVar.c;
        fiv.a(iterable);
        if (iterable instanceof fjo) {
            List listD = ((fjo) iterable).d();
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
        } else if (iterable instanceof fkp) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
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
        return this;
    }
}
