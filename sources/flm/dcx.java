package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dcx extends akl implements dcw {
    public static dcw a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.udc.internal.IUdcService");
        return iInterfaceQueryLocalInterface instanceof dcw ? (dcw) iInterfaceQueryLocalInterface : new dcy(iBinder);
    }
}
