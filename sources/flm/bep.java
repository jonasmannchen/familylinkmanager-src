package flm;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimeraresources.R;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bep {
    public static final bep a;
    private static final Map b = bih.a(new String[]{"android.permission-group.SENSORS", "android.permission-group.CALENDAR", "android.permission-group.CAMERA", "android.permission-group.CONTACTS", "android.permission-group.MICROPHONE", "android.permission-group.PHONE", "android.permission-group.SMS", "android.permission-group.STORAGE"}, new String[]{"android.permission.BODY_SENSORS", "android.permission.READ_CALENDAR", "android.permission.CAMERA", "android.permission.READ_CONTACTS", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE", "android.permission.SEND_SMS", "android.permission.READ_EXTERNAL_STORAGE"});
    private static final Map c = new rt();
    private static final Map d = new rt();
    private volatile Set e = null;

    private bep() {
    }

    @TargetApi(23)
    public final Set a() {
        Set setUnmodifiableSet = this.e;
        if (setUnmodifiableSet == null) {
            synchronized (this) {
                setUnmodifiableSet = this.e;
                if (setUnmodifiableSet == null) {
                    HashSet hashSet = new HashSet();
                    BaseApplicationContext baseApplicationContextA = ayt.a();
                    if (biw.a()) {
                        for (Map.Entry entry : c().entrySet()) {
                            if (baseApplicationContextA.checkSelfPermission((String) entry.getValue()) == -1) {
                                hashSet.add((String) entry.getKey());
                            }
                        }
                    }
                    setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                    this.e = setUnmodifiableSet;
                }
            }
        }
        return setUnmodifiableSet;
    }

    public final synchronized void b() {
        this.e = null;
    }

    public static PendingIntent a(Context context, Set set, Map map) {
        String str;
        if (bik.a(context)) {
            str = "com.google.android.gms.RECOVER_WEAR_PERMISSION";
        } else {
            str = "com.google.android.gms.RECOVER_PERMISSION";
        }
        Intent intent = new Intent(str);
        if (set == null) {
            return PendingIntent.getActivity(context, 0, intent, 134217728);
        }
        intent.putStringArrayListExtra("requiredGroups", new ArrayList<>(set));
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (set.contains(entry.getKey())) {
                    intent.putExtra((String) entry.getKey(), entry.getValue() == null ? 0 : ((Integer) entry.getValue()).intValue());
                }
            }
        }
        return PendingIntent.getActivity(context, 0, intent, 134217728);
    }

    public static Map c() {
        if (bav.APK_IS_TV_APK) {
            return c;
        }
        if (bav.APK_IS_AUTO_APK && fop.b()) {
            return d;
        }
        return b;
    }

    static {
        if (bav.APK_IS_TV_APK) {
            c.putAll(b);
            c.remove("android.permission-group.SENSORS");
        } else if (bav.APK_IS_AUTO_APK && fop.b()) {
            d.putAll(b);
            d.remove("android.permission-group.SENSORS");
        }
        bih.a(new String[]{"android.permission-group.SENSORS", "android.permission-group.CALENDAR", "android.permission-group.CAMERA", "android.permission-group.CONTACTS", "android.permission-group.MICROPHONE", "android.permission-group.PHONE", "android.permission-group.SMS", "android.permission-group.STORAGE"}, new Integer[]{Integer.valueOf(R.string.permgrouplab_sensors), Integer.valueOf(R.string.permgrouplab_calendar), Integer.valueOf(R.string.permgrouplab_camera), Integer.valueOf(R.string.permgrouplab_contacts), Integer.valueOf(R.string.permgrouplab_microphone), Integer.valueOf(R.string.permgrouplab_phone), Integer.valueOf(R.string.permgrouplab_sms), Integer.valueOf(R.string.permgrouplab_storage)});
        a = new bep();
    }
}
