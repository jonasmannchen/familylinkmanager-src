package flm;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.kids.aidl.IKidsInternalService;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ErrorReport[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String strCreateString = null;
        int i = 0;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        int i2 = 0;
        String strCreateString9 = null;
        String strCreateString10 = null;
        String strCreateString11 = null;
        String strCreateString12 = null;
        String strCreateString13 = null;
        String[] strArrCreateStringArray = null;
        String[] strArrCreateStringArray2 = null;
        String[] strArrCreateStringArray3 = null;
        String strCreateString14 = null;
        String strCreateString15 = null;
        byte[] bArrCreateByteArray = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String strCreateString16 = null;
        String strCreateString17 = null;
        String strCreateString18 = null;
        Bundle bundleCreateBundle = null;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        String strCreateString19 = null;
        String strCreateString20 = null;
        int i9 = 0;
        String strCreateString21 = null;
        String strCreateString22 = null;
        String strCreateString23 = null;
        String strCreateString24 = null;
        String strCreateString25 = null;
        String strCreateString26 = null;
        String strCreateString27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strCreateString28 = null;
        bng[] bngVarArr = null;
        String[] strArrCreateStringArray4 = null;
        boolean z3 = false;
        String strCreateString29 = null;
        bnk bnkVar = null;
        bni bniVar = null;
        String strCreateString30 = null;
        boolean z4 = false;
        Bundle bundleCreateBundle2 = null;
        ArrayList arrayListCreateTypedList = null;
        boolean z5 = false;
        Bitmap bitmap = null;
        String strCreateString31 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) bdw.createParcelable(parcel, header, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 4:
                    i = bdw.readInt(parcel, header);
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
                case 9:
                    strCreateString6 = bdw.createString(parcel, header);
                    break;
                case 10:
                    strCreateString7 = bdw.createString(parcel, header);
                    break;
                case 11:
                    strCreateString8 = bdw.createString(parcel, header);
                    break;
                case 12:
                    i2 = bdw.readInt(parcel, header);
                    break;
                case 13:
                    strCreateString9 = bdw.createString(parcel, header);
                    break;
                case 14:
                    strCreateString10 = bdw.createString(parcel, header);
                    break;
                case 15:
                    strCreateString11 = bdw.createString(parcel, header);
                    break;
                case 16:
                    strCreateString12 = bdw.createString(parcel, header);
                    break;
                case 17:
                    strCreateString13 = bdw.createString(parcel, header);
                    break;
                case 18:
                    strArrCreateStringArray = bdw.createStringArray(parcel, header);
                    break;
                case 19:
                    strArrCreateStringArray2 = bdw.createStringArray(parcel, header);
                    break;
                case 20:
                    strArrCreateStringArray3 = bdw.createStringArray(parcel, header);
                    break;
                case 21:
                    strCreateString14 = bdw.createString(parcel, header);
                    break;
                case 22:
                    strCreateString15 = bdw.createString(parcel, header);
                    break;
                case 23:
                    bArrCreateByteArray = bdw.createByteArray(parcel, header);
                    break;
                case 24:
                    i3 = bdw.readInt(parcel, header);
                    break;
                case 25:
                    i4 = bdw.readInt(parcel, header);
                    break;
                case 26:
                    i5 = bdw.readInt(parcel, header);
                    break;
                case 27:
                    i6 = bdw.readInt(parcel, header);
                    break;
                case 28:
                    strCreateString16 = bdw.createString(parcel, header);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_verifyParentAccessCode /* 29 */:
                    strCreateString17 = bdw.createString(parcel, header);
                    break;
                case 30:
                    strCreateString18 = bdw.createString(parcel, header);
                    break;
                case 31:
                    bundleCreateBundle = bdw.createBundle(parcel, header);
                    break;
                case 32:
                    z = bdw.readBoolean(parcel, header);
                    break;
                case 33:
                    i7 = bdw.readInt(parcel, header);
                    break;
                case 34:
                    i8 = bdw.readInt(parcel, header);
                    break;
                case 35:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 36:
                    strCreateString19 = bdw.createString(parcel, header);
                    break;
                case 37:
                    strCreateString20 = bdw.createString(parcel, header);
                    break;
                case 38:
                    i9 = bdw.readInt(parcel, header);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_startService /* 39 */:
                    strCreateString21 = bdw.createString(parcel, header);
                    break;
                case 40:
                    strCreateString22 = bdw.createString(parcel, header);
                    break;
                case 41:
                    strCreateString23 = bdw.createString(parcel, header);
                    break;
                case 42:
                    strCreateString24 = bdw.createString(parcel, header);
                    break;
                case 43:
                    strCreateString25 = bdw.createString(parcel, header);
                    break;
                case 44:
                    strCreateString26 = bdw.createString(parcel, header);
                    break;
                case 45:
                    strCreateString27 = bdw.createString(parcel, header);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) bdw.createParcelable(parcel, header, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    strCreateString28 = bdw.createString(parcel, header);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                    bngVarArr = (bng[]) bdw.createTypedArray(parcel, header, bng.CREATOR);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_setMemberSvExitState /* 49 */:
                    strArrCreateStringArray4 = bdw.createStringArray(parcel, header);
                    break;
                case 50:
                    z3 = bdw.readBoolean(parcel, header);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_clearLockdownInfo /* 51 */:
                    strCreateString29 = bdw.createString(parcel, header);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_listManagedDevices /* 52 */:
                    bnkVar = (bnk) bdw.createParcelable(parcel, header, bnk.CREATOR);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_logToClearcutFromUi /* 53 */:
                    bniVar = (bni) bdw.createParcelable(parcel, header, bni.CREATOR);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getSuwLibraryFlows /* 54 */:
                    strCreateString30 = bdw.createString(parcel, header);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getLockdownInfo /* 55 */:
                    z4 = bdw.readBoolean(parcel, header);
                    break;
                case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                    bundleCreateBundle2 = bdw.createBundle(parcel, header);
                    break;
                case 57:
                    arrayListCreateTypedList = bdw.createTypedList(parcel, header, RectF.CREATOR);
                    break;
                case 58:
                    z5 = bdw.readBoolean(parcel, header);
                    break;
                case 59:
                    bitmap = (Bitmap) bdw.createParcelable(parcel, header, Bitmap.CREATOR);
                    break;
                case 60:
                    strCreateString31 = bdw.createString(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ErrorReport(applicationErrorReport, strCreateString, i, strCreateString2, strCreateString3, strCreateString4, strCreateString5, strCreateString6, strCreateString7, strCreateString8, i2, strCreateString9, strCreateString10, strCreateString11, strCreateString12, strCreateString13, strArrCreateStringArray, strArrCreateStringArray2, strArrCreateStringArray3, strCreateString14, strCreateString15, bArrCreateByteArray, i3, i4, i5, i6, strCreateString16, strCreateString17, strCreateString18, bundleCreateBundle, z, i7, i8, z2, strCreateString19, strCreateString20, i9, strCreateString21, strCreateString22, strCreateString23, strCreateString24, strCreateString25, strCreateString26, strCreateString27, bitmapTeleporter, strCreateString28, bngVarArr, strArrCreateStringArray4, z3, strCreateString29, bnkVar, bniVar, strCreateString30, z4, bundleCreateBundle2, arrayListCreateTypedList, z5, bitmap, strCreateString31);
    }
}
