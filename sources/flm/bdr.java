package flm;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdr extends bbq {
    public final atg mClientImpl;

    public bdr(Context context, Looper looper, int i, atr atrVar, ats atsVar, bba bbaVar, atg atgVar) {
        super(context, looper, i, bbaVar, atrVar, atsVar);
        this.mClientImpl = atgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getStartServiceAction() {
        return this.mClientImpl.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getServiceDescriptor() {
        return this.mClientImpl.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final IInterface createServiceInterface(IBinder iBinder) {
        return this.mClientImpl.c();
    }

    @Override // flm.bai
    protected final void onSetConnectState(int i, IInterface iInterface) {
        this.mClientImpl.d();
    }

    public final atg getClient() {
        return this.mClientImpl;
    }

    @Override // flm.bbq, flm.bai, flm.ate
    public final int getMinApkVersion() {
        return super.getMinApkVersion();
    }
}
