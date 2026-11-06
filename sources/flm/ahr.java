package flm;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ahr implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {
    public static ahr b;
    public static ahr c;
    public final View a;
    private final CharSequence d;
    private final int e;
    private final Runnable f = new ahs(this);
    private final Runnable g = new aht(this);
    private int h;
    private int i;
    private ahu j;
    private boolean k;

    ahr(View view, CharSequence charSequence) {
        this.a = view;
        this.d = charSequence;
        this.e = tr.a(ViewConfiguration.get(this.a.getContext()));
        b();
        this.a.setOnLongClickListener(this);
        this.a.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        a(true);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.j == null || !this.k) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                switch (motionEvent.getAction()) {
                    case 7:
                        if (this.a.isEnabled() && this.j == null) {
                            int x = (int) motionEvent.getX();
                            int y = (int) motionEvent.getY();
                            if (Math.abs(x - this.h) > this.e || Math.abs(y - this.i) > this.e) {
                                this.h = x;
                                this.i = y;
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                a(this);
                            }
                        }
                        break;
                    case 10:
                        b();
                        a();
                        break;
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    final void a(boolean z) {
        int height;
        int i;
        int dimensionPixelSize;
        long longPressTimeout;
        if (ti.z(this.a)) {
            a((ahr) null);
            if (c != null) {
                c.a();
            }
            c = this;
            this.k = z;
            this.j = new ahu(this.a.getContext());
            ahu ahuVar = this.j;
            View view = this.a;
            int i2 = this.h;
            int i3 = this.i;
            boolean z2 = this.k;
            CharSequence charSequence = this.d;
            if (ahuVar.b()) {
                ahuVar.a();
            }
            ahuVar.c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = ahuVar.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = ahuVar.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            int width = view.getWidth() >= dimensionPixelOffset ? i2 : view.getWidth() / 2;
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = ahuVar.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                int i4 = i3 + dimensionPixelOffset2;
                int i5 = i3 - dimensionPixelOffset2;
                height = i4;
                i = i5;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = ahuVar.a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(ahuVar.e);
                if (ahuVar.e.left < 0 && ahuVar.e.top < 0) {
                    Resources resources = ahuVar.a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        dimensionPixelSize = resources.getDimensionPixelSize(identifier);
                    } else {
                        dimensionPixelSize = 0;
                    }
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    ahuVar.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(ahuVar.g);
                view.getLocationOnScreen(ahuVar.f);
                int[] iArr = ahuVar.f;
                iArr[0] = iArr[0] - ahuVar.g[0];
                int[] iArr2 = ahuVar.f;
                iArr2[1] = iArr2[1] - ahuVar.g[1];
                layoutParams.x = (ahuVar.f[0] + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ahuVar.b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = ahuVar.b.getMeasuredHeight();
                int i6 = ((ahuVar.f[1] + i) - dimensionPixelOffset3) - measuredHeight;
                int i7 = ahuVar.f[1] + height + dimensionPixelOffset3;
                if (z2) {
                    if (i6 >= 0) {
                        layoutParams.y = i6;
                    } else {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= ahuVar.e.height()) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i6;
                }
            }
            ((WindowManager) ahuVar.a.getSystemService("window")).addView(ahuVar.b, ahuVar.d);
            this.a.addOnAttachStateChangeListener(this);
            if (this.k) {
                longPressTimeout = 2500;
            } else if ((ti.n(this.a) & 1) == 1) {
                longPressTimeout = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                longPressTimeout = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.a.removeCallbacks(this.g);
            this.a.postDelayed(this.g, longPressTimeout);
        }
    }

    final void a() {
        if (c == this) {
            c = null;
            if (this.j != null) {
                this.j.a();
                this.j = null;
                b();
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (b == this) {
            a((ahr) null);
        }
        this.a.removeCallbacks(this.g);
    }

    static void a(ahr ahrVar) {
        if (b != null) {
            ahr ahrVar2 = b;
            ahrVar2.a.removeCallbacks(ahrVar2.f);
        }
        b = ahrVar;
        if (ahrVar != null) {
            ahr ahrVar3 = b;
            ahrVar3.a.postDelayed(ahrVar3.f, ViewConfiguration.getLongPressTimeout());
        }
    }

    private final void b() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
    }
}
