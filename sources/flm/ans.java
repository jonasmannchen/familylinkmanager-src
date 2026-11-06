package flm;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ans extends akl implements anr {
    public ans() {
        super("com.google.android.gms.checkin.internal.ICheckinApiCallbacks");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.akl
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 5) {
            return false;
        }
        a((Status) akm.a(parcel, Status.CREATOR), parcel.readString());
        return true;
    }
}
