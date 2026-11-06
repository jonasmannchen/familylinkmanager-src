package flm;

import android.app.ActivityManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.pm.PackageManager;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsw {
    public static boolean a(String str) {
        try {
            ayt.a().getPackageManager().getApplicationInfo(str, btb.c);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static Set a() {
        if (fra.b()) {
            UsageStatsManager usageStatsManager = (UsageStatsManager) ayt.a().getSystemService("usagestats");
            long jA = bij.a.a();
            long millis = TimeUnit.SECONDS.toMillis(3L);
            boolean z = false;
            String packageName = null;
            UsageEvents.Event event = new UsageEvents.Event();
            while (true) {
                long j = jA - millis;
                btv.a("TimeLimit", "Querying for events at %s-%s", new Date(j), new Date(jA));
                UsageEvents usageEventsQueryEvents = usageStatsManager.queryEvents(j, jA);
                while (usageEventsQueryEvents.hasNextEvent()) {
                    usageEventsQueryEvents.getNextEvent(event);
                    btv.a("TimeLimit", "Usage event T:%s, E:%s, P:%s", new Date(event.getTimeStamp()), Integer.valueOf(event.getEventType()), event.getPackageName());
                    switch (event.getEventType()) {
                        case 1:
                            packageName = event.getPackageName();
                            z = true;
                            break;
                        case 2:
                            packageName = null;
                            z = true;
                            break;
                    }
                }
                millis <<= 1;
                if (!z && millis < TimeUnit.DAYS.toMillis(365L)) {
                    jA = j;
                }
            }
            if (!z) {
                btv.d("TimeLimit", "No usage data available on the device to find foreground app.", new Object[0]);
                btt.a("TimeLimit", "NoUsageData", "No usage data available on the device to find foreground app.", new Object[0]);
                packageName = "NO_DATA_AVAILABLE.IS_IT_LAUNCHER?";
            } else {
                btv.a("TimeLimit", "Foreground package: %s", packageName);
            }
            if (packageName != null) {
                return Collections.singleton(packageName);
            }
            return Collections.emptySet();
        }
        ActivityManager activityManager = (ActivityManager) ayt.a().getSystemService("activity");
        HashSet hashSet = new HashSet();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : (List) dvi.c(activityManager.getRunningAppProcesses()).a(Collections.emptyList())) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.pkgList != null) {
                Collections.addAll(hashSet, runningAppProcessInfo.pkgList);
            }
        }
        return hashSet;
    }
}
