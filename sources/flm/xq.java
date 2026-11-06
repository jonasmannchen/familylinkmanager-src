package flm;

import android.graphics.drawable.Animatable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xq extends xv {
    private final Animatable a;

    xq(Animatable animatable) {
        this.a = animatable;
    }

    @Override // flm.xv
    public final void a() {
        this.a.start();
    }

    @Override // flm.xv
    public final void b() {
        this.a.stop();
    }
}
