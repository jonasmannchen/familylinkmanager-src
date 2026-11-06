package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fio extends fgo {
    public fin a;
    public boolean b = false;
    private final fin c;

    public fio(fin finVar) {
        this.c = finVar;
        this.a = (fin) finVar.a(dp.at, (Object) null);
    }

    public void c() {
        if (this.b) {
            fin finVar = (fin) this.a.a(dp.at, (Object) null);
            a(finVar, this.a);
            this.a = finVar;
            this.b = false;
        }
    }

    @Override // flm.fkg
    public final boolean f() {
        return fin.a(this.a, false);
    }

    @Override // flm.fkf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public fin g() {
        if (this.b) {
            return this.a;
        }
        this.a.e();
        this.b = true;
        return this.a;
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
    @Override // flm.fkf
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final fin h() {
        boolean z;
        fin finVar = (fin) g();
        boolean zBooleanValue = Boolean.TRUE.booleanValue();
        byte bByteValue = ((Byte) finVar.a(dp.aq, (Object) null)).byteValue();
        if (bByteValue == 1) {
            z = true;
        } else if (bByteValue == 0) {
            z = false;
        } else {
            boolean zD = fkq.a.a(finVar).d(finVar);
            if (zBooleanValue) {
                finVar.a(dp.ar, zD ? finVar : null);
            }
            z = zD;
        }
        if (!z) {
            throw new flp();
        }
        return finVar;
    }

    @Override // flm.fgo
    public final fio a(fin finVar) {
        c();
        a(this.a, finVar);
        return this;
    }

    private static void a(fin finVar, fin finVar2) {
        fkq.a.a(finVar).b(finVar, finVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fgo
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fio a(fhk fhkVar, fib fibVar) throws IOException {
        c();
        try {
            fkq.a.a(this.a).a(this.a, fho.a(fhkVar), fibVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    @Override // flm.fgo
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fgo clone() {
        return (fio) clone();
    }

    @Override // flm.fkg
    public final /* synthetic */ fke m() {
        return this.c;
    }

    @Override // flm.fgo
    public /* synthetic */ Object clone() {
        fio fioVar = (fio) this.c.a(dp.au, (Object) null);
        fioVar.a((fin) g());
        return fioVar;
    }
}
