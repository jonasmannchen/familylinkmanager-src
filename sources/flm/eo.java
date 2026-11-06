package flm;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eo implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ int b;
    private final /* synthetic */ BottomSheetBehavior c;

    eo(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.a = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b(this.a, this.b);
    }
}
