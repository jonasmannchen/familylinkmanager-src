package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cyb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cyc[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String strCreateString = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        cyi cyiVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    cyiVar = (cyi) bdw.createParcelable(parcel, header, cyi.CREATOR);
                    break;
                case 3:
                    strCreateString6 = bdw.createString(parcel, header);
                    break;
                case 4:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 5:
                    strCreateString4 = bdw.createString(parcel, header);
                    break;
                case 6:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
                case 7:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
                case 17:
                    strCreateString5 = bdw.createString(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new cyc(cyiVar, strCreateString6, strCreateString5, strCreateString4, strCreateString3, strCreateString2, strCreateString);
    }
}
