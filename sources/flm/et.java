package flm;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class et implements Runnable {
    private final View a;
    private final int b;
    private final /* synthetic */ BottomSheetBehavior c;

    public et(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.a = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.g != null && this.c.g.a(true)) {
            ti.a(this.a, this);
        } else {
            this.c.b(this.b);
        }
    }
}
