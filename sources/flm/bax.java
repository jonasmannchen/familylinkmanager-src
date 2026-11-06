package flm;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bax implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    @Override // android.os.Parcelable.Creator
    public final baw createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundleCreateBundle = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        ArrayList arrayListCreateStringList = null;
        ArrayList arrayListCreateStringList2 = null;
        String strCreateString = null;
        String strCreateString2 = null;
        Account account = null;
        Account account2 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i3 = bdw.readInt(parcel, header);
                    break;
                case 2:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 3:
                    account2 = (Account) bdw.createParcelable(parcel, header, Account.CREATOR);
                    break;
                case 4:
                    account = (Account) bdw.createParcelable(parcel, header, Account.CREATOR);
                    break;
                case 5:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 6:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 7:
                    arrayListCreateStringList2 = bdw.createStringList(parcel, header);
                    break;
                case 8:
                    arrayListCreateStringList = bdw.createStringList(parcel, header);
                    break;
                case 9:
                    bundleCreateBundle = bdw.createBundle(parcel, header);
                    break;
                case 10:
                    i = bdw.readInt(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new baw(i3, i2, account2, account, strCreateString2, strCreateString, arrayListCreateStringList2, arrayListCreateStringList, bundleCreateBundle, i);
    }

    @Override // android.os.Parcelable.Creator
    public final baw[] newArray(int i) {
        return new baw[i];
    }

    static void writeToParcel(baw bawVar, Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, bawVar.getVersion());
        bdy.writeInt(parcel, 2, bawVar.getCallingUid());
        bdy.writeParcelable(parcel, 3, bawVar.getResolvedAccount(), i, false);
        bdy.writeParcelable(parcel, 4, bawVar.getRequestedAccount(), i, false);
        bdy.writeString(parcel, 5, bawVar.getCallingPackageName(), false);
        bdy.writeString(parcel, 6, bawVar.getAuthPackageName(), false);
        bdy.writeStringList(parcel, 7, bawVar.getGrantedScopesAsList(), false);
        bdy.writeStringList(parcel, 8, bawVar.getVisibleActionsAsList(), false);
        bdy.writeBundle(parcel, 9, bawVar.getExtras(), false);
        bdy.writeInt(parcel, 10, bawVar.getCallingPid());
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
