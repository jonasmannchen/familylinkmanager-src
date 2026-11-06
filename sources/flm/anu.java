package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class anu extends akl implements ant {
    public static ant a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.checkin.internal.ICheckinApiService");
        return iInterfaceQueryLocalInterface instanceof ant ? (ant) iInterfaceQueryLocalInterface : new anv(iBinder);
    }
}
