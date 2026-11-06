package flm;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pj {
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, pk pkVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceA = a(context, resources, typedValue, i, i2, pkVar, handler, z);
        if (typefaceA == null && pkVar == null) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return typefaceA;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    private static Typeface a(Context context, Resources resources, TypedValue typedValue, int i, int i2, pk pkVar, Handler handler, boolean z) {
        int next;
        pc pdVar;
        if (typedValue.string == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = typedValue.string.toString();
        if (!string.startsWith("res/")) {
            if (pkVar != null) {
                pkVar.a(-3, handler);
            }
            return null;
        }
        Typeface typeface = (Typeface) ps.b.get(ps.a(resources, i, i2));
        if (typeface != null) {
            if (pkVar != null) {
                pkVar.a(typeface, handler);
                return typeface;
            }
            return typeface;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                XmlResourceParser xml = resources.getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                xml.require(2, null, "font-family");
                if (xml.getName().equals("font-family")) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), db.e);
                    String string2 = typedArrayObtainAttributes.getString(db.q);
                    String string3 = typedArrayObtainAttributes.getString(db.u);
                    String string4 = typedArrayObtainAttributes.getString(db.v);
                    int resourceId = typedArrayObtainAttributes.getResourceId(db.r, 0);
                    int integer = typedArrayObtainAttributes.getInteger(db.s, 1);
                    int integer2 = typedArrayObtainAttributes.getInteger(db.t, 500);
                    typedArrayObtainAttributes.recycle();
                    if (string2 != null && string3 != null && string4 != null) {
                        while (xml.next() != 3) {
                            pb.a(xml);
                        }
                        pdVar = new pf(new qt(string2, string3, string4, pb.a(resources, resourceId)), integer, integer2);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        while (xml.next() != 3) {
                            if (xml.getEventType() == 2) {
                                if (xml.getName().equals("font")) {
                                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xml), db.f);
                                    int i3 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(db.o) ? db.o : db.j, 400);
                                    boolean z2 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(db.m) ? db.m : db.h, 0);
                                    int i4 = typedArrayObtainAttributes2.hasValue(db.p) ? db.p : db.k;
                                    String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(db.n) ? db.n : db.i);
                                    int i5 = typedArrayObtainAttributes2.getInt(i4, 0);
                                    int i6 = typedArrayObtainAttributes2.hasValue(db.l) ? db.l : db.g;
                                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i6, 0);
                                    String string6 = typedArrayObtainAttributes2.getString(i6);
                                    typedArrayObtainAttributes2.recycle();
                                    while (xml.next() != 3) {
                                        pb.a(xml);
                                    }
                                    arrayList.add(new pe(string6, i3, z2, string5, i5, resourceId2));
                                } else {
                                    pb.a(xml);
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            pdVar = null;
                        } else {
                            pdVar = new pd((pe[]) arrayList.toArray(new pe[arrayList.size()]));
                        }
                    }
                } else {
                    pb.a(xml);
                    pdVar = null;
                }
                if (pdVar == null) {
                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                    if (pkVar != null) {
                        pkVar.a(-3, handler);
                    }
                    return null;
                }
                return ps.a(context, pdVar, resources, i, i2, pkVar, handler, z);
            }
            Typeface typefaceA = ps.a(context, resources, i, string, i2);
            if (pkVar != null) {
                if (typefaceA != null) {
                    pkVar.a(typefaceA, handler);
                    return typefaceA;
                }
                pkVar.a(-3, handler);
                return typefaceA;
            }
            return typefaceA;
        } catch (IOException e) {
            Log.e("ResourcesCompat", "Failed to read xml resource " + string, e);
            if (pkVar != null) {
                pkVar.a(-3, handler);
            }
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("ResourcesCompat", "Failed to parse xml resource " + string, e2);
            if (pkVar != null) {
                pkVar.a(-3, handler);
            }
            return null;
        }
    }
}
