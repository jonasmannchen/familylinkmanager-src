package flm;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ddh extends bbq {
    public ddh(Context context, Looper looper, bba bbaVar, atr atrVar, ats atsVar) {
        super(context, looper, 35, bbaVar, atrVar, atsVar);
        bdi.checkNotNull(bbaVar.getAccount(), "Must pass an account via UdcOptions or call GoogleApiClient.Builder.setAccount()");
    }

    @Override // flm.bai
    public final boolean requiresAccount() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getServiceDescriptor() {
        return "com.google.android.gms.udc.internal.IUdcService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getStartServiceAction() {
        return "com.google.android.gms.udc.service.START";
    }

    @Override // flm.bbq, flm.bai, flm.ate
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // flm.bai
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return dcx.a(iBinder);
    }
}
