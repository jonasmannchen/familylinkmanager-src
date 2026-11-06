package flm;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bnm extends bbq {
    public final Context a;

    public bnm(Context context, Looper looper, atr atrVar, ats atsVar, bba bbaVar) {
        super(context, looper, 29, bbaVar, atrVar, atsVar);
        this.a = context;
        dfe.a = context.getContentResolver();
    }

    @Override // flm.bai
    public final aqb[] getApiFeatures() {
        return bmv.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getStartServiceAction() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final String getServiceDescriptor() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // flm.bbq, flm.bai, flm.ate
    public final int getMinApkVersion() {
        return 11925000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bai
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return bno.a(iBinder);
    }
}
