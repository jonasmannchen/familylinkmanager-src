package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class er extends sr {
    public static final Parcelable.Creator CREATOR = new es();
    public final int a;

    public er(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
    }

    public er(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }

    @Override // flm.sr, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
