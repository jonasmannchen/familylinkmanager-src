package flm;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ctp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ctn[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        String strCreateString = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        long j2 = 0;
        long j3 = 0;
        String strCreateString2 = null;
        Account account = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    account = (Account) bdw.createParcelable(parcel, header, Account.CREATOR);
                    break;
                case 3:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 4:
                    j3 = bdw.readLong(parcel, header);
                    break;
                case 5:
                    j2 = bdw.readLong(parcel, header);
                    break;
                case 6:
                    j = bdw.readLong(parcel, header);
                    break;
                case 7:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ctn(account, strCreateString2, j3, j2, j, strCreateString);
    }
}
