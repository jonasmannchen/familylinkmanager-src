package flm;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bmo extends akl implements bmn {
    public static bmn a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        return iInterfaceQueryLocalInterface instanceof bmn ? (bmn) iInterfaceQueryLocalInterface : new bmp(iBinder);
    }
}
