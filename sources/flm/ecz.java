package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ecz implements ecf {
    private final String a;
    private final ecf b;

    ecz(RuntimeException runtimeException, ecf ecfVar) {
        StringBuilder sbAppend = new StringBuilder("LOGGING ERROR: ").append(runtimeException.getMessage()).append("\n  original message: ");
        if (ecfVar.h() == null) {
            sbAppend.append(ecfVar.j());
        } else {
            sbAppend.append(ecfVar.h().b);
            sbAppend.append("\n  original arguments:");
            for (Object obj : ecfVar.i()) {
                sbAppend.append("\n    ").append(eco.a(obj));
            }
        }
        eci eciVarL = ecfVar.l();
        if (eciVarL.a() > 0) {
            sbAppend.append("\n  metadata:");
            for (int i = 0; i < eciVarL.a(); i++) {
                sbAppend.append("\n    ").append(eciVarL.a(i)).append(": ").append(eciVarL.b(i));
            }
        }
        sbAppend.append("\n  level: ").append(ecfVar.d());
        sbAppend.append("\n  timestamp (nanos): ").append(ecfVar.e());
        sbAppend.append("\n  class: ").append(ecfVar.g().a());
        sbAppend.append("\n  method: ").append(ecfVar.g().b());
        sbAppend.append("\n  line number: ").append(ecfVar.g().c());
        this.a = sbAppend.toString();
        this.b = ecfVar;
    }

    @Override // flm.ecf
    public final Level d() {
        return this.b.d().intValue() > Level.WARNING.intValue() ? this.b.d() : Level.WARNING;
    }

    @Override // flm.ecf
    public final long e() {
        return this.b.e();
    }

    @Override // flm.ecf
    public final String f() {
        return this.b.f();
    }

    @Override // flm.ecf
    public final ebj g() {
        return this.b.g();
    }

    @Override // flm.ecf
    public final eci l() {
        return ecj.a;
    }

    @Override // flm.ecf
    public final boolean k() {
        return false;
    }

    @Override // flm.ecf
    public final ecx h() {
        return null;
    }

    @Override // flm.ecf
    public final Object[] i() {
        throw new IllegalStateException();
    }

    @Override // flm.ecf
    public final Object j() {
        return this.a;
    }
}
