package flm;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kt extends jq {
    private static final String[] r = {"android:visibility:visibility", "android:visibility:parent"};
    public int q = 3;

    @Override // flm.jq
    public final String[] a() {
        return r;
    }

    private static void d(kg kgVar) {
        kgVar.a.put("android:visibility:visibility", Integer.valueOf(kgVar.b.getVisibility()));
        kgVar.a.put("android:visibility:parent", kgVar.b.getParent());
        int[] iArr = new int[2];
        kgVar.b.getLocationOnScreen(iArr);
        kgVar.a.put("android:visibility:screenLocation", iArr);
    }

    @Override // flm.jq
    public void a(kg kgVar) {
        d(kgVar);
    }

    @Override // flm.jq
    public final void b(kg kgVar) {
        d(kgVar);
    }

    private static kw b(kg kgVar, kg kgVar2) {
        kw kwVar = new kw();
        kwVar.a = false;
        kwVar.b = false;
        if (kgVar != null && kgVar.a.containsKey("android:visibility:visibility")) {
            kwVar.c = ((Integer) kgVar.a.get("android:visibility:visibility")).intValue();
            kwVar.e = (ViewGroup) kgVar.a.get("android:visibility:parent");
        } else {
            kwVar.c = -1;
            kwVar.e = null;
        }
        if (kgVar2 != null && kgVar2.a.containsKey("android:visibility:visibility")) {
            kwVar.d = ((Integer) kgVar2.a.get("android:visibility:visibility")).intValue();
            kwVar.f = (ViewGroup) kgVar2.a.get("android:visibility:parent");
        } else {
            kwVar.d = -1;
            kwVar.f = null;
        }
        if (kgVar != null && kgVar2 != null) {
            if (kwVar.c == kwVar.d && kwVar.e == kwVar.f) {
                return kwVar;
            }
            if (kwVar.c != kwVar.d) {
                if (kwVar.c == 0) {
                    kwVar.b = false;
                    kwVar.a = true;
                } else if (kwVar.d == 0) {
                    kwVar.b = true;
                    kwVar.a = true;
                }
            } else if (kwVar.f == null) {
                kwVar.b = false;
                kwVar.a = true;
            } else if (kwVar.e == null) {
                kwVar.b = true;
                kwVar.a = true;
            }
        } else if (kgVar == null && kwVar.d == 0) {
            kwVar.b = true;
            kwVar.a = true;
        } else if (kgVar2 == null && kwVar.c == 0) {
            kwVar.b = false;
            kwVar.a = true;
        }
        return kwVar;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    @Override // flm.jq
    public final Animator a(ViewGroup viewGroup, kg kgVar, kg kgVar2) {
        View view;
        View view2;
        int id;
        kw kwVarB = b(kgVar, kgVar2);
        if (!kwVarB.a || (kwVarB.e == null && kwVarB.f == null)) {
            return null;
        }
        if (kwVarB.b) {
            if ((this.q & 1) != 1 || kgVar2 == null) {
                return null;
            }
            if (kgVar == null) {
                View view3 = (View) kgVar2.b.getParent();
                if (b(b(view3, false), a(view3, false)).a) {
                    return null;
                }
            }
            return a(kgVar2.b, kgVar);
        }
        int i = kwVarB.d;
        if ((this.q & 2) != 2) {
            return null;
        }
        View view4 = kgVar != null ? kgVar.b : null;
        View view5 = kgVar2 != null ? kgVar2.b : null;
        if (view5 == null || view5.getParent() == null) {
            if (view5 != null) {
                view = null;
                view2 = view5;
            } else if (view4 == null) {
                view = null;
                view2 = null;
            } else if (view4.getParent() == null) {
                view2 = view4;
                view = null;
            } else if (view4.getParent() instanceof View) {
                View view6 = (View) view4.getParent();
                if (!b(a(view6, true), b(view6, true)).a) {
                    View viewA = kf.a(viewGroup, view4, view6);
                    view = null;
                    view2 = viewA;
                } else {
                    if (view6.getParent() == null && (id = view6.getId()) != -1) {
                        viewGroup.findViewById(id);
                    }
                    view = null;
                    view2 = null;
                }
            } else {
                view = null;
                view2 = null;
            }
        } else if (i == 4 || view4 == view5) {
            view = view5;
            view2 = null;
        } else {
            View viewA2 = kf.a(viewGroup, view4, (View) view4.getParent());
            view = null;
            view2 = viewA2;
        }
        if (view2 != null && kgVar != null) {
            int[] iArr = (int[]) kgVar.a.get("android:visibility:screenLocation");
            int i2 = iArr[0];
            int i3 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view2.offsetLeftAndRight((i2 - iArr2[0]) - view2.getLeft());
            view2.offsetTopAndBottom((i3 - iArr2[1]) - view2.getTop());
            ki kiVar = new ki(viewGroup);
            kiVar.a(view2);
            Animator animatorB = b(view2, kgVar);
            if (animatorB == null) {
                kiVar.b(view2);
                return animatorB;
            }
            animatorB.addListener(new ku(this, kiVar, view2));
            return animatorB;
        }
        if (view == null) {
            return null;
        }
        int visibility = view.getVisibility();
        km.a(view, 0);
        Animator animatorB2 = b(view, kgVar);
        if (animatorB2 != null) {
            kv kvVar = new kv(view, i, true);
            animatorB2.addListener(kvVar);
            animatorB2.addPauseListener(kvVar);
            a(kvVar);
            return animatorB2;
        }
        km.a(view, visibility);
        return animatorB2;
    }

    public Animator a(View view, kg kgVar) {
        return null;
    }

    public Animator b(View view, kg kgVar) {
        return null;
    }

    @Override // flm.jq
    public final boolean a(kg kgVar, kg kgVar2) {
        if (kgVar == null && kgVar2 == null) {
            return false;
        }
        if (kgVar != null && kgVar2 != null && kgVar2.a.containsKey("android:visibility:visibility") != kgVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        kw kwVarB = b(kgVar, kgVar2);
        if (kwVarB.a) {
            return kwVarB.c == 0 || kwVarB.d == 0;
        }
        return false;
    }
}
