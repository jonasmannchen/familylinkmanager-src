package android.support.design.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import flm.hr;
import flm.hs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class BottomAppBar extends Toolbar implements hr {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }

    @Override // android.support.v7.widget.Toolbar
    public final void a(CharSequence charSequence) {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: compiled from: PG */
    public class Behavior extends HideBottomViewOnScrollBehavior {
        private final Rect b;

        public Behavior() {
            this.b = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
        }

        @Override // android.support.design.behavior.HideBottomViewOnScrollBehavior
        public final /* synthetic */ void c(View view) {
            super.c((BottomAppBar) view);
            throw new NoSuchMethodError();
        }

        @Override // android.support.design.behavior.HideBottomViewOnScrollBehavior
        public final /* synthetic */ void b(View view) {
            super.b((BottomAppBar) view);
            throw new NoSuchMethodError();
        }

        @Override // android.support.design.behavior.HideBottomViewOnScrollBehavior, flm.hs
        public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
            throw new NoSuchMethodError();
        }

        @Override // flm.hs
        public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            throw new NoSuchMethodError();
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void b(CharSequence charSequence) {
        throw new NoSuchMethodError();
    }

    @Override // flm.hr
    public final hs a() {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        throw new NoSuchMethodError();
    }
}
