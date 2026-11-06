package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bed extends akl implements bec {
    public static bec a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.net.ISocketFactoryCreator");
        return iInterfaceQueryLocalInterface instanceof bec ? (bec) iInterfaceQueryLocalInterface : new bee(iBinder);
    }
}
