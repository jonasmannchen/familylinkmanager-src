package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cvy[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        ArrayList arrayListCreateTypedList = null;
        ArrayList arrayListCreateTypedList2 = null;
        ArrayList arrayListCreateTypedList3 = null;
        String strCreateString = null;
        cvg cvgVar = null;
        boolean z = false;
        boolean z2 = false;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        int i = 0;
        double d = 0.0d;
        long j = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 3:
                    arrayListCreateTypedList = bdw.createTypedList(parcel, header, cvw.CREATOR);
                    break;
                case 4:
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
                case 5:
                    arrayListCreateTypedList2 = bdw.createTypedList(parcel, header, cwa.CREATOR);
                    break;
                case 6:
                    arrayListCreateTypedList3 = bdw.createTypedList(parcel, header, cvk.CREATOR);
                    break;
                case 7:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 8:
                    cvgVar = (cvg) bdw.createParcelable(parcel, header, cvg.CREATOR);
                    break;
                case 9:
                    z = bdw.readBoolean(parcel, header);
                    break;
                case 10:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 11:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 12:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
                case 13:
                    strCreateString4 = bdw.createString(parcel, header);
                    break;
                case 14:
                    i = bdw.readInt(parcel, header);
                    break;
                case 15:
                    d = bdw.readDouble(parcel, header);
                    break;
                case 16:
                    j = bdw.readLong(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new cvy(arrayListCreateTypedList, arrayListCreateTypedList2, arrayListCreateTypedList3, strCreateString, cvgVar, z, z2, strCreateString2, strCreateString3, strCreateString4, i, d, j);
    }
}
