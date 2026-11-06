package flm;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class crx extends asx {
    crx() {
    }

    @Override // flm.asx
    public final /* synthetic */ ate buildClient(Context context, Looper looper, bba bbaVar, Object obj, atr atrVar, ats atsVar) {
        return new csw(context, looper, atrVar, atsVar, "locationServices", bbaVar);
    }
}
