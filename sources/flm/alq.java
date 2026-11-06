package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class alq extends akl implements alp {
    public static alp a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audit.internal.IAuditService");
        return iInterfaceQueryLocalInterface instanceof alp ? (alp) iInterfaceQueryLocalInterface : new alr(iBinder);
    }
}
