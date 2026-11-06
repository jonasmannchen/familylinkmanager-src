package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.OneoffTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new OneoffTask[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OneoffTask(parcel);
    }
}
