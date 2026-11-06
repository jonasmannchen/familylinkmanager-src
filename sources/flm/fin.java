package flm;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fin extends fgn {
    public static Map G = new ConcurrentHashMap();
    public flr E = flr.a;
    public int F = -1;

    public abstract Object a(int i, Object obj);

    @Override // flm.fke
    public final fko d() {
        return (fko) a(dp.aw, (Object) null);
    }

    public String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(string);
        fkh.a(this, sb, 0);
        return sb.toString();
    }

    public int hashCode() {
        if (this.D != 0) {
            return this.D;
        }
        this.D = fkq.a.a(this).a(this);
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((fin) a(dp.av, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return fkq.a.a(this).a(this, (fin) obj);
    }

    protected void e() {
        fkq.a.a(this).c(this);
    }

    @Override // flm.fkg
    public final boolean f() {
        boolean zBooleanValue = Boolean.TRUE.booleanValue();
        byte bByteValue = ((Byte) a(dp.aq, (Object) null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = fkq.a.a(this).d(this);
        if (zBooleanValue) {
            a(dp.ar, zD ? this : null);
        }
        return zD;
    }

    @Override // flm.fgn
    final int c() {
        return this.F;
    }

    @Override // flm.fgn
    final void a(int i) {
        this.F = i;
    }

    @Override // flm.fke
    public final void a(fhp fhpVar) {
        fhx fhxVar;
        fky fkyVarA = fkq.a.a((Class) getClass());
        if (fhpVar.b != null) {
            fhxVar = fhpVar.b;
        } else {
            fhxVar = new fhx(fhpVar);
        }
        fkyVarA.a((Object) this, (fmp) fhxVar);
    }

    @Override // flm.fke
    public final int g() {
        if (this.F == -1) {
            this.F = fkq.a.a(this).b(this);
        }
        return this.F;
    }

    static fin a(Class cls) {
        fin finVar = (fin) G.get(cls);
        if (finVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                finVar = (fin) G.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (finVar == null) {
            finVar = (fin) ((fin) flw.a(cls)).a(dp.av, (Object) null);
            if (finVar == null) {
                throw new IllegalStateException();
            }
            G.put(cls, finVar);
        }
        return finVar;
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final boolean a(fin finVar, boolean z) {
        byte bByteValue = ((Byte) finVar.a(dp.aq, (Object) null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = fkq.a.a(finVar).d(finVar);
        if (z) {
            finVar.a(dp.ar, zD ? finVar : null);
        }
        return zD;
    }

    public static fjb h() {
        return fiu.b;
    }

    public static fjb a(fjb fjbVar) {
        int size = fjbVar.size();
        return fjbVar.a(size == 0 ? 10 : size << 1);
    }

    public static fje i() {
        return fjs.b;
    }

    public static fje a(fje fjeVar) {
        int size = fjeVar.size();
        return fjeVar.a(size == 0 ? 10 : size << 1);
    }

    public static fjf j() {
        return fkr.b;
    }

    public static fjf a(fjf fjfVar) {
        int size = fjfVar.size();
        return fjfVar.a(size == 0 ? 10 : size << 1);
    }

    static fin a(fin finVar, fhk fhkVar, fib fibVar) throws fjg {
        fin finVar2 = (fin) finVar.a(dp.at, (Object) null);
        try {
            fkq.a.a(finVar2).a(finVar2, fho.a(fhkVar), fibVar);
            finVar2.e();
            return finVar2;
        } catch (IOException e) {
            if (e.getCause() instanceof fjg) {
                throw ((fjg) e.getCause());
            }
            throw new fjg(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof fjg) {
                throw ((fjg) e2.getCause());
            }
            throw e2;
        }
    }

    public static fin a(fin finVar, byte[] bArr) throws fjg {
        fin finVar2 = (fin) finVar.a(dp.at, (Object) null);
        try {
            fkq.a.a(finVar2).a(finVar2, bArr, 0, bArr.length, new fgu());
            finVar2.e();
            if (finVar2.D != 0) {
                throw new RuntimeException();
            }
            return finVar2;
        } catch (IOException e) {
            if (e.getCause() instanceof fjg) {
                throw ((fjg) e.getCause());
            }
            throw new fjg(e.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            fjg fjgVarA = fjg.a();
            if (fjgVarA == null) {
                throw null;
            }
            throw fjgVarA;
        }
    }

    public static fin a(fin finVar, byte[] bArr, fib fibVar) throws fjg {
        try {
            fhk fhkVarA = fhk.a(bArr);
            fin finVarA = a(finVar, fhkVarA, fibVar);
            try {
                fhkVarA.a(0);
                return finVarA;
            } catch (fjg e) {
                throw e;
            }
        } catch (fjg e2) {
            throw e2;
        }
    }

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
    public static fin b(fin finVar, byte[] bArr) throws fjg {
        boolean z;
        fin finVarA = a(finVar, bArr);
        if (finVarA != null) {
            boolean zBooleanValue = Boolean.TRUE.booleanValue();
            byte bByteValue = ((Byte) finVarA.a(dp.aq, (Object) null)).byteValue();
            if (bByteValue == 1) {
                z = true;
            } else if (bByteValue == 0) {
                z = false;
            } else {
                boolean zD = fkq.a.a(finVarA).d(finVarA);
                if (zBooleanValue) {
                    finVarA.a(dp.ar, zD ? finVarA : null);
                }
                z = zD;
            }
            if (!z) {
                fjg fjgVarA = new flp().a();
                if (fjgVarA == null) {
                    throw null;
                }
                throw fjgVarA;
            }
        }
        return finVarA;
    }

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
    public static fin b(fin finVar, byte[] bArr, fib fibVar) throws fjg {
        boolean z;
        fin finVarA = a(finVar, bArr, fibVar);
        if (finVarA != null) {
            boolean zBooleanValue = Boolean.TRUE.booleanValue();
            byte bByteValue = ((Byte) finVarA.a(dp.aq, (Object) null)).byteValue();
            if (bByteValue == 1) {
                z = true;
            } else if (bByteValue == 0) {
                z = false;
            } else {
                boolean zD = fkq.a.a(finVarA).d(finVarA);
                if (zBooleanValue) {
                    finVarA.a(dp.ar, zD ? finVarA : null);
                }
                z = zD;
            }
            if (!z) {
                fjg fjgVarA = new flp().a();
                if (fjgVarA == null) {
                    throw null;
                }
                throw fjgVarA;
            }
        }
        return finVarA;
    }

    @Override // flm.fke
    public final /* synthetic */ fkf k() {
        fio fioVar = (fio) a(dp.au, (Object) null);
        fioVar.a(this);
        return fioVar;
    }

    @Override // flm.fke
    public final /* synthetic */ fkf l() {
        return (fio) a(dp.au, (Object) null);
    }

    @Override // flm.fkg
    public final /* synthetic */ fke m() {
        return (fin) a(dp.av, (Object) null);
    }
}
