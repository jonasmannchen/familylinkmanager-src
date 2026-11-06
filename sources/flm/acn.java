package flm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acn {
    public final acq a;
    public int b = 0;
    public Typeface c;
    public boolean d;
    private final TextView e;
    private ahc f;
    private ahc g;
    private ahc h;
    private ahc i;
    private ahc j;
    private ahc k;

    public acn(TextView textView) {
        this.e = textView;
        this.a = new acq(this.e);
    }

    @SuppressLint({"NewApi"})
    public final void a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListE;
        ColorStateList colorStateListE2;
        int resourceId;
        Context context = this.e.getContext();
        abo aboVarA = abo.a();
        ahe aheVarA = ahe.a(context, attributeSet, xl.ak, i, 0);
        int iG = aheVarA.g(xl.ar, -1);
        if (aheVarA.f(xl.an)) {
            this.f = a(context, aboVarA, aheVarA.g(xl.an, 0));
        }
        if (aheVarA.f(xl.aq)) {
            this.g = a(context, aboVarA, aheVarA.g(xl.aq, 0));
        }
        if (aheVarA.f(xl.ao)) {
            this.h = a(context, aboVarA, aheVarA.g(xl.ao, 0));
        }
        if (aheVarA.f(xl.al)) {
            this.i = a(context, aboVarA, aheVarA.g(xl.al, 0));
        }
        if (aheVarA.f(xl.ap)) {
            this.j = a(context, aboVarA, aheVarA.g(xl.ap, 0));
        }
        if (aheVarA.f(xl.am)) {
            this.k = a(context, aboVarA, aheVarA.g(xl.am, 0));
        }
        aheVarA.b.recycle();
        boolean z = this.e.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean zA = false;
        boolean z2 = false;
        ColorStateList colorStateListE3 = null;
        ColorStateList colorStateListE4 = null;
        if (iG == -1) {
            colorStateListE = null;
            colorStateListE2 = null;
        } else {
            ahe aheVarA2 = ahe.a(context, iG, xl.cG);
            if (!z && aheVarA2.f(xl.cP)) {
                z2 = true;
                zA = aheVarA2.a(xl.cP, false);
            }
            a(context, aheVarA2);
            if (Build.VERSION.SDK_INT >= 23) {
                colorStateListE = null;
                colorStateListE2 = null;
            } else {
                if (aheVarA2.f(xl.cI)) {
                    colorStateListE3 = aheVarA2.e(xl.cI);
                }
                if (aheVarA2.f(xl.cJ)) {
                    colorStateListE4 = aheVarA2.e(xl.cJ);
                }
                if (!aheVarA2.f(xl.cK)) {
                    colorStateListE = colorStateListE3;
                    colorStateListE2 = null;
                } else {
                    colorStateListE = colorStateListE3;
                    colorStateListE2 = aheVarA2.e(xl.cK);
                }
            }
            aheVarA2.b.recycle();
        }
        ahe aheVarA3 = ahe.a(context, attributeSet, xl.cG, i, 0);
        if (!z && aheVarA3.f(xl.cP)) {
            z2 = true;
            zA = aheVarA3.a(xl.cP, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (aheVarA3.f(xl.cI)) {
                colorStateListE = aheVarA3.e(xl.cI);
            }
            if (aheVarA3.f(xl.cJ)) {
                colorStateListE4 = aheVarA3.e(xl.cJ);
            }
            if (aheVarA3.f(xl.cK)) {
                colorStateListE2 = aheVarA3.e(xl.cK);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && aheVarA3.f(xl.cL) && aheVarA3.e(xl.cL, -1) == 0) {
            this.e.setTextSize(0, 0.0f);
        }
        a(context, aheVarA3);
        aheVarA3.b.recycle();
        if (colorStateListE != null) {
            this.e.setTextColor(colorStateListE);
        }
        if (colorStateListE4 != null) {
            this.e.setHintTextColor(colorStateListE4);
        }
        if (colorStateListE2 != null) {
            this.e.setLinkTextColor(colorStateListE2);
        }
        if (!z && z2) {
            a(zA);
        }
        if (this.c != null) {
            this.e.setTypeface(this.c, this.b);
        }
        acq acqVar = this.a;
        float fApplyDimension = -1.0f;
        float fApplyDimension2 = -1.0f;
        float dimension = -1.0f;
        TypedArray typedArrayObtainStyledAttributes = acqVar.h.obtainStyledAttributes(attributeSet, xl.as, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(xl.ax)) {
            acqVar.a = typedArrayObtainStyledAttributes.getInt(xl.ax, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(xl.aw)) {
            dimension = typedArrayObtainStyledAttributes.getDimension(xl.aw, -1.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(xl.au)) {
            fApplyDimension = typedArrayObtainStyledAttributes.getDimension(xl.au, -1.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(xl.at)) {
            fApplyDimension2 = typedArrayObtainStyledAttributes.getDimension(xl.at, -1.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(xl.av) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(xl.av, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = typedArrayObtainTypedArray.getDimensionPixelSize(i2, -1);
                }
                acqVar.f = acq.a(iArr);
                acqVar.a();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (acqVar.e()) {
            if (acqVar.a == 1) {
                if (!acqVar.g) {
                    DisplayMetrics displayMetrics = acqVar.h.getResources().getDisplayMetrics();
                    if (fApplyDimension == -1.0f) {
                        fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (fApplyDimension2 == -1.0f) {
                        fApplyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    acqVar.a(fApplyDimension, fApplyDimension2, dimension);
                }
                acqVar.b();
            }
        } else {
            acqVar.a = 0;
        }
        if (un.a && this.a.a != 0) {
            int[] iArr2 = this.a.f;
            if (iArr2.length > 0) {
                if (this.e.getAutoSizeStepGranularity() != -1.0f) {
                    this.e.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.a.d), Math.round(this.a.e), Math.round(this.a.c), 0);
                } else {
                    this.e.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
                }
            }
        }
        ahe aheVarA4 = ahe.a(context, attributeSet, xl.as);
        int iE = aheVarA4.e(xl.ay, -1);
        int iE2 = aheVarA4.e(xl.az, -1);
        int iE3 = aheVarA4.e(xl.aA, -1);
        aheVarA4.b.recycle();
        if (iE != -1) {
            vc.b(this.e, iE);
        }
        if (iE2 != -1) {
            vc.c(this.e, iE2);
        }
        if (iE3 != -1) {
            vc.d(this.e, iE3);
        }
    }

    private final void a(Context context, ahe aheVar) {
        String strD;
        Typeface typefaceA;
        this.b = aheVar.a(xl.cM, this.b);
        if (aheVar.f(xl.cH) || aheVar.f(xl.cO)) {
            this.c = null;
            int i = aheVar.f(xl.cO) ? xl.cO : xl.cH;
            if (!context.isRestricted()) {
                aco acoVar = new aco(this, new WeakReference(this.e));
                try {
                    int i2 = this.b;
                    int resourceId = aheVar.b.getResourceId(i, 0);
                    if (resourceId == 0) {
                        typefaceA = null;
                    } else {
                        if (aheVar.c == null) {
                            aheVar.c = new TypedValue();
                        }
                        Context context2 = aheVar.a;
                        typefaceA = context2.isRestricted() ? null : pj.a(context2, resourceId, aheVar.c, i2, acoVar, null, true);
                    }
                    this.c = typefaceA;
                    this.d = this.c == null;
                } catch (Resources.NotFoundException e) {
                } catch (UnsupportedOperationException e2) {
                }
            }
            if (this.c == null && (strD = aheVar.d(i)) != null) {
                this.c = Typeface.create(strD, this.b);
            }
            return;
        }
        if (aheVar.f(xl.cN)) {
            this.d = false;
            switch (aheVar.a(xl.cN, 1)) {
                case 1:
                    this.c = Typeface.SANS_SERIF;
                    break;
                case 2:
                    this.c = Typeface.SERIF;
                    break;
                case 3:
                    this.c = Typeface.MONOSPACE;
                    break;
            }
        }
    }

    public final void a(Context context, int i) {
        ColorStateList colorStateListE;
        ahe aheVarA = ahe.a(context, i, xl.cG);
        if (aheVarA.f(xl.cP)) {
            a(aheVarA.a(xl.cP, false));
        }
        if (Build.VERSION.SDK_INT < 23 && aheVarA.f(xl.cI) && (colorStateListE = aheVarA.e(xl.cI)) != null) {
            this.e.setTextColor(colorStateListE);
        }
        if (aheVarA.f(xl.cL) && aheVarA.e(xl.cL, -1) == 0) {
            this.e.setTextSize(0, 0.0f);
        }
        a(context, aheVarA);
        aheVarA.b.recycle();
        if (this.c != null) {
            this.e.setTypeface(this.c, this.b);
        }
    }

    private final void a(boolean z) {
        this.e.setAllCaps(z);
    }

    public final void a() {
        if (this.f != null || this.g != null || this.h != null || this.i != null) {
            Drawable[] compoundDrawables = this.e.getCompoundDrawables();
            a(compoundDrawables[0], this.f);
            a(compoundDrawables[1], this.g);
            a(compoundDrawables[2], this.h);
            a(compoundDrawables[3], this.i);
        }
        if (this.j != null || this.k != null) {
            Drawable[] compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.j);
            a(compoundDrawablesRelative[2], this.k);
        }
    }

    private final void a(Drawable drawable, ahc ahcVar) {
        if (drawable != null && ahcVar != null) {
            abo.a(drawable, ahcVar, this.e.getDrawableState());
        }
    }

    private static ahc a(Context context, abo aboVar, int i) {
        ColorStateList colorStateListB = aboVar.b(context, i);
        if (colorStateListB == null) {
            return null;
        }
        ahc ahcVar = new ahc();
        ahcVar.d = true;
        ahcVar.a = colorStateListB;
        return ahcVar;
    }

    public final void b() {
        if (!un.a) {
            this.a.c();
        }
    }

    public final void a(int i, float f) {
        if (!un.a && !this.a.d()) {
            this.a.a(i, f);
        }
    }

    public final void a(int i) {
        acq acqVar = this.a;
        if (acqVar.e()) {
            switch (i) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    acqVar.a = 0;
                    acqVar.d = -1.0f;
                    acqVar.e = -1.0f;
                    acqVar.c = -1.0f;
                    acqVar.f = new int[0];
                    acqVar.b = false;
                    return;
                case 1:
                    DisplayMetrics displayMetrics = acqVar.h.getResources().getDisplayMetrics();
                    acqVar.a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (acqVar.b()) {
                        acqVar.c();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        acq acqVar = this.a;
        if (acqVar.e()) {
            DisplayMetrics displayMetrics = acqVar.h.getResources().getDisplayMetrics();
            acqVar.a(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (acqVar.b()) {
                acqVar.c();
            }
        }
    }

    public final void a(int[] iArr, int i) {
        acq acqVar = this.a;
        if (acqVar.e()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = acqVar.h.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                acqVar.f = acq.a(iArrCopyOf);
                if (!acqVar.a()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                acqVar.g = false;
            }
            if (acqVar.b()) {
                acqVar.c();
            }
        }
    }

    final int c() {
        return this.a.a;
    }

    final int d() {
        return Math.round(this.a.c);
    }

    final int e() {
        return Math.round(this.a.d);
    }

    final int f() {
        return Math.round(this.a.e);
    }

    final int[] g() {
        return this.a.f;
    }
}
