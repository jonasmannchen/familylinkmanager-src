package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cwn extends akl implements cwm {
    public static cwm a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        return iInterfaceQueryLocalInterface instanceof cwm ? (cwm) iInterfaceQueryLocalInterface : new cwo(iBinder);
    }
}
