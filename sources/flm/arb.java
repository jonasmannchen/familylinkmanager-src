package flm;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class arb {
    public final String a;
    public final aqi b;
    public final byte[] c;
    public byte[] d;
    private byte[] e;

    public arb(String str, aqi aqiVar) {
        this.e = null;
        this.d = null;
        this.a = str;
        this.b = aqiVar;
        this.c = aqiVar.a();
    }

    public arb(String str, byte[] bArr) {
        this.e = null;
        this.d = null;
        this.a = str;
        this.b = null;
        this.c = bArr;
    }

    public final boolean a(apw apwVar) {
        if (this.e == null) {
            this.e = a(this.c, this.a);
        }
        return apwVar.a(this.e);
    }

    public static byte[] a(byte[] bArr, String str) {
        MessageDigest messageDigestA = bhr.a("SHA-256");
        try {
            messageDigestA.update(str.getBytes("US-ASCII"));
            messageDigestA.update((byte) 32);
            messageDigestA.update(bArr);
            return messageDigestA.digest();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
