package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cyy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cyt[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int[] iArrCreateIntArray = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        byte[][] bArrCreateByteArrayArray = null;
        int[] iArrCreateIntArray2 = null;
        byte[][] bArrCreateByteArrayArray2 = null;
        byte[][] bArrCreateByteArrayArray3 = null;
        byte[][] bArrCreateByteArrayArray4 = null;
        byte[][] bArrCreateByteArrayArray5 = null;
        byte[] bArrCreateByteArray = null;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 3:
                    bArrCreateByteArray = bdw.createByteArray(parcel, header);
                    break;
                case 4:
                    bArrCreateByteArrayArray5 = bdw.createByteArrayArray(parcel, header);
                    break;
                case 5:
                    bArrCreateByteArrayArray4 = bdw.createByteArrayArray(parcel, header);
                    break;
                case 6:
                    bArrCreateByteArrayArray3 = bdw.createByteArrayArray(parcel, header);
                    break;
                case 7:
                    bArrCreateByteArrayArray2 = bdw.createByteArrayArray(parcel, header);
                    break;
                case 8:
                    iArrCreateIntArray2 = bdw.createIntArray(parcel, header);
                    break;
                case 9:
                    bArrCreateByteArrayArray = bdw.createByteArrayArray(parcel, header);
                    break;
                case 10:
                    iArrCreateIntArray = bdw.createIntArray(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new cyt(strCreateString, bArrCreateByteArray, bArrCreateByteArrayArray5, bArrCreateByteArrayArray4, bArrCreateByteArrayArray3, bArrCreateByteArrayArray2, iArrCreateIntArray2, bArrCreateByteArrayArray, iArrCreateIntArray);
    }
}
