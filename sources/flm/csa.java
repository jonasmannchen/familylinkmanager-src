package flm;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class csa extends bbq {
    public final ctb a;
    private final String b;

    public csa(Context context, Looper looper, atr atrVar, ats atsVar, String str, bba bbaVar) {
        super(context, looper, 23, bbaVar, atrVar, atsVar);
        this.a = new csb(this);
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.b);
        return bundle;
    }

    @Override // flm.bbq, flm.bai, flm.ate
    public int getMinApkVersion() {
        return 11925000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return cso.a(iBinder);
    }
}
