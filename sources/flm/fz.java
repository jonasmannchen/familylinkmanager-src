package flm;

import android.graphics.Typeface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fz extends pk {
    private final /* synthetic */ ga a;
    private final /* synthetic */ fy b;

    public fz(fy fyVar, ga gaVar) {
        this.b = fyVar;
        this.a = gaVar;
    }

    @Override // flm.pk
    public final void a(Typeface typeface) {
        this.b.k = Typeface.create(typeface, this.b.c);
        this.b.j = true;
        this.a.a(this.b.k);
    }

    @Override // flm.pk
    public final void a(int i) {
        this.b.j = true;
        this.a.a();
    }
}
