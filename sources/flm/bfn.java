package flm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfn {
    private static final HashMap a = new HashMap();

    public static synchronized String a(Context context, String str) {
        String string;
        if (TextUtils.isEmpty(str)) {
            str = "GMS/1.0";
        }
        string = (String) a.get(str);
        if (string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Mozilla 5.0 (Linux; U; Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("; ");
            sb.append(Locale.getDefault().toString());
            String str2 = Build.MODEL;
            if (!TextUtils.isEmpty(str2)) {
                sb.append("; ");
                sb.append(str2);
            }
            String str3 = Build.ID;
            if (!TextUtils.isEmpty(str3)) {
                sb.append("; Build/");
                sb.append(str3);
            }
            sb.append("); ");
            sb.append(context.getPackageName());
            sb.append('/');
            sb.append(a(context));
            sb.append("; FastParser/1.1; ");
            sb.append(str);
            sb.append("; (gzip)");
            string = sb.toString();
            a.put(str, string);
        }
        return string;
    }

    private static int a(Context context) {
        try {
            return bjj.a.a(context).b(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return 0;
        }
    }
}
