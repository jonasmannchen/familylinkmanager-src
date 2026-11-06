package flm;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bki extends bbq {
    public static ala a = ala.a;
    public final bkk b;
    private final Looper c;
    private ale d;

    public bki(Context context, Looper looper, bba bbaVar, amn amnVar, atr atrVar, ats atsVar) {
        super(context, looper, 47, bbaVar, atrVar, atsVar);
        this.c = looper;
        String str = bbaVar.getAccount() == null ? "@@ContextManagerNullAccount@@" : bbaVar.getAccount().name;
        this.b = amnVar == null ? new bkk(str, context.getPackageName(), Process.myUid(), context.getPackageName(), bif.a(context, context.getPackageName()), 3, null, null, -1, Process.myPid()) : bkk.a(context, str, amnVar);
    }

    @Override // flm.bai
    public final boolean requiresAccount() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getStartServiceAction() {
        return "com.google.android.contextmanager.service.ContextManagerService.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getServiceDescriptor() {
        return "com.google.android.gms.contextmanager.internal.IContextManagerService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.google.android.contextmanager.service.args", bea.serializeToBytes(this.b));
        return bundle;
    }

    public final ale a() {
        if (this.d == null) {
            this.d = new ale(this.c, bke.a);
        }
        return this.d;
    }

    public static void a(auw auwVar, int i) {
        auwVar.setResult(new Status(0));
    }

    @Override // flm.bbq, flm.bai, flm.ate
    public final int getMinApkVersion() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return bkz.a(iBinder);
    }
}
