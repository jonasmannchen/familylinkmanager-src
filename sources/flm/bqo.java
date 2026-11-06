package flm;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.kids.aidl.IKidsInternalService;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 0;
        String strCreateString = null;
        Account account = null;
        Bundle bundleCreateBundle = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        Bitmap bitmap = null;
        boolean z = false;
        boolean z2 = false;
        ArrayList arrayListCreateStringList = null;
        Bundle bundleCreateBundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArrCreateByteArray = null;
        int i2 = 0;
        int i3 = 0;
        String strCreateString4 = null;
        Uri uri = null;
        ArrayList arrayListCreateTypedList = null;
        int i4 = 0;
        bnk bnkVar = null;
        ArrayList arrayListCreateTypedList2 = null;
        boolean z3 = false;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        int i5 = 0;
        PendingIntent pendingIntent = null;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        String strCreateString5 = null;
        boolean z6 = false;
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
                    account = (Account) bdw.createParcelable(parcel, header, Account.CREATOR);
                    break;
                case 4:
                    bundleCreateBundle = bdw.createBundle(parcel, header);
                    break;
                case 5:
                    z = bdw.readBoolean(parcel, header);
                    break;
                case 6:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 7:
                    arrayListCreateStringList = bdw.createStringList(parcel, header);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                case 30:
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
                case 10:
                    bundleCreateBundle2 = bdw.createBundle(parcel, header);
                    break;
                case 11:
                    bitmap2 = (Bitmap) bdw.createParcelable(parcel, header, Bitmap.CREATOR);
                    break;
                case 14:
                    strCreateString4 = bdw.createString(parcel, header);
                    break;
                case 15:
                    uri = (Uri) bdw.createParcelable(parcel, header, Uri.CREATOR);
                    break;
                case 16:
                    arrayListCreateTypedList = bdw.createTypedList(parcel, header, bru.CREATOR);
                    break;
                case 17:
                    i4 = bdw.readInt(parcel, header);
                    break;
                case 18:
                    arrayListCreateTypedList2 = bdw.createTypedList(parcel, header, bqt.CREATOR);
                    break;
                case 19:
                    bArrCreateByteArray = bdw.createByteArray(parcel, header);
                    break;
                case 20:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 21:
                    i3 = bdw.readInt(parcel, header);
                    break;
                case 22:
                    z3 = bdw.readBoolean(parcel, header);
                    break;
                case 23:
                    errorReport = (ErrorReport) bdw.createParcelable(parcel, header, ErrorReport.CREATOR);
                    break;
                case 25:
                    bnkVar = (bnk) bdw.createParcelable(parcel, header, bnk.CREATOR);
                    break;
                case 28:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 31:
                    togglingData = (TogglingData) bdw.createParcelable(parcel, header, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = bdw.readInt(parcel, header);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) bdw.createParcelable(parcel, header, PendingIntent.CREATOR);
                    break;
                case 34:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
                case 35:
                    bitmap = (Bitmap) bdw.createParcelable(parcel, header, Bitmap.CREATOR);
                    break;
                case 36:
                    i6 = bdw.readInt(parcel, header);
                    break;
                case 37:
                    z4 = bdw.readBoolean(parcel, header);
                    break;
                case 38:
                    z5 = bdw.readBoolean(parcel, header);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                    i7 = bdw.readInt(parcel, header);
                    break;
                case 40:
                    strCreateString5 = bdw.createString(parcel, header);
                    break;
                case 41:
                    z6 = bdw.readBoolean(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GoogleHelp(i, strCreateString, account, bundleCreateBundle, strCreateString2, strCreateString3, bitmap, z, z2, arrayListCreateStringList, bundleCreateBundle2, bitmap2, bArrCreateByteArray, i2, i3, strCreateString4, uri, arrayListCreateTypedList, i4, bnkVar, arrayListCreateTypedList2, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, strCreateString5, z6);
    }
}
