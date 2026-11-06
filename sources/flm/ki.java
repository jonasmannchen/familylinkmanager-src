package flm;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ki implements kj {
    private final ViewGroupOverlay a;

    ki(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // flm.kj
    public final void a(View view) {
        this.a.add(view);
    }

    @Override // flm.kj
    public final void b(View view) {
        this.a.remove(view);
    }
}
