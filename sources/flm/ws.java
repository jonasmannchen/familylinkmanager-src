package flm;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ws extends Dialog implements vz {
    private wa a;
    private final tb b;

    public ws(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i = typedValue.resourceId;
        }
        super(context, i);
        this.b = new wt(this);
        a().a((Bundle) null);
        a().k();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().j();
        super.onCreate(bundle);
        a().a(bundle);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().b(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        return a().a(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().e();
    }

    public final boolean a(int i) {
        return a().c(1);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().g();
    }

    private final wa a() {
        if (this.a == null) {
            this.a = new wb(getContext(), getWindow(), this);
        }
        return this.a;
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

    final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ta.a(this.b, getWindow().getDecorView(), this, keyEvent);
    }
}
