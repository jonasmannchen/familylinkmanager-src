package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bdo implements Runnable {
    public final /* synthetic */ bdn this$0;
    public final /* synthetic */ Context val$context;
    public final /* synthetic */ int val$statusCode;

    bdo(bdn bdnVar, Context context, int i) {
        this.this$0 = bdnVar;
        this.val$context = context;
        this.val$statusCode = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.this$0.logNotOnUiThread(this.val$context, this.val$statusCode);
    }
}
