package flm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbf implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    @Override // android.os.Parcelable.Creator
    public final bbe createFromParcel(Parcel parcel) {
        aqb[] aqbVarArr = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    bundleCreateBundle = bdw.createBundle(parcel, header);
                    break;
                case 2:
                    aqbVarArr = (aqb[]) bdw.createTypedArray(parcel, header, aqb.CREATOR);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new bbe(bundleCreateBundle, aqbVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final bbe[] newArray(int i) {
        return new bbe[i];
    }

    static void writeToParcel(bbe bbeVar, Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeBundle(parcel, 1, bbeVar.resolutionBundle, false);
        bdy.writeTypedArray(parcel, 2, bbeVar.availableFeatures, i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
