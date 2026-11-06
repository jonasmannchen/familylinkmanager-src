package flm;

import android.support.design.behavior.SwipeDismissBehavior;
import android.support.design.snackbar.BaseTransientBottomBar;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class hn extends BaseTransientBottomBar {
    public hn(ViewGroup viewGroup, View view, gx gxVar) {
        super(viewGroup, view, gxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.design.snackbar.BaseTransientBottomBar
    public final int b() {
        if (c()) {
            return R.layout.mtrl_layout_snackbar_legacy;
        }
        return R.layout.design_layout_snackbar_legacy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.design.snackbar.BaseTransientBottomBar
    public final SwipeDismissBehavior g() {
        return new ho(this);
    }
}
