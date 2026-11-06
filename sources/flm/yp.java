package flm;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class yp {
    public sw A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D = null;
    public PorterDuff.Mode E = null;
    public final /* synthetic */ yn F;
    public Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;

    public yp(yn ynVar, Menu menu) {
        this.F = ynVar;
        this.a = menu;
        a();
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    static char a(String str) {
        if (str == null) {
            return (char) 0;
        }
        return str.charAt(0);
    }

    final void a(MenuItem menuItem) {
        boolean z = true;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r > 0).setTitleCondensed(this.l).setIcon(this.m);
        if (this.v >= 0) {
            menuItem.setShowAsAction(this.v);
        }
        if (this.z != null) {
            if (this.F.e.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            yn ynVar = this.F;
            if (ynVar.f == null) {
                ynVar.f = ynVar.a(ynVar.e);
            }
            menuItem.setOnMenuItemClickListener(new yo(ynVar.f, this.z));
        }
        if (this.r >= 2) {
            if (menuItem instanceof zm) {
                ((zm) menuItem).a(true);
            } else if (menuItem instanceof zo) {
                zo zoVar = (zo) menuItem;
                try {
                    if (zoVar.e == null) {
                        zoVar.e = ((qj) zoVar.d).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    zoVar.e.invoke(zoVar.d, true);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        if (this.x != null) {
            menuItem.setActionView((View) a(this.x, yn.a, this.F.c));
        } else {
            z = false;
        }
        if (this.w > 0) {
            if (!z) {
                menuItem.setActionView(this.w);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (this.A != null) {
            sw swVar = this.A;
            if (menuItem instanceof qj) {
                ((qj) menuItem).a(swVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.B;
        if (menuItem instanceof qj) {
            ((qj) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.C;
        if (menuItem instanceof qj) {
            ((qj) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.n;
        int i = this.o;
        if (menuItem instanceof qj) {
            ((qj) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
        char c2 = this.p;
        int i2 = this.q;
        if (menuItem instanceof qj) {
            ((qj) menuItem).setNumericShortcut(c2, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c2, i2);
        }
        if (this.E != null) {
            PorterDuff.Mode mode = this.E;
            if (menuItem instanceof qj) {
                ((qj) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintMode(mode);
            }
        }
        if (this.D != null) {
            ColorStateList colorStateList = this.D;
            if (menuItem instanceof qj) {
                ((qj) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    public final SubMenu b() {
        this.h = true;
        SubMenu subMenuAddSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        a(subMenuAddSubMenu.getItem());
        return subMenuAddSubMenu;
    }

    final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = this.F.e.getClassLoader().loadClass(str).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }
}
