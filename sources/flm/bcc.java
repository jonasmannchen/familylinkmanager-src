package flm;

import android.content.Context;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcc {
    public aqf apiAvailability;
    public final SparseIntArray apiAvailabilityCache;

    public bcc() {
        this(aqd.a);
    }

    public bcc(aqf aqfVar) {
        this.apiAvailabilityCache = new SparseIntArray();
        bdi.checkNotNull(aqfVar);
        this.apiAvailability = aqfVar;
    }

    public final int getClientAvailability(Context context, ate ateVar) {
        int iA;
        bdi.checkNotNull(context);
        bdi.checkNotNull(ateVar);
        if (!ateVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = ateVar.getMinApkVersion();
        int i = this.apiAvailabilityCache.get(minApkVersion, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.apiAvailabilityCache.size()) {
                iA = i;
                break;
            }
            int iKeyAt = this.apiAvailabilityCache.keyAt(i2);
            if (iKeyAt > minApkVersion && this.apiAvailabilityCache.get(iKeyAt) == 0) {
                iA = 0;
                break;
            }
            i2++;
        }
        if (iA == -1) {
            iA = this.apiAvailability.a(context, minApkVersion);
        }
        this.apiAvailabilityCache.put(minApkVersion, iA);
        return iA;
    }

    public final void flush() {
        this.apiAvailabilityCache.clear();
    }
}
