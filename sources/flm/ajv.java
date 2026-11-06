package flm;

import com.android.volley.Request;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajv implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ Request c;

    public ajv(Request request, String str, long j) {
        this.c = request;
        this.a = str;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.a(this.a, this.b);
        this.c.a.a(this.c.toString());
    }
}
