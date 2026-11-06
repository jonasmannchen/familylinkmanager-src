package flm;

import android.annotation.TargetApi;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(5)
public final class aqz {
    public static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList("com.android.settings", "com.android.systemui")));
    public final boolean b;
    private final PackageManager c;

    public aqz(PackageManager packageManager) {
        this.c = packageManager;
        this.b = "google".equals(Build.BRAND) && packageManager.hasSystemFeature("com.google.android.feature.GOOGLE_EXPERIENCE");
    }

    public final aqi a() {
        try {
            PackageInfo packageInfo = this.c.getPackageInfo("android", 64);
            if (packageInfo.signatures.length == 1) {
                return new aqj(packageInfo.signatures[0].toByteArray());
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("PlatCertificateHelper", "Unexpected exception looking up android", e);
        }
        Log.w("PlatCertificateHelper", "Could not determine the platform key");
        return null;
    }
}
