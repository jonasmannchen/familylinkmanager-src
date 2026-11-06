package flm;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.design.textfield.TextInputLayout;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class he {
    public final Context a;
    public final TextInputLayout b;
    public Animator c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean g;
    public TextView h;
    public int i;
    public CharSequence j;
    public boolean k;
    public TextView l;
    public int m;
    private LinearLayout n;
    private int o;
    private FrameLayout p;
    private int q;
    private final float r;

    public he(TextInputLayout textInputLayout) {
        this.a = textInputLayout.getContext();
        this.b = textInputLayout;
        this.r = this.a.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a() {
        this.f = null;
        b();
        if (this.d == 1) {
            if (this.k && !TextUtils.isEmpty(this.j)) {
                this.e = 2;
            } else {
                this.e = 0;
            }
        }
        a(this.d, this.e, a(this.h, (CharSequence) null));
    }

    public final boolean a(TextView textView, CharSequence charSequence) {
        return ti.w(this.b) && this.b.isEnabled() && !(this.e == this.d && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void a(int i, int i2, boolean z) {
        TextView textViewD;
        TextView textViewD2;
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.c = animatorSet;
            ArrayList arrayList = new ArrayList();
            a(arrayList, this.k, this.l, 2, i, i2);
            a(arrayList, this.g, this.h, 1, i, i2);
            ea.a(animatorSet, arrayList);
            animatorSet.addListener(new hf(this, i2, d(i), i, d(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewD2 = d(i2)) != null) {
                textViewD2.setVisibility(0);
                textViewD2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewD = d(i)) != null) {
                textViewD.setVisibility(4);
                if (i == 1) {
                    textViewD.setText((CharSequence) null);
                }
            }
            this.d = i2;
        }
        this.b.b();
        this.b.a(z, false);
        this.b.d();
    }

    private final void a(List list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
                objectAnimatorOfFloat.setDuration(167L);
                objectAnimatorOfFloat.setInterpolator(dz.a);
                list.add(objectAnimatorOfFloat);
                if (i3 == i) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.r, 0.0f);
                    objectAnimatorOfFloat2.setDuration(217L);
                    objectAnimatorOfFloat2.setInterpolator(dz.d);
                    list.add(objectAnimatorOfFloat2);
                }
            }
        }
    }

    public final void b() {
        if (this.c != null) {
            this.c.cancel();
        }
    }

    private static boolean c(int i) {
        return i == 0 || i == 1;
    }

    private final TextView d(int i) {
        switch (i) {
            case 1:
                return this.h;
            case 2:
                return this.l;
            default:
                return null;
        }
    }

    public final void c() {
        if ((this.n == null || this.b.a == null) ? false : true) {
            ti.a(this.n, ti.h(this.b.a), 0, ti.i(this.b.a), 0);
        }
    }

    public final void a(TextView textView, int i) {
        if (this.n == null && this.p == null) {
            this.n = new LinearLayout(this.a);
            this.n.setOrientation(0);
            this.b.addView(this.n, -1, -2);
            this.p = new FrameLayout(this.a);
            this.n.addView(this.p, -1, new FrameLayout.LayoutParams(-2, -2));
            this.n.addView(new vb(this.a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.b.a != null) {
                c();
            }
        }
        if (c(i)) {
            this.p.setVisibility(0);
            this.p.addView(textView);
            this.q++;
        } else {
            this.n.addView(textView, i);
        }
        this.n.setVisibility(0);
        this.o++;
    }

    public final void b(TextView textView, int i) {
        if (this.n != null) {
            if (c(i) && this.p != null) {
                this.q--;
                a(this.p, this.q);
                this.p.removeView(textView);
            } else {
                this.n.removeView(textView);
            }
            this.o--;
            a(this.n, this.o);
        }
    }

    private static void a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean d() {
        return (this.e != 1 || this.h == null || TextUtils.isEmpty(this.f)) ? false : true;
    }

    public final int e() {
        if (this.h != null) {
            return this.h.getCurrentTextColor();
        }
        return -1;
    }

    public final void a(int i) {
        this.i = i;
        if (this.h != null) {
            this.b.a(this.h, i);
        }
    }

    public final void b(int i) {
        this.m = i;
        if (this.l != null) {
            vc.a(this.l, i);
        }
    }
}
