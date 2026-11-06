package flm;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqw implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final bmt c;
    private final long d;

    public bqw(Context context, GoogleHelp googleHelp, bmt bmtVar, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = bmtVar;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new bnr().a();
            throw new NoSuchMethodError();
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
            List listSingletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
            brn brnVarA = bqp.a(this.a);
            bda.toVoidTask(brn.g.b(brnVarA.e, this.b, bnq.a(listSingletonList), this.d));
        }
    }
}
