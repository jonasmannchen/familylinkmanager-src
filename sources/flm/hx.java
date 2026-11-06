package flm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hx extends sr {
    public static final Parcelable.Creator CREATOR = new hy();
    public SparseArray a;

    public hx(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.a = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.a.append(iArr[i2], parcelableArray[i2]);
        }
    }

    public hx(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // flm.sr, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.a != null ? this.a.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.a.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.a.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
