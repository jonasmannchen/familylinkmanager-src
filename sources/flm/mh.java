package flm;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mh extends AnimationSet implements Runnable {
    private final ViewGroup a;
    private final View b;
    private boolean c;
    private boolean d;
    private boolean e;

    mh(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.e = true;
        this.a = viewGroup;
        this.b = view;
        addAnimation(animation);
        this.a.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (super.getTransformation(j, transformation)) {
            return true;
        }
        this.c = true;
        oe.a(this.a, this);
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (super.getTransformation(j, transformation, f)) {
            return true;
        }
        this.c = true;
        oe.a(this.a, this);
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c && this.e) {
            this.e = false;
            this.a.post(this);
        } else {
            this.a.endViewTransition(this.b);
            this.d = true;
        }
    }
}
