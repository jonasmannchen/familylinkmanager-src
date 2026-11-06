package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bag {
    public static atj fromStatus(Status status) {
        if (status.j != null) {
            return new atw(status);
        }
        return new atj(status);
    }

    public static atj fromConnectionResult(apx apxVar) {
        return fromStatus(new Status(apxVar.c, apxVar.e, apxVar.d));
    }
}
