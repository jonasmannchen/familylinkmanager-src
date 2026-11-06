package flm;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ayc implements Runnable {
    private final /* synthetic */ dad a;
    private final /* synthetic */ aya b;

    ayc(aya ayaVar, dad dadVar) {
        this.b = ayaVar;
        this.a = dadVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aya ayaVar = this.b;
        dad dadVar = this.a;
        apx apxVar = dadVar.b;
        if (apxVar.b()) {
            bdl bdlVar = dadVar.c;
            apx connectionResult = bdlVar.getConnectionResult();
            if (!connectionResult.b()) {
                String strValueOf = String.valueOf(connectionResult);
                Log.wtf("SignInCoordinator", new StringBuilder(String.valueOf(strValueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(strValueOf).toString(), new Exception());
                ayaVar.g.a(connectionResult);
                ayaVar.f.disconnect();
                return;
            }
            ayaVar.g.a(bdlVar.getAccountAccessor(), ayaVar.d);
        } else {
            ayaVar.g.a(apxVar);
        }
        ayaVar.f.disconnect();
    }
}
