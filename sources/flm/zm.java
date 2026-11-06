package flm;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class zm implements qj {
    private View A;
    private MenuItem.OnActionExpandListener B;
    private ContextMenu.ContextMenuInfo D;
    public final int a;
    public zi d;
    public int e;
    public sw f;
    private final int g;
    private final int h;
    private final int i;
    private CharSequence j;
    private CharSequence k;
    private Intent l;
    private char m;
    private char n;
    private Drawable o;
    private aai q;
    private MenuItem.OnMenuItemClickListener r;
    private CharSequence s;
    private CharSequence t;
    public int b = 4096;
    public int c = 4096;
    private int p = 0;
    private ColorStateList u = null;
    private PorterDuff.Mode v = null;
    private boolean w = false;
    private boolean x = false;
    private boolean y = false;
    private int z = 16;
    private boolean C = false;

    zm(zi ziVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.e = 0;
        this.d = ziVar;
        this.g = i2;
        this.h = i;
        this.i = i3;
        this.a = i4;
        this.j = charSequence;
        this.e = i5;
    }

    public final boolean b() {
        if ((this.r != null && this.r.onMenuItemClick(this)) || this.d.a(this.d, this)) {
            return true;
        }
        if (this.l != null) {
            try {
                this.d.a.startActivity(this.l);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.f != null && this.f.d();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.z & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.z |= 16;
        } else {
            this.z &= -17;
        }
        this.d.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.h;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.l = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.n;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.n != c) {
            this.n = Character.toLowerCase(c);
            this.d.b(false);
        }
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.n != c || this.c != i) {
            this.n = Character.toLowerCase(c);
            this.c = KeyEvent.normalizeMetaState(i);
            this.d.b(false);
        }
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.m;
    }

    @Override // flm.qj, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.m != c) {
            this.m = c;
            this.d.b(false);
        }
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.m != c || this.b != i) {
            this.m = c;
            this.b = KeyEvent.normalizeMetaState(i);
            this.d.b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.m = c;
        this.n = Character.toLowerCase(c2);
        this.d.b(false);
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.m = c;
        this.b = KeyEvent.normalizeMetaState(i);
        this.n = Character.toLowerCase(c2);
        this.c = KeyEvent.normalizeMetaState(i2);
        this.d.b(false);
        return this;
    }

    public final char c() {
        return this.d.c() ? this.n : this.m;
    }

    public static void a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final boolean d() {
        return this.d.d() && c() != 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.q != null;
    }

    public final void a(aai aaiVar) {
        this.q = aaiVar;
        aaiVar.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.j;
    }

    public final CharSequence a(aab aabVar) {
        return (aabVar == null || !aabVar.b()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.j = charSequence;
        this.d.b(false);
        if (this.q != null) {
            this.q.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        return setTitle(this.d.a.getString(i));
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.k != null ? this.k : this.j;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.k = charSequence;
        this.d.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        if (this.o != null) {
            return a(this.o);
        }
        if (this.p != 0) {
            Drawable drawableB = xn.b(this.d.a, this.p);
            this.p = 0;
            this.o = drawableB;
            return a(drawableB);
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.p = 0;
        this.o = drawable;
        this.y = true;
        this.d.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.o = null;
        this.p = i;
        this.y = true;
        this.d.b(false);
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.u = colorStateList;
        this.w = true;
        this.y = true;
        this.d.b(false);
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.u;
    }

    @Override // flm.qj, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.v = mode;
        this.x = true;
        this.y = true;
        this.d.b(false);
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.v;
    }

    private final Drawable a(Drawable drawable) {
        if (drawable != null && this.y && (this.w || this.x)) {
            drawable = qc.e(drawable).mutate();
            if (this.w) {
                qc.a(drawable, this.u);
            }
            if (this.x) {
                qc.a(drawable, this.v);
            }
            this.y = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.z & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.z;
        this.z = (z ? 1 : 0) | (this.z & (-2));
        if (i != this.z) {
            this.d.b(false);
        }
        return this;
    }

    public final void a(boolean z) {
        this.z = (z ? 4 : 0) | (this.z & (-5));
    }

    public final boolean e() {
        return (this.z & 4) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.z & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.z & 4) != 0) {
            zi ziVar = this.d;
            int groupId = getGroupId();
            int size = ziVar.c.size();
            ziVar.e();
            for (int i = 0; i < size; i++) {
                zm zmVar = (zm) ziVar.c.get(i);
                if (zmVar.getGroupId() == groupId && zmVar.e() && zmVar.isCheckable()) {
                    zmVar.b(zmVar == this);
                }
            }
            ziVar.f();
        } else {
            b(z);
        }
        return this;
    }

    final void b(boolean z) {
        int i = this.z;
        this.z = (z ? 2 : 0) | (this.z & (-3));
        if (i != this.z) {
            this.d.b(false);
        }
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if (this.f == null || !this.f.b()) {
            return (this.z & 8) == 0;
        }
        return (this.z & 8) == 0 && this.f.c();
    }

    final boolean c(boolean z) {
        int i = this.z;
        this.z = (z ? 0 : 8) | (this.z & (-9));
        return i != this.z;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (c(z)) {
            this.d.g();
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.r = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        if (this.j != null) {
            return this.j.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    public final boolean f() {
        return (this.z & 32) == 32;
    }

    public final boolean g() {
        return (this.e & 1) == 1;
    }

    public final boolean h() {
        return (this.e & 2) == 2;
    }

    public final void d(boolean z) {
        if (z) {
            this.z |= 32;
        } else {
            this.z &= -33;
        }
    }

    @Override // flm.qj, android.view.MenuItem
    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
            case 1:
            case 2:
                this.e = i;
                this.d.h();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    @Override // flm.qj, android.view.MenuItem
    public final View getActionView() {
        if (this.A != null) {
            return this.A;
        }
        if (this.f != null) {
            this.A = this.f.a(this);
            return this.A;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // flm.qj
    public final sw a() {
        return this.f;
    }

    @Override // flm.qj
    public final qj a(sw swVar) {
        if (this.f != null) {
            sw swVar2 = this.f;
            swVar2.b = null;
            swVar2.a = null;
        }
        this.A = null;
        this.f = swVar;
        this.d.b(true);
        if (this.f != null) {
            this.f.a(new zn(this));
        }
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final boolean expandActionView() {
        if (!i()) {
            return false;
        }
        if (this.B == null || this.B.onMenuItemActionExpand(this)) {
            return this.d.a(this);
        }
        return false;
    }

    @Override // flm.qj, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.e & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        if (this.B == null || this.B.onMenuItemActionCollapse(this)) {
            return this.d.b(this);
        }
        return false;
    }

    public final boolean i() {
        if ((this.e & 8) == 0) {
            return false;
        }
        if (this.A == null && this.f != null) {
            this.A = this.f.a(this);
        }
        return this.A != null;
    }

    public final void e(boolean z) {
        this.C = z;
        this.d.b(false);
    }

    @Override // flm.qj, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qj setContentDescription(CharSequence charSequence) {
        this.s = charSequence;
        this.d.b(false);
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.s;
    }

    @Override // android.view.MenuItem
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qj setTooltipText(CharSequence charSequence) {
        this.t = charSequence;
        this.d.b(false);
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.t;
    }

    @Override // flm.qj, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.d.a;
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(View view) {
        this.A = view;
        this.f = null;
        if (view != null && view.getId() == -1 && this.g > 0) {
            view.setId(this.g);
        }
        this.d.h();
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }
}
