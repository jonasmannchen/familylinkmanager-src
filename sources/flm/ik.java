package flm;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ik extends ij {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public boolean c;
    private ir d;
    private PorterDuffColorFilter e;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    ik() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.d = new ir();
    }

    ik(ir irVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.d = irVar;
        this.e = a(irVar.c, irVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        } else if (!this.g && super.mutate() == this) {
            this.d = new ir(this.d);
            this.g = true;
        }
        return this;
    }

    final Object a(String str) {
        return this.d.b.k.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.b != null && Build.VERSION.SDK_INT >= 24) {
            return new is(this.b.getConstantState());
        }
        this.d.a = getChangingConfigurations();
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() > 0 && this.j.height() > 0) {
            ColorFilter colorFilter = this.f == null ? this.e : this.f;
            canvas.getMatrix(this.i);
            this.i.getValues(this.h);
            float fAbs = Math.abs(this.h[0]);
            float fAbs2 = Math.abs(this.h[4]);
            float fAbs3 = Math.abs(this.h[1]);
            float fAbs4 = Math.abs(this.h[3]);
            if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
                fAbs2 = 1.0f;
                fAbs = 1.0f;
            }
            int iWidth = (int) (fAbs * this.j.width());
            int iHeight = (int) (fAbs2 * this.j.height());
            int iMin = Math.min(2048, iWidth);
            int iMin2 = Math.min(2048, iHeight);
            if (iMin > 0 && iMin2 > 0) {
                int iSave = canvas.save();
                canvas.translate(this.j.left, this.j.top);
                if (isAutoMirrored() && qc.f(this) == 1) {
                    canvas.translate(this.j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.j.offsetTo(0, 0);
                ir irVar = this.d;
                if (irVar.f != null) {
                    if (!(iMin == irVar.f.getWidth() && iMin2 == irVar.f.getHeight())) {
                        irVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                        irVar.k = true;
                    }
                } else {
                    irVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                    irVar.k = true;
                }
                if (!this.c) {
                    this.d.a(iMin, iMin2);
                } else {
                    ir irVar2 = this.d;
                    if (!(!irVar2.k && irVar2.g == irVar2.c && irVar2.h == irVar2.d && irVar2.j == irVar2.e && irVar2.i == irVar2.b.getRootAlpha())) {
                        this.d.a(iMin, iMin2);
                        ir irVar3 = this.d;
                        irVar3.g = irVar3.c;
                        irVar3.h = irVar3.d;
                        irVar3.i = irVar3.b.getRootAlpha();
                        irVar3.j = irVar3.e;
                        irVar3.k = false;
                    }
                }
                ir irVar4 = this.d;
                Rect rect = this.j;
                if (!(irVar4.b.getRootAlpha() < 255) && colorFilter == null) {
                    paint = null;
                } else {
                    if (irVar4.l == null) {
                        irVar4.l = new Paint();
                        irVar4.l.setFilterBitmap(true);
                    }
                    irVar4.l.setAlpha(irVar4.b.getRootAlpha());
                    irVar4.l.setColorFilter(colorFilter);
                    paint = irVar4.l;
                }
                canvas.drawBitmap(irVar4.f, (Rect) null, rect, paint);
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b != null ? qc.b(this.b) : this.d.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else if (this.d.b.getRootAlpha() != i) {
            this.d.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    private final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        if (this.b != null) {
            qc.a(this.b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            qc.a(this.b, colorStateList);
            return;
        }
        ir irVar = this.d;
        if (irVar.c != colorStateList) {
            irVar.c = colorStateList;
            this.e = a(colorStateList, irVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.b != null) {
            qc.a(this.b, mode);
            return;
        }
        ir irVar = this.d;
        if (irVar.d != mode) {
            irVar.d = mode;
            this.e = a(irVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        if (!super.isStateful()) {
            if (this.d != null) {
                iq iqVar = this.d.b;
                if (iqVar.j == null) {
                    iqVar.j = Boolean.valueOf(iqVar.d.b());
                }
                if (iqVar.j.booleanValue() || (this.d.c != null && this.d.c.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        boolean z = false;
        ir irVar = this.d;
        if (irVar.c != null && irVar.d != null) {
            this.e = a(irVar.c, irVar.d);
            invalidateSelf();
            z = true;
        }
        iq iqVar = irVar.b;
        if (iqVar.j == null) {
            iqVar.j = Boolean.valueOf(iqVar.d.b());
        }
        if (iqVar.j.booleanValue()) {
            boolean zA = irVar.b.d.a(iArr);
            irVar.k |= zA;
            if (zA) {
                invalidateSelf();
                return true;
            }
            return z;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b != null ? this.b.getIntrinsicWidth() : (int) this.d.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b != null ? this.b.getIntrinsicHeight() : (int) this.d.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        if (this.b != null) {
            qc.c(this.b);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.b != null ? qc.a(this.b) : this.d.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        if (this.b != null) {
            qc.a(this.b, z);
        } else {
            this.d.e = z;
        }
    }

    public static ik a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            ik ikVar = new ik();
            ikVar.b = resources.getDrawable(i, theme);
            new is(ikVar.b.getConstantState());
            return ikVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return a(resources, xml, attributeSetAsAttributeSet, theme);
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static ik a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ik ikVar = new ik();
        ikVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return ikVar;
    }

    static int a(int i, float f) {
        return (((int) (Color.alpha(i) * f)) << 24) | (16777215 & i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        boolean z;
        if (this.b != null) {
            qc.a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        ir irVar = this.d;
        irVar.b = new iq();
        TypedArray typedArrayA = pn.a(resources, theme, attributeSet, ia.a);
        ir irVar2 = this.d;
        iq iqVar = irVar2.b;
        int iA = pn.a(typedArrayA, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        switch (iA) {
            case 3:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 9:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 14:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 15:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 16:
                mode = PorterDuff.Mode.ADD;
                break;
        }
        irVar2.d = mode;
        ColorStateList colorStateList = typedArrayA.getColorStateList(1);
        if (colorStateList != null) {
            irVar2.c = colorStateList;
        }
        boolean z2 = irVar2.e;
        if (pn.a(xmlPullParser, "autoMirrored")) {
            z2 = typedArrayA.getBoolean(5, z2);
        }
        irVar2.e = z2;
        iqVar.g = pn.a(typedArrayA, xmlPullParser, "viewportWidth", 7, iqVar.g);
        iqVar.h = pn.a(typedArrayA, xmlPullParser, "viewportHeight", 8, iqVar.h);
        if (iqVar.g <= 0.0f) {
            throw new XmlPullParserException(typedArrayA.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (iqVar.h <= 0.0f) {
            throw new XmlPullParserException(typedArrayA.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        iqVar.e = typedArrayA.getDimension(3, iqVar.e);
        iqVar.f = typedArrayA.getDimension(2, iqVar.f);
        if (iqVar.e <= 0.0f) {
            throw new XmlPullParserException(typedArrayA.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (iqVar.f <= 0.0f) {
            throw new XmlPullParserException(typedArrayA.getPositionDescription() + "<vector> tag requires height > 0");
        }
        iqVar.setAlpha(pn.a(typedArrayA, xmlPullParser, "alpha", 4, iqVar.getAlpha()));
        String string = typedArrayA.getString(0);
        if (string != null) {
            iqVar.i = string;
            iqVar.k.put(string, iqVar);
        }
        typedArrayA.recycle();
        irVar.a = getChangingConfigurations();
        irVar.k = true;
        ir irVar3 = this.d;
        iq iqVar2 = irVar3.b;
        boolean z3 = true;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(iqVar2.d);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                in inVar = (in) arrayDeque.peek();
                if ("path".equals(name)) {
                    im imVar = new im();
                    TypedArray typedArrayA2 = pn.a(resources, theme, attributeSet, ia.c);
                    imVar.a = null;
                    if (pn.a(xmlPullParser, "pathData")) {
                        String string2 = typedArrayA2.getString(0);
                        if (string2 != null) {
                            imVar.o = string2;
                        }
                        String string3 = typedArrayA2.getString(2);
                        if (string3 != null) {
                            imVar.n = pp.b(string3);
                        }
                        imVar.d = pn.a(typedArrayA2, xmlPullParser, theme, "fillColor", 1, 0);
                        imVar.g = pn.a(typedArrayA2, xmlPullParser, "fillAlpha", 12, imVar.g);
                        int iA2 = pn.a(typedArrayA2, xmlPullParser, "strokeLineCap", 8, -1);
                        Paint.Cap cap = imVar.k;
                        switch (iA2) {
                            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                cap = Paint.Cap.BUTT;
                                break;
                            case 1:
                                cap = Paint.Cap.ROUND;
                                break;
                            case 2:
                                cap = Paint.Cap.SQUARE;
                                break;
                        }
                        imVar.k = cap;
                        int iA3 = pn.a(typedArrayA2, xmlPullParser, "strokeLineJoin", 9, -1);
                        Paint.Join join = imVar.l;
                        switch (iA3) {
                            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                join = Paint.Join.MITER;
                                break;
                            case 1:
                                join = Paint.Join.ROUND;
                                break;
                            case 2:
                                join = Paint.Join.BEVEL;
                                break;
                        }
                        imVar.l = join;
                        imVar.m = pn.a(typedArrayA2, xmlPullParser, "strokeMiterLimit", 10, imVar.m);
                        imVar.b = pn.a(typedArrayA2, xmlPullParser, theme, "strokeColor", 3, 0);
                        imVar.e = pn.a(typedArrayA2, xmlPullParser, "strokeAlpha", 11, imVar.e);
                        imVar.c = pn.a(typedArrayA2, xmlPullParser, "strokeWidth", 4, imVar.c);
                        imVar.i = pn.a(typedArrayA2, xmlPullParser, "trimPathEnd", 6, imVar.i);
                        imVar.j = pn.a(typedArrayA2, xmlPullParser, "trimPathOffset", 7, imVar.j);
                        imVar.h = pn.a(typedArrayA2, xmlPullParser, "trimPathStart", 5, imVar.h);
                        imVar.f = pn.a(typedArrayA2, xmlPullParser, "fillType", 13, imVar.f);
                    }
                    typedArrayA2.recycle();
                    inVar.b.add(imVar);
                    if (imVar.getPathName() != null) {
                        iqVar2.k.put(imVar.getPathName(), imVar);
                    }
                    z = false;
                    irVar3.a |= imVar.p;
                } else if ("clip-path".equals(name)) {
                    il ilVar = new il();
                    if (pn.a(xmlPullParser, "pathData")) {
                        TypedArray typedArrayA3 = pn.a(resources, theme, attributeSet, ia.d);
                        String string4 = typedArrayA3.getString(0);
                        if (string4 != null) {
                            ilVar.o = string4;
                        }
                        String string5 = typedArrayA3.getString(1);
                        if (string5 != null) {
                            ilVar.n = pp.b(string5);
                        }
                        typedArrayA3.recycle();
                    }
                    inVar.b.add(ilVar);
                    if (ilVar.getPathName() != null) {
                        iqVar2.k.put(ilVar.getPathName(), ilVar);
                    }
                    irVar3.a = ilVar.p | irVar3.a;
                    z = z3;
                } else {
                    if ("group".equals(name)) {
                        in inVar2 = new in();
                        TypedArray typedArrayA4 = pn.a(resources, theme, attributeSet, ia.b);
                        inVar2.l = null;
                        inVar2.c = pn.a(typedArrayA4, xmlPullParser, "rotation", 5, inVar2.c);
                        inVar2.d = typedArrayA4.getFloat(1, inVar2.d);
                        inVar2.e = typedArrayA4.getFloat(2, inVar2.e);
                        inVar2.f = pn.a(typedArrayA4, xmlPullParser, "scaleX", 3, inVar2.f);
                        inVar2.g = pn.a(typedArrayA4, xmlPullParser, "scaleY", 4, inVar2.g);
                        inVar2.h = pn.a(typedArrayA4, xmlPullParser, "translateX", 6, inVar2.h);
                        inVar2.i = pn.a(typedArrayA4, xmlPullParser, "translateY", 7, inVar2.i);
                        String string6 = typedArrayA4.getString(0);
                        if (string6 != null) {
                            inVar2.m = string6;
                        }
                        inVar2.a();
                        typedArrayA4.recycle();
                        inVar.b.add(inVar2);
                        arrayDeque.push(inVar2);
                        if (inVar2.getGroupName() != null) {
                            iqVar2.k.put(inVar2.getGroupName(), inVar2);
                        }
                        irVar3.a = inVar2.k | irVar3.a;
                    }
                    z = z3;
                }
            } else {
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
                z = z3;
            }
            z3 = z;
            eventType = xmlPullParser.next();
        }
        if (z3) {
            throw new XmlPullParserException("no path defined");
        }
        this.e = a(irVar.c, irVar.d);
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.b != null ? this.b.getChangingConfigurations() : super.getChangingConfigurations() | this.d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return this.b != null ? this.b.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // flm.ij, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }
}
