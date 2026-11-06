package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cxq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cxr[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Long longObject = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        Long longObject2 = null;
        String strCreateString = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 3:
                    arrayListCreateTypedList = bdw.createTypedList(parcel, header, cyr.CREATOR);
                    break;
                case 4:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 5:
                    longObject2 = bdw.readLongObject(parcel, header);
                    break;
                case 6:
                    longObject = bdw.readLongObject(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new cxr(strCreateString2, arrayListCreateTypedList, strCreateString, longObject2, longObject);
    }
}
