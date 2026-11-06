package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ank implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new anj[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        float f = 0.0f;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 0;
        int[] iArrCreateIntArray = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    f3 = bdw.readFloat(parcel, header);
                    break;
                case 3:
                    f2 = bdw.readFloat(parcel, header);
                    break;
                case 4:
                    f = bdw.readFloat(parcel, header);
                    break;
                case 5:
                    i = bdw.readInt(parcel, header);
                    break;
                case 6:
                    iArrCreateIntArray = bdw.createIntArray(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new anj(f3, f2, f, i, iArrCreateIntArray);
    }
}
