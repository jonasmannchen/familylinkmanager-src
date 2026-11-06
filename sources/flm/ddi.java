package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ddi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ddk[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayListCreateIntegerList = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        byte[] bArrCreateByteArray = null;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 2:
                    bArrCreateByteArray = bdw.createByteArray(parcel, header);
                    break;
                case 3:
                    arrayListCreateIntegerList = bdw.createIntegerList(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ddk(strCreateString, bArrCreateByteArray, arrayListCreateIntegerList);
    }
}
