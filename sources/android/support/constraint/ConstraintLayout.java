package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import flm.bbx;
import flm.dc;
import flm.dd;
import flm.de;
import flm.df;
import flm.dg;
import flm.dp;
import flm.dr;
import flm.ds;
import flm.dt;
import flm.dx;
import flm.ehh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private SparseArray a;
    private final ArrayList b;
    private ds c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private dd j;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(100);
        this.c = new ds();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(100);
        this.c = new ds();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(100);
        this.c = new ds();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        a(attributeSet);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    private final void a(AttributeSet attributeSet) {
        this.c.I = this;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dg.a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == dg.e) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == dg.d) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == dg.c) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == dg.b) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == dg.W) {
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                } else if (index == dg.g) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    this.j = new dd();
                    dd ddVar = this.j;
                    Context context = getContext();
                    XmlResourceParser xml = context.getResources().getXml(resourceId);
                    try {
                        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                            switch (eventType) {
                                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                    xml.getName();
                                    break;
                                case 2:
                                    String name = xml.getName();
                                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                    de deVar = new de();
                                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSetAsAttributeSet, dg.X);
                                    dd.a(deVar, typedArrayObtainStyledAttributes2);
                                    typedArrayObtainStyledAttributes2.recycle();
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        deVar.a = true;
                                    }
                                    ddVar.a.put(Integer.valueOf(deVar.d), deVar);
                                    break;
                            }
                        }
                    } catch (IOException e) {
                        ehh.a.a(e);
                    } catch (XmlPullParserException e2) {
                        ehh.a.a(e2);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.c.ac = this.i;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        dr drVarA = a(view);
        if ((view instanceof df) && !(drVarA instanceof dt)) {
            dc dcVar = (dc) view.getLayoutParams();
            dcVar.X = new dt();
            dcVar.P = true;
            ((dt) dcVar.X).h(dcVar.L);
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.a(a(view));
        this.h = true;
    }

    private final dr a(int i) {
        if (i == 0) {
            return this.c;
        }
        View view = (View) this.a.get(i);
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        return ((dc) view.getLayoutParams()).X;
    }

    private final dr a(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        return ((dc) view.getLayoutParams()).X;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02da  */
    /* JADX WARN: Code duplicated, block: B:105:0x02df  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:114:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:117:0x0306  */
    /* JADX WARN: Code duplicated, block: B:119:0x030e  */
    /* JADX WARN: Code duplicated, block: B:122:0x031d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0327  */
    /* JADX WARN: Code duplicated, block: B:127:0x0337  */
    /* JADX WARN: Code duplicated, block: B:129:0x0341  */
    /* JADX WARN: Code duplicated, block: B:132:0x0351  */
    /* JADX WARN: Code duplicated, block: B:134:0x0367 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:159:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:15:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:162:0x0402  */
    /* JADX WARN: Code duplicated, block: B:164:0x0407  */
    /* JADX WARN: Code duplicated, block: B:167:0x0424  */
    /* JADX WARN: Code duplicated, block: B:169:0x0453  */
    /* JADX WARN: Code duplicated, block: B:171:0x0458  */
    /* JADX WARN: Code duplicated, block: B:175:0x046b  */
    /* JADX WARN: Code duplicated, block: B:177:0x046e  */
    /* JADX WARN: Code duplicated, block: B:17:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:180:0x0481  */
    /* JADX WARN: Code duplicated, block: B:182:0x0484  */
    /* JADX WARN: Code duplicated, block: B:185:0x0498  */
    /* JADX WARN: Code duplicated, block: B:187:0x049d  */
    /* JADX WARN: Code duplicated, block: B:190:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:192:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:195:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:196:0x04db  */
    /* JADX WARN: Code duplicated, block: B:197:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:198:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:19:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:21:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:23:0x0157  */
    /* JADX WARN: Code duplicated, block: B:320:0x0779 A[PHI: r2 r3 r4 r5 r6 r7 r8
  0x0779: PHI (r2v69 float) = (r2v68 float), (r2v145 float), (r2v145 float), (r2v145 float) binds: [B:95:0x02bf, B:104:0x02dd, B:106:0x02e0, B:173:0x045f] A[DONT_GENERATE, DONT_INLINE]
  0x0779: PHI (r3v40 int) = (r3v39 int), (r3v74 int), (r3v74 int), (r3v74 int) binds: [B:95:0x02bf, B:104:0x02dd, B:106:0x02e0, B:173:0x045f] A[DONT_GENERATE, DONT_INLINE]
  0x0779: PHI (r4v19 int) = (r4v18 int), (r4v37 int), (r4v37 int), (r4v37 int) binds: [B:95:0x02bf, B:104:0x02dd, B:106:0x02e0, B:173:0x045f] A[DONT_GENERATE, DONT_INLINE]
  0x0779: PHI (r5v14 int) = (r5v13 int), (r5v24 int), (r5v24 int), (r5v24 int) binds: [B:95:0x02bf, B:104:0x02dd, B:106:0x02e0, B:173:0x045f] A[DONT_GENERATE, DONT_INLINE]
  0x0779: PHI (r6v30 int) = (r6v29 int), (r6v39 int), (r6v39 int), (r6v39 int) binds: [B:95:0x02bf, B:104:0x02dd, B:106:0x02e0, B:173:0x045f] A[DONT_GENERATE, DONT_INLINE]
  0x0779: PHI (r7v26 int) = (r7v25 int), (r7v31 int), (r7v31 int), (r7v31 int) binds: [B:95:0x02bf, B:104:0x02dd, B:106:0x02e0, B:173:0x045f] A[DONT_GENERATE, DONT_INLINE]
  0x0779: PHI (r8v16 int) = (r8v15 int), (r8v21 int), (r8v21 int), (r8v21 int) binds: [B:95:0x02bf, B:104:0x02dd, B:106:0x02e0, B:173:0x045f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:325:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x020d  */
    /* JADX WARN: Code duplicated, block: B:49:0x021e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0229  */
    /* JADX WARN: Code duplicated, block: B:64:0x0257  */
    /* JADX WARN: Code duplicated, block: B:66:0x025f  */
    /* JADX WARN: Code duplicated, block: B:68:0x026c  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d2  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int iCombineMeasuredStates;
        View view;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        boolean z;
        int baseline;
        int measuredWidth;
        int measuredHeight;
        int baseline2;
        boolean z2;
        int childMeasureSpec;
        int childMeasureSpec2;
        int childCount;
        int i5;
        View childAt;
        dr drVarA;
        dc dcVar;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f;
        float f2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        dr drVarA2;
        dr drVarA3;
        dr drVarA4;
        dr drVarA5;
        View view2;
        dr drVarA6;
        dr drVarA7;
        dr drVarA8;
        dr drVarA9;
        dr drVarA10;
        dt dtVar;
        float f3;
        int i17;
        int i18;
        dd ddVar;
        int childCount2;
        HashSet<Integer> hashSet;
        int i19;
        de deVar;
        View childAt2;
        int id;
        de deVar2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.c.t = paddingLeft;
        this.c.u = paddingTop;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop2 = getPaddingTop() + getPaddingBottom();
        int paddingLeft2 = getPaddingLeft() + getPaddingRight();
        int i20 = dp.w;
        int i21 = dp.w;
        getLayoutParams();
        switch (mode) {
            case Integer.MIN_VALUE:
                i3 = dp.x;
                break;
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                i3 = dp.x;
                size = 0;
                break;
            case 1073741824:
                size = Math.min(this.f, size) - paddingLeft2;
                i3 = i20;
                break;
            default:
                size = 0;
                i3 = i20;
                break;
        }
        switch (mode2) {
            case Integer.MIN_VALUE:
                i4 = dp.x;
                break;
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                i4 = dp.x;
                size2 = 0;
                break;
            case 1073741824:
                size2 = Math.min(this.g, size2) - paddingTop2;
                i4 = i21;
                break;
            default:
                size2 = 0;
                i4 = i21;
                break;
        }
        this.c.c(0);
        this.c.d(0);
        this.c.f(i3);
        this.c.a(size);
        this.c.g(i4);
        this.c.b(size2);
        this.c.c((this.d - getPaddingLeft()) - getPaddingRight());
        this.c.d((this.e - getPaddingTop()) - getPaddingBottom());
        if (this.h) {
            this.h = false;
            int childCount3 = getChildCount();
            boolean z3 = false;
            for (int i22 = 0; i22 < childCount3; i22++) {
                if (getChildAt(i22).isLayoutRequested()) {
                    z3 = true;
                    if (z3) {
                        this.b.clear();
                        if (this.j != null) {
                            ddVar = this.j;
                            childCount2 = getChildCount();
                            hashSet = new HashSet(ddVar.a.keySet());
                            for (i19 = 0; i19 < childCount2; i19++) {
                                childAt2 = getChildAt(i19);
                                id = childAt2.getId();
                                if (ddVar.a.containsKey(Integer.valueOf(id))) {
                                    hashSet.remove(Integer.valueOf(id));
                                    deVar2 = (de) ddVar.a.get(Integer.valueOf(id));
                                    dc dcVar2 = (dc) childAt2.getLayoutParams();
                                    deVar2.a(dcVar2);
                                    childAt2.setLayoutParams(dcVar2);
                                    childAt2.setVisibility(deVar2.G);
                                    childAt2.setAlpha(deVar2.R);
                                    childAt2.setRotationX(deVar2.U);
                                    childAt2.setRotationY(deVar2.V);
                                    childAt2.setScaleX(deVar2.W);
                                    childAt2.setScaleY(deVar2.X);
                                    childAt2.setPivotX(deVar2.Y);
                                    childAt2.setPivotY(deVar2.Z);
                                    childAt2.setTranslationX(deVar2.aa);
                                    childAt2.setTranslationY(deVar2.ab);
                                    childAt2.setTranslationZ(deVar2.ac);
                                    if (deVar2.S) {
                                        childAt2.setElevation(deVar2.T);
                                    }
                                }
                            }
                            for (Integer num : hashSet) {
                                deVar = (de) ddVar.a.get(num);
                                if (deVar.a) {
                                    df dfVar = new df(getContext());
                                    dfVar.setId(num.intValue());
                                    dc dcVarA = a();
                                    deVar.a(dcVarA);
                                    addView(dfVar, dcVarA);
                                }
                            }
                        }
                        childCount = getChildCount();
                        ((dx) this.c).af.clear();
                        for (i5 = 0; i5 < childCount; i5++) {
                            childAt = getChildAt(i5);
                            drVarA = a(childAt);
                            if (drVarA != null) {
                                dcVar = (dc) childAt.getLayoutParams();
                                drVarA.a();
                                drVarA.J = childAt.getVisibility();
                                drVarA.I = childAt;
                                ds dsVar = this.c;
                                ((dx) dsVar).af.add(drVarA);
                                if (drVarA.o != null) {
                                    ((dx) drVarA.o).a(drVarA);
                                }
                                drVarA.o = dsVar;
                                if (dcVar.N || !dcVar.M) {
                                    this.b.add(drVarA);
                                }
                                if (dcVar.P) {
                                    dtVar = (dt) drVarA;
                                    if (dcVar.a != -1 && (i18 = dcVar.a) >= 0) {
                                        dtVar.ac = -1.0f;
                                        dtVar.ad = i18;
                                        dtVar.ae = -1;
                                    }
                                    if (dcVar.b != -1 && (i17 = dcVar.b) >= 0) {
                                        dtVar.ac = -1.0f;
                                        dtVar.ad = -1;
                                        dtVar.ae = i17;
                                    }
                                    if (dcVar.c != -1.0f) {
                                        f3 = dcVar.c;
                                        if (f3 > -1.0f) {
                                            dtVar.ac = f3;
                                            dtVar.ad = -1;
                                            dtVar.ae = -1;
                                        }
                                    }
                                } else if (dcVar.Q == -1 || dcVar.R != -1 || dcVar.S != -1 || dcVar.T != -1 || dcVar.h != -1 || dcVar.i != -1 || dcVar.j != -1 || dcVar.k != -1 || dcVar.l != -1 || dcVar.J != -1 || dcVar.K != -1 || dcVar.width == -1 || dcVar.height == -1) {
                                    i6 = dcVar.Q;
                                    i7 = dcVar.R;
                                    i8 = dcVar.S;
                                    i9 = dcVar.T;
                                    i10 = dcVar.U;
                                    i11 = dcVar.V;
                                    f = dcVar.W;
                                    if (Build.VERSION.SDK_INT < 17) {
                                        i6 = dcVar.d;
                                        i7 = dcVar.e;
                                        i8 = dcVar.f;
                                        i9 = dcVar.g;
                                        i10 = dcVar.q;
                                        i11 = dcVar.s;
                                        f = dcVar.w;
                                        if (i6 == -1 && i7 == -1) {
                                            if (dcVar.n != -1) {
                                                i6 = dcVar.n;
                                            } else if (dcVar.m != -1) {
                                                i7 = dcVar.m;
                                            }
                                        }
                                        if (i8 == -1 || i9 != -1) {
                                            f2 = f;
                                            i12 = i8;
                                            i13 = i7;
                                            i14 = i11;
                                            i15 = i6;
                                            i16 = i9;
                                        } else if (dcVar.o != -1) {
                                            f2 = f;
                                            i12 = dcVar.o;
                                            i13 = i7;
                                            i14 = i11;
                                            i15 = i6;
                                            i16 = i9;
                                        } else if (dcVar.p != -1) {
                                            f2 = f;
                                            i12 = i8;
                                            i13 = i7;
                                            i14 = i11;
                                            i15 = i6;
                                            i16 = dcVar.p;
                                        } else {
                                            f2 = f;
                                            i12 = i8;
                                            i13 = i7;
                                            i14 = i11;
                                            i15 = i6;
                                            i16 = i9;
                                        }
                                    } else {
                                        f2 = f;
                                        i12 = i8;
                                        i13 = i7;
                                        i14 = i11;
                                        i15 = i6;
                                        i16 = i9;
                                    }
                                    if (i15 != -1) {
                                        drVarA10 = a(i15);
                                        if (drVarA10 != null) {
                                            drVarA.a(dp.m, drVarA10, dp.m, dcVar.leftMargin, i10);
                                        }
                                    } else if (i13 != -1 && (drVarA2 = a(i13)) != null) {
                                        drVarA.a(dp.m, drVarA2, dp.o, dcVar.leftMargin, i10);
                                    }
                                    if (i12 != -1) {
                                        drVarA9 = a(i12);
                                        if (drVarA9 != null) {
                                            drVarA.a(dp.o, drVarA9, dp.m, dcVar.rightMargin, i14);
                                        }
                                    } else if (i16 != -1 && (drVarA3 = a(i16)) != null) {
                                        drVarA.a(dp.o, drVarA3, dp.o, dcVar.rightMargin, i14);
                                    }
                                    if (dcVar.h != -1) {
                                        drVarA8 = a(dcVar.h);
                                        if (drVarA8 != null) {
                                            drVarA.a(dp.n, drVarA8, dp.n, dcVar.topMargin, dcVar.r);
                                        }
                                    } else if (dcVar.i != -1 && (drVarA4 = a(dcVar.i)) != null) {
                                        drVarA.a(dp.n, drVarA4, dp.p, dcVar.topMargin, dcVar.r);
                                    }
                                    if (dcVar.j != -1) {
                                        drVarA7 = a(dcVar.j);
                                        if (drVarA7 != null) {
                                            drVarA.a(dp.p, drVarA7, dp.n, dcVar.bottomMargin, dcVar.t);
                                        }
                                    } else if (dcVar.k != -1 && (drVarA5 = a(dcVar.k)) != null) {
                                        drVarA.a(dp.p, drVarA5, dp.p, dcVar.bottomMargin, dcVar.t);
                                    }
                                    if (dcVar.l != -1) {
                                        view2 = (View) this.a.get(dcVar.l);
                                        drVarA6 = a(dcVar.l);
                                        if (drVarA6 != null && view2 != null && (view2.getLayoutParams() instanceof dc)) {
                                            dc dcVar3 = (dc) view2.getLayoutParams();
                                            dcVar.O = true;
                                            dcVar3.O = true;
                                            drVarA.e(dp.q).a(drVarA6.e(dp.q), 0, -1, dp.i, 0, true);
                                            drVarA.e(dp.n).c();
                                            drVarA.e(dp.p).c();
                                        }
                                    }
                                    if (f2 >= 0.0f && f2 != 0.5f) {
                                        drVarA.E = f2;
                                    }
                                    if (dcVar.x >= 0.0f && dcVar.x != 0.5f) {
                                        drVarA.F = dcVar.x;
                                    }
                                    if (isInEditMode() && (dcVar.J != -1 || dcVar.K != -1)) {
                                        int i23 = dcVar.J;
                                        int i24 = dcVar.K;
                                        drVarA.t = i23;
                                        drVarA.u = i24;
                                    }
                                    if (!dcVar.M) {
                                        if (dcVar.width == -1) {
                                            drVarA.f(dp.z);
                                            drVarA.e(dp.m).d = dcVar.leftMargin;
                                            drVarA.e(dp.o).d = dcVar.rightMargin;
                                        } else {
                                            drVarA.f(dp.y);
                                            drVarA.a(0);
                                        }
                                    } else {
                                        drVarA.f(dp.w);
                                        drVarA.a(dcVar.width);
                                    }
                                    if (!dcVar.N) {
                                        if (dcVar.height == -1) {
                                            drVarA.g(dp.z);
                                            drVarA.e(dp.n).d = dcVar.topMargin;
                                            drVarA.e(dp.p).d = dcVar.bottomMargin;
                                        } else {
                                            drVarA.g(dp.y);
                                            drVarA.b(0);
                                        }
                                    } else {
                                        drVarA.g(dp.w);
                                        drVarA.b(dcVar.height);
                                    }
                                    if (dcVar.y != null) {
                                        drVarA.a(dcVar.y);
                                    }
                                    drVarA.Y = dcVar.z;
                                    drVarA.Z = dcVar.A;
                                    drVarA.U = dcVar.B;
                                    drVarA.V = dcVar.C;
                                    int i25 = dcVar.D;
                                    int i26 = dcVar.F;
                                    int i27 = dcVar.H;
                                    drVarA.c = i25;
                                    drVarA.e = i26;
                                    drVarA.f = i27;
                                    int i28 = dcVar.E;
                                    int i29 = dcVar.G;
                                    int i30 = dcVar.I;
                                    drVarA.d = i28;
                                    drVarA.g = i29;
                                    drVarA.h = i30;
                                }
                            }
                        }
                    }
                }
            }
            if (z3) {
                this.b.clear();
                if (this.j != null) {
                    ddVar = this.j;
                    childCount2 = getChildCount();
                    hashSet = new HashSet(ddVar.a.keySet());
                    while (i19 < childCount2) {
                        childAt2 = getChildAt(i19);
                        id = childAt2.getId();
                        if (ddVar.a.containsKey(Integer.valueOf(id))) {
                            hashSet.remove(Integer.valueOf(id));
                            deVar2 = (de) ddVar.a.get(Integer.valueOf(id));
                            dc dcVar4 = (dc) childAt2.getLayoutParams();
                            deVar2.a(dcVar4);
                            childAt2.setLayoutParams(dcVar4);
                            childAt2.setVisibility(deVar2.G);
                            childAt2.setAlpha(deVar2.R);
                            childAt2.setRotationX(deVar2.U);
                            childAt2.setRotationY(deVar2.V);
                            childAt2.setScaleX(deVar2.W);
                            childAt2.setScaleY(deVar2.X);
                            childAt2.setPivotX(deVar2.Y);
                            childAt2.setPivotY(deVar2.Z);
                            childAt2.setTranslationX(deVar2.aa);
                            childAt2.setTranslationY(deVar2.ab);
                            childAt2.setTranslationZ(deVar2.ac);
                            if (deVar2.S) {
                                childAt2.setElevation(deVar2.T);
                            }
                        }
                    }
                    while (r3.hasNext()) {
                        deVar = (de) ddVar.a.get(num);
                        if (deVar.a) {
                            df dfVar2 = new df(getContext());
                            dfVar2.setId(num.intValue());
                            dc dcVarA2 = a();
                            deVar.a(dcVarA2);
                            addView(dfVar2, dcVarA2);
                        }
                    }
                }
                childCount = getChildCount();
                ((dx) this.c).af.clear();
                while (i5 < childCount) {
                    childAt = getChildAt(i5);
                    drVarA = a(childAt);
                    if (drVarA != null) {
                        dcVar = (dc) childAt.getLayoutParams();
                        drVarA.a();
                        drVarA.J = childAt.getVisibility();
                        drVarA.I = childAt;
                        ds dsVar2 = this.c;
                        ((dx) dsVar2).af.add(drVarA);
                        if (drVarA.o != null) {
                            ((dx) drVarA.o).a(drVarA);
                        }
                        drVarA.o = dsVar2;
                        if (dcVar.N) {
                            this.b.add(drVarA);
                        } else {
                            this.b.add(drVarA);
                        }
                        if (dcVar.P) {
                            dtVar = (dt) drVarA;
                            if (dcVar.a != -1) {
                                dtVar.ac = -1.0f;
                                dtVar.ad = i18;
                                dtVar.ae = -1;
                            }
                            if (dcVar.b != -1) {
                                dtVar.ac = -1.0f;
                                dtVar.ad = -1;
                                dtVar.ae = i17;
                            }
                            if (dcVar.c != -1.0f) {
                                f3 = dcVar.c;
                                if (f3 > -1.0f) {
                                    dtVar.ac = f3;
                                    dtVar.ad = -1;
                                    dtVar.ae = -1;
                                }
                            }
                        } else if (dcVar.Q == -1) {
                            i6 = dcVar.Q;
                            i7 = dcVar.R;
                            i8 = dcVar.S;
                            i9 = dcVar.T;
                            i10 = dcVar.U;
                            i11 = dcVar.V;
                            f = dcVar.W;
                            if (Build.VERSION.SDK_INT < 17) {
                                i6 = dcVar.d;
                                i7 = dcVar.e;
                                i8 = dcVar.f;
                                i9 = dcVar.g;
                                i10 = dcVar.q;
                                i11 = dcVar.s;
                                f = dcVar.w;
                                if (i6 == -1) {
                                    if (dcVar.n != -1) {
                                        i6 = dcVar.n;
                                    } else if (dcVar.m != -1) {
                                        i7 = dcVar.m;
                                    }
                                }
                                if (i8 == -1) {
                                    f2 = f;
                                    i12 = i8;
                                    i13 = i7;
                                    i14 = i11;
                                    i15 = i6;
                                    i16 = i9;
                                } else {
                                    f2 = f;
                                    i12 = i8;
                                    i13 = i7;
                                    i14 = i11;
                                    i15 = i6;
                                    i16 = i9;
                                }
                            } else {
                                f2 = f;
                                i12 = i8;
                                i13 = i7;
                                i14 = i11;
                                i15 = i6;
                                i16 = i9;
                            }
                            if (i15 != -1) {
                                drVarA10 = a(i15);
                                if (drVarA10 != null) {
                                    drVarA.a(dp.m, drVarA10, dp.m, dcVar.leftMargin, i10);
                                }
                            } else if (i13 != -1) {
                                drVarA.a(dp.m, drVarA2, dp.o, dcVar.leftMargin, i10);
                            }
                            if (i12 != -1) {
                                drVarA9 = a(i12);
                                if (drVarA9 != null) {
                                    drVarA.a(dp.o, drVarA9, dp.m, dcVar.rightMargin, i14);
                                }
                            } else if (i16 != -1) {
                                drVarA.a(dp.o, drVarA3, dp.o, dcVar.rightMargin, i14);
                            }
                            if (dcVar.h != -1) {
                                drVarA8 = a(dcVar.h);
                                if (drVarA8 != null) {
                                    drVarA.a(dp.n, drVarA8, dp.n, dcVar.topMargin, dcVar.r);
                                }
                            } else if (dcVar.i != -1) {
                                drVarA.a(dp.n, drVarA4, dp.p, dcVar.topMargin, dcVar.r);
                            }
                            if (dcVar.j != -1) {
                                drVarA7 = a(dcVar.j);
                                if (drVarA7 != null) {
                                    drVarA.a(dp.p, drVarA7, dp.n, dcVar.bottomMargin, dcVar.t);
                                }
                            } else if (dcVar.k != -1) {
                                drVarA.a(dp.p, drVarA5, dp.p, dcVar.bottomMargin, dcVar.t);
                            }
                            if (dcVar.l != -1) {
                                view2 = (View) this.a.get(dcVar.l);
                                drVarA6 = a(dcVar.l);
                                if (drVarA6 != null) {
                                    dc dcVar5 = (dc) view2.getLayoutParams();
                                    dcVar.O = true;
                                    dcVar5.O = true;
                                    drVarA.e(dp.q).a(drVarA6.e(dp.q), 0, -1, dp.i, 0, true);
                                    drVarA.e(dp.n).c();
                                    drVarA.e(dp.p).c();
                                }
                            }
                            if (f2 >= 0.0f) {
                                drVarA.E = f2;
                            }
                            if (dcVar.x >= 0.0f) {
                                drVarA.F = dcVar.x;
                            }
                            if (isInEditMode()) {
                                int i210 = dcVar.J;
                                int i211 = dcVar.K;
                                drVarA.t = i210;
                                drVarA.u = i211;
                            }
                            if (!dcVar.M) {
                                if (dcVar.width == -1) {
                                    drVarA.f(dp.z);
                                    drVarA.e(dp.m).d = dcVar.leftMargin;
                                    drVarA.e(dp.o).d = dcVar.rightMargin;
                                } else {
                                    drVarA.f(dp.y);
                                    drVarA.a(0);
                                }
                            } else {
                                drVarA.f(dp.w);
                                drVarA.a(dcVar.width);
                            }
                            if (!dcVar.N) {
                                if (dcVar.height == -1) {
                                    drVarA.g(dp.z);
                                    drVarA.e(dp.n).d = dcVar.topMargin;
                                    drVarA.e(dp.p).d = dcVar.bottomMargin;
                                } else {
                                    drVarA.g(dp.y);
                                    drVarA.b(0);
                                }
                            } else {
                                drVarA.g(dp.w);
                                drVarA.b(dcVar.height);
                            }
                            if (dcVar.y != null) {
                                drVarA.a(dcVar.y);
                            }
                            drVarA.Y = dcVar.z;
                            drVarA.Z = dcVar.A;
                            drVarA.U = dcVar.B;
                            drVarA.V = dcVar.C;
                            int i212 = dcVar.D;
                            int i213 = dcVar.F;
                            int i214 = dcVar.H;
                            drVarA.c = i212;
                            drVarA.e = i213;
                            drVarA.f = i214;
                            int i215 = dcVar.E;
                            int i216 = dcVar.G;
                            int i31 = dcVar.I;
                            drVarA.d = i215;
                            drVarA.g = i216;
                            drVarA.h = i31;
                        } else {
                            i6 = dcVar.Q;
                            i7 = dcVar.R;
                            i8 = dcVar.S;
                            i9 = dcVar.T;
                            i10 = dcVar.U;
                            i11 = dcVar.V;
                            f = dcVar.W;
                            if (Build.VERSION.SDK_INT < 17) {
                                i6 = dcVar.d;
                                i7 = dcVar.e;
                                i8 = dcVar.f;
                                i9 = dcVar.g;
                                i10 = dcVar.q;
                                i11 = dcVar.s;
                                f = dcVar.w;
                                if (i6 == -1) {
                                    if (dcVar.n != -1) {
                                        i6 = dcVar.n;
                                    } else if (dcVar.m != -1) {
                                        i7 = dcVar.m;
                                    }
                                }
                                if (i8 == -1) {
                                    f2 = f;
                                    i12 = i8;
                                    i13 = i7;
                                    i14 = i11;
                                    i15 = i6;
                                    i16 = i9;
                                } else {
                                    f2 = f;
                                    i12 = i8;
                                    i13 = i7;
                                    i14 = i11;
                                    i15 = i6;
                                    i16 = i9;
                                }
                            } else {
                                f2 = f;
                                i12 = i8;
                                i13 = i7;
                                i14 = i11;
                                i15 = i6;
                                i16 = i9;
                            }
                            if (i15 != -1) {
                                drVarA10 = a(i15);
                                if (drVarA10 != null) {
                                    drVarA.a(dp.m, drVarA10, dp.m, dcVar.leftMargin, i10);
                                }
                            } else if (i13 != -1) {
                                drVarA.a(dp.m, drVarA2, dp.o, dcVar.leftMargin, i10);
                            }
                            if (i12 != -1) {
                                drVarA9 = a(i12);
                                if (drVarA9 != null) {
                                    drVarA.a(dp.o, drVarA9, dp.m, dcVar.rightMargin, i14);
                                }
                            } else if (i16 != -1) {
                                drVarA.a(dp.o, drVarA3, dp.o, dcVar.rightMargin, i14);
                            }
                            if (dcVar.h != -1) {
                                drVarA8 = a(dcVar.h);
                                if (drVarA8 != null) {
                                    drVarA.a(dp.n, drVarA8, dp.n, dcVar.topMargin, dcVar.r);
                                }
                            } else if (dcVar.i != -1) {
                                drVarA.a(dp.n, drVarA4, dp.p, dcVar.topMargin, dcVar.r);
                            }
                            if (dcVar.j != -1) {
                                drVarA7 = a(dcVar.j);
                                if (drVarA7 != null) {
                                    drVarA.a(dp.p, drVarA7, dp.n, dcVar.bottomMargin, dcVar.t);
                                }
                            } else if (dcVar.k != -1) {
                                drVarA.a(dp.p, drVarA5, dp.p, dcVar.bottomMargin, dcVar.t);
                            }
                            if (dcVar.l != -1) {
                                view2 = (View) this.a.get(dcVar.l);
                                drVarA6 = a(dcVar.l);
                                if (drVarA6 != null) {
                                    dc dcVar6 = (dc) view2.getLayoutParams();
                                    dcVar.O = true;
                                    dcVar6.O = true;
                                    drVarA.e(dp.q).a(drVarA6.e(dp.q), 0, -1, dp.i, 0, true);
                                    drVarA.e(dp.n).c();
                                    drVarA.e(dp.p).c();
                                }
                            }
                            if (f2 >= 0.0f) {
                                drVarA.E = f2;
                            }
                            if (dcVar.x >= 0.0f) {
                                drVarA.F = dcVar.x;
                            }
                            if (isInEditMode()) {
                                int i217 = dcVar.J;
                                int i218 = dcVar.K;
                                drVarA.t = i217;
                                drVarA.u = i218;
                            }
                            if (!dcVar.M) {
                                if (dcVar.width == -1) {
                                    drVarA.f(dp.z);
                                    drVarA.e(dp.m).d = dcVar.leftMargin;
                                    drVarA.e(dp.o).d = dcVar.rightMargin;
                                } else {
                                    drVarA.f(dp.y);
                                    drVarA.a(0);
                                }
                            } else {
                                drVarA.f(dp.w);
                                drVarA.a(dcVar.width);
                            }
                            if (!dcVar.N) {
                                if (dcVar.height == -1) {
                                    drVarA.g(dp.z);
                                    drVarA.e(dp.n).d = dcVar.topMargin;
                                    drVarA.e(dp.p).d = dcVar.bottomMargin;
                                } else {
                                    drVarA.g(dp.y);
                                    drVarA.b(0);
                                }
                            } else {
                                drVarA.g(dp.w);
                                drVarA.b(dcVar.height);
                            }
                            if (dcVar.y != null) {
                                drVarA.a(dcVar.y);
                            }
                            drVarA.Y = dcVar.z;
                            drVarA.Z = dcVar.A;
                            drVarA.U = dcVar.B;
                            drVarA.V = dcVar.C;
                            int i219 = dcVar.D;
                            int i2110 = dcVar.F;
                            int i2111 = dcVar.H;
                            drVarA.c = i219;
                            drVarA.e = i2110;
                            drVarA.f = i2111;
                            int i2112 = dcVar.E;
                            int i2113 = dcVar.G;
                            int i32 = dcVar.I;
                            drVarA.d = i2112;
                            drVarA.g = i2113;
                            drVarA.h = i32;
                        }
                    }
                }
            }
        }
        int paddingTop3 = getPaddingTop() + getPaddingBottom();
        int paddingLeft3 = getPaddingLeft() + getPaddingRight();
        int childCount4 = getChildCount();
        for (int i33 = 0; i33 < childCount4; i33++) {
            View childAt3 = getChildAt(i33);
            if (childAt3.getVisibility() != 8) {
                dc dcVar7 = (dc) childAt3.getLayoutParams();
                dr drVar = dcVar7.X;
                if (!dcVar7.P) {
                    int i34 = dcVar7.width;
                    int i35 = dcVar7.height;
                    boolean z4 = false;
                    boolean z5 = false;
                    if (dcVar7.M || dcVar7.N || (!dcVar7.M && dcVar7.D == 1) || dcVar7.width == -1 || (!dcVar7.N && (dcVar7.E == 1 || dcVar7.height == -1))) {
                        if (i34 == 0 || i34 == -1) {
                            z2 = true;
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft3, -2);
                        } else {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft3, i34);
                            z2 = false;
                        }
                        if (i35 == 0 || i35 == -1) {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop3, -2);
                            z5 = true;
                        } else {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop3, i35);
                        }
                        childAt3.measure(childMeasureSpec, childMeasureSpec2);
                        measuredWidth = childAt3.getMeasuredWidth();
                        boolean z6 = z2;
                        measuredHeight = childAt3.getMeasuredHeight();
                        z4 = z6;
                    } else {
                        measuredWidth = i34;
                        measuredHeight = i35;
                    }
                    drVar.a(measuredWidth);
                    drVar.b(measuredHeight);
                    if (z4) {
                        drVar.C = measuredWidth;
                    }
                    if (z5) {
                        drVar.D = measuredHeight;
                    }
                    if (dcVar7.O && (baseline2 = childAt3.getBaseline()) != -1) {
                        drVar.z = baseline2;
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            this.c.n();
        }
        int i36 = 0;
        int size3 = this.b.size();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingRight = paddingLeft + getPaddingRight();
        if (size3 > 0) {
            boolean z7 = false;
            boolean z8 = this.c.G == dp.x;
            boolean z9 = this.c.H == dp.x;
            int i37 = 0;
            while (i37 < size3) {
                dr drVar2 = (dr) this.b.get(i37);
                if ((drVar2 instanceof dt) || (view = (View) drVar2.I) == null || view.getVisibility() == 8) {
                    iCombineMeasuredStates = i36;
                } else {
                    dc dcVar8 = (dc) view.getLayoutParams();
                    if (dcVar8.width == -2) {
                        iMakeMeasureSpec = getChildMeasureSpec(i, paddingRight, dcVar8.width);
                    } else {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(drVar2.c(), 1073741824);
                    }
                    if (dcVar8.height == -2) {
                        iMakeMeasureSpec2 = getChildMeasureSpec(i2, paddingBottom, dcVar8.height);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(drVar2.f(), 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (measuredWidth2 != drVar2.c()) {
                        drVar2.a(measuredWidth2);
                        if (z8 && drVar2.i() > this.c.c()) {
                            this.c.a(Math.max(this.d, drVar2.i() + drVar2.e(dp.o).b()));
                        }
                        z = true;
                    } else {
                        z = z7;
                    }
                    if (measuredHeight2 != drVar2.f()) {
                        drVar2.b(measuredHeight2);
                        if (z9 && drVar2.j() > this.c.f()) {
                            this.c.b(Math.max(this.e, drVar2.j() + drVar2.e(dp.p).b()));
                        }
                        z = true;
                    }
                    if (dcVar8.O && (baseline = view.getBaseline()) != -1 && baseline != drVar2.z) {
                        drVar2.z = baseline;
                        z = true;
                    }
                    if (Build.VERSION.SDK_INT >= 11) {
                        iCombineMeasuredStates = combineMeasuredStates(i36, view.getMeasuredState());
                        z7 = z;
                    } else {
                        z7 = z;
                        iCombineMeasuredStates = i36;
                    }
                }
                i37++;
                i36 = iCombineMeasuredStates;
            }
            if (z7) {
                this.c.n();
            }
        }
        int iC = this.c.c() + paddingRight;
        int iF = this.c.f() + paddingBottom;
        if (Build.VERSION.SDK_INT >= 11) {
            int iResolveSizeAndState = resolveSizeAndState(iC, i, i36);
            int iResolveSizeAndState2 = resolveSizeAndState(iF, i2, i36 << 16);
            int iMin = Math.min(this.f, iResolveSizeAndState) & 16777215;
            int iMin2 = Math.min(this.g, iResolveSizeAndState2) & 16777215;
            if (this.c.ad) {
                iMin |= 16777216;
            }
            if (this.c.ae) {
                iMin2 |= 16777216;
            }
            setMeasuredDimension(iMin, iMin2);
            return;
        }
        setMeasuredDimension(iC, iF);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            dc dcVar = (dc) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || dcVar.P || zIsInEditMode) {
                dr drVar = dcVar.X;
                int iG = drVar.g();
                int iH = drVar.h();
                childAt.layout(iG, iH, drVar.c() + iG, drVar.f() + iH);
            }
        }
    }

    protected static dc a() {
        return new dc(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new dc(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dc;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.h = true;
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new dc(getContext(), attributeSet);
    }
}
