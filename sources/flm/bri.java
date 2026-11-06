package flm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bri extends brz {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ WeakReference b;
    private final /* synthetic */ brm c;
    private final /* synthetic */ bql d;
    private final /* synthetic */ bmt e;
    private final /* synthetic */ brb f;

    bri(brb brbVar, Intent intent, WeakReference weakReference, brm brmVar, bql bqlVar, bmt bmtVar) {
        this.f = brbVar;
        this.a = intent;
        this.b = weakReference;
        this.c = brmVar;
        this.d = bqlVar;
        this.e = bmtVar;
    }

    @Override // flm.brz, flm.brp
    public final void a(GoogleHelp googleHelp) {
        long jNanoTime = System.nanoTime();
        this.a.putExtra("EXTRA_START_TICK", jNanoTime);
        Activity activity = (Activity) this.b.get();
        if (activity == null) {
            this.c.forceFailureUnlessReady(brb.a);
            return;
        }
        if (this.d != null || this.e != null) {
            brw brwVar = new brw(googleHelp);
            Context applicationContext = activity.getApplicationContext();
            bmt bmtVar = this.e;
            bql bqlVar = this.d;
            bqm bqmVar = new bqm(brwVar.a);
            if (bqlVar != null) {
                bqmVar.a.B = true;
                brwVar.a(brwVar.b.a(applicationContext, brwVar.a, bqlVar, jNanoTime), 4);
            }
            if (bmtVar != null) {
                bqmVar.a.C = true;
                brwVar.a(brwVar.b.b(applicationContext, brwVar.a, bmtVar, jNanoTime), 4);
                brwVar.a(brwVar.b.a(applicationContext, brwVar.a, bmtVar, jNanoTime), 4);
            }
        }
        bqm bqmVar2 = new bqm(googleHelp);
        bqmVar2.a.A = aqd.b;
        if (bqmVar2.a() != null) {
            bqmVar2.a().c = brb.a(activity);
        }
        brb brbVar = this.f;
        brm brmVar = this.c;
        Intent intent = this.a;
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            bqr bqrVar = (bqr) bea.deserializeFromIntentExtra(intent, "EXTRA_IN_PRODUCT_HELP", bqr.CREATOR);
            bqrVar.a = googleHelp;
            bea.serializeToIntentExtra(bqrVar, intent, "EXTRA_IN_PRODUCT_HELP");
        }
        activity.startActivityForResult(intent, 123);
        brmVar.setResult((aty) Status.a);
    }
}
