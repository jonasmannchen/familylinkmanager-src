package flm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class anv extends akk implements ant {
    anv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.checkin.internal.ICheckinApiService");
    }

    @Override // flm.ant
    public final void a(anr anrVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, anrVar);
        transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
    }
}
