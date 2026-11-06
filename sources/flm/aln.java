package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aln implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new all[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        byte[] bArrCreateByteArray = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        byte[] bArrCreateByteArray2 = null;
        byte[][] bArrCreateByteArrayArray = null;
        String strCreateString = null;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 2:
                    i = bdw.readInt(parcel, header);
                    break;
                case 3:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 4:
                    bArrCreateByteArrayArray = bdw.createByteArrayArray(parcel, header);
                    break;
                case 5:
                    bArrCreateByteArray2 = bdw.createByteArray(parcel, header);
                    break;
                case 6:
                    bArrCreateByteArray = bdw.createByteArray(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new all(i2, i, strCreateString, bArrCreateByteArrayArray, bArrCreateByteArray2, bArrCreateByteArray);
    }
}
