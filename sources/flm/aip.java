package flm;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aip extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new aiq();
    public boolean a;

    public aip(Parcelable parcelable) {
        super(parcelable);
        this.a = false;
    }

    public aip(Parcel parcel) {
        super(parcel);
        this.a = false;
        this.a = parcel.readInt() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }
}
