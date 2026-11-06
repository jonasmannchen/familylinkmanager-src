package flm;

import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdx extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    public bdx(String str, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        super(new StringBuilder(String.valueOf(str).length() + 41).append(str).append(" Parcel: pos=").append(iDataPosition).append(" size=").append(parcel.dataSize()).toString());
    }
}
