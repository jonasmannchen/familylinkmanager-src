package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ams implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new amu[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArrCreateByteArray = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 3:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 4:
                    bArrCreateByteArray = bdw.createByteArray(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new amu(strCreateString2, strCreateString, bArrCreateByteArray);
    }
}
