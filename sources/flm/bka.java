package flm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bka implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bkb[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        blf blfVar = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        ArrayList arrayListCreateStringList = null;
        ArrayList arrayListCreateTypedList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    arrayListCreateTypedList = bdw.createTypedList(parcel, header, bkc.CREATOR);
                    break;
                case 3:
                    arrayListCreateStringList = bdw.createStringList(parcel, header);
                    break;
                case 4:
                    blfVar = (blf) bdw.createParcelable(parcel, header, blf.CREATOR);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new bkb(arrayListCreateTypedList, arrayListCreateStringList, blfVar);
    }
}
