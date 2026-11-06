package flm;

import android.content.Context;
import com.google.android.gms.common.stats.AlarmEvent;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfs {
    public static bfs a;
    private static Integer b;

    public static void a(Context context, int i, String str, long j, long j2, long j3, List list, int i2) {
        boolean z;
        int iA;
        if (bav.IS_PACKAGE_SIDE) {
            if (b == null) {
                if (bav.IS_PACKAGE_SIDE) {
                    bgi bgiVar = null;
                    iA = 0 != 0 ? bgiVar.a(3) : bgb.b;
                } else {
                    iA = bgb.b;
                }
                b = Integer.valueOf(iA);
            }
            z = b.intValue() != bgb.b;
        } else {
            z = false;
        }
        if (z) {
            AlarmEvent alarmEvent = new AlarmEvent(System.currentTimeMillis(), i, str, j, j2, j3, bgj.a(list), i2, bil.a(context), bgj.a(context.getPackageName()), bil.b(context));
            bgd bgdVarA = bgd.a();
            if (!bgdVarA.a.a("alarms") || bgdVarA.a.c == bgb.b) {
                return;
            }
            bgdVarA.b.submit(new bgf(bgdVarA, "alarms", alarmEvent));
        }
    }
}
