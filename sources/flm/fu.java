package flm;

import android.graphics.Typeface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fu extends ga {
    public boolean a;
    private final Typeface b;
    private final fv c;

    public fu(fv fvVar, Typeface typeface) {
        this.b = typeface;
        this.c = fvVar;
    }

    @Override // flm.ga
    public final void a(Typeface typeface) {
        b(typeface);
    }

    @Override // flm.ga
    public final void a() {
        b(this.b);
    }

    private final void b(Typeface typeface) {
        if (!this.a) {
            this.c.a(typeface);
        }
    }
}
