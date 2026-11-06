package flm;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xc extends ys {
    private final /* synthetic */ wx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(wx wxVar, Window.Callback callback) {
        super(callback);
        this.a = wxVar;
    }

    @Override // flm.ys, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (zOnPreparePanel && !this.a.b) {
            this.a.a.l();
            this.a.b = true;
        }
        return zOnPreparePanel;
    }

    @Override // flm.ys, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return i == 0 ? new View(this.a.a.b()) : super.onCreatePanelView(i);
    }
}
