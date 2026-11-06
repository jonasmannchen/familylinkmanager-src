package flm;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdk implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    @Override // android.os.Parcelable.Creator
    public final bdj createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 0;
        Account account = null;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 2:
                    account = (Account) bdw.createParcelable(parcel, header, Account.CREATOR);
                    break;
                case 3:
                    i = bdw.readInt(parcel, header);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) bdw.createParcelable(parcel, header, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new bdj(i2, account, i, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final bdj[] newArray(int i) {
        return new bdj[i];
    }

    static void writeToParcel(bdj bdjVar, Parcel parcel, int i) {
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeInt(parcel, 1, bdjVar.mVersionCode);
        bdy.writeParcelable(parcel, 2, bdjVar.getAccount(), i, false);
        bdy.writeInt(parcel, 3, bdjVar.getSessionId());
        bdy.writeParcelable(parcel, 4, bdjVar.getSignInAccountHint(), i, false);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
