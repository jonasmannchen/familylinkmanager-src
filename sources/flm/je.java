package flm;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class je extends kt {
    public je(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.q = i;
    }

    public je() {
    }

    @Override // flm.kt, flm.jq
    public final void a(kg kgVar) {
        super.a(kgVar);
        kgVar.a.put("android:fade:transitionAlpha", Float.valueOf(km.a.a(kgVar.b)));
    }

    private final Animator a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        km.a(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) km.b, f2);
        objectAnimatorOfFloat.addListener(new jg(view));
        a(new jf(this, view));
        return objectAnimatorOfFloat;
    }

    @Override // flm.kt
    public final Animator a(View view, kg kgVar) {
        float fA = a(kgVar, 0.0f);
        return a(view, fA != 1.0f ? fA : 0.0f, 1.0f);
    }

    @Override // flm.kt
    public final Animator b(View view, kg kgVar) {
        km.b(view);
        return a(view, a(kgVar, 1.0f), 0.0f);
    }

    private static float a(kg kgVar, float f) {
        Float f2;
        if (kgVar != null && (f2 = (Float) kgVar.a.get("android:fade:transitionAlpha")) != null) {
            return f2.floatValue();
        }
        return f;
    }
}
