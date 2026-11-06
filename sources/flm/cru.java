package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cru implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i = bdw.readInt(parcel, header);
                    break;
                case 2:
                    j = bdw.readLong(parcel, header);
                    break;
                case 3:
                    j2 = bdw.readLong(parcel, header);
                    break;
                case 4:
                    z = bdw.readBoolean(parcel, header);
                    break;
                case 5:
                    j3 = bdw.readLong(parcel, header);
                    break;
                case 6:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 7:
                    f = bdw.readFloat(parcel, header);
                    break;
                case 8:
                    j4 = bdw.readLong(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }
}
