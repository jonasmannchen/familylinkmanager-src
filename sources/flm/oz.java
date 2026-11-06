package flm;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import com.google.android.chimeraresources.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oz {
    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int[] iArr;
        Object[] objArr;
        int i;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int i2 = 0;
        int[] iArr3 = new int[20];
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = db.a;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr4) : theme.obtainStyledAttributes(attributeSet, iArr4, 0, 0);
                int color = typedArrayObtainAttributes.getColor(db.d, -65281);
                float f = 1.0f;
                if (typedArrayObtainAttributes.hasValue(db.c)) {
                    f = typedArrayObtainAttributes.getFloat(db.c, 1.0f);
                } else if (typedArrayObtainAttributes.hasValue(db.b)) {
                    f = typedArrayObtainAttributes.getFloat(db.b, 1.0f);
                }
                typedArrayObtainAttributes.recycle();
                int i3 = 0;
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr5 = new int[attributeCount];
                int i4 = 0;
                while (i4 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == R.attr.alpha) {
                        i = i3;
                    } else {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr5[i3] = attributeNameResource;
                        i = i5;
                    }
                    i4++;
                    i3 = i;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr5, i3);
                int iRound = (16777215 & color) | (Math.round(Color.alpha(color) * f) << 24);
                if (i2 + 1 > iArr3.length) {
                    iArr = new int[pi.a(i2)];
                    System.arraycopy(iArr3, 0, iArr, 0, i2);
                } else {
                    iArr = iArr3;
                }
                iArr[i2] = iRound;
                if (i2 + 1 > iArr2.length) {
                    objArr = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), pi.a(i2));
                    System.arraycopy(iArr2, 0, objArr, 0, i2);
                } else {
                    objArr = iArr2;
                }
                objArr[i2] = iArrTrimStateSet;
                i2++;
                iArr2 = (int[][]) objArr;
                iArr3 = iArr;
            }
        }
        int[] iArr6 = new int[i2];
        int[][] iArr7 = new int[i2][];
        System.arraycopy(iArr3, 0, iArr6, 0, i2);
        System.arraycopy(iArr2, 0, iArr7, 0, i2);
        return new ColorStateList(iArr7, iArr6);
    }
}
