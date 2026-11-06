package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bpx extends akl implements bpw {
    public static bpw a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
        return iInterfaceQueryLocalInterface instanceof bpw ? (bpw) iInterfaceQueryLocalInterface : new bpy(iBinder);
    }
}
