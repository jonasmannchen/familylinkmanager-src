package flm;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wm extends ys {
    private final /* synthetic */ wb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    wm(wb wbVar, Window.Callback callback) {
        super(callback);
        this.a = wbVar;
    }

    @Override // flm.ys, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    @Override // flm.ys, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z;
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            wb wbVar = this.a;
            int keyCode = keyEvent.getKeyCode();
            vj vjVarA = wbVar.a();
            if (vjVarA != null && vjVarA.a(keyCode, keyEvent)) {
                z = true;
            } else if (wbVar.m != null && wbVar.a(wbVar.m, keyEvent.getKeyCode(), keyEvent, 1)) {
                if (wbVar.m != null) {
                    wbVar.m.l = true;
                }
                z = true;
            } else if (wbVar.m == null) {
                wq wqVarD = wbVar.d(0);
                wbVar.a(wqVarD, keyEvent);
                boolean zA = wbVar.a(wqVarD, keyEvent.getKeyCode(), keyEvent, 1);
                wqVarD.k = false;
                if (zA) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // flm.ys, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof zi)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // flm.ys, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // flm.ys, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        zi ziVar = menu instanceof zi ? (zi) menu : null;
        if (i == 0 && ziVar == null) {
            return false;
        }
        if (ziVar != null) {
            ziVar.j = true;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (ziVar != null) {
            ziVar.j = false;
            return zOnPreparePanel;
        }
        return zOnPreparePanel;
    }

    @Override // flm.ys, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        vj vjVarA;
        super.onMenuOpened(i, menu);
        wb wbVar = this.a;
        if (i == 108 && (vjVarA = wbVar.a()) != null) {
            vjVarA.g(true);
        }
        return true;
    }

    @Override // flm.ys, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        wb wbVar = this.a;
        if (i == 108) {
            vj vjVarA = wbVar.a();
            if (vjVarA != null) {
                vjVarA.g(false);
                return;
            }
            return;
        }
        if (i == 0) {
            wq wqVarD = wbVar.d(i);
            if (wqVarD.m) {
                wbVar.a(wqVarD, false);
            }
        }
    }

    @Override // flm.ys, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.a.k) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    private final ActionMode a(ActionMode.Callback callback) {
        ym ymVar = new ym(this.a.b, callback);
        yg ygVarA = this.a.a(ymVar);
        if (ygVarA != null) {
            return ymVar.b(ygVarA);
        }
        return null;
    }

    @Override // flm.ys, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.a.k) {
            switch (i) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    return a(callback);
            }
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    @Override // flm.ys, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        wq wqVarD = this.a.d(0);
        if (wqVarD != null && wqVarD.h != null) {
            super.onProvideKeyboardShortcuts(list, wqVarD.h, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }
}
