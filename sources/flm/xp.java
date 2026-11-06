package flm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class xp extends yb {
    private xr b;
    private xv c;
    private int d;
    private int e;
    private boolean f;

    public xp() {
        this(null, null);
    }

    xp(xr xrVar, Resources resources) {
        super(null);
        this.d = -1;
        this.e = -1;
        a(new xr(xrVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static xp a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        xp xpVar = new xp();
        xpVar.b(context, resources, xmlPullParser, attributeSet, theme);
        return xpVar;
    }

    @Override // flm.yb
    public final void b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int next;
        int next2;
        TypedArray typedArrayA = pn.a(resources, theme, attributeSet, xl.M);
        setVisible(typedArrayA.getBoolean(xl.S, true), true);
        xr xrVar = this.b;
        xrVar.b |= typedArrayA.getChangingConfigurations();
        xrVar.f = typedArrayA.getBoolean(xl.R, xrVar.f);
        xrVar.i = typedArrayA.getBoolean(xl.N, xrVar.i);
        xrVar.u = typedArrayA.getInt(xl.P, xrVar.u);
        xrVar.v = typedArrayA.getInt(xl.Q, xrVar.v);
        setDither(typedArrayA.getBoolean(xl.O, xrVar.s));
        a(resources);
        typedArrayA.recycle();
        int depth2 = xmlPullParser.getDepth() + 1;
        while (true) {
            int next3 = xmlPullParser.next();
            if (next3 == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next3 == 3)) {
                break;
            }
            if (next3 == 2 && depth <= depth2) {
                if (xmlPullParser.getName().equals("item")) {
                    TypedArray typedArrayA2 = pn.a(resources, theme, attributeSet, xl.T);
                    int resourceId = typedArrayA2.getResourceId(xl.V, 0);
                    Drawable drawableCreateFromXmlInner = null;
                    int resourceId2 = typedArrayA2.getResourceId(xl.U, -1);
                    if (resourceId2 > 0) {
                        drawableCreateFromXmlInner = xn.b(context, resourceId2);
                    }
                    typedArrayA2.recycle();
                    int[] iArrA = a(attributeSet);
                    if (drawableCreateFromXmlInner == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlPullParser.getName().equals("vector")) {
                            drawableCreateFromXmlInner = ik.a(resources, xmlPullParser, attributeSet, theme);
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    if (drawableCreateFromXmlInner == null) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    this.b.a(iArrA, drawableCreateFromXmlInner, resourceId);
                } else if (xmlPullParser.getName().equals("transition")) {
                    TypedArray typedArrayA3 = pn.a(resources, theme, attributeSet, xl.W);
                    int resourceId3 = typedArrayA3.getResourceId(xl.Y, -1);
                    int resourceId4 = typedArrayA3.getResourceId(xl.aa, -1);
                    Drawable drawableCreateFromXmlInner2 = null;
                    int resourceId5 = typedArrayA3.getResourceId(xl.X, -1);
                    if (resourceId5 > 0) {
                        drawableCreateFromXmlInner2 = xn.b(context, resourceId5);
                    }
                    boolean z = typedArrayA3.getBoolean(xl.Z, false);
                    typedArrayA3.recycle();
                    if (drawableCreateFromXmlInner2 == null) {
                        do {
                            next2 = xmlPullParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlPullParser.getName().equals("animated-vector")) {
                            drawableCreateFromXmlInner2 = ib.a(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            drawableCreateFromXmlInner2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            drawableCreateFromXmlInner2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    if (drawableCreateFromXmlInner2 == null) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    if (resourceId3 == -1 || resourceId4 == -1) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                    }
                    this.b.a(resourceId3, resourceId4, drawableCreateFromXmlInner2, z);
                } else {
                    continue;
                }
            }
        }
        onStateChange(getState());
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.c != null && (visible || z2)) {
            if (z) {
                this.c.a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // flm.yb, flm.xw, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        if (this.c != null) {
            this.c.b();
            this.c = null;
            a(this.d);
            this.d = -1;
            this.e = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    @Override // flm.yb, flm.xw, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z;
        int i;
        boolean z2;
        xv xqVar;
        int iA = this.b.a(iArr);
        if (iA != this.a) {
            xv xvVar = this.c;
            if (xvVar != null) {
                if (iA == this.d) {
                    z2 = true;
                } else if (iA == this.e && xvVar.c()) {
                    xvVar.d();
                    this.d = this.e;
                    this.e = iA;
                    z2 = true;
                } else {
                    int i2 = this.d;
                    xvVar.b();
                    i = i2;
                }
                if (!z2 || a(iA)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                i = this.a;
            }
            this.c = null;
            this.e = -1;
            this.d = -1;
            xr xrVar = this.b;
            int iA2 = xrVar.a(i);
            int iA3 = xrVar.a(iA);
            if (iA3 == 0 || iA2 == 0) {
                z2 = false;
            } else {
                int iLongValue = (int) ((Long) xrVar.a.a(xr.a(iA2, iA3), -1L)).longValue();
                if (iLongValue < 0) {
                    z2 = false;
                } else {
                    boolean z3 = (((Long) xrVar.a.a(xr.a(iA2, iA3), -1L)).longValue() & 8589934592L) != 0;
                    a(iLongValue);
                    Object current = getCurrent();
                    if (current instanceof AnimationDrawable) {
                        xqVar = new xt((AnimationDrawable) current, (((Long) xrVar.a.a(xr.a(iA2, iA3), -1L)).longValue() & 4294967296L) != 0, z3);
                    } else if (current instanceof ib) {
                        xqVar = new xs((ib) current);
                    } else if (current instanceof Animatable) {
                        xqVar = new xq((Animatable) current);
                    } else {
                        z2 = false;
                    }
                    xqVar.a();
                    this.c = xqVar;
                    this.e = i;
                    this.d = iA;
                    z2 = true;
                }
            }
            if (z2) {
            }
            z = true;
        } else {
            z = false;
        }
        Drawable current2 = getCurrent();
        if (current2 != null) {
            return z | current2.setState(iArr);
        }
        return z;
    }

    @Override // flm.yb, flm.xw, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            this.b.a();
            this.f = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.yb, flm.xw
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xr b() {
        return new xr(this.b, this, null);
    }

    @Override // flm.yb, flm.xw
    protected final void a(xz xzVar) {
        super.a(xzVar);
        if (xzVar instanceof xr) {
            this.b = (xr) xzVar;
        }
    }

    @Override // flm.yb, flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // flm.xw, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    static {
        xp.class.getSimpleName();
    }
}
