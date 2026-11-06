package flm;

import android.os.SystemClock;
import android.provider.Settings;
import com.google.android.gms.kids.database.SupervisionDatabase;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btj {
    private static final long a = TimeUnit.MINUTES.toMillis(2);
    private static btk b = new btk();

    public static long a() {
        return SupervisionDatabase.h().k().b("key_device_time_skew_ms");
    }

    public static long b() {
        if (biw.d()) {
            return System.currentTimeMillis();
        }
        return System.currentTimeMillis() - a();
    }

    public static long c() {
        return SystemClock.elapsedRealtime();
    }

    public static void d() {
        if (!biw.d()) {
            SupervisionDatabase.h().k().a("key_device_time_at_elapsed_time_zero", b() - SystemClock.elapsedRealtime());
        }
    }

    public static void e() {
        if (!biw.d()) {
            SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
            bvp bvpVarK = supervisionDatabaseH.k();
            supervisionDatabaseH.d();
            try {
                if (f()) {
                    bvpVarK.a("key_device_time_at_elapsed_time_zero", System.currentTimeMillis() - SystemClock.elapsedRealtime());
                    bvpVarK.a("key_device_time_skew_ms", 0L);
                } else {
                    bvpVarK.a("key_device_time_skew_ms", System.currentTimeMillis() - (bvpVarK.b("key_device_time_at_elapsed_time_zero") + SystemClock.elapsedRealtime()));
                }
                supervisionDatabaseH.f();
            } finally {
                supervisionDatabaseH.e();
            }
        }
    }

    public static void a(long j) {
        if (!biw.d()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = jCurrentTimeMillis - j;
            if (f() && 0 <= j2 && j2 <= a) {
                j = jCurrentTimeMillis;
            }
            SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
            bvp bvpVarK = supervisionDatabaseH.k();
            supervisionDatabaseH.d();
            try {
                bvpVarK.a("key_device_time_skew_ms", jCurrentTimeMillis - j);
                bvpVarK.a("key_device_time_at_elapsed_time_zero", j - jElapsedRealtime);
                supervisionDatabaseH.f();
            } finally {
                supervisionDatabaseH.e();
            }
        }
    }

    private static boolean f() {
        return Settings.Global.getInt(ayt.a().getContentResolver(), "auto_time", 0) == 1;
    }
}
