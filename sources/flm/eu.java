package flm;

import android.content.Context;
import android.os.Bundle;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eu extends ws {
    public boolean a;
    public boolean b;
    public boolean c;
    private BottomSheetBehavior d;
    private eq e;

    public eu(Context context) {
        this(context, 0);
    }

    private eu(Context context, int i) {
        int i2;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
            i2 = typedValue.resourceId;
        } else {
            i2 = R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i2);
        this.a = true;
        this.b = true;
        this.e = new ey(this);
        a(1);
    }

    @Override // flm.ws, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(a(i, null, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ws, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // flm.ws, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(a(0, view, null));
    }

    @Override // flm.ws, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.a != z) {
            this.a = z;
            if (this.d != null) {
                this.d.e = z;
            }
        }
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        if (this.d != null && this.d.f == 5) {
            BottomSheetBehavior bottomSheetBehavior = this.d;
            if (4 != bottomSheetBehavior.f) {
                if (bottomSheetBehavior.i == null) {
                    bottomSheetBehavior.f = 4;
                    return;
                }
                View view = (View) bottomSheetBehavior.i.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null && parent.isLayoutRequested() && ti.z(view)) {
                        view.post(new eo(bottomSheetBehavior, view, 4));
                    } else {
                        bottomSheetBehavior.b(view, 4);
                    }
                }
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.a) {
            this.a = true;
        }
        this.b = z;
        this.c = true;
    }

    private final View a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.design_bottom_sheet);
        ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        if (!(layoutParams2 instanceof hv)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        hs hsVar = ((hv) layoutParams2).a;
        if (!(hsVar instanceof BottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        this.d = (BottomSheetBehavior) hsVar;
        this.d.k = this.e;
        this.d.e = this.a;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new ev(this));
        ti.a(frameLayout2, new ew(this));
        frameLayout2.setOnTouchListener(new ex());
        return frameLayout;
    }
}
