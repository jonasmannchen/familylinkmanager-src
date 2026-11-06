package flm;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mt {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    private static final ne b = new mz();
    private static final ne c = a();

    private static ne a() {
        try {
            return (ne) Class.forName("flm.jh").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static void a(lw lwVar, ArrayList arrayList, ArrayList arrayList2, int i, int i2, boolean z) {
        ViewGroup viewGroup;
        Object obj;
        Rect rect;
        ViewGroup viewGroup2;
        Object obj2;
        Rect rect2;
        View viewA;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (lwVar.f > 0) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                lb lbVar = (lb) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    if (lbVar.a.h.a()) {
                        for (int size = lbVar.b.size() - 1; size >= 0; size--) {
                            a(lbVar, (lc) lbVar.b.get(size), sparseArray, true, z);
                        }
                    }
                } else {
                    int size2 = lbVar.b.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        a(lbVar, (lc) lbVar.b.get(i4), sparseArray, false, z);
                    }
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(lwVar.g.b);
                int size3 = sparseArray.size();
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 < size3) {
                        int iKeyAt = sparseArray.keyAt(i6);
                        rt rtVar = new rt();
                        int i7 = i2 - 1;
                        while (true) {
                            int i8 = i7;
                            if (i8 < i) {
                                break;
                            }
                            lb lbVar2 = (lb) arrayList.get(i8);
                            if (lbVar2.b(iKeyAt)) {
                                boolean zBooleanValue = ((Boolean) arrayList2.get(i8)).booleanValue();
                                if (lbVar2.q != null) {
                                    int size4 = lbVar2.q.size();
                                    if (zBooleanValue) {
                                        arrayList3 = lbVar2.q;
                                        arrayList4 = lbVar2.r;
                                    } else {
                                        ArrayList arrayList5 = lbVar2.q;
                                        arrayList3 = lbVar2.r;
                                        arrayList4 = arrayList5;
                                    }
                                    for (int i9 = 0; i9 < size4; i9++) {
                                        String str = (String) arrayList4.get(i9);
                                        String str2 = (String) arrayList3.get(i9);
                                        String str3 = (String) rtVar.remove(str2);
                                        if (str3 != null) {
                                            rtVar.put(str, str3);
                                        } else {
                                            rtVar.put(str, str2);
                                        }
                                    }
                                }
                            }
                            i7 = i8 - 1;
                        }
                        my myVar = (my) sparseArray.valueAt(i6);
                        if (z) {
                            if (!lwVar.h.a()) {
                                viewGroup2 = null;
                            } else {
                                viewGroup2 = (ViewGroup) lwVar.h.a(iKeyAt);
                            }
                            if (viewGroup2 != null) {
                                lg lgVar = myVar.a;
                                lg lgVar2 = myVar.d;
                                ne neVarA = a(lgVar2, lgVar);
                                if (neVarA != null) {
                                    boolean z2 = myVar.b;
                                    boolean z3 = myVar.e;
                                    ArrayList arrayList6 = new ArrayList();
                                    ArrayList arrayList7 = new ArrayList();
                                    Object objA = a(neVarA, lgVar, z2);
                                    Object objB = b(neVarA, lgVar2, z3);
                                    lg lgVar3 = myVar.a;
                                    lg lgVar4 = myVar.d;
                                    if (lgVar3 != null) {
                                        lgVar3.K.setVisibility(0);
                                    }
                                    if (lgVar3 == null || lgVar4 == null) {
                                        obj2 = null;
                                    } else {
                                        boolean z4 = myVar.b;
                                        Object objA2 = rtVar.isEmpty() ? null : a(neVarA, lgVar3, lgVar4, z4);
                                        rt rtVarB = b(neVarA, rtVar, objA2, myVar);
                                        rt rtVarA = a(neVarA, rtVar, objA2, myVar);
                                        if (rtVar.isEmpty()) {
                                            objA2 = null;
                                            if (rtVarB != null) {
                                                rtVarB.clear();
                                            }
                                            if (rtVarA != null) {
                                                rtVarA.clear();
                                            }
                                        } else {
                                            a(arrayList7, rtVarB, rtVar.keySet());
                                            a(arrayList6, rtVarA, rtVar.values());
                                        }
                                        if (objA == null && objB == null && objA2 == null) {
                                            obj2 = null;
                                        } else {
                                            a(lgVar3, lgVar4, z4, rtVarB, true);
                                            if (objA2 != null) {
                                                arrayList6.add(view);
                                                neVarA.a(objA2, view, arrayList7);
                                                a(neVarA, objA2, objB, rtVarB, myVar.e, myVar.f);
                                                rect2 = new Rect();
                                                viewA = a(rtVarA, myVar, objA, z4);
                                                if (viewA != null) {
                                                    neVarA.a(objA, rect2);
                                                }
                                            } else {
                                                rect2 = null;
                                                viewA = null;
                                            }
                                            oe.a(viewGroup2, new mw(lgVar3, lgVar4, z4, rtVarA, viewA, neVarA, rect2));
                                            obj2 = objA2;
                                        }
                                    }
                                    if (objA != null || obj2 != null || objB != null) {
                                        ArrayList arrayListA = a(neVarA, objB, lgVar2, arrayList7, view);
                                        ArrayList arrayListA2 = a(neVarA, objA, lgVar, arrayList6, view);
                                        a(arrayListA2, 4);
                                        Object objA3 = a(neVarA, objA, objB, obj2, lgVar, z2);
                                        if (objA3 != null) {
                                            if (lgVar2 != null && objB != null && lgVar2.m && lgVar2.C && lgVar2.P) {
                                                lgVar2.a(true);
                                                neVarA.b(objB, lgVar2.K, arrayListA);
                                                oe.a(lgVar2.J, new mu(arrayListA));
                                            }
                                            ArrayList arrayList8 = new ArrayList();
                                            int size5 = arrayList6.size();
                                            for (int i10 = 0; i10 < size5; i10++) {
                                                View view2 = (View) arrayList6.get(i10);
                                                arrayList8.add(ti.m(view2));
                                                ti.a(view2, (String) null);
                                            }
                                            neVarA.a(objA3, objA, arrayListA2, objB, arrayListA, obj2, arrayList6);
                                            neVarA.a(viewGroup2, objA3);
                                            int size6 = arrayList6.size();
                                            ArrayList arrayList9 = new ArrayList();
                                            for (int i11 = 0; i11 < size6; i11++) {
                                                View view3 = (View) arrayList7.get(i11);
                                                String strM = ti.m(view3);
                                                arrayList9.add(strM);
                                                if (strM != null) {
                                                    ti.a(view3, (String) null);
                                                    String str4 = (String) rtVar.get(strM);
                                                    for (int i12 = 0; i12 < size6; i12++) {
                                                        if (str4.equals(arrayList8.get(i12))) {
                                                            ti.a((View) arrayList6.get(i12), strM);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            oe.a(viewGroup2, new nf(neVarA, size6, arrayList6, arrayList8, arrayList7, arrayList9));
                                            a(arrayListA2, 0);
                                            neVarA.a(obj2, arrayList7, arrayList6);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (!lwVar.h.a()) {
                                viewGroup = null;
                            } else {
                                viewGroup = (ViewGroup) lwVar.h.a(iKeyAt);
                            }
                            if (viewGroup != null) {
                                lg lgVar5 = myVar.a;
                                lg lgVar6 = myVar.d;
                                ne neVarA2 = a(lgVar6, lgVar5);
                                if (neVarA2 != null) {
                                    boolean z5 = myVar.b;
                                    boolean z6 = myVar.e;
                                    Object objA4 = a(neVarA2, lgVar5, z5);
                                    Object objB2 = b(neVarA2, lgVar6, z6);
                                    ArrayList arrayList10 = new ArrayList();
                                    ArrayList arrayList11 = new ArrayList();
                                    lg lgVar7 = myVar.a;
                                    lg lgVar8 = myVar.d;
                                    if (lgVar7 == null || lgVar8 == null) {
                                        obj = null;
                                    } else {
                                        boolean z7 = myVar.b;
                                        Object objA5 = rtVar.isEmpty() ? null : a(neVarA2, lgVar7, lgVar8, z7);
                                        rt rtVarB2 = b(neVarA2, rtVar, objA5, myVar);
                                        if (rtVar.isEmpty()) {
                                            objA5 = null;
                                        } else {
                                            arrayList10.addAll(rtVarB2.values());
                                        }
                                        if (objA4 == null && objB2 == null && objA5 == null) {
                                            obj = null;
                                        } else {
                                            a(lgVar7, lgVar8, z7, rtVarB2, true);
                                            if (objA5 != null) {
                                                rect = new Rect();
                                                neVarA2.a(objA5, view, arrayList10);
                                                a(neVarA2, objA5, objB2, rtVarB2, myVar.e, myVar.f);
                                                if (objA4 != null) {
                                                    neVarA2.a(objA4, rect);
                                                }
                                            } else {
                                                rect = null;
                                            }
                                            oe.a(viewGroup, new mx(neVarA2, rtVar, objA5, myVar, arrayList11, view, lgVar7, lgVar8, z7, arrayList10, objA4, rect));
                                            obj = objA5;
                                        }
                                    }
                                    if (objA4 != null || obj != null || objB2 != null) {
                                        ArrayList arrayListA3 = a(neVarA2, objB2, lgVar6, arrayList10, view);
                                        Object obj3 = (arrayListA3 == null || arrayListA3.isEmpty()) ? null : objB2;
                                        neVarA2.b(objA4, view);
                                        Object objA6 = a(neVarA2, objA4, obj3, obj, lgVar5, myVar.b);
                                        if (objA6 != null) {
                                            ArrayList arrayList12 = new ArrayList();
                                            neVarA2.a(objA6, objA4, arrayList12, obj3, arrayListA3, obj, arrayList11);
                                            oe.a(viewGroup, new mv(objA4, neVarA2, view, lgVar5, arrayList11, arrayList12, arrayListA3, obj3));
                                            oe.a(viewGroup, new ng(neVarA2, arrayList11, rtVar));
                                            neVarA2.a(viewGroup, objA6);
                                            oe.a(viewGroup, new nh(neVarA2, arrayList11, rtVar));
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i6 + 1;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private static ne a(lg lgVar, lg lgVar2) {
        ArrayList arrayList = new ArrayList();
        if (lgVar != null) {
            Object objV = lgVar.v();
            if (objV != null) {
                arrayList.add(objV);
            }
            Object objU = lgVar.u();
            if (objU != null) {
                arrayList.add(objU);
            }
            Object objY = lgVar.y();
            if (objY != null) {
                arrayList.add(objY);
            }
        }
        if (lgVar2 != null) {
            Object objT = lgVar2.t();
            if (objT != null) {
                arrayList.add(objT);
            }
            Object objW = lgVar2.w();
            if (objW != null) {
                arrayList.add(objW);
            }
            Object objX = lgVar2.x();
            if (objX != null) {
                arrayList.add(objX);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (b != null && a(b, arrayList)) {
            return b;
        }
        if (c != null && a(c, arrayList)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static boolean a(ne neVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!neVar.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static Object a(ne neVar, lg lgVar, lg lgVar2, boolean z) {
        Object objX;
        if (lgVar == null || lgVar2 == null) {
            return null;
        }
        if (z) {
            objX = lgVar2.y();
        } else {
            objX = lgVar.x();
        }
        return neVar.c(neVar.b(objX));
    }

    private static Object a(ne neVar, lg lgVar, boolean z) {
        Object objT;
        if (lgVar == null) {
            return null;
        }
        if (z) {
            objT = lgVar.w();
        } else {
            objT = lgVar.t();
        }
        return neVar.b(objT);
    }

    private static Object b(ne neVar, lg lgVar, boolean z) {
        Object objV;
        if (lgVar == null) {
            return null;
        }
        if (z) {
            objV = lgVar.u();
        } else {
            objV = lgVar.v();
        }
        return neVar.b(objV);
    }

    private static void a(ArrayList arrayList, rt rtVar, Collection collection) {
        for (int size = rtVar.size() - 1; size >= 0; size--) {
            View view = (View) rtVar.c(size);
            if (collection.contains(ti.m(view))) {
                arrayList.add(view);
            }
        }
    }

    private static rt b(ne neVar, rt rtVar, Object obj, my myVar) {
        oh ohVarF;
        ArrayList arrayList;
        if (rtVar.isEmpty() || obj == null) {
            rtVar.clear();
            return null;
        }
        lg lgVar = myVar.d;
        rt rtVar2 = new rt();
        neVar.a((Map) rtVar2, lgVar.K);
        lb lbVar = myVar.f;
        if (myVar.e) {
            ohVarF = lgVar.E();
            arrayList = lbVar.r;
        } else {
            ohVarF = lgVar.F();
            arrayList = lbVar.q;
        }
        sc.a((Map) rtVar2, (Collection) arrayList);
        if (ohVarF != null) {
            throw new NoSuchMethodError();
        }
        sc.a((Map) rtVar, (Collection) rtVar2.keySet());
        return rtVar2;
    }

    static rt a(ne neVar, rt rtVar, Object obj, my myVar) {
        oh ohVarE;
        ArrayList arrayList;
        lg lgVar = myVar.a;
        View view = lgVar.K;
        if (rtVar.isEmpty() || obj == null || view == null) {
            rtVar.clear();
            return null;
        }
        rt rtVar2 = new rt();
        neVar.a((Map) rtVar2, view);
        lb lbVar = myVar.c;
        if (myVar.b) {
            ohVarE = lgVar.F();
            arrayList = lbVar.q;
        } else {
            ohVarE = lgVar.E();
            arrayList = lbVar.r;
        }
        if (arrayList != null) {
            sc.a((Map) rtVar2, (Collection) arrayList);
            sc.a((Map) rtVar2, rtVar.values());
        }
        if (ohVarE != null) {
            throw new NoSuchMethodError();
        }
        for (int size = rtVar.size() - 1; size >= 0; size--) {
            if (!rtVar2.containsKey((String) rtVar.c(size))) {
                rtVar.d(size);
            }
        }
        return rtVar2;
    }

    static View a(rt rtVar, my myVar, Object obj, boolean z) {
        String str;
        lb lbVar = myVar.c;
        if (obj != null && rtVar != null && lbVar.q != null && !lbVar.q.isEmpty()) {
            if (z) {
                str = (String) lbVar.q.get(0);
            } else {
                str = (String) lbVar.r.get(0);
            }
            return (View) rtVar.get(str);
        }
        return null;
    }

    private static void a(ne neVar, Object obj, Object obj2, rt rtVar, boolean z, lb lbVar) {
        String str;
        if (lbVar.q != null && !lbVar.q.isEmpty()) {
            if (z) {
                str = (String) lbVar.r.get(0);
            } else {
                str = (String) lbVar.q.get(0);
            }
            View view = (View) rtVar.get(str);
            neVar.a(obj, view);
            if (obj2 != null) {
                neVar.a(obj2, view);
            }
        }
    }

    static void a(lg lgVar, lg lgVar2, boolean z, rt rtVar, boolean z2) {
        oh ohVarE;
        if (z) {
            ohVarE = lgVar2.E();
        } else {
            ohVarE = lgVar.E();
        }
        if (ohVarE != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = rtVar == null ? 0 : rtVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(rtVar.b(i));
                arrayList.add(rtVar.c(i));
            }
            if (z2) {
                throw new NoSuchMethodError();
            }
            throw new NoSuchMethodError();
        }
    }

    static ArrayList a(ne neVar, Object obj, lg lgVar, ArrayList arrayList, View view) {
        ArrayList arrayList2 = null;
        if (obj != null) {
            arrayList2 = new ArrayList();
            View view2 = lgVar.K;
            if (view2 != null) {
                neVar.a(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                neVar.a(obj, arrayList2);
            }
        }
        return arrayList2;
    }

    static void a(ArrayList arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    private static Object a(ne neVar, Object obj, Object obj2, Object obj3, lg lgVar, boolean z) {
        if (obj == null || obj2 == null || lgVar == null || z) {
        }
        return neVar.a(obj2, obj, obj3);
    }

    private static void a(lb lbVar, lc lcVar, SparseArray sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        my myVarA;
        my myVarA2;
        lg lgVar = lcVar.b;
        if (lgVar != null && (i = lgVar.A) != 0) {
            switch (z ? a[lcVar.a] : lcVar.a) {
                case 1:
                case 7:
                    if (z2) {
                        z9 = lgVar.O;
                    } else {
                        z9 = (lgVar.m || lgVar.C) ? false : true;
                    }
                    z4 = true;
                    z5 = false;
                    z6 = false;
                    z7 = z9;
                    break;
                case 2:
                default:
                    z4 = false;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    break;
                case 3:
                case 6:
                    if (z2) {
                        z3 = !lgVar.m && lgVar.K != null && lgVar.K.getVisibility() == 0 && lgVar.Q >= 0.0f;
                    } else {
                        z3 = lgVar.m && !lgVar.C;
                    }
                    z4 = false;
                    z5 = z3;
                    z6 = true;
                    z7 = false;
                    break;
                case 4:
                    if (z2) {
                        z8 = lgVar.P && lgVar.m && lgVar.C;
                    } else {
                        z8 = lgVar.m && !lgVar.C;
                    }
                    z4 = false;
                    z5 = z8;
                    z6 = true;
                    z7 = false;
                    break;
                case 5:
                    if (z2) {
                        z10 = lgVar.P && !lgVar.C && lgVar.m;
                    } else {
                        z10 = lgVar.C;
                    }
                    z4 = true;
                    z5 = false;
                    z6 = false;
                    z7 = z10;
                    break;
            }
            my myVar = (my) sparseArray.get(i);
            if (z7) {
                myVarA = a(myVar, sparseArray, i);
                myVarA.a = lgVar;
                myVarA.b = z;
                myVarA.c = lbVar;
            } else {
                myVarA = myVar;
            }
            if (!z2 && z4) {
                if (myVarA != null && myVarA.d == lgVar) {
                    myVarA.d = null;
                }
                lw lwVar = lbVar.a;
                if (lgVar.c <= 0 && lwVar.f > 0 && !lbVar.s) {
                    lwVar.b(lgVar);
                    lwVar.a(lgVar, 1, 0, 0, false);
                }
            }
            if (z5 && (myVarA == null || myVarA.d == null)) {
                myVarA2 = a(myVarA, sparseArray, i);
                myVarA2.d = lgVar;
                myVarA2.e = z;
                myVarA2.f = lbVar;
            } else {
                myVarA2 = myVarA;
            }
            if (!z2 && z6 && myVarA2 != null && myVarA2.a == lgVar) {
                myVarA2.a = null;
            }
        }
    }

    private static my a(my myVar, SparseArray sparseArray, int i) {
        if (myVar == null) {
            my myVar2 = new my();
            sparseArray.put(i, myVar2);
            return myVar2;
        }
        return myVar;
    }
}
