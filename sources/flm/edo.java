package flm;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class edo extends LogRecord {
    private final ecf a;

    edo(ecf ecfVar) {
        super(ecfVar.d(), null);
        this.a = ecfVar;
        ebj ebjVarG = ecfVar.g();
        setSourceClassName(ebjVarG.a());
        setSourceMethodName(ebjVarG.b());
        setLoggerName(ecfVar.f());
        setMillis(TimeUnit.NANOSECONDS.toMillis(ecfVar.e()));
    }

    edo(RuntimeException runtimeException, ecf ecfVar) {
        this(ecfVar);
        setLevel(ecfVar.d().intValue() < Level.WARNING.intValue() ? Level.WARNING : ecfVar.d());
        setThrown(runtimeException);
        StringBuilder sbAppend = new StringBuilder("LOGGING ERROR: ").append(runtimeException.getMessage()).append('\n');
        a(ecfVar, sbAppend);
        setMessage(sbAppend.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()).append(" {\n  message: ").append(getMessage()).append("\n  arguments: ").append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>").append('\n');
        a(this.a, sb);
        sb.append("\n}");
        return sb.toString();
    }

    private static void a(ecf ecfVar, StringBuilder sb) {
        sb.append("  original message: ");
        if (ecfVar.h() == null) {
            sb.append(ecfVar.j());
        } else {
            sb.append(ecfVar.h().b);
            sb.append("\n  original arguments:");
            for (Object obj : ecfVar.i()) {
                sb.append("\n    ").append(eco.a(obj));
            }
        }
        eci eciVarL = ecfVar.l();
        if (eciVarL.a() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < eciVarL.a(); i++) {
                sb.append("\n    ");
                sb.append(eciVarL.a(i).a).append(": ").append(eciVarL.b(i));
            }
        }
        sb.append("\n  level: ").append(ecfVar.d());
        sb.append("\n  timestamp (nanos): ").append(ecfVar.e());
        sb.append("\n  class: ").append(ecfVar.g().a());
        sb.append("\n  method: ").append(ecfVar.g().b());
        sb.append("\n  line number: ").append(ecfVar.g().c());
    }
}
