package flm;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class akr extends akx implements ol, vz {
    private wa a;
    private int b = 0;
    private Resources c;

    @Override // flm.akx
    public void onCreate(Bundle bundle) {
        wa delegate = getDelegate();
        delegate.j();
        delegate.a(bundle);
        if (delegate.k() && this.b != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.b, false);
            } else {
                setTheme(this.b);
            }
        }
        super.onCreate(bundle);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.b = i;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().c();
    }

    public vj getSupportActionBar() {
        return getDelegate().a();
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().a(toolbar);
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().b();
    }

    public void setContentView(int i) {
        getDelegate().b(i);
    }

    public void setContentView(View view) {
        getDelegate().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().a(view, layoutParams);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().b(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().a(configuration);
        if (this.c != null) {
            this.c.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    protected void onPostResume() {
        super.onPostResume();
        getDelegate().f();
    }

    @Override // flm.akx
    public void onStart() {
        super.onStart();
        getDelegate().d();
    }

    @Override // flm.akx
    public void onStop() {
        super.onStop();
        getDelegate().e();
    }

    public View findViewById(int i) {
        return getDelegate().a(i);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        vj supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.a() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // flm.akx
    public void onDestroy() {
        super.onDestroy();
        getDelegate().h();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().a(charSequence);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().c(i);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().g();
    }

    public void invalidateOptionsMenu() {
        getDelegate().g();
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

    public yg startSupportActionMode(yh yhVar) {
        return getDelegate().a(yhVar);
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    public void onCreateSupportNavigateUpTaskStack(ok okVar) {
        okVar.a(getContainerActivity());
    }

    public void onPrepareSupportNavigateUpTaskStack(ok okVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null) {
            if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
                ok okVarA = ok.a((Context) this);
                onCreateSupportNavigateUpTaskStack(okVarA);
                onPrepareSupportNavigateUpTaskStack(okVarA);
                okVarA.a();
                try {
                    kz.a(getContainerActivity());
                } catch (IllegalStateException e) {
                    finish();
                }
            } else {
                supportNavigateUpTo(supportParentActivityIntent);
            }
            return true;
        }
        return false;
    }

    @Override // flm.ol
    public Intent getSupportParentActivityIntent() {
        return np.a(getContainerActivity());
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return np.a(getContainerActivity(), intent);
    }

    public void supportNavigateUpTo(Intent intent) {
        np.b(getContainerActivity(), intent);
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public vm getDrawerToggleDelegate() {
        return getDelegate().i();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // flm.akx
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().b(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wa getDelegate() {
        if (this.a == null) {
            this.a = new wb(this, getWindow(), this);
        }
        return this.a;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        vj supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public Resources getResources() {
        if (this.c == null) {
            ahv.a();
        }
        return this.c == null ? super.getResources() : this.c;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void openOptionsMenu() {
        vj supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.c()) {
                super.openOptionsMenu();
            }
        }
    }

    public void closeOptionsMenu() {
        vj supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.d()) {
                super.closeOptionsMenu();
            }
        }
    }
}
