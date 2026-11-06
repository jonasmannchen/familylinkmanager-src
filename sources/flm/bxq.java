package flm;

import android.location.Location;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bxq extends crt {
    private final /* synthetic */ CountDownLatch a;
    private final /* synthetic */ fag b;

    bxq(CountDownLatch countDownLatch, fag fagVar) {
        this.a = countDownLatch;
        this.b = fagVar;
    }

    @Override // flm.crt
    public final void a(LocationResult locationResult) {
        if (this.a.getCount() > 0) {
            int size = locationResult.b.size();
            Location location = size == 0 ? null : (Location) locationResult.b.get(size - 1);
            btt.a(this.b.b, location);
            btv.c("Location", "[%s] Obtained %s of %s location updates with expected accuracy %s", "LocationFixer", Long.valueOf((((long) this.b.c) - this.a.getCount()) + 1), Integer.valueOf(this.b.c), Float.valueOf(location.getAccuracy()));
            this.a.countDown();
            bxo.a(new StringBuilder(34).append("Location fix accuracy: ").append((int) location.getAccuracy()).toString());
            if (location.getAccuracy() < this.b.h) {
                for (int i = 0; i < this.a.getCount(); i++) {
                    this.a.countDown();
                }
            }
        }
    }

    @Override // flm.crt
    public final void a(LocationAvailability locationAvailability) {
        if (locationAvailability.a()) {
            btv.c("Location", "[%s] Location is available", "LocationFixer");
        } else {
            btv.d("Location", "[%s] Location is unavailable", "LocationFixer");
        }
        btv.c("Location", "[%s] Location status: %s", "LocationFixer", Integer.valueOf(locationAvailability.d));
        btv.c("Location", "[%s] Batched location status: %s", "LocationFixer", Arrays.toString(locationAvailability.e));
    }
}
