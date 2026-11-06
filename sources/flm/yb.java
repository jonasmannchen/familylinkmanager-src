package flm;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class yb extends xw {
    private yc b;
    private boolean c;

    yb() {
        this(null, null);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iB = this.b.b(iArr);
        if (iB < 0) {
            iB = this.b.b(StateSet.WILD_CARD);
        }
        return a(iB) || zOnStateChange;
    }

    public void b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int next;
        TypedArray typedArrayA = pn.a(resources, theme, attributeSet, xl.ci);
        setVisible(typedArrayA.getBoolean(xl.cq, true), true);
        yc ycVar = this.b;
        ycVar.b |= typedArrayA.getChangingConfigurations();
        ycVar.f = typedArrayA.getBoolean(xl.cp, ycVar.f);
        ycVar.i = typedArrayA.getBoolean(xl.cl, ycVar.i);
        ycVar.u = typedArrayA.getInt(xl.cn, ycVar.u);
        ycVar.v = typedArrayA.getInt(xl.co, ycVar.v);
        ycVar.s = typedArrayA.getBoolean(xl.cm, ycVar.s);
        a(resources);
        typedArrayA.recycle();
        yc ycVar2 = this.b;
        int depth2 = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayA2 = pn.a(resources, theme, attributeSet, xl.cj);
                Drawable drawableCreateFromXmlInner = null;
                int resourceId = typedArrayA2.getResourceId(xl.ck, -1);
                if (resourceId > 0) {
                    drawableCreateFromXmlInner = xn.b(context, resourceId);
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
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                    } else {
                        drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                    }
                }
                ycVar2.a(iArrA, drawableCreateFromXmlInner);
            }
        }
        onStateChange(getState());
    }

    static int[] a(AttributeSet attributeSet) {
        int i;
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i2 = 0;
        int i3 = 0;
        while (i2 < attributeCount) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            switch (attributeNameResource) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    i = i3;
                    break;
                case R.attr.id:
                case R.attr.drawable:
                    i = i3;
                    break;
                default:
                    int i4 = i3 + 1;
                    if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                        attributeNameResource = -attributeNameResource;
                    }
                    iArr[i3] = attributeNameResource;
                    i = i4;
                    break;
            }
            i2++;
            i3 = i;
        }
        return StateSet.trimStateSet(iArr, i3);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.c && super.mutate() == this) {
            this.b.a();
            this.c = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // flm.xw
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yc b() {
        return new yc(this.b, this, null);
    }

    @Override // flm.xw, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // flm.xw
    protected void a(xz xzVar) {
        super.a(xzVar);
        if (xzVar instanceof yc) {
            this.b = (yc) xzVar;
        }
    }

    yb(yc ycVar, Resources resources) {
        a(new yc(ycVar, this, resources));
        onStateChange(getState());
    }

    yb(yc ycVar) {
    }
}
