package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new csc[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        crc crcVar = csc.b;
        List listCreateTypedList = csc.a;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    crcVar = (crc) bdw.createParcelable(parcel, header, crc.CREATOR);
                    break;
                case 2:
                    listCreateTypedList = bdw.createTypedList(parcel, header, bay.CREATOR);
                    break;
                case 3:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new csc(crcVar, listCreateTypedList, strCreateString);
    }
}
