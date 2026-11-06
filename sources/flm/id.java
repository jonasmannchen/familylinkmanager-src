package flm;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class id extends Drawable.ConstantState {
    public int a;
    public ik b;
    public AnimatorSet c;
    public ArrayList d;
    public rt e;

    public id(id idVar, Drawable.Callback callback, Resources resources) {
        if (idVar != null) {
            this.a = idVar.a;
            if (idVar.b != null) {
                Drawable.ConstantState constantState = idVar.b.getConstantState();
                if (resources != null) {
                    this.b = (ik) constantState.newDrawable(resources);
                } else {
                    this.b = (ik) constantState.newDrawable();
                }
                this.b = (ik) this.b.mutate();
                this.b.setCallback(callback);
                this.b.setBounds(idVar.b.getBounds());
                this.b.c = false;
            }
            if (idVar.d != null) {
                int size = idVar.d.size();
                this.d = new ArrayList(size);
                this.e = new rt(size);
                for (int i = 0; i < size; i++) {
                    Animator animator = (Animator) idVar.d.get(i);
                    Animator animatorClone = animator.clone();
                    String str = (String) idVar.e.get(animator);
                    animatorClone.setTarget(this.b.a(str));
                    this.d.add(animatorClone);
                    this.e.put(animatorClone, str);
                }
                a();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a;
    }

    public final void a() {
        if (this.c == null) {
            this.c = new AnimatorSet();
        }
        this.c.playTogether(this.d);
    }
}
