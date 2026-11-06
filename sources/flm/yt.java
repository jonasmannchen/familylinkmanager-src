package flm;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class yt implements qj {
    private CharSequence d;
    private CharSequence e;
    private Intent f;
    private char g;
    private char i;
    private Drawable k;
    private Context l;
    private CharSequence m;
    private CharSequence n;
    private int h = 4096;
    private int j = 4096;
    private ColorStateList o = null;
    private PorterDuff.Mode p = null;
    private boolean q = false;
    private boolean r = false;
    private int s = 16;
    private final int a = R.id.home;
    private final int b = 0;
    private final int c = 0;

    public yt(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.l = context;
        this.d = charSequence;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.i;
    }

    @Override // flm.qj, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.g;
    }

    @Override // flm.qj, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.e != null ? this.e : this.d;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.i = Character.toLowerCase(c);
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.i = Character.toLowerCase(c);
        this.j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.s = (z ? 1 : 0) | (this.s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.s = (z ? 2 : 0) | (this.s & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.s = (z ? 16 : 0) | (this.s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.k = drawable;
        b();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.k = oo.a(this.l, i);
        b();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.g = c;
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.g = c;
        this.h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.g = c;
        this.i = Character.toLowerCase(c2);
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.g = c;
        this.h = KeyEvent.normalizeMetaState(i);
        this.i = Character.toLowerCase(c2);
        this.j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.d = this.l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.s = (z ? 0 : 8) | (this.s & 8);
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // flm.qj, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // flm.qj
    public final sw a() {
        return null;
    }

    @Override // flm.qj
    public final qj a(sw swVar) {
        throw new UnsupportedOperationException();
    }

    @Override // flm.qj, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // flm.qj, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // flm.qj, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // flm.qj
    /* JADX INFO: renamed from: a */
    public final qj setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.m;
    }

    @Override // flm.qj
    /* JADX INFO: renamed from: b */
    public final qj setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.n;
    }

    @Override // flm.qj, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        this.q = true;
        b();
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.o;
    }

    @Override // flm.qj, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.p = mode;
        this.r = true;
        b();
        return this;
    }

    @Override // flm.qj, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    private final void b() {
        if (this.k != null) {
            if (this.q || this.r) {
                this.k = qc.e(this.k);
                this.k = this.k.mutate();
                if (this.q) {
                    qc.a(this.k, this.o);
                }
                if (this.r) {
                    qc.a(this.k, this.p);
                }
            }
        }
    }

    @Override // flm.qj, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // flm.qj, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // flm.qj, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }
}
