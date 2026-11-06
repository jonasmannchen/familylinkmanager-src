package flm;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ei extends hs {
    private ej a;
    private int b;
    private int c;

    public ei() {
        this.b = 0;
        this.c = 0;
    }

    public ei(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
    }

    @Override // flm.hs
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        b(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new ej(view);
        }
        ej ejVar = this.a;
        ejVar.b = ejVar.a.getTop();
        ejVar.c = ejVar.a.getLeft();
        ejVar.a();
        if (this.b != 0) {
            this.a.a(this.b);
            this.b = 0;
            return true;
        }
        return true;
    }

    protected void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.a(view, i);
    }

    public boolean a_(int i) {
        if (this.a != null) {
            return this.a.a(i);
        }
        this.b = i;
        return false;
    }

    public int b() {
        if (this.a != null) {
            return this.a.d;
        }
        return 0;
    }
}
