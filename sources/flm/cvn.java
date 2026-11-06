package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cvm[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String strCreateString = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        boolean z = false;
        String strCreateString2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    z = bdw.readBoolean(parcel, header);
                    break;
                case 3:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 4:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new cvm(z, strCreateString2, strCreateString);
    }
}
