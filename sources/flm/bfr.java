package flm;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfr {
    public static final long a = a("WINDOW_EXACT");
    public static final long b = a("WINDOW_HEURISTIC");
    public static final int c = b("FLAG_STANDALONE");
    public static final int d;
    public final AlarmManager e;
    public final Context f;
    public final boolean g;
    private final bfs h;
    private final boolean i;

    public bfr(Context context) {
        this(context.getApplicationContext(), (AlarmManager) context.getSystemService("alarm"), context.getApplicationInfo().targetSdkVersion);
    }

    private bfr(Context context, AlarmManager alarmManager, int i) {
        this.f = (Context) bdi.checkNotNull(context);
        this.e = (AlarmManager) bdi.checkNotNull(alarmManager);
        this.g = i < 19;
        if (bfs.a == null) {
            bfs.a = new bfs();
        }
        this.h = bfs.a;
        this.i = bjd.a(this.f);
    }

    @TargetApi(19)
    public final void a(String str, int i, long j, long j2, long j3, PendingIntent pendingIntent, WorkSource workSource) {
        if (a(j)) {
            WorkSource workSource2 = !this.i ? null : workSource;
            try {
                this.e.set(i, j, j2, 0L, pendingIntent, workSource2);
                if (i == 2 || i == 0) {
                    int i2 = 0;
                    if (j2 == a) {
                        i2 = c | 0;
                    }
                    long jCurrentTimeMillis = 0;
                    if (i == 2) {
                        jCurrentTimeMillis = j - SystemClock.elapsedRealtime();
                    } else if (i == 0) {
                        jCurrentTimeMillis = j - System.currentTimeMillis();
                    }
                    bfs.a(this.f, i, str, jCurrentTimeMillis, j2, 0L, bjd.a(workSource2), i2);
                    duj.a();
                }
            } catch (SecurityException e) {
                Log.e("AlarmManager", "Failed to set alarm", e);
            }
        }
    }

    private static long a(String str) {
        try {
            return ((Long) AlarmManager.class.getDeclaredField(str).get(null)).longValue();
        } catch (Exception e) {
            return -1L;
        }
    }

    private static int b(String str) {
        try {
            return ((Integer) AlarmManager.class.getDeclaredField(str).get(null)).intValue();
        } catch (Exception e) {
            return -1;
        }
    }

    public static boolean a(long j) {
        return j > 0;
    }

    static {
        b("FLAG_WAKE_FROM_IDLE");
        d = b("FLAG_WAKE_FROM_IDLE");
        b("FLAG_ALLOW_WHILE_IDLE_UNRESTRICTED");
        b("FLAG_IDLE_UNTIL");
    }
}
