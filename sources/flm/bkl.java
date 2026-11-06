package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bkk[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String strCreateString = null;
        int i = 0;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i2 = 0;
        String strCreateString2 = null;
        int i3 = 0;
        int i4 = 0;
        String strCreateString3 = null;
        int i5 = 0;
        String strCreateString4 = null;
        String strCreateString5 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    strCreateString5 = bdw.createString(parcel, header);
                    break;
                case 3:
                    strCreateString4 = bdw.createString(parcel, header);
                    break;
                case 4:
                    i5 = bdw.readInt(parcel, header);
                    break;
                case 5:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
                case 6:
                    i4 = bdw.readInt(parcel, header);
                    break;
                case 7:
                    i3 = bdw.readInt(parcel, header);
                    break;
                case 8:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 9:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 10:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 11:
                    i = bdw.readInt(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new bkk(strCreateString5, strCreateString4, i5, strCreateString3, i4, i3, strCreateString2, strCreateString, i2, i);
    }
}
