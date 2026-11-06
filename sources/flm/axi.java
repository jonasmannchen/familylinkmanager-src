package flm;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class axi extends akl implements axh {
    public axi() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((Status) akm.a(parcel, Status.CREATOR));
        return true;
    }
}
