package flm;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aya extends czu implements atr, ats {
    private static asx h = czl.a;
    public final Context a;
    public final Handler b;
    public final asx c;
    public Set d;
    public bba e;
    public czp f;
    public ayd g;

    public aya(Context context, Handler handler, bba bbaVar) {
        this(context, handler, bbaVar, h);
    }

    public aya(Context context, Handler handler, bba bbaVar, asx asxVar) {
        this.a = context;
        this.b = handler;
        this.e = (bba) bdi.checkNotNull(bbaVar, "ClientSettings must not be null");
        this.d = bbaVar.getRequiredScopes();
        this.c = asxVar;
    }

    @Override // flm.atr
    public final void a(Bundle bundle) {
        this.f.a(this);
    }

    @Override // flm.atr
    public final void a(int i) {
        this.f.disconnect();
    }

    @Override // flm.ats
    public final void a(apx apxVar) {
        this.g.a(apxVar);
    }

    @Override // flm.czu, flm.czv
    public final void a(dad dadVar) {
        this.b.post(new ayc(this, dadVar));
    }
}
