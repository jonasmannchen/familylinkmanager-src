package flm;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbo implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    @Override // android.os.Parcelable.Creator
    public final bbn createFromParcel(Parcel parcel) {
        boolean z = false;
        aqb[] aqbVarArr = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        aqb[] aqbVarArr2 = null;
        Account account = null;
        Bundle bundleCreateBundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String strCreateString = null;
        int i = 0;
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
                    i = bdw.readInt(parcel, header);
                    break;
                case 4:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 5:
                    iBinder = bdw.readIBinder(parcel, header);
                    break;
                case 6:
                    scopeArr = (Scope[]) bdw.createTypedArray(parcel, header, Scope.CREATOR);
                    break;
                case 7:
                    bundleCreateBundle = bdw.createBundle(parcel, header);
                    break;
                case 8:
                    account = (Account) bdw.createParcelable(parcel, header, Account.CREATOR);
                    break;
                case 9:
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
                case 10:
                    aqbVarArr2 = (aqb[]) bdw.createTypedArray(parcel, header, aqb.CREATOR);
                    break;
                case 11:
                    aqbVarArr = (aqb[]) bdw.createTypedArray(parcel, header, aqb.CREATOR);
                    break;
                case 12:
                    z = bdw.readBoolean(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new bbn(i3, i2, i, strCreateString, iBinder, scopeArr, bundleCreateBundle, account, aqbVarArr2, aqbVarArr, z);
    }

    @Override // android.os.Parcelable.Creator
    public final bbn[] newArray(int i) {
        return new bbn[i];
    }

    static void writeToParcel(bbn bbnVar, Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, bbnVar.version);
        bdy.writeInt(parcel, 2, bbnVar.serviceId);
        bdy.writeInt(parcel, 3, bbnVar.clientLibraryVersion);
        bdy.writeString(parcel, 4, bbnVar.callingPackage, false);
        bdy.writeIBinder(parcel, 5, bbnVar.accountAccessorBinder, false);
        bdy.writeTypedArray(parcel, 6, bbnVar.scopes, i, false);
        bdy.writeBundle(parcel, 7, bbnVar.extraArgs, false);
        bdy.writeParcelable(parcel, 8, bbnVar.clientRequestedAccount, i, false);
        bdy.writeTypedArray(parcel, 10, bbnVar.clientRequiredFeatures, i, false);
        bdy.writeTypedArray(parcel, 11, bbnVar.clientApiFeatures, i, false);
        bdy.writeBoolean(parcel, 12, bbnVar.requestingConnectionInfo);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
