package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ble implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new blc[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String[] strArrCreateStringArray = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        String[] strArrCreateStringArray2 = null;
        String[] strArrCreateStringArray3 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    strArrCreateStringArray3 = bdw.createStringArray(parcel, header);
                    break;
                case 3:
                    strArrCreateStringArray2 = bdw.createStringArray(parcel, header);
                    break;
                case 4:
                    strArrCreateStringArray = bdw.createStringArray(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new blc(strArrCreateStringArray3, strArrCreateStringArray2, strArrCreateStringArray);
    }
}
