package flm;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.chimera.Activity;
import java.io.PrintStream;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ccb {
    private static final ThreadLocal b = new ThreadLocal();
    public Activity a;
    private cci c;

    public ccb(Activity activity, cci cciVar) {
        this.a = activity;
        this.c = cciVar;
    }

    public final cbx a(int i) {
        int next;
        Resources resources = this.a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    String resourceName = resources.getResourceName(i);
                    throw new RuntimeException(new StringBuilder(String.valueOf(resourceName).length() + 37).append("Exception inflating ").append(resourceName).append(" line ").append(xml.getLineNumber()).toString(), e);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        PrintStream printStream = System.out;
        String strValueOf = String.valueOf(name);
        printStream.println(strValueOf.length() != 0 ? "usp:".concat(strValueOf) : new String("usp:"));
        cbw cbwVarA = a(resources, xml, attributeSetAsAttributeSet);
        if (!(cbwVarA instanceof cbx)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(name).length() + 47).append("Root element <").append(name).append("> did not inflate into a NavGraph").toString());
        }
        cbx cbxVar = (cbx) cbwVarA;
        xml.close();
        return cbxVar;
    }

    private final cbw a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet) throws XmlPullParserException {
        int depth;
        String name = xmlResourceParser.getName();
        ccf ccfVarA = this.c.a(xmlResourceParser.getName());
        if (ccfVarA == null) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(name).length() + 88).append("Could not inflate ").append(name).append(". You must call NavController.addNavigator() for each navigation type.").toString());
        }
        cbw cbwVarB = ccfVarA.b();
        cbwVarB.a(this.a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1 && ((depth = xmlResourceParser.getDepth()) >= depth2 || next != 3)) {
                if (next == 2 && depth <= depth2) {
                    String name2 = xmlResourceParser.getName();
                    if ("argument".equals(name2)) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, alg.t);
                        String string = typedArrayObtainAttributes.getString(alg.v);
                        TypedValue typedValue = (TypedValue) b.get();
                        if (typedValue == null) {
                            typedValue = new TypedValue();
                            b.set(typedValue);
                        }
                        if (typedArrayObtainAttributes.getValue(alg.u, typedValue)) {
                            switch (typedValue.type) {
                                case 1:
                                    cbwVarB.a().putInt(string, typedValue.data);
                                    break;
                                case 2:
                                default:
                                    if (typedValue.type >= 16 && typedValue.type <= 31) {
                                        cbwVarB.a().putInt(string, typedValue.data);
                                    } else {
                                        throw new XmlPullParserException(new StringBuilder(37).append("unsupported argument type ").append(typedValue.type).toString());
                                    }
                                    break;
                                case 3:
                                    cbwVarB.a().putString(string, typedValue.string.toString());
                                    break;
                                case 4:
                                    cbwVarB.a().putFloat(string, typedValue.getFloat());
                                    break;
                                case 5:
                                    cbwVarB.a().putInt(string, (int) typedValue.getDimension(resources.getDisplayMetrics()));
                                    break;
                            }
                        }
                        typedArrayObtainAttributes.recycle();
                    } else if ("action".equals(name2)) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, alg.h);
                        int resourceId = typedArrayObtainAttributes2.getResourceId(alg.i, 0);
                        cbs cbsVar = new cbs(typedArrayObtainAttributes2.getResourceId(alg.k, 0));
                        ccd ccdVar = new ccd();
                        if (typedArrayObtainAttributes2.getBoolean(alg.o, false)) {
                            ccdVar.a |= 1;
                        } else {
                            ccdVar.a &= -2;
                        }
                        if (typedArrayObtainAttributes2.getBoolean(alg.n, false)) {
                            ccdVar.a |= 2;
                        } else {
                            ccdVar.a &= -3;
                        }
                        if (typedArrayObtainAttributes2.getBoolean(alg.j, false)) {
                            ccdVar.a |= 4;
                        } else {
                            ccdVar.a &= -5;
                        }
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(alg.r, 0);
                        boolean z = typedArrayObtainAttributes2.getBoolean(alg.s, false);
                        ccdVar.b = resourceId2;
                        ccdVar.c = z;
                        ccdVar.d = typedArrayObtainAttributes2.getResourceId(alg.l, -1);
                        ccdVar.e = typedArrayObtainAttributes2.getResourceId(alg.m, -1);
                        ccdVar.f = typedArrayObtainAttributes2.getResourceId(alg.p, -1);
                        ccdVar.g = typedArrayObtainAttributes2.getResourceId(alg.q, -1);
                        cbsVar.b = new ccc(ccdVar.a, ccdVar.b, ccdVar.c, ccdVar.d, ccdVar.e, ccdVar.f, ccdVar.g);
                        if (resourceId == 0) {
                            throw new IllegalArgumentException("Cannot have an action with actionId 0");
                        }
                        if (cbwVarB.f == null) {
                            cbwVarB.f = new sp();
                        }
                        cbwVarB.f.b(resourceId, cbsVar);
                        typedArrayObtainAttributes2.recycle();
                    } else if ("include".equals(name2) && (cbwVarB instanceof cbx)) {
                        TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, alg.B);
                        ((cbx) cbwVarB).a(a(typedArrayObtainAttributes3.getResourceId(alg.C, 0)));
                        typedArrayObtainAttributes3.recycle();
                    } else if (cbwVarB instanceof cbx) {
                        ((cbx) cbwVarB).a(a(resources, xmlResourceParser, attributeSet));
                    }
                }
            }
        }
        return cbwVarB;
    }
}
