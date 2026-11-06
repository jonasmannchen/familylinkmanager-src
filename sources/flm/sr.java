package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class sr implements Parcelable {
    public final Parcelable e;
    public static final sr d = new ss();
    public static final Parcelable.Creator CREATOR = new st();

    private sr() {
        this.e = null;
    }

    public sr(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.e = parcelable == d ? null : parcelable;
    }

    public sr(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.e = parcelable == null ? d : parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
    }

    /* synthetic */ sr(byte b) {
        this();
    }
}
