package android.support.design.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import flm.aab;
import flm.aej;
import flm.ahq;
import flm.fm;
import flm.fn;
import flm.su;
import flm.ti;
import flm.vc;
import flm.zm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends fm implements aab {
    private static final int[] b = {R.attr.state_checked};
    public boolean a;
    private int c;
    private final CheckedTextView d;
    private FrameLayout e;
    private zm j;
    private final su k;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new fn(this);
        c(0);
        LayoutInflater.from(context).inflate(com.google.android.chimeraresources.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.c = context.getResources().getDimensionPixelSize(com.google.android.chimeraresources.R.dimen.design_navigation_icon_size);
        this.d = (CheckedTextView) findViewById(com.google.android.chimeraresources.R.id.design_menu_item_text);
        this.d.setDuplicateParentStateEnabled(true);
        ti.a(this.d, this.k);
    }

    @Override // flm.aab
    public final void a(zm zmVar, int i) {
        StateListDrawable stateListDrawable;
        this.j = zmVar;
        setVisibility(zmVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.chimeraresources.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(b, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            ti.a(this, stateListDrawable);
        }
        boolean zIsCheckable = zmVar.isCheckable();
        refreshDrawableState();
        if (this.a != zIsCheckable) {
            this.a = zIsCheckable;
            this.k.a(this.d, 2048);
        }
        boolean zIsChecked = zmVar.isChecked();
        refreshDrawableState();
        this.d.setChecked(zIsChecked);
        setEnabled(zmVar.isEnabled());
        this.d.setText(zmVar.getTitle());
        Drawable icon = zmVar.getIcon();
        if (icon != null) {
            icon.setBounds(0, 0, this.c, this.c);
        }
        vc.a(this.d, icon, null, null, null);
        View actionView = zmVar.getActionView();
        if (actionView != null) {
            if (this.e == null) {
                this.e = (FrameLayout) ((ViewStub) findViewById(com.google.android.chimeraresources.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.e.removeAllViews();
            this.e.addView(actionView);
        }
        setContentDescription(zmVar.getContentDescription());
        ahq.a(this, zmVar.getTooltipText());
        if (this.j.getTitle() == null && this.j.getIcon() == null && this.j.getActionView() != null) {
            this.d.setVisibility(8);
            if (this.e != null) {
                aej aejVar = (aej) this.e.getLayoutParams();
                aejVar.width = -1;
                this.e.setLayoutParams(aejVar);
                return;
            }
            return;
        }
        this.d.setVisibility(0);
        if (this.e != null) {
            aej aejVar2 = (aej) this.e.getLayoutParams();
            aejVar2.width = -2;
            this.e.setLayoutParams(aejVar2);
        }
    }

    @Override // flm.aab
    public final zm a() {
        return this.j;
    }

    @Override // flm.aab
    public final boolean b() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.j != null && this.j.isCheckable() && this.j.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, b);
        }
        return iArrOnCreateDrawableState;
    }
}
