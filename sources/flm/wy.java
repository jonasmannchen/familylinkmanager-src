package flm;

import android.view.Menu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wy implements Runnable {
    private final /* synthetic */ wx a;

    wy(wx wxVar) {
        this.a = wxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wx wxVar = this.a;
        Menu menuH = wxVar.h();
        zi ziVar = menuH instanceof zi ? (zi) menuH : null;
        if (ziVar != null) {
            ziVar.e();
        }
        try {
            menuH.clear();
            if (!wxVar.c.onCreatePanelMenu(0, menuH) || !wxVar.c.onPreparePanel(0, null, menuH)) {
                menuH.clear();
            }
        } finally {
            if (ziVar != null) {
                ziVar.f();
            }
        }
    }
}
