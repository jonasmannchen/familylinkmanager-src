package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class blr extends akl implements blq {
    public blr() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static blq a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (iInterfaceQueryLocalInterface instanceof blq) {
            return (blq) iInterfaceQueryLocalInterface;
        }
        return new bls(iBinder);
    }
}
