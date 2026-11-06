package flm;

import android.support.design.behavior.SwipeDismissBehavior;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class en implements Runnable {
    private final View a;
    private final boolean b;
    private final /* synthetic */ SwipeDismissBehavior c;

    en(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.c = swipeDismissBehavior;
        this.a = view;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.a != null && this.c.a.a(true)) {
            ti.a(this.a, this);
        } else if (this.b && this.c.b != null) {
            this.c.b.a(this.a);
        }
    }
}
