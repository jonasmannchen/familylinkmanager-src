package flm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aez extends aeq implements aey {
    public static Method a;
    public aey b;

    public aez(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // flm.aeq
    final ado a(Context context, boolean z) {
        afa afaVar = new afa(context, z);
        afaVar.c = this;
        return afaVar;
    }

    @Override // flm.aey
    public final void b(zi ziVar, MenuItem menuItem) {
        if (this.b != null) {
            this.b.b(ziVar, menuItem);
        }
    }

    @Override // flm.aey
    public final void a(zi ziVar, MenuItem menuItem) {
        if (this.b != null) {
            this.b.a(ziVar, menuItem);
        }
    }

    static {
        try {
            a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
        }
    }
}
