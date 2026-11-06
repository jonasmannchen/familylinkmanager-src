package flm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avl extends atm {
    public final ate g;
    private final avg h;
    private final bba i;
    private final asx j;

    public avl(Context context, asw aswVar, Looper looper, ate ateVar, avg avgVar, bba bbaVar, asx asxVar) {
        super(context, aswVar, looper);
        this.g = ateVar;
        this.h = avgVar;
        this.i = bbaVar;
        this.j = asxVar;
        this.f.a(this);
    }

    @Override // flm.atm
    public final ate a(Looper looper, awv awvVar) {
        this.h.b = awvVar;
        return this.g;
    }

    @Override // flm.atm
    public final aya a(Context context, Handler handler) {
        return new aya(context, handler, this.i, this.j);
    }
}
