package flm;

import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bkv extends akl implements bku {
    public bkv() {
        super("com.google.android.gms.contextmanager.internal.IContextListener");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((bjk) akm.a(parcel, bjk.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
