package flm;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class aqi extends bci {
    private int a;

    protected aqi(byte[] bArr) {
        bdi.checkArgument(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    abstract byte[] a();

    public int hashCode() {
        return this.a;
    }

    public boolean equals(Object obj) {
        blq bytesWrapped;
        if (obj == null || !(obj instanceof bch)) {
            return false;
        }
        try {
            bch bchVar = (bch) obj;
            if (bchVar.getHashCode() == hashCode() && (bytesWrapped = bchVar.getBytesWrapped()) != null) {
                return Arrays.equals(a(), (byte[]) blt.a(bytesWrapped));
            }
            return false;
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    @Override // flm.bch
    public blq getBytesWrapped() {
        return blt.a(a());
    }

    @Override // flm.bch
    public int getHashCode() {
        return hashCode();
    }

    protected static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
