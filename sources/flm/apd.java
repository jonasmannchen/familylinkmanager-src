package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new apc[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        cza[] czaVarArr = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        boolean z = true;
        cyt[] cytVarArr = null;
        byte[][] bArrCreateByteArrayArray = null;
        int[] iArrCreateIntArray = null;
        String[] strArrCreateStringArray = null;
        int[] iArrCreateIntArray2 = null;
        byte[] bArrCreateByteArray = null;
        apq apqVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    apqVar = (apq) bdw.createParcelable(parcel, header, apq.CREATOR);
                    break;
                case 3:
                    bArrCreateByteArray = bdw.createByteArray(parcel, header);
                    break;
                case 4:
                    iArrCreateIntArray2 = bdw.createIntArray(parcel, header);
                    break;
                case 5:
                    strArrCreateStringArray = bdw.createStringArray(parcel, header);
                    break;
                case 6:
                    iArrCreateIntArray = bdw.createIntArray(parcel, header);
                    break;
                case 7:
                    bArrCreateByteArrayArray = bdw.createByteArrayArray(parcel, header);
                    break;
                case 8:
                    z = bdw.readBoolean(parcel, header);
                    break;
                case 9:
                    cytVarArr = (cyt[]) bdw.createTypedArray(parcel, header, cyt.CREATOR);
                    break;
                case 10:
                    czaVarArr = (cza[]) bdw.createTypedArray(parcel, header, cza.CREATOR);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new apc(apqVar, bArrCreateByteArray, iArrCreateIntArray2, strArrCreateStringArray, iArrCreateIntArray, bArrCreateByteArrayArray, z, cytVarArr, czaVarArr);
    }
}
