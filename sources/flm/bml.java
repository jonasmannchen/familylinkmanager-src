package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bml extends akl implements bmk {
    public static bmk a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
        return iInterfaceQueryLocalInterface instanceof bmk ? (bmk) iInterfaceQueryLocalInterface : new bmm(iBinder);
    }
}
