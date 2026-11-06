package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ama implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        String strCreateString = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        ArrayList arrayListCreateStringList = null;
        boolean z2 = false;
        Long longObject = null;
        String strCreateString2 = null;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i = bdw.readInt(parcel, header);
                    break;
                case 2:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 3:
                    longObject = bdw.readLongObject(parcel, header);
                    break;
                case 4:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 5:
                    z = bdw.readBoolean(parcel, header);
                    break;
                case 6:
                    arrayListCreateStringList = bdw.createStringList(parcel, header);
                    break;
                case 7:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new TokenData(i, strCreateString2, longObject, z2, z, arrayListCreateStringList, strCreateString);
    }
}
