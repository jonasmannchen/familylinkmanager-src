package flm;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xe {
    public static xe a;
    private final Context b;
    private final LocationManager c;
    private final xf d = new xf();

    xe(Context context, LocationManager locationManager) {
        this.b = context;
        this.c = locationManager;
    }

    final boolean a() {
        Location location;
        long j;
        long j2;
        xf xfVar = this.d;
        if (this.d.b > System.currentTimeMillis()) {
            return xfVar.a;
        }
        Location locationA = null;
        Location locationA2 = null;
        if (oy.a(this.b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            locationA = a("network");
        }
        if (oy.a(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            locationA2 = a("gps");
        }
        if (locationA2 == null || locationA == null) {
            location = locationA2 != null ? locationA2 : locationA;
        } else {
            location = locationA2.getTime() > locationA.getTime() ? locationA2 : locationA;
        }
        if (location != null) {
            xf xfVar2 = this.d;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (xd.a == null) {
                xd.a = new xd();
            }
            xd xdVar = xd.a;
            xdVar.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
            xdVar.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
            boolean z = xdVar.d == 1;
            long j3 = xdVar.c;
            long j4 = xdVar.b;
            xdVar.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
            long j5 = xdVar.c;
            if (j3 == -1 || j4 == -1) {
                j = 43200000 + jCurrentTimeMillis;
            } else {
                if (jCurrentTimeMillis > j4) {
                    j2 = j5 + 0;
                } else if (jCurrentTimeMillis > j3) {
                    j2 = 0 + j4;
                } else {
                    j2 = 0 + j3;
                }
                j = j2 + 60000;
            }
            xfVar2.a = z;
            xfVar2.b = j;
            return xfVar.a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    private final Location a(String str) {
        try {
            if (this.c.isProviderEnabled(str)) {
                return this.c.getLastKnownLocation(str);
            }
        } catch (Exception e) {
        }
        return null;
    }
}
