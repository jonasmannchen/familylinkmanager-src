package flm;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awg extends awq {
    private final /* synthetic */ avy b;
    private final /* synthetic */ dad c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    awg(awo awoVar, avy avyVar, dad dadVar) {
        super(awoVar);
        this.b = avyVar;
        this.c = dadVar;
    }

    @Override // flm.awq
    public final void a() {
        avy avyVar = this.b;
        dad dadVar = this.c;
        if (avyVar.b(0)) {
            apx apxVar = dadVar.b;
            if (!apxVar.b()) {
                if (!avyVar.a(apxVar)) {
                    avyVar.b(apxVar);
                    return;
                } else {
                    avyVar.f();
                    avyVar.e();
                    return;
                }
            }
            bdl bdlVar = dadVar.c;
            apx connectionResult = bdlVar.getConnectionResult();
            if (!connectionResult.b()) {
                String strValueOf = String.valueOf(connectionResult);
                Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(strValueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(strValueOf).toString(), new Exception());
                avyVar.b(connectionResult);
            } else {
                avyVar.g = true;
                avyVar.h = bdlVar.getAccountAccessor();
                avyVar.i = bdlVar.getSaveDefaultAccount();
                avyVar.j = bdlVar.isFromCrossClientAuth();
                avyVar.e();
            }
        }
    }
}
