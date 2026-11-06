package flm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aca extends PopupWindow {
    private static final boolean a = false;

    public aca(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ahe aheVarA = ahe.a(context, attributeSet, xl.bW, i, i2);
        if (aheVarA.f(xl.bY)) {
            va.a(this, aheVarA.a(xl.bY, false));
        }
        setBackgroundDrawable(aheVarA.a(xl.bX));
        aheVarA.b.recycle();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }
}
