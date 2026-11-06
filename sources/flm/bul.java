package flm;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bul {
    public static void a(boolean z) {
        try {
            Object systemService = ayt.a().getSystemService("statusbar");
            Method method = systemService.getClass().getMethod("disable", Integer.TYPE);
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(z ? 51314688 : 0);
            method.invoke(systemService, objArr);
        } catch (Exception e) {
            btv.c("TimeLimit", e, "Could not disable status bar", new Object[0]);
            btt.a("TimeLimit", e, "Could not disable status bar", new Object[0]);
        }
    }
}
