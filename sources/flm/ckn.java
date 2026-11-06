package flm;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.google.android.gms.kids.setup.fragment.KidSetupFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckn implements ViewTreeObserver.OnScrollChangedListener {
    private final /* synthetic */ KidSetupFragment a;

    public ckn(KidSetupFragment kidSetupFragment) {
        this.a = kidSetupFragment;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ScrollView scrollViewM = this.a.m();
        if (scrollViewM.canScrollVertically(130)) {
            return;
        }
        this.a.b = true;
        scrollViewM.getViewTreeObserver().removeOnScrollChangedListener(this);
        this.a.n.d.setVisibility(8);
        this.a.n.b.setVisibility(0);
    }
}
