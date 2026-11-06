package flm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alr extends akk implements alp {
    alr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.audit.internal.IAuditService");
    }

    @Override // flm.alp
    public final void a(all allVar, axh axhVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, allVar);
        akm.a(parcelObtainAndWriteInterfaceToken, axhVar);
        transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
    }
}
