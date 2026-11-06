package flm;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dek extends dej {
    dek() {
    }

    @Override // flm.dej, flm.ddy
    public final void a(Status status) {
        if (!status.a()) {
            String strValueOf = String.valueOf(status);
            Log.e("UsageReportingClientImp", new StringBuilder(String.valueOf(strValueOf).length() + 52).append("disconnect(): Could not unregister listener: status=").append(strValueOf).toString());
        }
    }
}
