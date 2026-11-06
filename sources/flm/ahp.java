package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ahp extends tx {
    private boolean a = false;
    private final /* synthetic */ int b;
    private final /* synthetic */ ahn c;

    ahp(ahn ahnVar, int i) {
        this.c = ahnVar;
        this.b = i;
    }

    @Override // flm.tx, flm.tw
    public final void a(View view) {
        this.c.a.setVisibility(0);
    }

    @Override // flm.tx, flm.tw
    public final void b(View view) {
        if (!this.a) {
            this.c.a.setVisibility(this.b);
        }
    }

    @Override // flm.tx, flm.tw
    public final void c(View view) {
        this.a = true;
    }
}
