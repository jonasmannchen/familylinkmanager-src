package flm;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iu extends jq {
    private int[] x = new int[2];
    private boolean y = false;
    private boolean z = false;
    private static final String[] q = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property r = new iv(PointF.class, "boundsOrigin");
    private static final Property s = new iw(PointF.class, "topLeft");
    private static final Property t = new ix(PointF.class, "bottomRight");
    private static final Property u = new iy(PointF.class, "bottomRight");
    private static final Property v = new iz(PointF.class, "topLeft");
    private static final Property w = new ja(PointF.class, "position");
    private static jo A = new jo();

    @Override // flm.jq
    public final String[] a() {
        return q;
    }

    private final void d(kg kgVar) {
        View view = kgVar.b;
        if (ti.w(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            kgVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            kgVar.a.put("android:changeBounds:parent", kgVar.b.getParent());
        }
    }

    @Override // flm.jq
    public final void a(kg kgVar) {
        d(kgVar);
    }

    @Override // flm.jq
    public final void b(kg kgVar) {
        d(kgVar);
    }

    @Override // flm.jq
    public final Animator a(ViewGroup viewGroup, kg kgVar, kg kgVar2) {
        Animator animatorA;
        if (kgVar == null || kgVar2 == null) {
            return null;
        }
        Map map = kgVar.a;
        Map map2 = kgVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = kgVar2.b;
        Rect rect = (Rect) kgVar.a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) kgVar2.a.get("android:changeBounds:bounds");
        int i = rect.left;
        int i2 = rect2.left;
        int i3 = rect.top;
        int i4 = rect2.top;
        int i5 = rect.right;
        int i6 = rect2.right;
        int i7 = rect.bottom;
        int i8 = rect2.bottom;
        int i9 = i5 - i;
        int i10 = i7 - i3;
        int i11 = i6 - i2;
        int i12 = i8 - i4;
        Rect rect3 = (Rect) kgVar.a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) kgVar2.a.get("android:changeBounds:clip");
        int i13 = 0;
        if ((i9 != 0 && i10 != 0) || (i11 != 0 && i12 != 0)) {
            i13 = (i == i2 && i3 == i4) ? 0 : 1;
            if (i5 != i6 || i7 != i8) {
                i13++;
            }
        }
        int i14 = ((rect3 == null || rect3.equals(rect4)) && (rect3 != null || rect4 == null)) ? i13 : i13 + 1;
        if (i14 > 0) {
            km.a(view, i, i3, i5, i7);
            if (i14 == 2) {
                if (i9 == i11 && i10 == i12) {
                    animatorA = jm.a(view, w, this.p.a(i, i3, i2, i4));
                } else {
                    jd jdVar = new jd(view);
                    ObjectAnimator objectAnimatorA = jm.a(jdVar, s, this.p.a(i, i3, i2, i4));
                    ObjectAnimator objectAnimatorA2 = jm.a(jdVar, t, this.p.a(i5, i7, i6, i8));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
                    animatorSet.addListener(new jb(this, jdVar));
                    animatorA = animatorSet;
                }
            } else if (i != i2 || i3 != i4) {
                animatorA = jm.a(view, v, this.p.a(i, i3, i2, i4));
            } else {
                animatorA = jm.a(view, u, this.p.a(i5, i7, i6, i8));
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                kk.a(viewGroup4, true);
                a(new jc(this, viewGroup4));
                return animatorA;
            }
            return animatorA;
        }
        return null;
    }
}
