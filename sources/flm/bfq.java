package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.AlarmEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AlarmEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String strCreateString = null;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        ArrayList arrayListCreateStringList = null;
        int i3 = 0;
        int i4 = 0;
        String strCreateString2 = null;
        float f = 0.0f;
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
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 4:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 5:
                    j2 = bdw.readLong(parcel, header);
                    break;
                case 6:
                    j3 = bdw.readLong(parcel, header);
                    break;
                case 7:
                    j4 = bdw.readLong(parcel, header);
                    break;
                case 8:
                    arrayListCreateStringList = bdw.createStringList(parcel, header);
                    break;
                case 9:
                    i3 = bdw.readInt(parcel, header);
                    break;
                case 10:
                    i4 = bdw.readInt(parcel, header);
                    break;
                case 11:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 12:
                    f = bdw.readFloat(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new AlarmEvent(i, j, i2, strCreateString, j2, j3, j4, arrayListCreateStringList, i3, i4, strCreateString2, f);
    }
}
