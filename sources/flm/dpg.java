package flm;

import android.content.Context;
import android.os.Debug;
import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpg {
    public static int a(Context context) {
        return dpl.a(context).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
    }

    public static long a() {
        try {
            return Long.parseLong(Debug.getRuntimeStat("art.gc.bytes-allocated")) - Long.parseLong(Debug.getRuntimeStat("art.gc.bytes-freed"));
        } catch (NumberFormatException e) {
            return 0L;
        }
    }
}
