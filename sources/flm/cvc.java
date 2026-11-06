package flm;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cvc extends asx {
    cvc() {
    }

    @Override // flm.asx
    public final /* synthetic */ ate buildClient(Context context, Looper looper, bba bbaVar, Object obj, atr atrVar, ats atsVar) {
        cve cveVar = (cve) obj;
        bdi.checkNotNull(cveVar, "Must provide valid PeopleOptions!");
        return new cws(context, looper, atrVar, atsVar, String.valueOf(cveVar.a), bbaVar);
    }
}
