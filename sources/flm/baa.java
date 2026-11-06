package flm;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class baa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle bundleCreateBundle = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 0;
        CursorWindow[] cursorWindowArr = null;
        String[] strArrCreateStringArray = null;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    strArrCreateStringArray = bdw.createStringArray(parcel, header);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) bdw.createTypedArray(parcel, header, CursorWindow.CREATOR);
                    break;
                case 3:
                    i = bdw.readInt(parcel, header);
                    break;
                case 4:
                    bundleCreateBundle = bdw.createBundle(parcel, header);
                    break;
                case 1000:
                    i2 = bdw.readInt(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        DataHolder dataHolder = new DataHolder(i2, strArrCreateStringArray, cursorWindowArr, i, bundleCreateBundle);
        dataHolder.c = new Bundle();
        for (int i3 = 0; i3 < dataHolder.b.length; i3++) {
            dataHolder.c.putInt(dataHolder.b[i3], i3);
        }
        dataHolder.g = new int[dataHolder.d.length];
        int numRows = 0;
        for (int i4 = 0; i4 < dataHolder.d.length; i4++) {
            dataHolder.g[i4] = numRows;
            numRows += dataHolder.d[i4].getNumRows() - (numRows - dataHolder.d[i4].getStartPosition());
        }
        dataHolder.h = numRows;
        return dataHolder;
    }
}
