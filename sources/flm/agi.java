package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agi extends sr {
    public static final Parcelable.Creator CREATOR = new agj();
    public Parcelable a;

    agi(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? afw.class.getClassLoader() : classLoader);
    }

    public agi(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // flm.sr, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }
}
