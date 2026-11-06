package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class afx implements ahy {
    private final /* synthetic */ afw a;

    afx(afw afwVar) {
        this.a = afwVar;
    }

    @Override // flm.ahy
    public final View a(int i) {
        return this.a.e(i);
    }

    @Override // flm.ahy
    public final int a() {
        return this.a.p();
    }

    @Override // flm.ahy
    public final int b() {
        return this.a.p - this.a.r();
    }

    @Override // flm.ahy
    public final int a(View view) {
        return this.a.d(view) - ((aga) view.getLayoutParams()).leftMargin;
    }

    @Override // flm.ahy
    public final int b(View view) {
        aga agaVar = (aga) view.getLayoutParams();
        return agaVar.rightMargin + this.a.f(view);
    }
}
