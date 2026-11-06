package flm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cqm extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new cqn();
    public CharSequence a;
    public String b;
    public String c;
    public boolean d;

    public cqm(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.a == null ? "" : this.a, parcel, i);
        parcel.writeString(this.b == null ? "" : this.b);
        parcel.writeString(this.c == null ? "" : this.c);
        parcel.writeValue(Boolean.valueOf(this.d));
    }

    cqm(Parcel parcel) {
        super(parcel);
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = ((Boolean) parcel.readValue(null)).booleanValue();
    }
}
