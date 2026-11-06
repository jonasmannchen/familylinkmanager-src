package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aal implements tw {
    private boolean a = false;
    private int b;
    private final /* synthetic */ aak c;

    protected aal(aak aakVar) {
        this.c = aakVar;
    }

    public final aal a(tt ttVar, int i) {
        this.c.e = ttVar;
        this.b = i;
        return this;
    }

    @Override // flm.tw
    public final void a(View view) {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.a = false;
    }

    @Override // flm.tw
    public final void b(View view) {
        if (!this.a) {
            this.c.e = null;
            super/*android.view.ViewGroup*/.setVisibility(this.b);
        }
    }

    @Override // flm.tw
    public final void c(View view) {
        this.a = true;
    }
}
