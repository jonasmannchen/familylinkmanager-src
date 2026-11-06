package flm;

import android.annotation.SuppressLint;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsx {
    @SuppressLint({"PrivateApi"})
    public static boolean a(String str) {
        try {
            return ((Boolean) dvl.a(Class.forName("android.media.AudioSystem").getDeclaredMethod("isStreamActive", Integer.TYPE, Integer.TYPE).invoke(null, 4, 0))).booleanValue();
        } catch (ReflectiveOperationException e) {
            btv.c(str, e, "Can't call isAlarmActive(STREAM_ALARM, 0)", new Object[0]);
            btt.a(str, e, "Can't call isAlarmActive(STREAM_ALARM, 0)", new Object[0]);
            return false;
        }
    }
}
