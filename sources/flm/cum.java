package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cum extends akl implements cul {
    public static cul a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.lockbox.internal.ILockboxService");
        return iInterfaceQueryLocalInterface instanceof cul ? (cul) iInterfaceQueryLocalInterface : new cun(iBinder);
    }
}
