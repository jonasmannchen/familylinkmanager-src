package flm;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class abn {
    private final CompoundButton b;
    private boolean f;
    public ColorStateList a = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;

    abn(CompoundButton compoundButton) {
        this.b = compoundButton;
    }

    final void a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.b.getContext().obtainStyledAttributes(attributeSet, xl.aS, i, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(xl.aT) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(xl.aT, 0)) != 0) {
                this.b.setButtonDrawable(xn.b(this.b.getContext(), resourceId));
            }
            if (typedArrayObtainStyledAttributes.hasValue(xl.aU)) {
                uo.a(this.b, typedArrayObtainStyledAttributes.getColorStateList(xl.aU));
            }
            if (typedArrayObtainStyledAttributes.hasValue(xl.aV)) {
                this.b.setButtonTintMode(adn.a(typedArrayObtainStyledAttributes.getInt(xl.aV, -1), null));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    final void a() {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            b();
        }
    }

    private final void b() {
        Drawable drawableB = uo.b(this.b);
        if (drawableB != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = qc.e(drawableB).mutate();
                if (this.d) {
                    qc.a(drawableMutate, this.a);
                }
                if (this.e) {
                    qc.a(drawableMutate, this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.b.getDrawableState());
                }
                this.b.setButtonDrawable(drawableMutate);
            }
        }
    }
}
