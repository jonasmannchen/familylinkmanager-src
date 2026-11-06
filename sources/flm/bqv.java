package flm;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqv implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final bmt c;
    private final long d;

    public bqv(Context context, GoogleHelp googleHelp, bmt bmtVar, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = bmtVar;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle(1);
        try {
            new bnr().a();
            throw new NoSuchMethodError();
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            bnc bncVar = new bnc(null);
            bncVar.h = null;
            brn brnVarA = bqp.a(this.a);
            bda.toVoidTask(brn.g.a(brnVarA.e, this.b, bncVar, bundle, this.d));
        }
    }
}
