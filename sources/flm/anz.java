package flm;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class anz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new any[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        String strCreateString = null;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String strCreateString2 = null;
        boolean z4 = false;
        boolean z5 = false;
        ArrayList arrayListCreateStringList = null;
        boolean z6 = false;
        String strCreateString3 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i = bdw.readInt(parcel, header);
                    break;
                case 2:
                    intent = (Intent) bdw.createParcelable(parcel, header, Intent.CREATOR);
                    break;
                case 3:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 4:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 5:
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
                case 6:
                    i3 = bdw.readInt(parcel, header);
                    break;
                case 7:
                    z = bdw.readBoolean(parcel, header);
                    break;
                case 8:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 9:
                    z3 = bdw.readBoolean(parcel, header);
                    break;
                case 10:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 11:
                    z4 = bdw.readBoolean(parcel, header);
                    break;
                case 12:
                    z5 = bdw.readBoolean(parcel, header);
                    break;
                case 13:
                    arrayListCreateStringList = bdw.createStringList(parcel, header);
                    break;
                case 14:
                    z6 = bdw.readBoolean(parcel, header);
                    break;
                case 15:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new any(i, intent, i2, strCreateString, i3, z, z2, z3, strCreateString2, z4, z5, arrayListCreateStringList, z6, strCreateString3);
    }
}
