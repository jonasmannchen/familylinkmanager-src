package flm;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pa {
    public final Shader a;
    public int b;
    private final ColorStateList c;

    private pa(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.c = colorStateList;
        this.b = i;
    }

    static pa a(int i) {
        return new pa(null, null, i);
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean b() {
        return this.a == null && this.c != null && this.c.isStateful();
    }

    public final boolean a(int[] iArr) {
        int colorForState;
        if (!b() || (colorForState = this.c.getColorForState(iArr, this.c.getDefaultColor())) == this.b) {
            return false;
        }
        this.b = colorForState;
        return true;
    }

    public final boolean c() {
        return a() || this.b != 0;
    }

    public static pa a(Resources resources, int i, Resources.Theme theme) {
        int next;
        ph phVar;
        Shader sweepGradient;
        int depth;
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
            String name = xml.getName();
            switch (name) {
                case "selector":
                    ColorStateList colorStateListA = oz.a(resources, xml, attributeSetAsAttributeSet, theme);
                    return new pa(null, colorStateListA, colorStateListA.getDefaultColor());
                case "gradient":
                    String name2 = xml.getName();
                    if (!name2.equals("gradient")) {
                        throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                    }
                    TypedArray typedArrayA = pn.a(resources, theme, attributeSetAsAttributeSet, db.w);
                    float fA = pn.a(typedArrayA, (XmlPullParser) xml, "startX", db.I, 0.0f);
                    float fA2 = pn.a(typedArrayA, (XmlPullParser) xml, "startY", db.J, 0.0f);
                    float fA3 = pn.a(typedArrayA, (XmlPullParser) xml, "endX", db.E, 0.0f);
                    float fA4 = pn.a(typedArrayA, (XmlPullParser) xml, "endY", db.F, 0.0f);
                    float fA5 = pn.a(typedArrayA, (XmlPullParser) xml, "centerX", db.B, 0.0f);
                    float fA6 = pn.a(typedArrayA, (XmlPullParser) xml, "centerY", db.C, 0.0f);
                    int iA = pn.a(typedArrayA, (XmlPullParser) xml, "type", db.L, 0);
                    int iB = pn.b(typedArrayA, xml, "startColor", db.H, 0);
                    boolean zA = pn.a(xml, "centerColor");
                    int iB2 = pn.b(typedArrayA, xml, "centerColor", db.A, 0);
                    int iB3 = pn.b(typedArrayA, xml, "endColor", db.D, 0);
                    int iA2 = pn.a(typedArrayA, (XmlPullParser) xml, "tileMode", db.K, 0);
                    float fA7 = pn.a(typedArrayA, (XmlPullParser) xml, "gradientRadius", db.G, 0.0f);
                    typedArrayA.recycle();
                    int depth2 = xml.getDepth() + 1;
                    ArrayList arrayList = new ArrayList(20);
                    ArrayList arrayList2 = new ArrayList(20);
                    while (true) {
                        int next2 = xml.next();
                        if (next2 != 1 && ((depth = xml.getDepth()) >= depth2 || next2 != 3)) {
                            if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                TypedArray typedArrayA2 = pn.a(resources, theme, attributeSetAsAttributeSet, db.x);
                                boolean zHasValue = typedArrayA2.hasValue(db.y);
                                boolean zHasValue2 = typedArrayA2.hasValue(db.z);
                                if (!zHasValue || !zHasValue2) {
                                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                                }
                                int color = typedArrayA2.getColor(db.y, 0);
                                float f = typedArrayA2.getFloat(db.z, 0.0f);
                                typedArrayA2.recycle();
                                arrayList2.add(Integer.valueOf(color));
                                arrayList.add(Float.valueOf(f));
                            }
                        }
                    }
                    ph phVar2 = arrayList2.size() > 0 ? new ph(arrayList2, arrayList) : null;
                    if (phVar2 != null) {
                        phVar = phVar2;
                    } else if (zA) {
                        phVar = new ph(iB, iB2, iB3);
                    } else {
                        phVar = new ph(iB, iB3);
                    }
                    switch (iA) {
                        case 1:
                            if (fA7 <= 0.0f) {
                                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                            }
                            sweepGradient = new RadialGradient(fA5, fA6, fA7, phVar.a, phVar.b, pg.a(iA2));
                            break;
                            break;
                        case 2:
                            sweepGradient = new SweepGradient(fA5, fA6, phVar.a, phVar.b);
                            break;
                        default:
                            sweepGradient = new LinearGradient(fA, fA2, fA3, fA4, phVar.a, phVar.b, pg.a(iA2));
                            break;
                    }
                    return new pa(sweepGradient, null, 0);
                default:
                    throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }
}
