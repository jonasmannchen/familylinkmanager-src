package flm;

import android.view.ViewTreeObserver;
import com.google.android.gms.kids.setup.fragment.KidSetupFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cko implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ ViewTreeObserver.OnScrollChangedListener a;
    private final /* synthetic */ KidSetupFragment b;

    public cko(KidSetupFragment kidSetupFragment, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.b = kidSetupFragment;
        this.a = onScrollChangedListener;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.b.m().getViewTreeObserver().addOnScrollChangedListener(this.a);
    }
}
