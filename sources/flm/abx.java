package flm;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abx {
    private final ImageView a;
    private ahc b;
    private ahc c;

    public abx(ImageView imageView) {
        this.a = imageView;
    }

    public final void a(AttributeSet attributeSet, int i) {
        int iG;
        ahe aheVarA = ahe.a(this.a.getContext(), attributeSet, xl.ab, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (iG = aheVarA.g(xl.ac, -1)) != -1 && (drawable = xn.b(this.a.getContext(), iG)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                adn.b(drawable);
            }
            if (aheVarA.f(xl.ad)) {
                ImageView imageView = this.a;
                imageView.setImageTintList(aheVarA.e(xl.ad));
                if (Build.VERSION.SDK_INT == 21) {
                    Drawable drawable2 = imageView.getDrawable();
                    boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                    if (drawable2 != null && z) {
                        if (drawable2.isStateful()) {
                            drawable2.setState(imageView.getDrawableState());
                        }
                        imageView.setImageDrawable(drawable2);
                    }
                }
            }
            if (aheVarA.f(xl.ae)) {
                ImageView imageView2 = this.a;
                imageView2.setImageTintMode(adn.a(aheVarA.a(xl.ae, -1), null));
                if (Build.VERSION.SDK_INT == 21) {
                    Drawable drawable3 = imageView2.getDrawable();
                    boolean z2 = (imageView2.getImageTintList() == null || imageView2.getImageTintMode() == null) ? false : true;
                    if (drawable3 != null && z2) {
                        if (drawable3.isStateful()) {
                            drawable3.setState(imageView2.getDrawableState());
                        }
                        imageView2.setImageDrawable(drawable3);
                    }
                }
            }
        } finally {
            aheVarA.b.recycle();
        }
    }

    public final void a(int i) {
        if (i != 0) {
            Drawable drawableB = xn.b(this.a.getContext(), i);
            if (drawableB != null) {
                adn.b(drawableB);
            }
            this.a.setImageDrawable(drawableB);
        } else {
            this.a.setImageDrawable(null);
        }
        b();
    }

    final boolean a() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }

    final void b() {
        boolean z = false;
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            adn.b(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z2 = i <= 21 && i == 21;
            if (z2) {
                if (this.c == null) {
                    this.c = new ahc();
                }
                ahc ahcVar = this.c;
                ahcVar.a();
                ColorStateList imageTintList = this.a.getImageTintList();
                if (imageTintList != null) {
                    ahcVar.d = true;
                    ahcVar.a = imageTintList;
                }
                PorterDuff.Mode imageTintMode = this.a.getImageTintMode();
                if (imageTintMode != null) {
                    ahcVar.c = true;
                    ahcVar.b = imageTintMode;
                }
                if (ahcVar.d || ahcVar.c) {
                    abo.a(drawable, ahcVar, this.a.getDrawableState());
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            if (this.b != null) {
                abo.a(drawable, this.b, this.a.getDrawableState());
            }
        }
    }
}
