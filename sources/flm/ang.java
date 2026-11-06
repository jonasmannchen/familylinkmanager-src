package flm;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.ActivityRecognitionResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ang implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ane[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        bjk bjkVar = null;
        int iValidateObjectHeader = bdw.validateObjectHeader(parcel);
        anh anhVar = null;
        anj anjVar = null;
        anc ancVar = null;
        ana anaVar = null;
        DataHolder dataHolder = null;
        amy amyVar = null;
        Location location = null;
        amw amwVar = null;
        amt amtVar = null;
        ActivityRecognitionResult activityRecognitionResult = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = bdw.readHeader(parcel);
            switch (bdw.getFieldId(header)) {
                case 2:
                    activityRecognitionResult = (ActivityRecognitionResult) bdw.createParcelable(parcel, header, ActivityRecognitionResult.CREATOR);
                    break;
                case 3:
                    amtVar = (amt) bdw.createParcelable(parcel, header, amt.CREATOR);
                    break;
                case 4:
                    amwVar = (amw) bdw.createParcelable(parcel, header, amw.CREATOR);
                    break;
                case 5:
                    location = (Location) bdw.createParcelable(parcel, header, Location.CREATOR);
                    break;
                case 6:
                    amyVar = (amy) bdw.createParcelable(parcel, header, amy.CREATOR);
                    break;
                case 7:
                    dataHolder = (DataHolder) bdw.createParcelable(parcel, header, DataHolder.CREATOR);
                    break;
                case 8:
                    anaVar = (ana) bdw.createParcelable(parcel, header, ana.CREATOR);
                    break;
                case 9:
                    ancVar = (anc) bdw.createParcelable(parcel, header, anc.CREATOR);
                    break;
                case 10:
                    anjVar = (anj) bdw.createParcelable(parcel, header, anj.CREATOR);
                    break;
                case 11:
                    anhVar = (anh) bdw.createParcelable(parcel, header, anh.CREATOR);
                    break;
                case 12:
                    bjkVar = (bjk) bdw.createParcelable(parcel, header, bjk.CREATOR);
                    break;
                default:
                    bdw.skipUnknownField(parcel, header);
                    break;
            }
        }
        bdw.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ane(activityRecognitionResult, amtVar, amwVar, location, amyVar, dataHolder, anaVar, ancVar, anjVar, anhVar, bjkVar);
    }
}
