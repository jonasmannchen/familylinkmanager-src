package flm;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class zq extends FrameLayout implements yi {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    zq(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // flm.yi
    public final void a() {
        this.a.onActionViewExpanded();
    }

    @Override // flm.yi
    public final void b() {
        this.a.onActionViewCollapsed();
    }
}
