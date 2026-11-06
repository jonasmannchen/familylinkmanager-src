package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new apq[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String strCreateString = null;
        int i = 0;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        boolean z = true;
        boolean z2 = false;
        String strCreateString2 = null;
        String strCreateString3 = null;
        int i2 = 0;
        int i3 = 0;
        String strCreateString4 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    strCreateString4 = bdw.createString(parcel, header);
                    break;
                case 3:
                    i3 = bdw.readInt(parcel, header);
                    break;
                case 4:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 5:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
                case 6:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 7:
                    z = bdw.readBoolean(parcel, header);
                    break;
                case 8:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 9:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 10:
                    i = bdw.readInt(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new apq(strCreateString4, i3, i2, strCreateString3, strCreateString2, z, strCreateString, z2, i);
    }
}
