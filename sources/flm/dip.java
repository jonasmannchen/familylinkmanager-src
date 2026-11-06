package flm;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dip extends dfm implements dgb, dkz {
    private static final long g = TimeUnit.HOURS.toMillis(12);
    public final SharedPreferences c;
    public final boolean d;
    public final int e;
    public final Pattern[] f;
    private final dge h;

    static dip a(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, SharedPreferences sharedPreferences, dvi dviVar) {
        if (!dviVar.a()) {
            return new dip(dpzVar, application, dmbVar, dmbVar2, sharedPreferences);
        }
        dviVar.b();
        throw new NoSuchMethodError();
    }

    static boolean a(SharedPreferences sharedPreferences) {
        long j = g;
        dsg.b();
        long j2 = sharedPreferences.getLong("primes.packageMetric.lastSendTime", -1L);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < j2) {
            if (!sharedPreferences.edit().remove("primes.packageMetric.lastSendTime").commit()) {
                dkm.a(3, "SamplingUtil", "Failure storing timestamp to SharedPreferences", new Object[0]);
            }
            j2 = -1;
        }
        return j2 != -1 && jElapsedRealtime <= j2 + j;
    }

    private dip(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, SharedPreferences sharedPreferences) {
        this(dpzVar, application, dmbVar, dmbVar2, sharedPreferences, false, -1, new Pattern[0]);
    }

    private dip(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, SharedPreferences sharedPreferences, boolean z, int i, Pattern... patternArr) {
        super(dpzVar, application, dmbVar, dmbVar2, dp.J);
        this.c = sharedPreferences;
        this.d = z;
        this.e = i;
        this.f = patternArr;
        this.h = dge.a(application);
    }

    @Override // flm.dkz
    public final void e() {
        this.h.a(this);
    }

    @Override // flm.dkz
    public final void f() {
    }

    @Override // flm.dgb
    public final void b() {
        this.h.b(this);
        c().submit(new diq(this));
    }

    @Override // flm.dfm
    final void d() {
        this.h.b(this);
    }
}
