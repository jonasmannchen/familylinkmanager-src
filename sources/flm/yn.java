package flm;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class yn extends MenuInflater {
    public static final Class[] a;
    public static final Class[] b;
    public final Object[] c;
    public final Object[] d;
    public Context e;
    public Object f;

    public yn(Context context) {
        super(context);
        this.e = context;
        this.c = new Object[]{context};
        this.d = this.c;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof qi)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                layout = this.e.getResources().getLayout(i);
                a(layout, Xml.asAttributeSet(layout), menu);
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    private final void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        boolean z;
        String str;
        boolean z2;
        yp ypVar = new yp(this, menu);
        int eventType = xmlPullParser.getEventType();
        boolean z3 = false;
        String str2 = null;
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z4 = false;
        while (!z4) {
            switch (eventType) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (!z3) {
                        String name2 = xmlPullParser.getName();
                        if (name2.equals("group")) {
                            TypedArray typedArrayObtainStyledAttributes = ypVar.F.e.obtainStyledAttributes(attributeSet, xl.bm);
                            ypVar.b = typedArrayObtainStyledAttributes.getResourceId(xl.bp, 0);
                            ypVar.c = typedArrayObtainStyledAttributes.getInt(xl.bq, 0);
                            ypVar.d = typedArrayObtainStyledAttributes.getInt(xl.br, 0);
                            ypVar.e = typedArrayObtainStyledAttributes.getInt(xl.bn, 0);
                            ypVar.f = typedArrayObtainStyledAttributes.getBoolean(xl.bs, true);
                            ypVar.g = typedArrayObtainStyledAttributes.getBoolean(xl.bo, true);
                            typedArrayObtainStyledAttributes.recycle();
                            z = z4;
                            str = str2;
                            z2 = z3;
                            continue;
                        } else if (name2.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = ypVar.F.e.obtainStyledAttributes(attributeSet, xl.bt);
                            ypVar.i = typedArrayObtainStyledAttributes2.getResourceId(xl.bD, 0);
                            ypVar.j = (typedArrayObtainStyledAttributes2.getInt(xl.bE, ypVar.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(xl.bH, ypVar.d) & 65535);
                            ypVar.k = typedArrayObtainStyledAttributes2.getText(xl.bI);
                            ypVar.l = typedArrayObtainStyledAttributes2.getText(xl.bJ);
                            ypVar.m = typedArrayObtainStyledAttributes2.getResourceId(xl.bC, 0);
                            ypVar.n = yp.a(typedArrayObtainStyledAttributes2.getString(xl.by));
                            ypVar.o = typedArrayObtainStyledAttributes2.getInt(xl.bx, 4096);
                            ypVar.p = yp.a(typedArrayObtainStyledAttributes2.getString(xl.bF));
                            ypVar.q = typedArrayObtainStyledAttributes2.getInt(xl.bO, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(xl.bz)) {
                                ypVar.r = typedArrayObtainStyledAttributes2.getBoolean(xl.bz, false) ? 1 : 0;
                            } else {
                                ypVar.r = ypVar.e;
                            }
                            ypVar.s = typedArrayObtainStyledAttributes2.getBoolean(xl.bA, false);
                            ypVar.t = typedArrayObtainStyledAttributes2.getBoolean(xl.bK, ypVar.f);
                            ypVar.u = typedArrayObtainStyledAttributes2.getBoolean(xl.bB, ypVar.g);
                            ypVar.v = typedArrayObtainStyledAttributes2.getInt(xl.bP, -1);
                            ypVar.z = typedArrayObtainStyledAttributes2.getString(xl.bG);
                            ypVar.w = typedArrayObtainStyledAttributes2.getResourceId(xl.bu, 0);
                            ypVar.x = typedArrayObtainStyledAttributes2.getString(xl.bw);
                            ypVar.y = typedArrayObtainStyledAttributes2.getString(xl.bv);
                            boolean z5 = ypVar.y != null;
                            if (z5 && ypVar.w == 0 && ypVar.x == null) {
                                ypVar.A = (sw) ypVar.a(ypVar.y, b, ypVar.F.d);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                ypVar.A = null;
                            }
                            ypVar.B = typedArrayObtainStyledAttributes2.getText(xl.bL);
                            ypVar.C = typedArrayObtainStyledAttributes2.getText(xl.bQ);
                            if (typedArrayObtainStyledAttributes2.hasValue(xl.bN)) {
                                ypVar.E = adn.a(typedArrayObtainStyledAttributes2.getInt(xl.bN, -1), ypVar.E);
                            } else {
                                ypVar.E = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(xl.bM)) {
                                ypVar.D = typedArrayObtainStyledAttributes2.getColorStateList(xl.bM);
                            } else {
                                ypVar.D = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            ypVar.h = false;
                            z = z4;
                            str = str2;
                            z2 = z3;
                        } else if (name2.equals("menu")) {
                            a(xmlPullParser, attributeSet, ypVar.b());
                            z = z4;
                            str = str2;
                            z2 = z3;
                        } else {
                            z2 = true;
                            boolean z6 = z4;
                            str = name2;
                            z = z6;
                        }
                    }
                    boolean z7 = z;
                    eventType = xmlPullParser.next();
                    z3 = z2;
                    str2 = str;
                    z4 = z7;
                    break;
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (z3 && name3.equals(str2)) {
                        z2 = false;
                        boolean z8 = z4;
                        str = null;
                        z = z8;
                    } else if (name3.equals("group")) {
                        ypVar.a();
                        z = z4;
                        str = str2;
                        z2 = z3;
                    } else if (name3.equals("item")) {
                        if (!ypVar.h) {
                            if (ypVar.A != null && ypVar.A.e()) {
                                ypVar.b();
                                z = z4;
                                str = str2;
                                z2 = z3;
                            } else {
                                ypVar.h = true;
                                ypVar.a(ypVar.a.add(ypVar.b, ypVar.i, ypVar.j, ypVar.k));
                                z = z4;
                                str = str2;
                                z2 = z3;
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                        str = str2;
                        z2 = z3;
                    }
                    boolean z9 = z;
                    eventType = xmlPullParser.next();
                    z3 = z2;
                    str2 = str;
                    z4 = z9;
                    break;
            }
            z = z4;
            str = str2;
            z2 = z3;
            boolean z10 = z;
            eventType = xmlPullParser.next();
            z3 = z2;
            str2 = str;
            z4 = z10;
        }
    }

    final Object a(Object obj) {
        Object baseContext = obj;
        while (!(baseContext instanceof Activity) && (baseContext instanceof ContextWrapper)) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return baseContext;
    }

    static {
        Class[] clsArr = {Context.class};
        a = clsArr;
        b = clsArr;
    }
}
