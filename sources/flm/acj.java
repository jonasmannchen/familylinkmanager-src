package flm;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class acj extends aeq {
    public CharSequence a;
    public ListAdapter b;
    public final Rect c;
    public final /* synthetic */ acg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acj(acg acgVar, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = acgVar;
        this.c = new Rect();
        this.m = acgVar;
        a(true);
        this.l = 0;
        this.n = new ack(this, acgVar);
    }

    @Override // flm.aeq
    public final void a(ListAdapter listAdapter) {
        super.a(listAdapter);
        this.b = listAdapter;
    }

    final void a() {
        int i;
        int i2;
        Drawable background = this.s.getBackground();
        if (background != null) {
            background.getPadding(this.d.c);
            i = aic.a(this.d) ? this.d.c.right : -this.d.c.left;
        } else {
            Rect rect = this.d.c;
            this.d.c.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = this.d.getPaddingLeft();
        int paddingRight = this.d.getPaddingRight();
        int width = this.d.getWidth();
        if (this.d.b == -2) {
            int iA = this.d.a((SpinnerAdapter) this.b, this.s.getBackground());
            int i3 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.c.left) - this.d.c.right;
            if (iA <= i3) {
                i3 = iA;
            }
            b(Math.max(i3, (width - paddingLeft) - paddingRight));
        } else if (this.d.b == -1) {
            b((width - paddingLeft) - paddingRight);
        } else {
            b(this.d.b);
        }
        if (aic.a(this.d)) {
            i2 = ((width - paddingRight) - this.f) + i;
        } else {
            i2 = i + paddingLeft;
        }
        this.g = i2;
    }

    @Override // flm.aeq, flm.aae
    public final void b() {
        ViewTreeObserver viewTreeObserver;
        boolean zIsShowing = this.s.isShowing();
        a();
        c(2);
        super.b();
        this.e.setChoiceMode(1);
        int selectedItemPosition = this.d.getSelectedItemPosition();
        ado adoVar = this.e;
        if (this.s.isShowing() && adoVar != null) {
            adoVar.a = false;
            adoVar.setSelection(selectedItemPosition);
            if (adoVar.getChoiceMode() != 0) {
                adoVar.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!zIsShowing && (viewTreeObserver = this.d.getViewTreeObserver()) != null) {
            acl aclVar = new acl(this);
            viewTreeObserver.addOnGlobalLayoutListener(aclVar);
            a(new acm(this, aclVar));
        }
    }
}
