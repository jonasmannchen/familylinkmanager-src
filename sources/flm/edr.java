package flm;

import java.io.PrintStream;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class edr extends eck {
    private final edp e;
    private final edt f;
    private final edq g;
    private final ecm h;

    public edr() {
        edp edpVar = (edp) a("backend_factory", edp.class);
        this.e = edpVar == null ? edu.a : edpVar;
        edt edtVar = (edt) a("logging_context", edt.class);
        this.f = edtVar == null ? eds.a : edtVar;
        edq edqVar = (edq) a("clock", edq.class);
        this.g = edqVar == null ? edy.a : edqVar;
        this.h = edx.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.eck
    public ecm b() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.eck
    public ecg b(String str) {
        return this.e.a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.eck
    public boolean b(String str, Level level, boolean z) {
        return this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.eck
    public ecq d() {
        return this.f.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.eck
    public long f() {
        return this.g.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.eck
    public String h() {
        String name = getClass().getName();
        String strValueOf = String.valueOf(this.e);
        String strValueOf2 = String.valueOf(this.g);
        String strValueOf3 = String.valueOf(this.f);
        String strValueOf4 = String.valueOf(this.h);
        return new StringBuilder(String.valueOf(name).length() + 71 + String.valueOf(strValueOf).length() + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length()).append("Platform: ").append(name).append("\nBackendFactory: ").append(strValueOf).append("\nClock: ").append(strValueOf2).append("\nLoggingContext: ").append(strValueOf3).append("\nLogCallerFinder: ").append(strValueOf4).append("\n").toString();
    }

    private static Object a(String str, Class cls) {
        String strC = c(str);
        if (strC == null) {
            return null;
        }
        int iIndexOf = strC.indexOf(35);
        if (iIndexOf <= 0 || iIndexOf == strC.length() - 1) {
            a("invalid getter (expected <class>#<method>): %s\n", strC);
            return null;
        }
        return a(strC.substring(0, iIndexOf), strC.substring(iIndexOf + 1), cls);
    }

    private static String c(String str) {
        eel.a(str, "attribute name");
        String strValueOf = String.valueOf(str);
        String strConcat = strValueOf.length() != 0 ? "flogger.".concat(strValueOf) : new String("flogger.");
        try {
            return System.getProperty(strConcat);
        } catch (SecurityException e) {
            a("cannot read property name %s: %s", strConcat, e);
            return null;
        }
    }

    private static Object a(String str, String str2, Class cls) {
        try {
            return cls.cast(Class.forName(str).getMethod(str2, new Class[0]).invoke(null, new Object[0]));
        } catch (ClassCastException e) {
            a("cannot cast result of calling '%s#%s' to '%s': %s\n", str, str2, cls.getName(), e);
            return null;
        } catch (ClassNotFoundException e2) {
            return null;
        } catch (Exception e3) {
            a("cannot call expected no-argument static method '%s#%s': %s\n", str, str2, e3);
            return null;
        }
    }

    private static void a(String str, Object... objArr) {
        PrintStream printStream = System.err;
        String strValueOf = String.valueOf(edr.class);
        String str2 = String.format(str, objArr);
        printStream.println(new StringBuilder(String.valueOf(strValueOf).length() + 2 + String.valueOf(str2).length()).append(strValueOf).append(": ").append(str2).toString());
    }
}
