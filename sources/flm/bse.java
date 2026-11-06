package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bse extends akl implements bsd {
    public static bsd a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.http.IGoogleHttpService");
        return iInterfaceQueryLocalInterface instanceof bsd ? (bsd) iInterfaceQueryLocalInterface : new bsf(iBinder);
    }
}
