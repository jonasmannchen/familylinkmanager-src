package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eb extends sr {
    public static final Parcelable.Creator CREATOR = new ec();
    public int a;
    public float b;
    public boolean c;

    public eb(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
        this.c = parcel.readByte() != 0;
    }

    public eb(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // flm.sr, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeByte((byte) (this.c ? 1 : 0));
    }
}
