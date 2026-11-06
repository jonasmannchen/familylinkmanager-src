package flm;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class acs implements acu {
    private Drawable a;
    private final /* synthetic */ acr b;

    acs(acr acrVar) {
        this.b = acrVar;
    }

    @Override // flm.acu
    public final void a(Drawable drawable) {
        this.a = drawable;
        this.b.setBackgroundDrawable(drawable);
    }

    @Override // flm.acu
    public final boolean a() {
        return this.b.a;
    }

    @Override // flm.acu
    public final boolean b() {
        return this.b.b;
    }

    @Override // flm.acu
    public final void a(int i, int i2, int i3, int i4) {
        this.b.f.set(i, i2, i3, i4);
        super/*android.widget.FrameLayout*/.setPadding(this.b.e.left + i, this.b.e.top + i2, this.b.e.right + i3, this.b.e.bottom + i4);
    }

    @Override // flm.acu
    public final Drawable c() {
        return this.a;
    }

    @Override // flm.acu
    public final View d() {
        return this.b;
    }
}
