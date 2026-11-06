package flm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwo extends akk implements cwm {
    cwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    @Override // flm.cwm
    public final void a(cwk cwkVar, boolean z, boolean z2, String str, String str2, int i) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, cwkVar);
        akm.a(parcelObtainAndWriteInterfaceToken, z);
        akm.a(parcelObtainAndWriteInterfaceToken, z2);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(305, parcelObtainAndWriteInterfaceToken);
    }

    @Override // flm.cwm
    public final Bundle a(cwk cwkVar, boolean z, String str, String str2, int i) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, cwkVar);
        akm.a(parcelObtainAndWriteInterfaceToken, false);
        parcelObtainAndWriteInterfaceToken.writeString(null);
        parcelObtainAndWriteInterfaceToken.writeString(null);
        parcelObtainAndWriteInterfaceToken.writeInt(0);
        Parcel parcelTransactAndReadException = transactAndReadException(11, parcelObtainAndWriteInterfaceToken);
        Bundle bundle = (Bundle) akm.a(parcelTransactAndReadException, Bundle.CREATOR);
        parcelTransactAndReadException.recycle();
        return bundle;
    }
}
