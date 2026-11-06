package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class yr extends tx {
    private boolean a = false;
    private int b = 0;
    private final /* synthetic */ yq c;

    yr(yq yqVar) {
        this.c = yqVar;
    }

    @Override // flm.tx, flm.tw
    public final void a(View view) {
        if (!this.a) {
            this.a = true;
            if (this.c.b != null) {
                this.c.b.a(null);
            }
        }
    }

    @Override // flm.tx, flm.tw
    public final void b(View view) {
        int i = this.b + 1;
        this.b = i;
        if (i == this.c.a.size()) {
            if (this.c.b != null) {
                this.c.b.b(null);
            }
            this.b = 0;
            this.a = false;
            this.c.c = false;
        }
    }
}
