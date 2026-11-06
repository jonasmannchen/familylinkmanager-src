package flm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.LockScreenChimeraActivity;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byt {
    public static byr a() {
        return (byr) ((fin) ((bys) ((fio) byr.i.a(dp.au, (Object) null))).a(LockScreenChimeraActivity.ACTION_STOP).h());
    }

    public static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.telephony")) {
            if (packageManager.resolveActivity(new Intent("android.intent.action.DIAL"), 65536) != null) {
                return "android.intent.action.DIAL";
            }
            if (packageManager.resolveActivity(new Intent("com.android.phone.EmergencyDialer.DIAL"), 65536) != null) {
                return "com.android.phone.EmergencyDialer.DIAL";
            }
        }
        return null;
    }

    public static Set b(Context context) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
            return Collections.emptySet();
        }
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.DIAL"), 65536);
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            boolean z = (resolveInfo.activityInfo.applicationInfo.flags & bbv.DEFAULT_BIND_FLAGS) != 0;
            if (resolveInfo.isDefault || z) {
                hashSet.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (hashSet.isEmpty() && (resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("com.android.phone.EmergencyDialer.DIAL"), 65536)) != null) {
            return Collections.singleton(resolveInfoResolveActivity.activityInfo.packageName);
        }
        if ("htc".equalsIgnoreCase(Build.MANUFACTURER)) {
            hashSet.add("com.htc.contacts");
        }
        return hashSet;
    }

    public static String a(long j) {
        return DateFormat.getTimeInstance(3, Locale.getDefault()).format(new Date(j));
    }

    public static Calendar b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public static String a(Context context, long j) {
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(j);
        int i = minutes / 60;
        int i2 = minutes % 60;
        Resources resources = context.getResources();
        if (i == 0) {
            return resources.getQuantityString(R.plurals.kids_time_limit_num_minutes, i2, Integer.valueOf(i2));
        }
        return i2 == 0 ? resources.getQuantityString(R.plurals.kids_time_limit_num_hours, i, Integer.valueOf(i)) : context.getString(R.string.kids_time_limit_num_hours_and_minutes, resources.getQuantityString(R.plurals.kids_time_limit_num_hours, i, Integer.valueOf(i)), resources.getQuantityString(R.plurals.kids_time_limit_num_minutes, i2, Integer.valueOf(i2)));
    }

    public static boolean a(byr byrVar) {
        if (byrVar != null) {
            esu esuVar = esu.USAGE_LIMIT;
            esu esuVarA = esu.a(byrVar.c);
            if (esuVarA == null) {
                esuVarA = esu.NO_ACTIVE_POLICY;
            }
            if (esuVar == esuVarA && !byrVar.h.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
