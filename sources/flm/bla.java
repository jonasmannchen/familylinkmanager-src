package flm;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bla extends akk implements bky {
    bla(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.contextmanager.internal.IContextManagerService");
    }

    @Override // flm.bky
    public final void a(bkw bkwVar, String str, String str2, String str3, bkb bkbVar, blj bljVar, bku bkuVar, PendingIntent pendingIntent) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, bkwVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        parcelObtainAndWriteInterfaceToken.writeString(str3);
        akm.a(parcelObtainAndWriteInterfaceToken, bkbVar);
        akm.a(parcelObtainAndWriteInterfaceToken, (Parcelable) null);
        akm.a(parcelObtainAndWriteInterfaceToken, bkuVar);
        akm.a(parcelObtainAndWriteInterfaceToken, pendingIntent);
        transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
    }

    @Override // flm.bky
    public final void a(bkw bkwVar, String str, String str2, String str3, bku bkuVar, PendingIntent pendingIntent) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        akm.a(parcelObtainAndWriteInterfaceToken, bkwVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        parcelObtainAndWriteInterfaceToken.writeString(str2);
        parcelObtainAndWriteInterfaceToken.writeString(str3);
        akm.a(parcelObtainAndWriteInterfaceToken, bkuVar);
        akm.a(parcelObtainAndWriteInterfaceToken, pendingIntent);
        transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
    }
}
