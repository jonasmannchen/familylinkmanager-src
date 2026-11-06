package flm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Random;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdn {
    public static final String CLEARCUT_TAG = "service_connections";
    public static final Set IGNORED_PACKAGES;
    public static final String TAG = "ServiceConnection";
    public byte[] mCertificateFingerprint;
    public final int mClientVersion;
    public final String mPackageName;
    public final Random mRandom = new Random(System.currentTimeMillis());
    public final int mServiceId;

    public bdn(int i, String str, int i2) {
        this.mClientVersion = i;
        this.mPackageName = str;
        this.mServiceId = i2;
    }

    public final void logOnce(Context context, int i) {
        if (((Boolean) azh.a.b()).booleanValue() && this.mRandom.nextDouble() < ((Double) azh.b.b()).doubleValue() && !IGNORED_PACKAGES.contains(this.mPackageName)) {
            new bhj(10, new bdo(this, context, i)).start();
        }
    }

    final void logNotOnUiThread(Context context, int i) {
        asr asrVar = new asr();
        asrVar.a = Integer.valueOf(this.mClientVersion);
        asrVar.b = this.mPackageName;
        asrVar.f = Integer.valueOf(this.mServiceId);
        asrVar.d = Integer.valueOf(i);
        asrVar.e = 1;
        asrVar.c = getCertificateFingerprintLocked(context);
        asn asnVar = new asn();
        asnVar.a = new asr[]{asrVar};
        aog aogVarA = new bem().a(context).a(asnVar);
        fnh fnhVar = aogVarA.i;
        fnhVar.c();
        fng fngVar = (fng) fnhVar.a;
        if (CLEARCUT_TAG == 0) {
            throw new NullPointerException();
        }
        fngVar.a |= 8;
        fngVar.d = CLEARCUT_TAG;
        aog aogVarA2 = aogVarA.a(6);
        aogVarA2.g = fnk.UNMETERED_OR_DAILY;
        aogVarA2.a();
    }

    final byte[] getCertificateFingerprintLocked(Context context) {
        MessageDigest messageDigestA;
        byte[] bArrDigest = null;
        if (this.mCertificateFingerprint != null) {
            return this.mCertificateFingerprint;
        }
        try {
            PackageInfo packageInfoB = bjj.a.a(context).b(this.mPackageName, 64);
            if (packageInfoB.signatures != null && packageInfoB.signatures.length == 1 && (messageDigestA = bhr.a("SHA-256")) != null) {
                bArrDigest = messageDigestA.digest(packageInfoB.signatures[0].toByteArray());
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (bArrDigest == null) {
            bArrDigest = new byte[0];
        }
        this.mCertificateFingerprint = bArrDigest;
        return this.mCertificateFingerprint;
    }

    static {
        Set setUnmodifiableSet;
        String[] strArrSplit = ((String) aze.b.b()).split(bdp.WHITELIST_DELIMITER);
        switch (strArrSplit.length) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                setUnmodifiableSet = Collections.emptySet();
                break;
            case 1:
                setUnmodifiableSet = Collections.singleton(strArrSplit[0]);
                break;
            case 2:
                String str = strArrSplit[0];
                String str2 = strArrSplit[1];
                Set setA = bih.a(2, false);
                setA.add(str);
                setA.add(str2);
                setUnmodifiableSet = Collections.unmodifiableSet(setA);
                break;
            case 3:
                String str3 = strArrSplit[0];
                String str4 = strArrSplit[1];
                String str5 = strArrSplit[2];
                Set setA2 = bih.a(3, false);
                setA2.add(str3);
                setA2.add(str4);
                setA2.add(str5);
                setUnmodifiableSet = Collections.unmodifiableSet(setA2);
                break;
            case 4:
                String str6 = strArrSplit[0];
                String str7 = strArrSplit[1];
                String str8 = strArrSplit[2];
                String str9 = strArrSplit[3];
                Set setA3 = bih.a(4, false);
                setA3.add(str6);
                setA3.add(str7);
                setA3.add(str8);
                setA3.add(str9);
                setUnmodifiableSet = Collections.unmodifiableSet(setA3);
                break;
            default:
                Set setA4 = bih.a(strArrSplit.length, false);
                Collections.addAll(setA4, strArrSplit);
                setUnmodifiableSet = Collections.unmodifiableSet(setA4);
                break;
        }
        IGNORED_PACKAGES = setUnmodifiableSet;
    }
}
