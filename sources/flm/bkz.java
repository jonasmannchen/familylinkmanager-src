package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bkz extends akl implements bky {
    public static bky a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
        return iInterfaceQueryLocalInterface instanceof bky ? (bky) iInterfaceQueryLocalInterface : new bla(iBinder);
    }
}
