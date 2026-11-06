package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ahw {
    private final ahy a;
    private ahx b = new ahx();

    ahw(ahy ahyVar) {
        this.a = ahyVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    final View a(int i, int i2, int i3, int i4) {
        int iA = this.a.a();
        int iB = this.a.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewA = this.a.a(i);
            this.b.a(iA, iB, this.a.a(viewA), this.a.b(viewA));
            if (i3 != 0) {
                this.b.a = 0;
                this.b.a(i3);
                if (this.b.a()) {
                    return viewA;
                }
            }
            if (i4 != 0) {
                this.b.a = 0;
                this.b.a(i4);
                if (!this.b.a()) {
                    viewA = view;
                }
            } else {
                viewA = view;
            }
            i += i5;
            view = viewA;
        }
        return view;
    }

    final boolean a(View view, int i) {
        this.b.a(this.a.a(), this.a.b(), this.a.a(view), this.a.b(view));
        this.b.a = 0;
        this.b.a(24579);
        return this.b.a();
    }
}
