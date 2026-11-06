package flm;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class czk extends bbq {
    public czk(Context context, Looper looper, bba bbaVar, atr atrVar, ats atsVar) {
        super(context, looper, 51, bbaVar, atrVar, atsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getStartServiceAction() {
        return "com.google.android.gms.phenotype.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getServiceDescriptor() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // flm.bbq, flm.bai, flm.ate
    public final int getMinApkVersion() {
        return 9410000;
    }

    @Override // flm.bai
    public final aqb[] getApiFeatures() {
        return cyz.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return czh.a(iBinder);
    }
}
