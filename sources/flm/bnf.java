package flm;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bnf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bnc[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        String strCreateString = null;
        Bundle bundleCreateBundle = null;
        String strCreateString2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String strCreateString3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strCreateString4 = null;
        ArrayList arrayListCreateTypedList = null;
        boolean z = false;
        bnk bnkVar = null;
        bni bniVar = null;
        boolean z2 = false;
        Bitmap bitmap = null;
        String strCreateString5 = null;
        boolean z3 = false;
        long j = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    strCreateString = bdw.createString(parcel, header);
                    break;
                case 3:
                    bundleCreateBundle = bdw.createBundle(parcel, header);
                    break;
                case 4:
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
                case 5:
                    strCreateString2 = bdw.createString(parcel, header);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) bdw.createParcelable(parcel, header, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    strCreateString3 = bdw.createString(parcel, header);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) bdw.createParcelable(parcel, header, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    strCreateString4 = bdw.createString(parcel, header);
                    break;
                case 10:
                    arrayListCreateTypedList = bdw.createTypedList(parcel, header, bng.CREATOR);
                    break;
                case 11:
                    z = bdw.readBoolean(parcel, header);
                    break;
                case 12:
                    bnkVar = (bnk) bdw.createParcelable(parcel, header, bnk.CREATOR);
                    break;
                case 13:
                    bniVar = (bni) bdw.createParcelable(parcel, header, bni.CREATOR);
                    break;
                case 14:
                    z2 = bdw.readBoolean(parcel, header);
                    break;
                case 15:
                    bitmap = (Bitmap) bdw.createParcelable(parcel, header, Bitmap.CREATOR);
                    break;
                case 16:
                    strCreateString5 = bdw.createString(parcel, header);
                    break;
                case 17:
                    z3 = bdw.readBoolean(parcel, header);
                    break;
                case 18:
                    j = bdw.readLong(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new bnc(strCreateString, bundleCreateBundle, strCreateString2, applicationErrorReport, strCreateString3, bitmapTeleporter, strCreateString4, arrayListCreateTypedList, z, bnkVar, bniVar, z2, bitmap, strCreateString5, z3, j);
    }
}
