package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cvk[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        String strCreateString = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        double d = 0.0d;
        boolean z2 = false;
        int i = 0;
        cvg cvgVar = null;
        cvs cvsVar = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 3:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
                case 4:
                    cvsVar = (cvs) bdw.createParcelable(parcel, header, cvs.CREATOR);
                    break;
                case 5:
                    cvgVar = (cvg) bdw.createParcelable(parcel, header, cvg.CREATOR);
                    break;
                case 6:
                    i = bdw.readInt(parcel, header);
                    break;
                case 7:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 8:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 9:
                    z = bdw.readBoolean(parcel, header);
                    break;
                case 10:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 11:
                    d = bdw.readDouble(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new cvk(i2, strCreateString3, strCreateString2, cvsVar, cvgVar, i, strCreateString, z2, z, d);
    }
}
