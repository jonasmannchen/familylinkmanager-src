package flm;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class yx extends yy {
    public final Context a;
    public Map b;
    public Map c;

    yx(Context context, Object obj) {
        super(obj);
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof qj)) {
            return menuItem;
        }
        qj qjVar = (qj) menuItem;
        if (this.b == null) {
            this.b = new rt();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(menuItem);
        if (menuItem2 == null) {
            MenuItem menuItemA = aac.a(this.a, qjVar);
            this.b.put(qjVar, menuItemA);
            return menuItemA;
        }
        return menuItem2;
    }

    final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof qk)) {
            return subMenu;
        }
        qk qkVar = (qk) subMenu;
        if (this.c == null) {
            this.c = new rt();
        }
        SubMenu subMenu2 = (SubMenu) this.c.get(qkVar);
        if (subMenu2 == null) {
            aaj aajVar = new aaj(this.a, qkVar);
            this.c.put(qkVar, aajVar);
            return aajVar;
        }
        return subMenu2;
    }
}
