package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ctt extends akl implements cts {
    public static cts a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.reporting.internal.IReportingService");
        return iInterfaceQueryLocalInterface instanceof cts ? (cts) iInterfaceQueryLocalInterface : new ctu(iBinder);
    }
}
