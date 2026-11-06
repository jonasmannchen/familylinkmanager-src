package flm;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aff extends afd {
    aff(afw afwVar) {
        super(afwVar, (byte) 0);
    }

    @Override // flm.afd
    public final int c() {
        return this.a.q - this.a.s();
    }

    @Override // flm.afd
    public final int d() {
        return this.a.q;
    }

    @Override // flm.afd
    public final void a(int i) {
        afw afwVar = this.a;
        if (afwVar.f != null) {
            RecyclerView recyclerView = afwVar.f;
            int iA = recyclerView.f.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.f.b(i2).offsetTopAndBottom(i);
            }
        }
    }

    @Override // flm.afd
    public final int b() {
        return this.a.q();
    }

    @Override // flm.afd
    public final int e(View view) {
        aga agaVar = (aga) view.getLayoutParams();
        return agaVar.bottomMargin + afw.c(view) + agaVar.topMargin;
    }

    @Override // flm.afd
    public final int f(View view) {
        aga agaVar = (aga) view.getLayoutParams();
        return agaVar.rightMargin + afw.b(view) + agaVar.leftMargin;
    }

    @Override // flm.afd
    public final int b(View view) {
        aga agaVar = (aga) view.getLayoutParams();
        return agaVar.bottomMargin + this.a.g(view);
    }

    @Override // flm.afd
    public final int a(View view) {
        return this.a.e(view) - ((aga) view.getLayoutParams()).topMargin;
    }

    @Override // flm.afd
    public final int c(View view) {
        this.a.a(view, true, this.c);
        return this.c.bottom;
    }

    @Override // flm.afd
    public final int d(View view) {
        this.a.a(view, true, this.c);
        return this.c.top;
    }

    @Override // flm.afd
    public final int e() {
        return (this.a.q - this.a.q()) - this.a.s();
    }

    @Override // flm.afd
    public final int f() {
        return this.a.s();
    }

    @Override // flm.afd
    public final int g() {
        return this.a.o;
    }

    @Override // flm.afd
    public final int h() {
        return this.a.n;
    }
}
