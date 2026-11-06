package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dae implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dad[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        apx apxVar = null;
        int i = 0;
        bdl bdlVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i = bdw.readInt(parcel, header);
                    break;
                case 2:
                    apxVar = (apx) bdw.createParcelable(parcel, header, apx.CREATOR);
                    break;
                case 3:
                    bdlVar = (bdl) bdw.createParcelable(parcel, header, bdl.CREATOR);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new dad(i, apxVar, bdlVar);
    }
}
