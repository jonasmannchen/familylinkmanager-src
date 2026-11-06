package flm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cqy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        Bundle bundleCreateBundle = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        int i = 0;
        long j2 = 0;
        ArrayList arrayListCreateTypedList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 1:
                    arrayListCreateTypedList = bdw.createTypedList(parcel, header, cqz.CREATOR);
                    break;
                case 2:
                    j2 = bdw.readLong(parcel, header);
                    break;
                case 3:
                    j = bdw.readLong(parcel, header);
                    break;
                case 4:
                    i = bdw.readInt(parcel, header);
                    break;
                case 5:
                    bundleCreateBundle = bdw.createBundle(parcel, header);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ActivityRecognitionResult(arrayListCreateTypedList, j2, j, i, bundleCreateBundle);
    }
}
