package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ddx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ddw[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String strCreateString = null;
        boolean z = false;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 0;
        ArrayList arrayListCreateStringList = null;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 3:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 4:
                    arrayListCreateStringList = bdw.createStringList(parcel, header);
                    break;
                case 5:
                    i = bdw.readInt(parcel, header);
                    break;
                case 6:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 7:
                    z = bdw.readBoolean(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ddw(i2, z2, arrayListCreateStringList, i, strCreateString, z);
    }
}
