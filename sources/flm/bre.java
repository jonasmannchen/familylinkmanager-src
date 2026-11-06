package flm;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bre extends brm {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ long b;
    private final /* synthetic */ GoogleHelp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bre(atp atpVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(atpVar);
        this.a = bundle;
        this.b = j;
        this.c = googleHelp;
    }

    @Override // flm.brl
    protected final void a(brr brrVar) {
        try {
            brrVar.b(this.a, this.b, this.c, new brf(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            forceFailureUnlessReady(brb.a);
        }
    }
}
