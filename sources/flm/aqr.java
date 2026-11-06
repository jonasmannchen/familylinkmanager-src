package flm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new aqq[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        IBinder iBinder = null;
        String strCreateString = null;
        boolean z2 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 2:
                    iBinder = bdw.readIBinder(parcel, header);
                    break;
                case 3:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 4:
                    z = bdw.readBoolean(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new aqq(strCreateString, iBinder, z2, z);
    }
}
