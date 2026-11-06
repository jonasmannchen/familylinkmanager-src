package flm;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class yl extends ActionMode {
    public final yg a;
    private final Context b;

    public yl(Context context, yg ygVar) {
        this.b = context;
        this.a = ygVar;
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.a.a;
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.a.a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.a.d();
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.a.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return aac.a(this.b, (qi) this.a.b());
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.a.f();
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.a.a(i);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.a.g();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.a.b(i);
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.a.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.a.a(view);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.a.a();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.a.b;
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.a.a(z);
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.a.h();
    }
}
