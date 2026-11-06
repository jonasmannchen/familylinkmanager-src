package flm;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ctv extends bbq {
    private final String a;

    public ctv(Context context, Looper looper, bba bbaVar, atr atrVar, ats atsVar) {
        super(context, looper, 22, bbaVar, atrVar, atsVar);
        this.a = bbaVar.getRealClientPackageName();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getStartServiceAction() {
        return "com.google.android.gms.location.reporting.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.reporting.internal.IReportingService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.a)) {
            bundle.putString("real_client_package_name", this.a);
        }
        return bundle;
    }

    @Override // flm.bbq, flm.bai, flm.ate
    public final int getMinApkVersion() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return ctt.a(iBinder);
    }
}
