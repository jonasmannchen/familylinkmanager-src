package flm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String strCreateString = null;
        int i3 = 0;
        ArrayList arrayListCreateStringList = null;
        String strCreateString2 = null;
        long j2 = 0;
        int i4 = 0;
        String strCreateString3 = null;
        String strCreateString4 = null;
        float f = 0.0f;
        long j3 = 0;
        String strCreateString5 = null;
        boolean z = false;
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
                case 7:
                case 9:
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
                case 4:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 5:
                    i3 = bdw.readInt(parcel, header);
                    break;
                case 6:
                    arrayListCreateStringList = bdw.createStringList(parcel, header);
                    break;
                case 8:
                    j2 = bdw.readLong(parcel, header);
                    break;
                case 10:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
                case 11:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 12:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 13:
                    strCreateString4 = bdw.createString(parcel, header);
                    break;
                case 14:
                    i4 = bdw.readInt(parcel, header);
                    break;
                case 15:
                    f = bdw.readFloat(parcel, header);
                    break;
                case 16:
                    j3 = bdw.readLong(parcel, header);
                    break;
                case 17:
                    strCreateString5 = bdw.createString(parcel, header);
                    break;
                case 18:
                    z = bdw.readBoolean(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new WakeLockEvent(i, j, i2, strCreateString, i3, arrayListCreateStringList, strCreateString2, j2, i4, strCreateString3, strCreateString4, f, j3, strCreateString5, z);
    }
}
