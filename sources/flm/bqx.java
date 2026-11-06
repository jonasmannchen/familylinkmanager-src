package flm;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqx implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final bql c;
    private final long d;

    public bqx(Context context, GoogleHelp googleHelp, bql bqlVar, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = bqlVar;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new bnr().a();
            throw new NoSuchMethodError();
        } catch (Exception e) {
            Log.w("gH_GetAsyncHelpPsd", "Failed to get async help psd.", e);
            List listSingletonList = Collections.singletonList(Pair.create("gms:googlehelp:async_help_psd_failure", "exception"));
            brn brnVarA = bqp.a(this.a);
            bda.toVoidTask(brn.g.a(brnVarA.e, this.b, bnq.a(listSingletonList), this.d));
        }
    }
}
