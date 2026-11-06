package flm;

import com.google.android.gms.kids.database.SupervisionDatabase;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bud {
    private static final long a = TimeUnit.HOURS.toMillis(1);
    private static final long b = TimeUnit.HOURS.toMillis(24);

    public static boolean a(String str, String str2) {
        if (!Pattern.matches("^\\d{6}$", str2)) {
            return false;
        }
        fca fcaVarA = a(str);
        if (fcaVarA == null) {
            btt.a(str, "OTP", "no parent access code policy present", new Object[0]);
            return false;
        }
        fay fayVar = fcaVarA.b == null ? fay.e : fcaVarA.b;
        if (a(str, fayVar.c == null ? fao.c : fayVar.c, str2)) {
            return true;
        }
        if (a(str, fayVar.b == null ? fao.c : fayVar.b, str2)) {
            return true;
        }
        Iterator it = fayVar.d.iterator();
        while (it.hasNext()) {
            if (a(str, (fao) it.next(), str2)) {
                return true;
            }
        }
        exh exhVar = fcaVarA.c == null ? exh.c : fcaVarA.c;
        String str3 = (exhVar.b == null ? fao.c : exhVar.b).b;
        if (str3.isEmpty()) {
            btt.a(str, "OTP", "no PAC match, and emergency code does not exist", new Object[0]);
            return false;
        }
        if (a(str, str3, str2)) {
            return true;
        }
        btt.a(str, "OTP", "Incorrect parent access code and incorrect emergency code. Timestamp = %s", Long.valueOf(btj.b()));
        return false;
    }

    private static boolean a(String str, fao faoVar, String str2) {
        if (faoVar.b.isEmpty()) {
            return false;
        }
        try {
            long jB = ((fqs) fqr.a.a()).b();
            if (jB <= 0) {
                btt.a(str, "OTP", "Invalid otpTTLMillis. Fallback to default value.", new Object[0]);
                jB = TimeUnit.MINUTES.toMillis(10L);
            }
            long jA = ((fqs) fqr.a.a()).a();
            if (jA <= 0) {
                btt.a(str, "OTP", "Invalid granularityMillis. Fallback to default value.", new Object[0]);
                jA = TimeUnit.MINUTES.toMillis(1L);
            }
            epn epnVarA = epm.a(faoVar.b, btj.b(), jB, TimeUnit.DAYS.toMillis(1L), jA, str2);
            if (!epnVarA.a()) {
                if (epnVarA.b()) {
                    long jC = epnVarA.c() - btj.b();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z", Locale.US);
                    btt.a(str, "OTP", "The entered Parent Access Code (%s) is probably generated at %s, which is %s minutes from now. Current time: %s.", str2, simpleDateFormat.format(new Date(epnVarA.c())), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(jC)), simpleDateFormat.format(new Date(btj.b())));
                } else {
                    btt.a(str, "OTP", "Could not infer generation time of the entered Parent Access Code (%s).", str2);
                }
            }
            return epnVarA.a();
        } catch (Exception e) {
            btv.c(str, e, "Error occurred when verifying OTP.", new Object[0]);
            btt.a(str, e, "Error occurred when verifying OTP.", new Object[0]);
            return false;
        }
    }

    private static boolean a(String str, String str2, String str3) {
        if (str2.isEmpty()) {
            return false;
        }
        try {
            long jB = btj.b();
            long j = b;
            return epm.a(str2, jB, j, j, a, str3).a();
        } catch (Exception e) {
            btv.c(str, e, "Error occurred when verifying emergency OTP", new Object[0]);
            btt.a(str, e, "Error occurred when verifying emergency OTP", new Object[0]);
            return false;
        }
    }

    private static fca a(String str) {
        bwg bwgVarB = SupervisionDatabase.h().l().b(fdc.TYPE_PARENT_ACCESS_CODE, "");
        if (bwgVarB == null) {
            return null;
        }
        try {
            return (fca) fin.b(fca.d, bwgVarB.f, fib.b());
        } catch (fjg e) {
            btv.c(str, e, "Failed parse parent access code policy", new Object[0]);
            btt.a(str, e, "Failed parse parent access code policy", new Object[0]);
            return null;
        }
    }
}
