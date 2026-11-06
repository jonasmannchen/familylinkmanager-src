package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.model.AvatarReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cxo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AvatarReference[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Long longObject = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 0;
        Long longObject2 = null;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i = bdw.readInt(parcel, header);
                    break;
                case 2:
                    strCreateString5 = bdw.createString(parcel, header);
                    break;
                case 3:
                    strCreateString4 = bdw.createString(parcel, header);
                    break;
                case 4:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
                case 5:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 6:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 7:
                    longObject2 = bdw.readLongObject(parcel, header);
                    break;
                case 8:
                    longObject = bdw.readLongObject(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new AvatarReference(i, strCreateString5, strCreateString4, strCreateString3, strCreateString2, strCreateString, longObject2, longObject);
    }
}
