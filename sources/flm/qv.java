package flm;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qv implements Callable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ qt b;
    private final /* synthetic */ int c;
    private final /* synthetic */ String d;

    qv(Context context, qt qtVar, int i, String str) {
        this.a = context;
        this.b = qtVar;
        this.c = i;
        this.d = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Throwable {
        rb rbVarA = qu.a(this.a, this.b, this.c);
        if (rbVarA.a != null) {
            qu.a.put(this.d, rbVarA.a);
        }
        return rbVarA;
    }
}
