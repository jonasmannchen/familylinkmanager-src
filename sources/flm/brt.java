package flm;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class brt extends akk implements brr {
    brt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
    }

    @Override // flm.brr
    public final void a(GoogleHelp googleHelp, Bitmap bitmap, brp brpVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, googleHelp);
        akm.a(parcelObtainAndWriteInterfaceToken, bitmap);
        akm.a(parcelObtainAndWriteInterfaceToken, brpVar);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // flm.brr
    public final void a(Bundle bundle, long j, GoogleHelp googleHelp, brp brpVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, bundle);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        akm.a(parcelObtainAndWriteInterfaceToken, googleHelp);
        akm.a(parcelObtainAndWriteInterfaceToken, brpVar);
        transactOneway(8, parcelObtainAndWriteInterfaceToken);
    }

    @Override // flm.brr
    public final void b(Bundle bundle, long j, GoogleHelp googleHelp, brp brpVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, bundle);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        akm.a(parcelObtainAndWriteInterfaceToken, googleHelp);
        akm.a(parcelObtainAndWriteInterfaceToken, brpVar);
        transactOneway(9, parcelObtainAndWriteInterfaceToken);
    }

    @Override // flm.brr
    public final void a(bnc bncVar, Bundle bundle, long j, GoogleHelp googleHelp, brp brpVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, bncVar);
        akm.a(parcelObtainAndWriteInterfaceToken, bundle);
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        akm.a(parcelObtainAndWriteInterfaceToken, googleHelp);
        akm.a(parcelObtainAndWriteInterfaceToken, brpVar);
        transactOneway(10, parcelObtainAndWriteInterfaceToken);
    }
}
