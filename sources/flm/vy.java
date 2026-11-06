package flm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class vy extends ln implements ol, vz {
    private wa f;
    private int g = 0;
    private Resources h;

    @Override // flm.ln, flm.oj, android.app.Activity
    public void onCreate(Bundle bundle) {
        wa waVarE = e();
        waVarE.j();
        waVarE.a(bundle);
        if (waVarE.k() && this.g != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.g, false);
            } else {
                setTheme(this.g);
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.g = i;
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        e().c();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return e().b();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        e().b(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        e().a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().a(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().b(view, layoutParams);
    }

    @Override // flm.ln, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e().a(configuration);
        if (this.h != null) {
            this.h.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ln, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        e().f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ln, android.app.Activity
    public void onStart() {
        super.onStart();
        e().d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ln, android.app.Activity
    public void onStop() {
        super.onStop();
        e().e();
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        return e().a(i);
    }

    @Override // flm.ln, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        vj vjVarA = e().a();
        if (menuItem.getItemId() == 16908332 && vjVarA != null && (vjVarA.a() & 4) != 0) {
            return f();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ln, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e().h();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        e().a(charSequence);
    }

    @Override // flm.ln
    public final void b() {
        e().g();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        e().g();
    }

    @Override // flm.vz
    public void onSupportActionModeStarted(yg ygVar) {
    }

    @Override // flm.vz
    public void onSupportActionModeFinished(yg ygVar) {
    }

    @Override // flm.vz
    public yg onWindowStartingSupportActionMode(yh yhVar) {
        return null;
    }

    private final boolean f() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null) {
            if (np.a(this, supportParentActivityIntent)) {
                ok okVarA = ok.a((Context) this);
                okVarA.a((Activity) this);
                okVarA.a();
                try {
                    kz.a(this);
                } catch (IllegalStateException e) {
                    finish();
                }
            } else {
                np.b(this, supportParentActivityIntent);
            }
            return true;
        }
        return false;
    }

    @Override // flm.ol
    public Intent getSupportParentActivityIntent() {
        return np.a(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // flm.ln, flm.oj, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        e().b(bundle);
    }

    public final wa e() {
        if (this.f == null) {
            this.f = new wb(this, getWindow(), this);
        }
        return this.f;
    }

    @Override // flm.oj, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        vj vjVarA = e().a();
        if (keyCode == 82 && vjVarA != null && vjVarA.a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.h == null) {
            ahv.a();
        }
        return this.h == null ? super.getResources() : this.h;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        vj vjVarA = e().a();
        if (getWindow().hasFeature(0)) {
            if (vjVarA == null || !vjVarA.c()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        vj vjVarA = e().a();
        if (getWindow().hasFeature(0)) {
            if (vjVarA == null || !vjVarA.d()) {
                super.closeOptionsMenu();
            }
        }
    }
}
