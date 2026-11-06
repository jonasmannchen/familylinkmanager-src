package flm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gpb extends fio implements fkg {
    gpb() {
        super(gpa.ao);
    }

    public final gpb a(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 1;
        gpaVar.c = j;
        return this;
    }

    public final gpb b(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 4;
        gpaVar.d = j;
        return this;
    }

    public final List a() {
        return Collections.unmodifiableList(((gpa) this.a).e);
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
    public final gpb a(Iterable iterable) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (!gpaVar.e.a()) {
            fjf fjfVar = gpaVar.e;
            int size = fjfVar.size();
            gpaVar.e = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        List list = gpaVar.e;
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

    public final gpb i() {
        c();
        ((gpa) this.a).e = fkr.b;
        return this;
    }

    public final List j() {
        return Collections.unmodifiableList(((gpa) this.a).f);
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
    public final gpb b(Iterable iterable) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (!gpaVar.f.a()) {
            fjf fjfVar = gpaVar.f;
            int size = fjfVar.size();
            gpaVar.f = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        List list = gpaVar.f;
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

    public final gpb k() {
        c();
        ((gpa) this.a).f = fkr.b;
        return this;
    }

    public final List l() {
        return Collections.unmodifiableList(((gpa) this.a).g);
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
    public final gpb c(Iterable iterable) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (!gpaVar.g.a()) {
            fjf fjfVar = gpaVar.g;
            int size = fjfVar.size();
            gpaVar.g = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        List list = gpaVar.g;
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

    public final gpb n() {
        c();
        ((gpa) this.a).g = fkr.b;
        return this;
    }

    public final List o() {
        return Collections.unmodifiableList(((gpa) this.a).h);
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
    public final gpb d(Iterable iterable) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (!gpaVar.h.a()) {
            fjf fjfVar = gpaVar.h;
            int size = fjfVar.size();
            gpaVar.h = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        List list = gpaVar.h;
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

    public final gpb p() {
        c();
        ((gpa) this.a).h = fkr.b;
        return this;
    }

    public final List q() {
        return Collections.unmodifiableList(((gpa) this.a).i);
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
    public final gpb e(Iterable iterable) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (!gpaVar.i.a()) {
            fjf fjfVar = gpaVar.i;
            int size = fjfVar.size();
            gpaVar.i = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        List list = gpaVar.i;
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

    public final gpb r() {
        c();
        ((gpa) this.a).i = fkr.b;
        return this;
    }

    public final List s() {
        return Collections.unmodifiableList(((gpa) this.a).j);
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
    public final gpb f(Iterable iterable) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (!gpaVar.j.a()) {
            fjf fjfVar = gpaVar.j;
            int size = fjfVar.size();
            gpaVar.j = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        List list = gpaVar.j;
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

    public final gpb t() {
        c();
        ((gpa) this.a).j = fkr.b;
        return this;
    }

    public final gpb a(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.k = goyVar;
        gpaVar.a |= 16;
        return this;
    }

    public final List u() {
        return Collections.unmodifiableList(((gpa) this.a).l);
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
    public final gpb g(Iterable iterable) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (!gpaVar.l.a()) {
            fjf fjfVar = gpaVar.l;
            int size = fjfVar.size();
            gpaVar.l = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        List list = gpaVar.l;
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

    public final gpb v() {
        c();
        ((gpa) this.a).l = fkr.b;
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
    public final gpb h(Iterable iterable) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (!gpaVar.m.a()) {
            fjf fjfVar = gpaVar.m;
            int size = fjfVar.size();
            gpaVar.m = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        List list = gpaVar.m;
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
    public final gpb i(Iterable iterable) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (!gpaVar.n.a()) {
            fjf fjfVar = gpaVar.n;
            int size = fjfVar.size();
            gpaVar.n = fjfVar.a(size == 0 ? 10 : size << 1);
        }
        List list = gpaVar.n;
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

    public final gpb c(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 32;
        gpaVar.o = j;
        return this;
    }

    public final gpb d(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 64;
        gpaVar.p = j;
        return this;
    }

    public final gpb e(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 128;
        gpaVar.q = j;
        return this;
    }

    public final gpb f(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 256;
        gpaVar.r = j;
        return this;
    }

    public final gpb g(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 512;
        gpaVar.s = j;
        return this;
    }

    public final gpb h(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 1024;
        gpaVar.t = j;
        return this;
    }

    public final gpb i(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 2048;
        gpaVar.u = j;
        return this;
    }

    public final gpb j(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 4096;
        gpaVar.v = j;
        return this;
    }

    public final gpb k(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 8192;
        gpaVar.w = j;
        return this;
    }

    public final gpb l(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 16384;
        gpaVar.x = j;
        return this;
    }

    public final gpb m(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 32768;
        gpaVar.y = j;
        return this;
    }

    public final gpb n(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 65536;
        gpaVar.z = j;
        return this;
    }

    public final gpb o(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 131072;
        gpaVar.A = j;
        return this;
    }

    public final gpb p(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 262144;
        gpaVar.B = j;
        return this;
    }

    public final gpb b(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.C = goyVar;
        gpaVar.a |= 524288;
        return this;
    }

    public final gpb q(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.a |= 1048576;
        gpaVar.H = j;
        return this;
    }

    public final gpb c(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.I = goyVar;
        gpaVar.a |= 2097152;
        return this;
    }

    public final gpb d(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.J = goyVar;
        gpaVar.a |= 4194304;
        return this;
    }

    public final gpb e(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.K = goyVar;
        gpaVar.a |= 8388608;
        return this;
    }

    public final gpb f(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.L = goyVar;
        gpaVar.a |= 16777216;
        return this;
    }

    public final gpb g(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.M = goyVar;
        gpaVar.a |= 33554432;
        return this;
    }

    public final gpb h(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.N = goyVar;
        gpaVar.a |= 67108864;
        return this;
    }

    public final gpb i(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.O = goyVar;
        gpaVar.a |= 134217728;
        return this;
    }

    public final gpb j(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.P = goyVar;
        gpaVar.a |= 268435456;
        return this;
    }

    public final gpb k(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.Q = goyVar;
        gpaVar.a |= 536870912;
        return this;
    }

    public final gpb l(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.R = goyVar;
        gpaVar.a |= 1073741824;
        return this;
    }

    public final gpb m(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.S = goyVar;
        gpaVar.a |= Integer.MIN_VALUE;
        return this;
    }

    public final gpb n(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.T = goyVar;
        gpaVar.b |= 1;
        return this;
    }

    public final gpb o(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.U = goyVar;
        gpaVar.b |= 2;
        return this;
    }

    public final gpb r(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 4;
        gpaVar.V = j;
        return this;
    }

    public final gpb s(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 8;
        gpaVar.W = j;
        return this;
    }

    public final gpb t(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 16;
        gpaVar.X = j;
        return this;
    }

    public final gpb u(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 32;
        gpaVar.Y = j;
        return this;
    }

    public final gpb v(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 64;
        gpaVar.Z = j;
        return this;
    }

    public final gpb w(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 128;
        gpaVar.aa = j;
        return this;
    }

    public final gpb x(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 256;
        gpaVar.ab = j;
        return this;
    }

    public final gpb y(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 512;
        gpaVar.ac = j;
        return this;
    }

    public final gpb z(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 1024;
        gpaVar.ad = j;
        return this;
    }

    public final gpb A(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 2048;
        gpaVar.ae = j;
        return this;
    }

    public final gpb B(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 4096;
        gpaVar.af = j;
        return this;
    }

    public final gpb C(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 8192;
        gpaVar.ag = j;
        return this;
    }

    public final gpb D(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 16384;
        gpaVar.ah = j;
        return this;
    }

    public final gpb E(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 32768;
        gpaVar.ai = j;
        return this;
    }

    public final gpb F(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 65536;
        gpaVar.aj = j;
        return this;
    }

    public final gpb p(goy goyVar) {
        c();
        gpa gpaVar = (gpa) this.a;
        if (goyVar == null) {
            throw new NullPointerException();
        }
        gpaVar.ak = goyVar;
        gpaVar.b |= 131072;
        return this;
    }

    public final gpb G(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 262144;
        gpaVar.al = j;
        return this;
    }

    public final gpb H(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 524288;
        gpaVar.am = j;
        return this;
    }

    public final gpb I(long j) {
        c();
        gpa gpaVar = (gpa) this.a;
        gpaVar.b |= 1048576;
        gpaVar.an = j;
        return this;
    }
}
