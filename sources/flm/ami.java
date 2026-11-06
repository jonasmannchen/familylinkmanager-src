package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ami extends akl implements amh {
    public static amh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.appcert.IAppCertService");
        return iInterfaceQueryLocalInterface instanceof amh ? (amh) iInterfaceQueryLocalInterface : new amj(iBinder);
    }
}
