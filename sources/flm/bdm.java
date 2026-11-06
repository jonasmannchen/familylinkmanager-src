package flm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdm implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    @Override // android.os.Parcelable.Creator
    public final bdl createFromParcel(Parcel parcel) {
        apx apxVar = null;
        boolean z = false;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        boolean z2 = false;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i = bdw.readInt(parcel, header);
                    break;
                case 2:
                    iBinder = bdw.readIBinder(parcel, header);
                    break;
                case 3:
                    apxVar = (apx) bdw.createParcelable(parcel, header, apx.CREATOR);
                    break;
                case 4:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 5:
                    z = bdw.readBoolean(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new bdl(i, iBinder, apxVar, z2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final bdl[] newArray(int i) {
        return new bdl[i];
    }

    static void writeToParcel(bdl bdlVar, Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, bdlVar.mVersionCode);
        bdy.writeIBinder(parcel, 2, bdlVar.mAccountAccessorBinder, false);
        bdy.writeParcelable(parcel, 3, bdlVar.getConnectionResult(), i, false);
        bdy.writeBoolean(parcel, 4, bdlVar.getSaveDefaultAccount());
        bdy.writeBoolean(parcel, 5, bdlVar.isFromCrossClientAuth());
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
