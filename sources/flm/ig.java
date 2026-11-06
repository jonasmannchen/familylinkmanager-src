package flm;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ig {
    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser animation = null;
        try {
            try {
                animation = resources.getAnimation(i);
                Animator animatorA = a(context, resources, theme, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
                if (animation != null) {
                    animation.close();
                }
                return animatorA;
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (animation != null) {
                animation.close();
            }
            throw th;
        }
    }

    private static PropertyValuesHolder a(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolderOfInt;
        int color;
        int color2;
        int color3;
        float dimension;
        float dimension2;
        float dimension3;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i5 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            if ((z && a(i4)) || (z2 && a(i5))) {
                i = 3;
            } else {
                i = 0;
            }
        }
        boolean z3 = i == 0;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            pr[] prVarArrB = pp.b(string);
            pr[] prVarArrB2 = pp.b(string2);
            if (prVarArrB != null || prVarArrB2 != null) {
                if (prVarArrB != null) {
                    ih ihVar = new ih();
                    if (prVarArrB2 == null) {
                        return PropertyValuesHolder.ofObject(str, ihVar, prVarArrB);
                    }
                    if (pp.a(prVarArrB, prVarArrB2)) {
                        return PropertyValuesHolder.ofObject(str, ihVar, prVarArrB, prVarArrB2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (prVarArrB2 != null) {
                    return PropertyValuesHolder.ofObject(str, new ih(), prVarArrB2);
                }
            }
            return null;
        }
        ii iiVar = null;
        if (i == 3) {
            iiVar = ii.a;
        }
        if (z3) {
            if (z) {
                if (i4 == 5) {
                    dimension2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    dimension2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i5 == 5) {
                        dimension3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        dimension3 = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension2, dimension3);
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension2);
                }
            } else {
                if (i5 == 5) {
                    dimension = typedArray.getDimension(i3, 0.0f);
                } else {
                    dimension = typedArray.getFloat(i3, 0.0f);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension);
            }
        } else if (z) {
            if (i4 == 5) {
                color2 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (a(i4)) {
                color2 = typedArray.getColor(i2, 0);
            } else {
                color2 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    color3 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (a(i5)) {
                    color3 = typedArray.getColor(i3, 0);
                } else {
                    color3 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (!z2) {
            propertyValuesHolderOfInt = null;
        } else {
            if (i5 == 5) {
                color = (int) typedArray.getDimension(i3, 0.0f);
            } else if (a(i5)) {
                color = typedArray.getColor(i3, 0);
            } else {
                color = typedArray.getInt(i3, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt != null && iiVar != null) {
            propertyValuesHolderOfInt.setEvaluator(iiVar);
            return propertyValuesHolderOfInt;
        }
        return propertyValuesHolderOfInt;
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) throws XmlPullParserException, IOException {
        PropertyValuesHolder[] propertyValuesHolderArr;
        boolean z;
        PropertyValuesHolder propertyValuesHolderA;
        int size;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        Animator animatorA = null;
        ArrayList arrayList2 = null;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        ObjectAnimator objectAnimator = new ObjectAnimator();
                        a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
                        z = false;
                        animatorA = objectAnimator;
                    } else if (name.equals("animator")) {
                        animatorA = a(context, resources, theme, attributeSet, null, f, xmlPullParser);
                        z = false;
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray typedArrayA = pn.a(resources, theme, attributeSet, ia.h);
                        a(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, pn.a(typedArrayA, xmlPullParser, "ordering", 0, 0), f);
                        typedArrayA.recycle();
                        z = false;
                        animatorA = animatorSet2;
                    } else if (name.equals("propertyValuesHolder")) {
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                        ArrayList arrayList3 = null;
                        while (true) {
                            int eventType = xmlPullParser.getEventType();
                            if (eventType != 3 && eventType != 1) {
                                if (eventType != 2) {
                                    xmlPullParser.next();
                                } else {
                                    if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                                        TypedArray typedArrayA2 = pn.a(resources, theme, attributeSetAsAttributeSet, ia.i);
                                        String strA = pn.a(typedArrayA2, xmlPullParser, "propertyName", 3);
                                        int iA = pn.a(typedArrayA2, xmlPullParser, "valueType", 2, 4);
                                        ArrayList arrayList4 = null;
                                        int i6 = iA;
                                        while (true) {
                                            int next2 = xmlPullParser.next();
                                            if (next2 != 3 && next2 != 1) {
                                                if (xmlPullParser.getName().equals("keyframe")) {
                                                    if (i6 == 4) {
                                                        TypedArray typedArrayA3 = pn.a(resources, theme, Xml.asAttributeSet(xmlPullParser), ia.j);
                                                        TypedValue typedValueB = pn.b(typedArrayA3, xmlPullParser, "value", 0);
                                                        if ((typedValueB != null) && a(typedValueB.type)) {
                                                            i4 = 3;
                                                        } else {
                                                            i4 = 0;
                                                        }
                                                        typedArrayA3.recycle();
                                                    } else {
                                                        i4 = i6;
                                                    }
                                                    TypedArray typedArrayA4 = pn.a(resources, theme, Xml.asAttributeSet(xmlPullParser), ia.j);
                                                    Keyframe keyframeOfFloat = null;
                                                    float fA = pn.a(typedArrayA4, xmlPullParser, "fraction", 3, -1.0f);
                                                    TypedValue typedValueB2 = pn.b(typedArrayA4, xmlPullParser, "value", 0);
                                                    boolean z2 = typedValueB2 != null;
                                                    if (i4 != 4) {
                                                        i5 = i4;
                                                    } else if (z2 && a(typedValueB2.type)) {
                                                        i5 = 3;
                                                    } else {
                                                        i5 = 0;
                                                    }
                                                    if (z2) {
                                                        switch (i5) {
                                                            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                                                keyframeOfFloat = Keyframe.ofFloat(fA, pn.a(typedArrayA4, xmlPullParser, "value", 0, 0.0f));
                                                                break;
                                                            case 1:
                                                            case 3:
                                                                keyframeOfFloat = Keyframe.ofInt(fA, pn.a(typedArrayA4, xmlPullParser, "value", 0, 0));
                                                                break;
                                                        }
                                                    } else {
                                                        keyframeOfFloat = i5 == 0 ? Keyframe.ofFloat(fA) : Keyframe.ofInt(fA);
                                                    }
                                                    int iC = pn.c(typedArrayA4, xmlPullParser, "interpolator", 1, 0);
                                                    if (iC > 0) {
                                                        keyframeOfFloat.setInterpolator(C0001if.a(context, iC));
                                                    }
                                                    typedArrayA4.recycle();
                                                    if (keyframeOfFloat != null) {
                                                        if (arrayList4 == null) {
                                                            arrayList4 = new ArrayList();
                                                        }
                                                        arrayList4.add(keyframeOfFloat);
                                                    }
                                                    xmlPullParser.next();
                                                    i3 = i4;
                                                    arrayList = arrayList4;
                                                } else {
                                                    arrayList = arrayList4;
                                                    i3 = i6;
                                                }
                                                arrayList4 = arrayList;
                                                i6 = i3;
                                            }
                                        }
                                        if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                                            propertyValuesHolderA = null;
                                        } else {
                                            Keyframe keyframe = (Keyframe) arrayList4.get(0);
                                            Keyframe keyframe2 = (Keyframe) arrayList4.get(size - 1);
                                            float fraction = keyframe2.getFraction();
                                            if (fraction >= 1.0f) {
                                                i2 = size;
                                            } else if (fraction < 0.0f) {
                                                keyframe2.setFraction(1.0f);
                                                i2 = size;
                                            } else {
                                                arrayList4.add(arrayList4.size(), a(keyframe2, 1.0f));
                                                i2 = size + 1;
                                            }
                                            float fraction2 = keyframe.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList4.add(0, a(keyframe, 0.0f));
                                                    i2++;
                                                }
                                            }
                                            Keyframe[] keyframeArr = new Keyframe[i2];
                                            arrayList4.toArray(keyframeArr);
                                            for (int i7 = 0; i7 < i2; i7++) {
                                                Keyframe keyframe3 = keyframeArr[i7];
                                                if (keyframe3.getFraction() < 0.0f) {
                                                    if (i7 == 0) {
                                                        keyframe3.setFraction(0.0f);
                                                    } else if (i7 == i2 - 1) {
                                                        keyframe3.setFraction(1.0f);
                                                    } else {
                                                        int i8 = i7;
                                                        for (int i9 = i7 + 1; i9 < i2 - 1 && keyframeArr[i9].getFraction() < 0.0f; i9++) {
                                                            i8 = i9;
                                                        }
                                                        float fraction3 = (keyframeArr[i8 + 1].getFraction() - keyframeArr[i7 - 1].getFraction()) / ((i8 - i7) + 2);
                                                        for (int i10 = i7; i10 <= i8; i10++) {
                                                            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + fraction3);
                                                        }
                                                    }
                                                }
                                            }
                                            propertyValuesHolderA = PropertyValuesHolder.ofKeyframe(strA, keyframeArr);
                                            if (i6 == 3) {
                                                propertyValuesHolderA.setEvaluator(ii.a);
                                            }
                                        }
                                        if (propertyValuesHolderA == null) {
                                            propertyValuesHolderA = a(typedArrayA2, iA, 0, 1, strA);
                                        }
                                        if (propertyValuesHolderA != null) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(propertyValuesHolderA);
                                        }
                                        typedArrayA2.recycle();
                                    }
                                    xmlPullParser.next();
                                    arrayList3 = arrayList3;
                                }
                            }
                        }
                        if (arrayList3 == null) {
                            propertyValuesHolderArr = null;
                        } else {
                            int size2 = arrayList3.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i11 = 0; i11 < size2; i11++) {
                                propertyValuesHolderArr[i11] = (PropertyValuesHolder) arrayList3.get(i11);
                            }
                        }
                        if (propertyValuesHolderArr != null && animatorA != null && (animatorA instanceof ValueAnimator)) {
                            ((ValueAnimator) animatorA).setValues(propertyValuesHolderArr);
                        }
                        z = true;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    if (animatorSet != null && !z) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(animatorA);
                    }
                }
            }
        }
        if (animatorSet != null && arrayList2 != null) {
            Animator[] animatorArr = new Animator[arrayList2.size()];
            ArrayList arrayList5 = arrayList2;
            int size3 = arrayList5.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size3) {
                Object obj = arrayList5.get(i13);
                i13++;
                animatorArr[i12] = (Animator) obj;
                i12++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animatorA;
    }

    private static Keyframe a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        int i;
        TypedArray typedArrayA = pn.a(resources, theme, attributeSet, ia.g);
        TypedArray typedArrayA2 = pn.a(resources, theme, attributeSet, ia.k);
        ValueAnimator valueAnimator2 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long jA = pn.a(typedArrayA, xmlPullParser, "duration", 1, 300);
        long jA2 = pn.a(typedArrayA, xmlPullParser, "startOffset", 2, 0);
        int iA = pn.a(typedArrayA, xmlPullParser, "valueType", 7, 4);
        if (pn.a(xmlPullParser, "valueFrom") && pn.a(xmlPullParser, "valueTo")) {
            if (iA == 4) {
                TypedValue typedValuePeekValue = typedArrayA.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i2 = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayA.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                int i3 = z2 ? typedValuePeekValue2.type : 0;
                if ((z && a(i2)) || (z2 && a(i3))) {
                    iA = 3;
                } else {
                    iA = 0;
                }
            }
            PropertyValuesHolder propertyValuesHolderA = a(typedArrayA, iA, 5, 6, "");
            if (propertyValuesHolderA != null) {
                valueAnimator2.setValues(propertyValuesHolderA);
            }
        }
        valueAnimator2.setDuration(jA);
        valueAnimator2.setStartDelay(jA2);
        valueAnimator2.setRepeatCount(pn.a(typedArrayA, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(pn.a(typedArrayA, xmlPullParser, "repeatMode", 4, 1));
        if (typedArrayA2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            String strA = pn.a(typedArrayA2, xmlPullParser, "pathData", 1);
            if (strA != null) {
                String strA2 = pn.a(typedArrayA2, xmlPullParser, "propertyXName", 2);
                String strA3 = pn.a(typedArrayA2, xmlPullParser, "propertyYName", 3);
                if (strA2 == null && strA3 == null) {
                    throw new InflateException(typedArrayA2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathA = pp.a(strA);
                float f2 = 0.5f * f;
                PathMeasure pathMeasure = new PathMeasure(pathA, false);
                float length = 0.0f;
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathA, false);
                int iMin = Math.min(100, ((int) (length / f2)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f3 = length / (iMin - 1);
                float f4 = 0.0f;
                int i4 = 0;
                int i5 = 0;
                while (i5 < iMin) {
                    pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i5] = fArr3[0];
                    fArr2[i5] = fArr3[1];
                    f4 += f3;
                    if (i4 + 1 >= arrayList.size() || f4 <= ((Float) arrayList.get(i4 + 1)).floatValue()) {
                        i = i4;
                    } else {
                        i = i4 + 1;
                        pathMeasure2.nextContour();
                    }
                    i5++;
                    i4 = i;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = null;
                if (strA2 != null) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(strA2, fArr);
                }
                if (strA3 != null) {
                    propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat(strA3, fArr2);
                }
                if (propertyValuesHolderOfFloat == null) {
                    objectAnimator.setValues(propertyValuesHolderOfFloat2);
                } else if (propertyValuesHolderOfFloat2 == null) {
                    objectAnimator.setValues(propertyValuesHolderOfFloat);
                } else {
                    objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                }
            } else {
                objectAnimator.setPropertyName(pn.a(typedArrayA2, xmlPullParser, "propertyName", 0));
            }
        }
        int iC = pn.c(typedArrayA, xmlPullParser, "interpolator", 0, 0);
        if (iC > 0) {
            valueAnimator2.setInterpolator(C0001if.a(context, iC));
        }
        typedArrayA.recycle();
        if (typedArrayA2 != null) {
            typedArrayA2.recycle();
        }
        return valueAnimator2;
    }

    private static boolean a(int i) {
        return i >= 28 && i <= 31;
    }
}
