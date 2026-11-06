package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cvw[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String strCreateString = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        cvs cvsVar = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    strCreateString4 = bdw.createString(parcel, header);
                    break;
                case 3:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 5:
                    cvsVar = (cvs) bdw.createParcelable(parcel, header, cvs.CREATOR);
                    break;
                case 6:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new cvw(strCreateString4, strCreateString3, strCreateString2, cvsVar, strCreateString);
    }
}
