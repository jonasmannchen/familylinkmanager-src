package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cye implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cyf[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayListCreateTypedList = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        ArrayList arrayListCreateTypedList2 = null;
        ArrayList arrayListCreateTypedList3 = null;
        ArrayList arrayListCreateTypedList4 = null;
        ArrayList arrayListCreateTypedList5 = null;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 3:
                case 6:
                case 7:
                case 8:
                case 10:
                case 12:
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
                case 4:
                    arrayListCreateTypedList5 = bdw.createTypedList(parcel, header, cyc.CREATOR);
                    break;
                case 5:
                    arrayListCreateTypedList4 = bdw.createTypedList(parcel, header, cyo.CREATOR);
                    break;
                case 9:
                    arrayListCreateTypedList = bdw.createTypedList(parcel, header, cxu.CREATOR);
                    break;
                case 11:
                    arrayListCreateTypedList3 = bdw.createTypedList(parcel, header, cxx.CREATOR);
                    break;
                case 13:
                    arrayListCreateTypedList2 = bdw.createTypedList(parcel, header, cyl.CREATOR);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new cyf(strCreateString, arrayListCreateTypedList5, arrayListCreateTypedList4, arrayListCreateTypedList3, arrayListCreateTypedList2, arrayListCreateTypedList);
    }
}
