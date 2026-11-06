package flm;

import android.graphics.Typeface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pl implements Runnable {
    private final /* synthetic */ Typeface a;
    private final /* synthetic */ pk b;

    pl(pk pkVar, Typeface typeface) {
        this.b = pkVar;
        this.a = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
