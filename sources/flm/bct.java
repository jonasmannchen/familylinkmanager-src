package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bct implements bbm {
    public static final String TAG = "InstantAppChecker";
    public final Context mContext;

    bct(Context context) {
        this.mContext = context;
    }

    @Override // flm.bbm
    public final apx process(bbn bbnVar, bbe bbeVar) {
        if (bjj.a.a(this.mContext).c(bbnVar.getCallingPackage(), bbnVar.getServiceId())) {
            return apx.a;
        }
        new StringBuilder(46).append("API not available for instant app: ").append(bbnVar.getServiceId());
        return new apx(16);
    }
}
