package flm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.chimeraresources.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ti {
    private static WeakHashMap a;
    private static Field b;
    private static boolean c;
    private static ThreadLocal d;

    private static Rect c() {
        if (d == null) {
            d = new ThreadLocal();
        }
        Rect rect = (Rect) d.get();
        if (rect == null) {
            rect = new Rect();
            d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void a(View view, ua uaVar) {
        view.onInitializeAccessibilityNodeInfo(uaVar.a);
    }

    public static void a(View view, su suVar) {
        if (suVar == null && (D(view) instanceof sv)) {
            suVar = new su();
        }
        view.setAccessibilityDelegate(suVar == null ? null : suVar.a);
    }

    @SuppressLint({"InlinedApi"})
    public static int a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(8);
        }
    }

    public static boolean b(View view) {
        return D(view) != null;
    }

    private static View.AccessibilityDelegate D(View view) {
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable th2) {
            c = true;
            return null;
        }
    }

    public static boolean c(View view) {
        return view.hasTransientState();
    }

    public static void a(View view, boolean z) {
        view.setHasTransientState(z);
    }

    public static void d(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static int e(View view) {
        return view.getImportantForAccessibility();
    }

    public static void b(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static boolean a(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static int f(View view) {
        return view.getLayoutDirection();
    }

    public static int g(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static void c(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static int h(View view) {
        return view.getPaddingStart();
    }

    public static int i(View view) {
        return view.getPaddingEnd();
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static int j(View view) {
        return view.getMinimumWidth();
    }

    public static int k(View view) {
        return view.getMinimumHeight();
    }

    public static tt l(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        tt ttVar = (tt) a.get(view);
        if (ttVar == null) {
            tt ttVar2 = new tt(view);
            a.put(view, ttVar2);
            return ttVar2;
        }
        return ttVar;
    }

    public static void a(View view, float f) {
        view.setElevation(f);
    }

    public static void a(View view, String str) {
        view.setTransitionName(str);
    }

    public static String m(View view) {
        return view.getTransitionName();
    }

    public static int n(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void o(View view) {
        view.requestApplyInsets();
    }

    public static boolean p(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static void b(View view, boolean z) {
        view.setFitsSystemWindows(true);
    }

    public static void a(View view, th thVar) {
        if (thVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new tj(thVar));
        }
    }

    public static tz a(View view, tz tzVar) {
        WindowInsets windowInsets = (WindowInsets) tz.a(tzVar);
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (windowInsetsOnApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(windowInsetsOnApplyWindowInsets);
        }
        return tz.a(windowInsets);
    }

    public static boolean q(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean r(View view) {
        return view.isPaddingRelative();
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList s(View view) {
        return view.getBackgroundTintList();
    }

    public static void a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static PorterDuff.Mode t(View view) {
        return view.getBackgroundTintMode();
    }

    public static void a(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static boolean u(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void v(View view) {
        view.stopNestedScroll();
    }

    public static boolean w(View view) {
        return view.isLaidOut();
    }

    public static float x(View view) {
        return view.getZ();
    }

    public static void d(View view, int i) {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect rectC = c();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectC.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectC.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            E(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                E((View) parent2);
            }
        }
        if (z && rectC.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectC);
        }
    }

    public static void e(View view, int i) {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect rectC = c();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectC.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectC.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            E(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                E((View) parent2);
            }
        }
        if (z && rectC.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectC);
        }
    }

    private static void E(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void a(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static Rect y(View view) {
        return view.getClipBounds();
    }

    public static boolean z(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean A(View view) {
        return view.hasOnClickListeners();
    }

    public static void a(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static Display B(View view) {
        return view.getDisplay();
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        tq tqVarA = tq.a(view);
        if (tqVarA.a != null && tqVarA.a.get() == keyEvent) {
            return false;
        }
        tqVarA.a = new WeakReference(keyEvent);
        WeakReference weakReference = null;
        SparseArray sparseArrayA = tqVarA.a();
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayA.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArrayA.valueAt(iIndexOfKey);
            sparseArrayA.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArrayA.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 != null && z(view2)) {
            tq.b(view2, keyEvent);
        }
        return true;
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        tq tqVarA = tq.a(view);
        if (keyEvent.getAction() == 0) {
            tqVarA.b();
        }
        View viewA = tqVarA.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                tqVarA.a().put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    @TargetApi(28)
    static to a() {
        return new tk(R.id.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static CharSequence C(View view) {
        return (CharSequence) new tl(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).b(view);
    }

    @TargetApi(28)
    static to b() {
        return new tm(R.id.tag_accessibility_heading, Boolean.class, 28);
    }

    @TargetApi(19)
    static void f(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = C(view) != null;
            if (g(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(16);
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, 16);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    static {
        new AtomicInteger(1);
        a = null;
        c = false;
        new tn();
    }
}
