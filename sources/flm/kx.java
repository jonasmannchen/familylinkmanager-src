package flm;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kx {
    private final WindowId a;

    kx(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kx) && ((kx) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
