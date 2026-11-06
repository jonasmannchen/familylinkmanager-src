package flm;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehh {
    public static final ehi a;

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        a.a(th, printWriter);
    }

    public static void a(Throwable th, PrintStream printStream) {
        a.a(th, printStream);
    }

    private static Integer a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c A[Catch: Throwable -> 0x002d, TRY_ENTER, TryCatch #0 {Throwable -> 0x002d, blocks: (B:5:0x0007, B:7:0x000f, B:12:0x001c, B:16:0x0027, B:21:0x0069), top: B:26:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x0027 A[Catch: Throwable -> 0x002d, TRY_LEAVE, TryCatch #0 {Throwable -> 0x002d, blocks: (B:5:0x0007, B:7:0x000f, B:12:0x001c, B:16:0x0027, B:21:0x0069), top: B:26:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069 A[Catch: Throwable -> 0x002d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Throwable -> 0x002d, blocks: (B:5:0x0007, B:7:0x000f, B:12:0x001c, B:16:0x0027, B:21:0x0069), top: B:26:0x0007 }] */
    static {
        Integer numA;
        Throwable th;
        ehi ehmVar;
        boolean z;
        try {
            numA = a();
            if (numA == null) {
                if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    ehmVar = new ehl();
                } else {
                    ehmVar = new ehm();
                }
            } else {
                try {
                    if (numA.intValue() >= 19) {
                        ehmVar = new ehn();
                    } else {
                        if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            ehmVar = new ehl();
                        } else {
                            ehmVar = new ehm();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    PrintStream printStream = System.err;
                    String name = ehm.class.getName();
                    printStream.println(new StringBuilder(String.valueOf(name).length() + 132).append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ").append(name).append("will be used. The error is: ").toString());
                    th.printStackTrace(System.err);
                    ehmVar = new ehm();
                }
            }
        } catch (Throwable th3) {
            numA = null;
            th = th3;
        }
        a = ehmVar;
        if (numA != null) {
            numA.intValue();
        }
    }
}
