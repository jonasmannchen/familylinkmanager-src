package flm;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ym implements yh {
    private final ActionMode.Callback a;
    private final Context b;
    private final ArrayList c = new ArrayList();
    private final so d = new so();

    public ym(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // flm.yh
    public final boolean a(yg ygVar, Menu menu) {
        return this.a.onCreateActionMode(b(ygVar), a(menu));
    }

    @Override // flm.yh
    public final boolean b(yg ygVar, Menu menu) {
        return this.a.onPrepareActionMode(b(ygVar), a(menu));
    }

    @Override // flm.yh
    public final boolean a(yg ygVar, MenuItem menuItem) {
        return this.a.onActionItemClicked(b(ygVar), aac.a(this.b, (qj) menuItem));
    }

    @Override // flm.yh
    public final void a(yg ygVar) {
        this.a.onDestroyActionMode(b(ygVar));
    }

    private final Menu a(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 == null) {
            Menu menuA = aac.a(this.b, (qi) menu);
            this.d.put(menu, menuA);
            return menuA;
        }
        return menu2;
    }

    public final ActionMode b(yg ygVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            yl ylVar = (yl) this.c.get(i);
            if (ylVar != null && ylVar.a == ygVar) {
                return ylVar;
            }
        }
        yl ylVar2 = new yl(this.b, ygVar);
        this.c.add(ylVar2);
        return ylVar2;
    }
}
