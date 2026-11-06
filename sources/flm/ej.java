package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ej {
    public final View a;
    public int b;
    public int c;
    public int d;
    private int e;
    private boolean f = true;
    private boolean g = true;

    public ej(View view) {
        this.a = view;
    }

    final void a() {
        ti.d(this.a, this.d - (this.a.getTop() - this.b));
        ti.e(this.a, this.e - (this.a.getLeft() - this.c));
    }

    public final boolean a(int i) {
        if (!this.f || this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
