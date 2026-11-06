package flm;

import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface bcq extends IInterface {
    blq getGoogleCertificates();

    blq getGoogleReleaseCertificates();

    boolean isGoogleOrPlatformSigned(aqq aqqVar, blq blqVar);

    boolean isGoogleReleaseSigned(String str, blq blqVar);

    boolean isGoogleSigned(String str, blq blqVar);
}
