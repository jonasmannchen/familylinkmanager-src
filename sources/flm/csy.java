package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new csx[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String strCreateString = null;
        boolean z = false;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        List listCreateTypedList = csx.a;
        boolean z2 = false;
        boolean z3 = false;
        String strCreateString2 = null;
        LocationRequest locationRequest = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    locationRequest = (LocationRequest) bdw.createParcelable(parcel, header, LocationRequest.CREATOR);
                    break;
                case 2:
                case 3:
                case 4:
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
                case 5:
                    listCreateTypedList = bdw.createTypedList(parcel, header, bay.CREATOR);
                    break;
                case 6:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 7:
                    z3 = bdw.readBoolean(parcel, header);
                    break;
                case 8:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 9:
                    z = bdw.readBoolean(parcel, header);
                    break;
                case 10:
                    strCreateString = bdw.createString(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new csx(locationRequest, listCreateTypedList, strCreateString2, z3, z2, z, strCreateString);
    }
}
