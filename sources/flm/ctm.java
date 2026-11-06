package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ctm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ctl[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        Integer integerObject = null;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    i4 = bdw.readInt(parcel, header);
                    break;
                case 3:
                    i3 = bdw.readInt(parcel, header);
                    break;
                case 4:
                    z3 = bdw.readBoolean(parcel, header);
                    break;
                case 5:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 6:
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
                case 7:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 8:
                    integerObject = bdw.readIntegerObject(parcel, header);
                    break;
                case 9:
                    i = bdw.readInt(parcel, header);
                    break;
                case 10:
                    z = bdw.readBoolean(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ctl(i4, i3, z3, z2, i2, i, integerObject, z);
    }
}
