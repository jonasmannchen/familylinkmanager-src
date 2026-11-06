package flm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqq extends bdv {
    public static final Parcelable.Creator CREATOR = new aqr();
    public final String a;
    public final aqi b;
    public final boolean c;
    public final boolean d;

    aqq(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        this.b = a(iBinder);
        this.c = z;
        this.d = z2;
    }

    aqq(String str, aqi aqiVar, boolean z, boolean z2) {
        this.a = str;
        this.b = aqiVar;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        int iBeginObjectHeader = bdy.beginObjectHeader(parcel);
        bdy.writeString(parcel, 1, this.a, false);
        if (this.b == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = this.b.asBinder();
        }
        bdy.writeIBinder(parcel, 2, iBinderAsBinder, false);
        bdy.writeBoolean(parcel, 3, this.c);
        bdy.writeBoolean(parcel, 4, this.d);
        bdy.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private static aqi a(IBinder iBinder) {
        aqj aqjVar;
        if (iBinder == null) {
            return null;
        }
        try {
            blq bytesWrapped = bci.asInterface(iBinder).getBytesWrapped();
            byte[] bArr = bytesWrapped == null ? null : (byte[]) blt.a(bytesWrapped);
            if (bArr != null) {
                aqjVar = new aqj(bArr);
            } else {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                aqjVar = null;
            }
            return aqjVar;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }
}
