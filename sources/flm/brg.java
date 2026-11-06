package flm;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class brg extends brm {
    private final /* synthetic */ bnc a;
    private final /* synthetic */ Bundle b;
    private final /* synthetic */ long c;
    private final /* synthetic */ GoogleHelp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    brg(atp atpVar, bnc bncVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(atpVar);
        this.a = bncVar;
        this.b = bundle;
        this.c = j;
        this.d = googleHelp;
    }

    @Override // flm.brl
    protected final void a(brr brrVar) {
        try {
            brrVar.a(this.a, this.b, this.c, this.d, new brh(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            forceFailureUnlessReady(brb.a);
        }
    }
}
