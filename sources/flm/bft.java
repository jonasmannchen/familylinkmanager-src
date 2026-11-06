package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.ConnectionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bft implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i = bdw.readInt(parcel, header);
                    break;
                case 2:
                    j = bdw.readLong(parcel, header);
                    break;
                case 3:
                case 9:
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
                case 4:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 5:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 6:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
                case 7:
                    strCreateString4 = bdw.createString(parcel, header);
                    break;
                case 8:
                    strCreateString5 = bdw.createString(parcel, header);
                    break;
                case 10:
                    j2 = bdw.readLong(parcel, header);
                    break;
                case 11:
                    j3 = bdw.readLong(parcel, header);
                    break;
                case 12:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 13:
                    strCreateString6 = bdw.createString(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ConnectionEvent(i, j, i2, strCreateString, strCreateString2, strCreateString3, strCreateString4, strCreateString5, strCreateString6, j2, j3);
    }
}
