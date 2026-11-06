package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class crs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 1;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i2 = 1000;
        long j = 0;
        cry[] cryVarArr = null;
        int i3 = 1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i3 = bdw.readInt(parcel, header);
                    break;
                case 2:
                    i = bdw.readInt(parcel, header);
                    break;
                case 3:
                    j = bdw.readLong(parcel, header);
                    break;
                case 4:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 5:
                    cryVarArr = (cry[]) bdw.createTypedArray(parcel, header, cry.CREATOR);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LocationAvailability(i2, i3, i, j, cryVarArr);
    }
}
