package flm;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        Uri uri = null;
        String strCreateString5 = null;
        long j = 0;
        String strCreateString6 = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i = bdw.readInt(parcel, header);
                    break;
                case 2:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 4:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
                case 5:
                    strCreateString4 = bdw.createString(parcel, header);
                    break;
                case 6:
                    uri = (Uri) bdw.createParcelable(parcel, header, Uri.CREATOR);
                    break;
                case 7:
                    strCreateString5 = bdw.createString(parcel, header);
                    break;
                case 8:
                    j = bdw.readLong(parcel, header);
                    break;
                case 9:
                    strCreateString6 = bdw.createString(parcel, header);
                    break;
                case 10:
                    arrayListCreateTypedList = bdw.createTypedList(parcel, header, Scope.CREATOR);
                    break;
                case 11:
                    strCreateString7 = bdw.createString(parcel, header);
                    break;
                case 12:
                    strCreateString8 = bdw.createString(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GoogleSignInAccount(i, strCreateString, strCreateString2, strCreateString3, strCreateString4, uri, strCreateString5, j, strCreateString6, arrayListCreateTypedList, strCreateString7, strCreateString8);
    }
}
