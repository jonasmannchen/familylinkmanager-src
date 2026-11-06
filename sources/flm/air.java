package flm;

import android.view.ViewTreeObserver;
import com.android.setupwizardlib.TemplateLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class air implements ViewTreeObserver.OnPreDrawListener {
    private final /* synthetic */ TemplateLayout a;

    public air(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this.a.b);
        this.a.setXFraction(this.a.a);
        return true;
    }
}
