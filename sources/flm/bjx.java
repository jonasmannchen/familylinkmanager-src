package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bjw[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayListCreateTypedList = null;
        int i = 0;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        long j = 0;
        String strCreateString = null;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 3:
                    j = bdw.readLong(parcel, header);
                    break;
                case 4:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 5:
                    i = bdw.readInt(parcel, header);
                    break;
                case 6:
                    arrayListCreateTypedList = bdw.createTypedList(parcel, header, bjk.CREATOR);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new bjw(i2, j, strCreateString, i, arrayListCreateTypedList);
    }
}
