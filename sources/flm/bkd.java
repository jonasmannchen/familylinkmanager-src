package flm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bkc[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        bll bllVar = null;
        int i = 0;
        int i2 = 0;
        blb blbVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 3:
                    i = bdw.readInt(parcel, header);
                    break;
                case 4:
                    bllVar = (bll) bdw.createParcelable(parcel, header, bll.CREATOR);
                    break;
                case 5:
                    blbVar = (blb) bdw.createParcelable(parcel, header, blb.CREATOR);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new bkc(i2, i, bllVar, blbVar);
    }
}
