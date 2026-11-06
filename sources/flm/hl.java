package flm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hl extends sr {
    public static final Parcelable.Creator CREATOR = new hm();
    public CharSequence a;
    public boolean b;

    public hl(Parcelable parcelable) {
        super(parcelable);
    }

    hl(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = parcel.readInt() == 1;
    }

    @Override // flm.sr, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.a, parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String strValueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(hexString).length() + 35 + String.valueOf(strValueOf).length()).append("TextInputLayout.SavedState{").append(hexString).append(" error=").append(strValueOf).append("}").toString();
    }
}
