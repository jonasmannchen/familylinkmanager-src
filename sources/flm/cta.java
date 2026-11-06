package flm;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cta implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new csz[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 1;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        csx csxVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i = bdw.readInt(parcel, header);
                    break;
                case 2:
                    csxVar = (csx) bdw.createParcelable(parcel, header, csx.CREATOR);
                    break;
                case 3:
                    iBinder3 = bdw.readIBinder(parcel, header);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) bdw.createParcelable(parcel, header, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = bdw.readIBinder(parcel, header);
                    break;
                case 6:
                    iBinder = bdw.readIBinder(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new csz(i, csxVar, iBinder3, pendingIntent, iBinder2, iBinder);
    }
}
