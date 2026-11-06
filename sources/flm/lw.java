package flm;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lw extends lu implements LayoutInflater.Factory2 {
    private ArrayList C;
    public boolean b;
    public SparseArray d;
    public ArrayList e;
    public lt g;
    public lr h;
    public lg i;
    public ArrayList j;
    public ArrayList k;
    public mn l;
    private ArrayList m;
    private ArrayList o;
    private ArrayList p;
    private ArrayList q;
    private lg s;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private ArrayList z;
    public static boolean a = false;
    private static Field t = null;
    private static final Interpolator E = new DecelerateInterpolator(2.5f);
    private static final Interpolator F = new DecelerateInterpolator(1.5f);
    private int n = 0;
    public final ArrayList c = new ArrayList();
    private final CopyOnWriteArrayList r = new CopyOnWriteArrayList();
    public int f = 0;
    private Bundle A = null;
    private SparseArray B = null;
    private Runnable D = new lx(this);

    lw() {
    }

    private static boolean a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
            return false;
        }
        if (!(animator instanceof AnimatorSet)) {
            return false;
        }
        ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
        for (int i = 0; i < childAnimations.size(); i++) {
            if (a(childAnimations.get(i))) {
                return true;
            }
        }
        return false;
    }

    private final void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new rz("FragmentManager"));
        if (this.g != null) {
            try {
                this.g.a("  ", (FileDescriptor) null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            a("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    @Override // flm.lu
    public final ms a() {
        return new lb(this);
    }

    @Override // flm.lu
    public final boolean b() {
        t();
        return a((String) null, -1, 0);
    }

    @Override // flm.lu
    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        a((mk) new ml(this, null, i, 1), false);
    }

    private final boolean a(String str, int i, int i2) {
        lw lwVar;
        g();
        a(true);
        if (this.i != null && (lwVar = this.i.v) != null && lwVar.b()) {
            return true;
        }
        boolean zA = a(this.j, this.k, (String) null, -1, 0);
        if (zA) {
            this.b = true;
            try {
                a(this.j, this.k);
                f();
            } catch (Throwable th) {
                f();
                throw th;
            }
        }
        h();
        j();
        return zA;
    }

    private final lg a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        lg lgVar = (lg) this.d.get(i);
        if (lgVar == null) {
            a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
            return lgVar;
        }
        return lgVar;
    }

    @Override // flm.lu
    public final List c() {
        List list;
        if (this.c.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.c) {
            list = (List) this.c.clone();
        }
        return list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.s != null) {
            ry.a(this.s, sb);
        } else {
            ry.a(this.g, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // flm.lu
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        String str2;
        int size4;
        int size5;
        String str3 = str + "    ";
        if (this.d != null && (size5 = this.d.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size5; i++) {
                lg lgVar = (lg) this.d.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(lgVar);
                if (lgVar != null) {
                    lgVar.a(str3, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.c.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size6; i2++) {
                lg lgVar2 = (lg) this.c.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(lgVar2.toString());
            }
        }
        if (this.o != null && (size4 = this.o.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                lg lgVar3 = (lg) this.o.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(lgVar3.toString());
            }
        }
        if (this.e != null && (size3 = this.e.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                lb lbVar = (lb) this.e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(lbVar.toString());
                printWriter.print(str3);
                printWriter.print("mName=");
                printWriter.print(lbVar.j);
                printWriter.print(" mIndex=");
                printWriter.print(lbVar.l);
                printWriter.print(" mCommitted=");
                printWriter.println(lbVar.k);
                if (lbVar.g != 0) {
                    printWriter.print(str3);
                    printWriter.print("mTransition=#");
                    printWriter.print(Integer.toHexString(lbVar.g));
                    printWriter.print(" mTransitionStyle=#");
                    printWriter.println(Integer.toHexString(lbVar.h));
                }
                if (lbVar.c != 0 || lbVar.d != 0) {
                    printWriter.print(str3);
                    printWriter.print("mEnterAnim=#");
                    printWriter.print(Integer.toHexString(lbVar.c));
                    printWriter.print(" mExitAnim=#");
                    printWriter.println(Integer.toHexString(lbVar.d));
                }
                if (lbVar.e != 0 || lbVar.f != 0) {
                    printWriter.print(str3);
                    printWriter.print("mPopEnterAnim=#");
                    printWriter.print(Integer.toHexString(lbVar.e));
                    printWriter.print(" mPopExitAnim=#");
                    printWriter.println(Integer.toHexString(lbVar.f));
                }
                if (lbVar.m != 0 || lbVar.n != null) {
                    printWriter.print(str3);
                    printWriter.print("mBreadCrumbTitleRes=#");
                    printWriter.print(Integer.toHexString(lbVar.m));
                    printWriter.print(" mBreadCrumbTitleText=");
                    printWriter.println(lbVar.n);
                }
                if (lbVar.o != 0 || lbVar.p != null) {
                    printWriter.print(str3);
                    printWriter.print("mBreadCrumbShortTitleRes=#");
                    printWriter.print(Integer.toHexString(lbVar.o));
                    printWriter.print(" mBreadCrumbShortTitleText=");
                    printWriter.println(lbVar.p);
                }
                if (!lbVar.b.isEmpty()) {
                    printWriter.print(str3);
                    printWriter.println("Operations:");
                    new StringBuilder().append(str3).append("    ");
                    int size7 = lbVar.b.size();
                    for (int i5 = 0; i5 < size7; i5++) {
                        lc lcVar = (lc) lbVar.b.get(i5);
                        switch (lcVar.a) {
                            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                                str2 = "NULL";
                                break;
                            case 1:
                                str2 = "ADD";
                                break;
                            case 2:
                                str2 = "REPLACE";
                                break;
                            case 3:
                                str2 = "REMOVE";
                                break;
                            case 4:
                                str2 = "HIDE";
                                break;
                            case 5:
                                str2 = "SHOW";
                                break;
                            case 6:
                                str2 = "DETACH";
                                break;
                            case 7:
                                str2 = "ATTACH";
                                break;
                            case 8:
                                str2 = "SET_PRIMARY_NAV";
                                break;
                            case 9:
                                str2 = "UNSET_PRIMARY_NAV";
                                break;
                            default:
                                str2 = "cmd=" + lcVar.a;
                                break;
                        }
                        printWriter.print(str3);
                        printWriter.print("  Op #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.print(str2);
                        printWriter.print(" ");
                        printWriter.println(lcVar.b);
                        if (lcVar.c != 0 || lcVar.d != 0) {
                            printWriter.print(str3);
                            printWriter.print("enterAnim=#");
                            printWriter.print(Integer.toHexString(lcVar.c));
                            printWriter.print(" exitAnim=#");
                            printWriter.println(Integer.toHexString(lcVar.d));
                        }
                        if (lcVar.e != 0 || lcVar.f != 0) {
                            printWriter.print(str3);
                            printWriter.print("popEnterAnim=#");
                            printWriter.print(Integer.toHexString(lcVar.e));
                            printWriter.print(" popExitAnim=#");
                            printWriter.println(Integer.toHexString(lcVar.f));
                        }
                    }
                }
            }
        }
        synchronized (this) {
            if (this.p != null && (size2 = this.p.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    Object obj = (lb) this.p.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.q != null && this.q.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.q.toArray()));
            }
        }
        if (this.m != null && (size = this.m.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = (mk) this.m.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.g);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.h);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    private static mf a(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(E);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(F);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new mf(animationSet);
    }

    private static mf a(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(F);
        alphaAnimation.setDuration(220L);
        return new mf(alphaAnimation);
    }

    private final mf a(lg lgVar, int i, boolean z, int i2) {
        boolean z2;
        byte b = 1;
        int iB = lgVar.B();
        lg.p();
        lg.q();
        if (iB != 0) {
            boolean zEquals = "anim".equals(this.g.b.getResources().getResourceTypeName(iB));
            if (!zEquals) {
                z2 = false;
            } else {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.g.b, iB);
                    if (animationLoadAnimation != null) {
                        return new mf(animationLoadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    z2 = false;
                }
            }
            if (!z2) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.g.b, iB);
                    if (animatorLoadAnimator != null) {
                        return new mf(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this.g.b, iB);
                    if (animationLoadAnimation2 != null) {
                        return new mf(animationLoadAnimation2);
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        switch (i) {
            case 4097:
                if (!z) {
                    b = 2;
                }
                break;
            case 4099:
                b = !z ? (byte) 6 : (byte) 5;
                break;
            case 8194:
                b = !z ? (byte) 4 : (byte) 3;
                break;
            default:
                b = -1;
                break;
        }
        if (b < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a(0.0f, 1.0f);
            case 6:
                return a(1.0f, 0.0f);
            default:
                if (i2 == 0 && this.g.e()) {
                    i2 = this.g.f();
                }
                return i2 == 0 ? null : null;
        }
    }

    private static void a(View view, mf mfVar) {
        boolean zA;
        boolean z = false;
        if (view != null && mfVar != null) {
            if (view != null && mfVar != null && view.getLayerType() == 0 && ti.q(view)) {
                if (mfVar.a instanceof AlphaAnimation) {
                    zA = true;
                } else if (mfVar.a instanceof AnimationSet) {
                    List<Animation> animations = ((AnimationSet) mfVar.a).getAnimations();
                    int i = 0;
                    while (true) {
                        if (i >= animations.size()) {
                            zA = false;
                            break;
                        } else {
                            if (animations.get(i) instanceof AlphaAnimation) {
                                zA = true;
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    zA = a(mfVar.b);
                }
                if (zA) {
                    z = true;
                }
            }
            if (z) {
                if (mfVar.b != null) {
                    mfVar.b.addListener(new mg(view));
                    return;
                }
                Animation.AnimationListener animationListenerA = a(mfVar.a);
                view.setLayerType(2, null);
                mfVar.a.setAnimationListener(new mc(view, animationListenerA));
            }
        }
    }

    private static Animation.AnimationListener a(Animation animation) {
        try {
            if (t == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                t = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) t.get(animation);
        } catch (IllegalAccessException e) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e);
            return null;
        } catch (NoSuchFieldException e2) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e2);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:191:0x0435  */
    /* JADX WARN: Code duplicated, block: B:193:0x0439  */
    /* JADX WARN: Code duplicated, block: B:195:0x043f  */
    /* JADX WARN: Code duplicated, block: B:198:0x044f  */
    /* JADX WARN: Code duplicated, block: B:200:0x0455  */
    /* JADX WARN: Code duplicated, block: B:215:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:217:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:220:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:223:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:225:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:227:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:229:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:236:0x0501  */
    /* JADX WARN: Code duplicated, block: B:239:0x050c  */
    /* JADX WARN: Code duplicated, block: B:242:0x051c  */
    /* JADX WARN: Code duplicated, block: B:244:0x0537  */
    /* JADX WARN: Code duplicated, block: B:246:0x0547  */
    /* JADX WARN: Code duplicated, block: B:250:0x055b  */
    /* JADX WARN: Code duplicated, block: B:259:0x0577  */
    /* JADX WARN: Code duplicated, block: B:261:0x0585  */
    /* JADX WARN: Code duplicated, block: B:264:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:265:0x05da  */
    /* JADX WARN: Code duplicated, block: B:267:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:298:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0063  */
    final void a(lg lgVar, int i, int i2, int i3, boolean z) {
        mf mfVarA;
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        String resourceName;
        if ((!lgVar.m || lgVar.D) && i > 1) {
            i = 1;
        }
        if (lgVar.n && i > lgVar.c) {
            i = (lgVar.c == 0 && lgVar.i()) ? 1 : lgVar.c;
        }
        if (lgVar.M && lgVar.c < 3 && i > 2) {
            i = 2;
        }
        if (lgVar.c <= i) {
            if (!lgVar.o || lgVar.p) {
                if (lgVar.G() != null || lgVar.H() != null) {
                    lgVar.a((View) null);
                    lgVar.a((Animator) null);
                    a(lgVar, lgVar.I(), 0, 0, true);
                }
                switch (lgVar.c) {
                    case bbx.MSG_UNBIND_SERVICE /* 0 */:
                        if (i > 0) {
                            if (lgVar.d != null) {
                                lgVar.d.setClassLoader(this.g.b.getClassLoader());
                                lgVar.e = lgVar.d.getSparseParcelableArray("android:view_state");
                                lgVar.j = a(lgVar.d, "android:target_state");
                                if (lgVar.j != null) {
                                    lgVar.l = lgVar.d.getInt("android:target_req_state", 0);
                                }
                                Boolean bool = lgVar.f;
                                lgVar.N = lgVar.d.getBoolean("android:user_visible_hint", true);
                                if (!lgVar.N) {
                                    lgVar.M = true;
                                    if (i > 2) {
                                        i = 2;
                                    }
                                }
                            }
                            lgVar.u = this.g;
                            lgVar.y = this.s;
                            lgVar.t = this.s != null ? this.s.v : this.g.d;
                            if (lgVar.j != null) {
                                if (this.d.get(lgVar.j.g) != lgVar.j) {
                                    throw new IllegalStateException("Fragment " + lgVar + " declared target fragment " + lgVar.j + " that does not belong to this FragmentManager!");
                                }
                                if (lgVar.j.c <= 0) {
                                    a(lgVar.j, 1, 0, 0, true);
                                }
                            }
                            a(lgVar, this.g.b, false);
                            lgVar.I = false;
                            lgVar.a(this.g.b);
                            if (!lgVar.I) {
                                throw new oi("Fragment " + lgVar + " did not call through to super.onAttach()");
                            }
                            if (lgVar.y != null) {
                                lg lgVar2 = lgVar.y;
                                lg.o();
                            }
                            b(lgVar, this.g.b, false);
                            if (!lgVar.S) {
                                a(lgVar, lgVar.d, false);
                                Bundle bundle = lgVar.d;
                                if (lgVar.v != null) {
                                    lgVar.v.k();
                                }
                                lgVar.c = 1;
                                lgVar.I = false;
                                lgVar.a(bundle);
                                lgVar.S = true;
                                if (!lgVar.I) {
                                    throw new oi("Fragment " + lgVar + " did not call through to super.onCreate()");
                                }
                                lgVar.T.a(y.ON_CREATE);
                                b(lgVar, lgVar.d, false);
                            } else {
                                lgVar.g(lgVar.d);
                                lgVar.c = 1;
                            }
                            lgVar.F = false;
                            break;
                        }
                    case 1:
                        if (lgVar.o && !lgVar.r) {
                            lgVar.a(lgVar.f(lgVar.d), (ViewGroup) null, lgVar.d);
                            if (lgVar.K != null) {
                                lgVar.L = lgVar.K;
                                lgVar.K.setSaveFromParentEnabled(false);
                                if (lgVar.C) {
                                    lgVar.K.setVisibility(8);
                                }
                                lgVar.a(lgVar.K, lgVar.d);
                                a(lgVar, lgVar.K, lgVar.d, false);
                            } else {
                                lgVar.L = null;
                            }
                        }
                        if (i > 1) {
                            if (!lgVar.o) {
                                if (lgVar.A != 0) {
                                    if (lgVar.A == -1) {
                                        a(new IllegalArgumentException("Cannot create fragment " + lgVar + " for a container view with no id"));
                                    }
                                    viewGroup2 = (ViewGroup) this.h.a(lgVar.A);
                                    if (viewGroup2 == null && !lgVar.q) {
                                        try {
                                            Context contextJ = lgVar.j();
                                            if (contextJ == null) {
                                                throw new IllegalStateException("Fragment " + lgVar + " not attached to a context.");
                                            }
                                            resourceName = contextJ.getResources().getResourceName(lgVar.A);
                                            a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(lgVar.A) + " (" + resourceName + ") for fragment " + lgVar));
                                        } catch (Resources.NotFoundException e) {
                                            resourceName = "unknown";
                                        }
                                    }
                                } else {
                                    viewGroup2 = null;
                                }
                                lgVar.J = viewGroup2;
                                lgVar.a(lgVar.f(lgVar.d), viewGroup2, lgVar.d);
                                if (lgVar.K != null) {
                                    lgVar.L = lgVar.K;
                                    lgVar.K.setSaveFromParentEnabled(false);
                                    if (viewGroup2 != null) {
                                        viewGroup2.addView(lgVar.K);
                                    }
                                    if (lgVar.C) {
                                        lgVar.K.setVisibility(8);
                                    }
                                    lgVar.a(lgVar.K, lgVar.d);
                                    a(lgVar, lgVar.K, lgVar.d, false);
                                    lgVar.O = lgVar.K.getVisibility() == 0 && lgVar.J != null;
                                } else {
                                    lgVar.L = null;
                                }
                            }
                            Bundle bundle2 = lgVar.d;
                            if (lgVar.v != null) {
                                lgVar.v.k();
                            }
                            lgVar.c = 2;
                            lgVar.I = false;
                            lgVar.c(bundle2);
                            if (!lgVar.I) {
                                throw new oi("Fragment " + lgVar + " did not call through to super.onActivityCreated()");
                            }
                            if (lgVar.v != null) {
                                lgVar.v.m();
                            }
                            c(lgVar, lgVar.d, false);
                            if (lgVar.K != null) {
                                Bundle bundle3 = lgVar.d;
                                if (lgVar.e != null) {
                                    lgVar.L.restoreHierarchyState(lgVar.e);
                                    lgVar.e = null;
                                }
                                lgVar.I = false;
                                lgVar.I = true;
                                if (!lgVar.I) {
                                    throw new oi("Fragment " + lgVar + " did not call through to super.onViewStateRestored()");
                                }
                                if (lgVar.K != null) {
                                    lgVar.U.a(y.ON_CREATE);
                                }
                            }
                            lgVar.d = null;
                            break;
                        }
                    case 2:
                        if (i > 2) {
                            if (lgVar.v != null) {
                                lgVar.v.k();
                                lgVar.v.g();
                            }
                            lgVar.c = 3;
                            lgVar.I = false;
                            lgVar.g();
                            if (!lgVar.I) {
                                throw new oi("Fragment " + lgVar + " did not call through to super.onStart()");
                            }
                            if (lgVar.v != null) {
                                lgVar.v.n();
                            }
                            lgVar.T.a(y.ON_START);
                            if (lgVar.K != null) {
                                lgVar.U.a(y.ON_START);
                            }
                            b(lgVar, false);
                            break;
                        }
                    case 3:
                        if (i > 3) {
                            if (lgVar.v != null) {
                                lgVar.v.k();
                                lgVar.v.g();
                            }
                            lgVar.c = 4;
                            lgVar.I = false;
                            lgVar.r();
                            if (!lgVar.I) {
                                throw new oi("Fragment " + lgVar + " did not call through to super.onResume()");
                            }
                            if (lgVar.v != null) {
                                lgVar.v.o();
                                lgVar.v.g();
                            }
                            lgVar.T.a(y.ON_RESUME);
                            if (lgVar.K != null) {
                                lgVar.U.a(y.ON_RESUME);
                            }
                            c(lgVar, false);
                            lgVar.d = null;
                            lgVar.e = null;
                            break;
                        }
                    default:
                        if (lgVar.c != i) {
                            Log.w("FragmentManager", "moveToState: Fragment state for " + lgVar + " not updated inline; expected state " + i + " found " + lgVar.c);
                            lgVar.c = i;
                        }
                }
            } else {
                return;
            }
        } else if (lgVar.c > i) {
            switch (lgVar.c) {
                case 1:
                    if (i <= 0) {
                        if (this.x) {
                            if (lgVar.G() != null) {
                                View viewG = lgVar.G();
                                lgVar.a((View) null);
                                viewG.clearAnimation();
                            } else if (lgVar.H() != null) {
                                Animator animatorH = lgVar.H();
                                lgVar.a((Animator) null);
                                animatorH.cancel();
                            }
                        }
                        if (lgVar.G() == null || lgVar.H() != null) {
                            lgVar.b(i);
                            i = 1;
                        } else {
                            if (!lgVar.F) {
                                lgVar.T.a(y.ON_DESTROY);
                                if (lgVar.v != null) {
                                    lgVar.v.q();
                                }
                                lgVar.c = 0;
                                lgVar.I = false;
                                lgVar.S = false;
                                lgVar.c();
                                if (!lgVar.I) {
                                    throw new oi("Fragment " + lgVar + " did not call through to super.onDestroy()");
                                }
                                lgVar.v = null;
                                g(lgVar, false);
                            } else {
                                lgVar.c = 0;
                            }
                            lgVar.I = false;
                            lgVar.e();
                            lgVar.R = null;
                            if (!lgVar.I) {
                                throw new oi("Fragment " + lgVar + " did not call through to super.onDetach()");
                            }
                            if (lgVar.v != null) {
                                if (!lgVar.F) {
                                    throw new IllegalStateException("Child FragmentManager of " + lgVar + " was not  destroyed and this fragment is not retaining instance");
                                }
                                lgVar.v.q();
                                lgVar.v = null;
                            }
                            h(lgVar, false);
                            if (!z) {
                                if (!lgVar.F) {
                                    if (lgVar.g >= 0) {
                                        this.d.put(lgVar.g, null);
                                        lgVar.g = -1;
                                        lgVar.h = null;
                                        lgVar.m = false;
                                        lgVar.n = false;
                                        lgVar.o = false;
                                        lgVar.p = false;
                                        lgVar.q = false;
                                        lgVar.s = 0;
                                        lgVar.t = null;
                                        lgVar.v = null;
                                        lgVar.u = null;
                                        lgVar.z = 0;
                                        lgVar.A = 0;
                                        lgVar.B = null;
                                        lgVar.C = false;
                                        lgVar.D = false;
                                        lgVar.F = false;
                                    }
                                } else {
                                    lgVar.u = null;
                                    lgVar.y = null;
                                    lgVar.t = null;
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    if (i < 2) {
                        if (lgVar.K != null && this.g.b() && lgVar.e == null) {
                            j(lgVar);
                        }
                        if (lgVar.K != null) {
                            lgVar.U.a(y.ON_DESTROY);
                        }
                        if (lgVar.v != null) {
                            lgVar.v.b(1);
                        }
                        lgVar.c = 1;
                        lgVar.I = false;
                        lgVar.h();
                        if (!lgVar.I) {
                            throw new oi("Fragment " + lgVar + " did not call through to super.onDestroyView()");
                        }
                        nk.a(lgVar).a();
                        lgVar.r = false;
                        f(lgVar, false);
                        if (lgVar.K != null && lgVar.J != null) {
                            lgVar.J.endViewTransition(lgVar.K);
                            lgVar.K.clearAnimation();
                            if (this.f > 0 || this.x || lgVar.K.getVisibility() != 0 || lgVar.Q < 0.0f) {
                                mfVarA = null;
                            } else {
                                mfVarA = a(lgVar, i2, false, i3);
                            }
                            lgVar.Q = 0.0f;
                            if (mfVarA != null) {
                                view = lgVar.K;
                                viewGroup = lgVar.J;
                                viewGroup.startViewTransition(view);
                                lgVar.b(i);
                                if (mfVarA.a != null) {
                                    mh mhVar = new mh(mfVarA.a, viewGroup, view);
                                    lgVar.a(lgVar.K);
                                    mhVar.setAnimationListener(new ly(this, a(mhVar), viewGroup, lgVar));
                                    a(view, mfVarA);
                                    lgVar.K.startAnimation(mhVar);
                                } else {
                                    Animator animator = mfVarA.b;
                                    lgVar.a(mfVarA.b);
                                    animator.addListener(new ma(this, viewGroup, view, lgVar));
                                    animator.setTarget(lgVar.K);
                                    a(lgVar.K, mfVarA);
                                    animator.start();
                                }
                            }
                            lgVar.J.removeView(lgVar.K);
                        }
                        lgVar.J = null;
                        lgVar.K = null;
                        lgVar.V = null;
                        lgVar.W.b((Object) null);
                        lgVar.L = null;
                        lgVar.p = false;
                    }
                    if (i <= 0) {
                        if (this.x) {
                            if (lgVar.G() != null) {
                                View viewG2 = lgVar.G();
                                lgVar.a((View) null);
                                viewG2.clearAnimation();
                            } else if (lgVar.H() != null) {
                                Animator animatorH2 = lgVar.H();
                                lgVar.a((Animator) null);
                                animatorH2.cancel();
                            }
                        }
                        if (lgVar.G() == null) {
                            lgVar.b(i);
                            i = 1;
                        } else {
                            lgVar.b(i);
                            i = 1;
                        }
                    }
                    break;
                case 3:
                    if (i < 3) {
                        if (lgVar.K != null) {
                            lgVar.U.a(y.ON_STOP);
                        }
                        lgVar.T.a(y.ON_STOP);
                        if (lgVar.v != null) {
                            lgVar.v.p();
                        }
                        lgVar.c = 2;
                        lgVar.I = false;
                        lgVar.i_();
                        if (!lgVar.I) {
                            throw new oi("Fragment " + lgVar + " did not call through to super.onStop()");
                        }
                        e(lgVar, false);
                    }
                    if (i < 2) {
                        if (lgVar.K != null) {
                            j(lgVar);
                        }
                        if (lgVar.K != null) {
                            lgVar.U.a(y.ON_DESTROY);
                        }
                        if (lgVar.v != null) {
                            lgVar.v.b(1);
                        }
                        lgVar.c = 1;
                        lgVar.I = false;
                        lgVar.h();
                        if (!lgVar.I) {
                            throw new oi("Fragment " + lgVar + " did not call through to super.onDestroyView()");
                        }
                        nk.a(lgVar).a();
                        lgVar.r = false;
                        f(lgVar, false);
                        if (lgVar.K != null) {
                            lgVar.J.endViewTransition(lgVar.K);
                            lgVar.K.clearAnimation();
                            if (this.f > 0) {
                                mfVarA = null;
                            } else {
                                mfVarA = null;
                            }
                            lgVar.Q = 0.0f;
                            if (mfVarA != null) {
                                view = lgVar.K;
                                viewGroup = lgVar.J;
                                viewGroup.startViewTransition(view);
                                lgVar.b(i);
                                if (mfVarA.a != null) {
                                    mh mhVar2 = new mh(mfVarA.a, viewGroup, view);
                                    lgVar.a(lgVar.K);
                                    mhVar2.setAnimationListener(new ly(this, a(mhVar2), viewGroup, lgVar));
                                    a(view, mfVarA);
                                    lgVar.K.startAnimation(mhVar2);
                                } else {
                                    Animator animator2 = mfVarA.b;
                                    lgVar.a(mfVarA.b);
                                    animator2.addListener(new ma(this, viewGroup, view, lgVar));
                                    animator2.setTarget(lgVar.K);
                                    a(lgVar.K, mfVarA);
                                    animator2.start();
                                }
                            }
                            lgVar.J.removeView(lgVar.K);
                        }
                        lgVar.J = null;
                        lgVar.K = null;
                        lgVar.V = null;
                        lgVar.W.b((Object) null);
                        lgVar.L = null;
                        lgVar.p = false;
                    }
                    if (i <= 0) {
                        if (this.x) {
                            if (lgVar.G() != null) {
                                View viewG3 = lgVar.G();
                                lgVar.a((View) null);
                                viewG3.clearAnimation();
                            } else if (lgVar.H() != null) {
                                Animator animatorH3 = lgVar.H();
                                lgVar.a((Animator) null);
                                animatorH3.cancel();
                            }
                        }
                        if (lgVar.G() == null) {
                            lgVar.b(i);
                            i = 1;
                        } else {
                            lgVar.b(i);
                            i = 1;
                        }
                    }
                    break;
                case 4:
                    if (i < 4) {
                        if (lgVar.K != null) {
                            lgVar.U.a(y.ON_PAUSE);
                        }
                        lgVar.T.a(y.ON_PAUSE);
                        if (lgVar.v != null) {
                            lgVar.v.b(3);
                        }
                        lgVar.c = 3;
                        lgVar.I = false;
                        lgVar.a_();
                        if (!lgVar.I) {
                            throw new oi("Fragment " + lgVar + " did not call through to super.onPause()");
                        }
                        d(lgVar, false);
                    }
                    if (i < 3) {
                        if (lgVar.K != null) {
                            lgVar.U.a(y.ON_STOP);
                        }
                        lgVar.T.a(y.ON_STOP);
                        if (lgVar.v != null) {
                            lgVar.v.p();
                        }
                        lgVar.c = 2;
                        lgVar.I = false;
                        lgVar.i_();
                        if (!lgVar.I) {
                            throw new oi("Fragment " + lgVar + " did not call through to super.onStop()");
                        }
                        e(lgVar, false);
                    }
                    if (i < 2) {
                        if (lgVar.K != null) {
                            j(lgVar);
                        }
                        if (lgVar.K != null) {
                            lgVar.U.a(y.ON_DESTROY);
                        }
                        if (lgVar.v != null) {
                            lgVar.v.b(1);
                        }
                        lgVar.c = 1;
                        lgVar.I = false;
                        lgVar.h();
                        if (!lgVar.I) {
                            throw new oi("Fragment " + lgVar + " did not call through to super.onDestroyView()");
                        }
                        nk.a(lgVar).a();
                        lgVar.r = false;
                        f(lgVar, false);
                        if (lgVar.K != null) {
                            lgVar.J.endViewTransition(lgVar.K);
                            lgVar.K.clearAnimation();
                            if (this.f > 0) {
                                mfVarA = null;
                            } else {
                                mfVarA = null;
                            }
                            lgVar.Q = 0.0f;
                            if (mfVarA != null) {
                                view = lgVar.K;
                                viewGroup = lgVar.J;
                                viewGroup.startViewTransition(view);
                                lgVar.b(i);
                                if (mfVarA.a != null) {
                                    mh mhVar3 = new mh(mfVarA.a, viewGroup, view);
                                    lgVar.a(lgVar.K);
                                    mhVar3.setAnimationListener(new ly(this, a(mhVar3), viewGroup, lgVar));
                                    a(view, mfVarA);
                                    lgVar.K.startAnimation(mhVar3);
                                } else {
                                    Animator animator3 = mfVarA.b;
                                    lgVar.a(mfVarA.b);
                                    animator3.addListener(new ma(this, viewGroup, view, lgVar));
                                    animator3.setTarget(lgVar.K);
                                    a(lgVar.K, mfVarA);
                                    animator3.start();
                                }
                            }
                            lgVar.J.removeView(lgVar.K);
                        }
                        lgVar.J = null;
                        lgVar.K = null;
                        lgVar.V = null;
                        lgVar.W.b((Object) null);
                        lgVar.L = null;
                        lgVar.p = false;
                    }
                    if (i <= 0) {
                        if (this.x) {
                            if (lgVar.G() != null) {
                                View viewG4 = lgVar.G();
                                lgVar.a((View) null);
                                viewG4.clearAnimation();
                            } else if (lgVar.H() != null) {
                                Animator animatorH4 = lgVar.H();
                                lgVar.a((Animator) null);
                                animatorH4.cancel();
                            }
                        }
                        if (lgVar.G() == null) {
                            lgVar.b(i);
                            i = 1;
                        } else {
                            lgVar.b(i);
                            i = 1;
                        }
                    }
                    break;
            }
        }
        if (lgVar.c != i) {
            Log.w("FragmentManager", "moveToState: Fragment state for " + lgVar + " not updated inline; expected state " + i + " found " + lgVar.c);
            lgVar.c = i;
        }
    }

    private final void i(lg lgVar) {
        a(lgVar, this.f, 0, 0, false);
    }

    final void a(lg lgVar) {
        lg lgVar2;
        if (lgVar != null) {
            int iMin = this.f;
            if (lgVar.n) {
                if (lgVar.i()) {
                    iMin = Math.min(iMin, 1);
                } else {
                    iMin = Math.min(iMin, 0);
                }
            }
            a(lgVar, iMin, lgVar.C(), lgVar.D(), false);
            if (lgVar.K != null) {
                ViewGroup viewGroup = lgVar.J;
                View view = lgVar.K;
                if (viewGroup != null && view != null) {
                    int iIndexOf = this.c.indexOf(lgVar) - 1;
                    while (true) {
                        if (iIndexOf < 0) {
                            lgVar2 = null;
                            break;
                        }
                        lgVar2 = (lg) this.c.get(iIndexOf);
                        if (lgVar2.J == viewGroup && lgVar2.K != null) {
                            break;
                        } else {
                            iIndexOf--;
                        }
                    }
                } else {
                    lgVar2 = null;
                }
                if (lgVar2 != null) {
                    View view2 = lgVar2.K;
                    ViewGroup viewGroup2 = lgVar.J;
                    int iIndexOfChild = viewGroup2.indexOfChild(view2);
                    int iIndexOfChild2 = viewGroup2.indexOfChild(lgVar.K);
                    if (iIndexOfChild2 < iIndexOfChild) {
                        viewGroup2.removeViewAt(iIndexOfChild2);
                        viewGroup2.addView(lgVar.K, iIndexOfChild);
                    }
                }
                if (lgVar.O && lgVar.J != null) {
                    if (lgVar.Q > 0.0f) {
                        lgVar.K.setAlpha(lgVar.Q);
                    }
                    lgVar.Q = 0.0f;
                    lgVar.O = false;
                    mf mfVarA = a(lgVar, lgVar.C(), true, lgVar.D());
                    if (mfVarA != null) {
                        a(lgVar.K, mfVarA);
                        if (mfVarA.a != null) {
                            lgVar.K.startAnimation(mfVarA.a);
                        } else {
                            mfVarA.b.setTarget(lgVar.K);
                            mfVarA.b.start();
                        }
                    }
                }
            }
            if (lgVar.P) {
                if (lgVar.K != null) {
                    mf mfVarA2 = a(lgVar, lgVar.C(), !lgVar.C, lgVar.D());
                    if (mfVarA2 != null && mfVarA2.b != null) {
                        mfVarA2.b.setTarget(lgVar.K);
                        if (lgVar.C) {
                            if (lgVar.K()) {
                                lgVar.a(false);
                            } else {
                                ViewGroup viewGroup3 = lgVar.J;
                                View view3 = lgVar.K;
                                viewGroup3.startViewTransition(view3);
                                mfVarA2.b.addListener(new mb(this, viewGroup3, view3, lgVar));
                            }
                        } else {
                            lgVar.K.setVisibility(0);
                        }
                        a(lgVar.K, mfVarA2);
                        mfVarA2.b.start();
                    } else {
                        if (mfVarA2 != null) {
                            a(lgVar.K, mfVarA2);
                            lgVar.K.startAnimation(mfVarA2.a);
                            mfVarA2.a.start();
                        }
                        lgVar.K.setVisibility((!lgVar.C || lgVar.K()) ? 0 : 8);
                        if (lgVar.K()) {
                            lgVar.a(false);
                        }
                    }
                }
                if (lgVar.m) {
                    boolean z = lgVar.G;
                }
                lgVar.P = false;
                boolean z2 = lgVar.C;
                lg.m();
            }
        }
    }

    final void a(int i, boolean z) {
        if (this.g == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f) {
            this.f = i;
            if (this.d != null) {
                int size = this.c.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a((lg) this.c.get(i2));
                }
                int size2 = this.d.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    lg lgVar = (lg) this.d.valueAt(i3);
                    if (lgVar != null && ((lgVar.n || lgVar.D) && !lgVar.O)) {
                        a(lgVar);
                    }
                }
                s();
                if (this.u && this.g != null && this.f == 4) {
                    this.g.d();
                    this.u = false;
                }
            }
        }
    }

    private final void s() {
        if (this.d != null) {
            for (int i = 0; i < this.d.size(); i++) {
                lg lgVar = (lg) this.d.valueAt(i);
                if (lgVar != null && lgVar.M) {
                    if (this.b) {
                        this.y = true;
                    } else {
                        lgVar.M = false;
                        a(lgVar, this.f, 0, 0, false);
                    }
                }
            }
        }
    }

    final void b(lg lgVar) {
        if (lgVar.g < 0) {
            int i = this.n;
            this.n = i + 1;
            lgVar.a(i, this.s);
            if (this.d == null) {
                this.d = new SparseArray();
            }
            this.d.put(lgVar.g, lgVar);
        }
    }

    public final void a(lg lgVar, boolean z) {
        b(lgVar);
        if (!lgVar.D) {
            if (this.c.contains(lgVar)) {
                throw new IllegalStateException("Fragment already added: " + lgVar);
            }
            synchronized (this.c) {
                this.c.add(lgVar);
            }
            lgVar.m = true;
            lgVar.n = false;
            if (lgVar.K == null) {
                lgVar.P = false;
            }
            boolean z2 = lgVar.G;
            if (z) {
                i(lgVar);
            }
        }
    }

    public final void c(lg lgVar) {
        boolean z = !lgVar.i();
        if (!lgVar.D || z) {
            synchronized (this.c) {
                this.c.remove(lgVar);
            }
            boolean z2 = lgVar.G;
            lgVar.m = false;
            lgVar.n = true;
        }
    }

    public static void d(lg lgVar) {
        if (!lgVar.C) {
            lgVar.C = true;
            lgVar.P = lgVar.P ? false : true;
        }
    }

    public static void e(lg lgVar) {
        if (lgVar.C) {
            lgVar.C = false;
            lgVar.P = lgVar.P ? false : true;
        }
    }

    public final void f(lg lgVar) {
        if (!lgVar.D) {
            lgVar.D = true;
            if (lgVar.m) {
                synchronized (this.c) {
                    this.c.remove(lgVar);
                }
                boolean z = lgVar.G;
                lgVar.m = false;
            }
        }
    }

    public final void g(lg lgVar) {
        if (lgVar.D) {
            lgVar.D = false;
            if (!lgVar.m) {
                if (this.c.contains(lgVar)) {
                    throw new IllegalStateException("Fragment already added: " + lgVar);
                }
                synchronized (this.c) {
                    this.c.add(lgVar);
                }
                lgVar.m = true;
                boolean z = lgVar.G;
            }
        }
    }

    @Override // flm.lu
    public final lg a(int i) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            lg lgVar = (lg) this.c.get(size);
            if (lgVar != null && lgVar.z == i) {
                return lgVar;
            }
        }
        if (this.d != null) {
            for (int size2 = this.d.size() - 1; size2 >= 0; size2--) {
                lg lgVar2 = (lg) this.d.valueAt(size2);
                if (lgVar2 != null && lgVar2.z == i) {
                    return lgVar2;
                }
            }
        }
        return null;
    }

    @Override // flm.lu
    public final lg a(String str) {
        if (str != null) {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                lg lgVar = (lg) this.c.get(size);
                if (lgVar != null && str.equals(lgVar.B)) {
                    return lgVar;
                }
            }
        }
        if (this.d != null && str != null) {
            for (int size2 = this.d.size() - 1; size2 >= 0; size2--) {
                lg lgVar2 = (lg) this.d.valueAt(size2);
                if (lgVar2 != null && str.equals(lgVar2.B)) {
                    return lgVar2;
                }
            }
        }
        return null;
    }

    public final lg b(String str) {
        if (this.d != null && str != null) {
            for (int size = this.d.size() - 1; size >= 0; size--) {
                lg lgVarB = (lg) this.d.valueAt(size);
                if (lgVarB != null) {
                    if (!str.equals(lgVarB.h)) {
                        lgVarB = lgVarB.v != null ? lgVarB.v.b(str) : null;
                    }
                    if (lgVarB != null) {
                        return lgVarB;
                    }
                }
            }
        }
        return null;
    }

    private final void t() {
        if (d()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    @Override // flm.lu
    public final boolean d() {
        return this.v || this.w;
    }

    public final void a(mk mkVar, boolean z) {
        if (!z) {
            t();
        }
        synchronized (this) {
            if (this.x || this.g == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                if (this.m == null) {
                    this.m = new ArrayList();
                }
                this.m.add(mkVar);
                e();
            }
        }
    }

    final void e() {
        synchronized (this) {
            boolean z = (this.C == null || this.C.isEmpty()) ? false : true;
            boolean z2 = this.m != null && this.m.size() == 1;
            if (z || z2) {
                this.g.c.removeCallbacks(this.D);
                this.g.c.post(this.D);
            }
        }
    }

    public final int a(lb lbVar) {
        int size;
        synchronized (this) {
            if (this.q == null || this.q.size() <= 0) {
                if (this.p == null) {
                    this.p = new ArrayList();
                }
                size = this.p.size();
                this.p.add(lbVar);
            } else {
                size = ((Integer) this.q.remove(this.q.size() - 1)).intValue();
                this.p.set(size, lbVar);
            }
        }
        return size;
    }

    final void a(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.g == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.g.c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            t();
        }
        if (this.j == null) {
            this.j = new ArrayList();
            this.k = new ArrayList();
        }
        this.b = true;
        try {
            b((ArrayList) null, (ArrayList) null);
        } finally {
            this.b = false;
        }
    }

    final void f() {
        this.b = false;
        this.k.clear();
        this.j.clear();
    }

    public final boolean g() {
        a(true);
        boolean z = false;
        while (c(this.j, this.k)) {
            this.b = true;
            try {
                a(this.j, this.k);
                f();
                z = true;
            } catch (Throwable th) {
                f();
                throw th;
            }
        }
        h();
        j();
        return z;
    }

    private final void b(ArrayList arrayList, ArrayList arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        int i = 0;
        int size = this.C == null ? 0 : this.C.size();
        while (i < size) {
            mm mmVar = (mm) this.C.get(i);
            if (arrayList != null && !mmVar.a && (iIndexOf2 = arrayList.indexOf(mmVar.b)) != -1 && ((Boolean) arrayList2.get(iIndexOf2)).booleanValue()) {
                mmVar.d();
            } else {
                if ((mmVar.c == 0) || (arrayList != null && mmVar.b.a(arrayList, 0, arrayList.size()))) {
                    this.C.remove(i);
                    i--;
                    size--;
                    if (arrayList != null && !mmVar.a && (iIndexOf = arrayList.indexOf(mmVar.b)) != -1 && ((Boolean) arrayList2.get(iIndexOf)).booleanValue()) {
                        mmVar.d();
                    } else {
                        mmVar.c();
                    }
                }
            }
            i++;
            size = size;
        }
    }

    final void a(ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            b(arrayList, arrayList2);
            int size = arrayList.size();
            int i3 = 0;
            while (i2 < size) {
                if (((lb) arrayList.get(i2)).s) {
                    i = i2;
                } else {
                    if (i3 != i2) {
                        a(arrayList, arrayList2, i3, i2);
                    }
                    int i4 = i2 + 1;
                    if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                        while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((lb) arrayList.get(i4)).s) {
                            i4++;
                        }
                    }
                    int i5 = i4;
                    a(arrayList, arrayList2, i2, i5);
                    i3 = i5;
                    i = i5 - 1;
                }
                i2 = i + 1;
            }
            if (i3 != size) {
                a(arrayList, arrayList2, i3, size);
            }
        }
    }

    private final void a(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        lg lgVar;
        int i5;
        boolean z2;
        boolean z3 = ((lb) arrayList.get(i)).s;
        if (this.z == null) {
            this.z = new ArrayList();
        } else {
            this.z.clear();
        }
        this.z.addAll(this.c);
        lg lgVar2 = this.i;
        int i6 = i;
        boolean z4 = false;
        while (i6 < i2) {
            lb lbVar = (lb) arrayList.get(i6);
            if (!((Boolean) arrayList2.get(i6)).booleanValue()) {
                ArrayList arrayList3 = this.z;
                int i7 = 0;
                while (true) {
                    lgVar = lgVar2;
                    int i8 = i7;
                    if (i8 < lbVar.b.size()) {
                        lc lcVar = (lc) lbVar.b.get(i8);
                        switch (lcVar.a) {
                            case 1:
                            case 7:
                                arrayList3.add(lcVar.b);
                                lgVar2 = lgVar;
                                i5 = i8;
                                break;
                            case 2:
                                lg lgVar3 = lcVar.b;
                                int i9 = lgVar3.A;
                                boolean z5 = false;
                                int size = arrayList3.size() - 1;
                                lg lgVar4 = lgVar;
                                i5 = i8;
                                while (size >= 0) {
                                    lg lgVar5 = (lg) arrayList3.get(size);
                                    if (lgVar5.A != i9) {
                                        z2 = z5;
                                    } else if (lgVar5 == lgVar3) {
                                        z2 = true;
                                    } else {
                                        if (lgVar5 == lgVar4) {
                                            lbVar.b.add(i5, new lc(9, lgVar5));
                                            i5++;
                                            lgVar4 = null;
                                        }
                                        lc lcVar2 = new lc(3, lgVar5);
                                        lcVar2.c = lcVar.c;
                                        lcVar2.e = lcVar.e;
                                        lcVar2.d = lcVar.d;
                                        lcVar2.f = lcVar.f;
                                        lbVar.b.add(i5, lcVar2);
                                        arrayList3.remove(lgVar5);
                                        i5++;
                                        z2 = z5;
                                    }
                                    size--;
                                    z5 = z2;
                                }
                                if (z5) {
                                    lbVar.b.remove(i5);
                                    i5--;
                                    lgVar2 = lgVar4;
                                } else {
                                    lcVar.a = 1;
                                    arrayList3.add(lgVar3);
                                    lgVar2 = lgVar4;
                                }
                                break;
                            case 3:
                            case 6:
                                arrayList3.remove(lcVar.b);
                                if (lcVar.b == lgVar) {
                                    lbVar.b.add(i8, new lc(9, lcVar.b));
                                    int i10 = i8 + 1;
                                    lgVar2 = null;
                                    i5 = i10;
                                    break;
                                }
                            case 4:
                            case 5:
                            default:
                                lgVar2 = lgVar;
                                i5 = i8;
                                break;
                            case 8:
                                lbVar.b.add(i8, new lc(9, lgVar));
                                int i11 = i8 + 1;
                                lgVar2 = lcVar.b;
                                i5 = i11;
                                break;
                        }
                        i7 = i5 + 1;
                    }
                }
            } else {
                ArrayList arrayList4 = this.z;
                int i12 = 0;
                lgVar = lgVar2;
                while (true) {
                    int i13 = i12;
                    if (i13 < lbVar.b.size()) {
                        lc lcVar3 = (lc) lbVar.b.get(i13);
                        switch (lcVar3.a) {
                            case 1:
                            case 7:
                                arrayList4.remove(lcVar3.b);
                                break;
                            case 3:
                            case 6:
                                arrayList4.add(lcVar3.b);
                                break;
                            case 8:
                                lgVar = null;
                                break;
                            case 9:
                                lgVar = lcVar3.b;
                                break;
                        }
                        i12 = i13 + 1;
                    }
                }
            }
            i6++;
            z4 = z4 || lbVar.i;
            lgVar2 = lgVar;
        }
        this.z.clear();
        if (!z3) {
            mt.a(this, arrayList, arrayList2, i, i2, false);
        }
        int i14 = i;
        while (i14 < i2) {
            lb lbVar2 = (lb) arrayList.get(i14);
            if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                lbVar2.a(-1);
                lbVar2.a(i14 == i2 + (-1));
            } else {
                lbVar2.a(1);
                lbVar2.d();
            }
            i14++;
        }
        if (z3) {
            rv rvVar = new rv();
            a(rvVar);
            int i15 = i2 - 1;
            int i16 = i2;
            while (i15 >= i) {
                lb lbVar3 = (lb) arrayList.get(i15);
                boolean zBooleanValue = ((Boolean) arrayList2.get(i15)).booleanValue();
                int i17 = 0;
                while (true) {
                    int i18 = i17;
                    if (i18 < lbVar3.b.size()) {
                        if (lb.b((lc) lbVar3.b.get(i18))) {
                            z = true;
                        } else {
                            i17 = i18 + 1;
                        }
                    } else {
                        z = false;
                    }
                }
                if (z && !lbVar3.a(arrayList, i15 + 1, i2)) {
                    if (this.C == null) {
                        this.C = new ArrayList();
                    }
                    mm mmVar = new mm(lbVar3, zBooleanValue);
                    this.C.add(mmVar);
                    int i19 = 0;
                    while (true) {
                        int i20 = i19;
                        if (i20 < lbVar3.b.size()) {
                            lc lcVar4 = (lc) lbVar3.b.get(i20);
                            if (lb.b(lcVar4)) {
                                lcVar4.b.a(mmVar);
                            }
                            i19 = i20 + 1;
                        } else {
                            if (zBooleanValue) {
                                lbVar3.d();
                            } else {
                                lbVar3.a(false);
                            }
                            int i21 = i16 - 1;
                            if (i15 != i21) {
                                arrayList.remove(i15);
                                arrayList.add(i21, lbVar3);
                            }
                            a(rvVar);
                            i4 = i21;
                        }
                    }
                } else {
                    i4 = i16;
                }
                i15--;
                i16 = i4;
            }
            int size2 = rvVar.size();
            for (int i22 = 0; i22 < size2; i22++) {
                lg lgVar6 = (lg) rvVar.a[i22];
                if (!lgVar6.m) {
                    View view = lgVar6.K;
                    lgVar6.Q = view.getAlpha();
                    view.setAlpha(0.0f);
                }
            }
            i3 = i16;
        } else {
            i3 = i2;
        }
        if (i3 != i && z3) {
            mt.a(this, arrayList, arrayList2, i, i3, true);
            a(this.f, true);
        }
        while (i < i2) {
            lb lbVar4 = (lb) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue() && lbVar4.l >= 0) {
                int i23 = lbVar4.l;
                synchronized (this) {
                    this.p.set(i23, null);
                    if (this.q == null) {
                        this.q = new ArrayList();
                    }
                    this.q.add(Integer.valueOf(i23));
                }
                lbVar4.l = -1;
            }
            i++;
        }
        if (z4) {
        }
    }

    final void a(lb lbVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            lbVar.a(z3);
        } else {
            lbVar.d();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(lbVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            mt.a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            a(this.f, true);
        }
        if (this.d != null) {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                lg lgVar = (lg) this.d.valueAt(i);
                if (lgVar != null && lgVar.K != null && lgVar.O && lbVar.b(lgVar.A)) {
                    if (lgVar.Q > 0.0f) {
                        lgVar.K.setAlpha(lgVar.Q);
                    }
                    if (z3) {
                        lgVar.Q = 0.0f;
                    } else {
                        lgVar.Q = -1.0f;
                        lgVar.O = false;
                    }
                }
            }
        }
    }

    private final void a(rv rvVar) {
        if (this.f > 0) {
            int iMin = Math.min(this.f, 3);
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                lg lgVar = (lg) this.c.get(i);
                if (lgVar.c < iMin) {
                    a(lgVar, iMin, lgVar.B(), lgVar.C(), false);
                    if (lgVar.K != null && !lgVar.C && lgVar.O) {
                        rvVar.add(lgVar);
                    }
                }
            }
        }
    }

    private final boolean c(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this) {
            if (this.m == null || this.m.size() == 0) {
                return false;
            }
            int size = this.m.size();
            boolean zA = false;
            for (int i = 0; i < size; i++) {
                zA |= ((mk) this.m.get(i)).a(arrayList, arrayList2);
            }
            this.m.clear();
            this.g.c.removeCallbacks(this.D);
            return zA;
        }
    }

    final void h() {
        if (this.y) {
            this.y = false;
            s();
        }
    }

    final boolean a(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        if (this.e == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.e.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.e.remove(size));
            arrayList2.add(true);
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = this.e.size() - 1;
                while (size2 >= 0) {
                    lb lbVar = (lb) this.e.get(size2);
                    if ((str != null && str.equals(lbVar.j)) || (i >= 0 && i == lbVar.l)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size2--;
                    while (size2 >= 0) {
                        lb lbVar2 = (lb) this.e.get(size2);
                        if ((str == null || !str.equals(lbVar2.j)) && (i < 0 || i != lbVar2.l)) {
                            break;
                        }
                        size2--;
                    }
                }
                i3 = size2;
            }
            if (i3 == this.e.size() - 1) {
                return false;
            }
            for (int size3 = this.e.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.e.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    static void a(mn mnVar) {
        if (mnVar != null) {
            List list = mnVar.a;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((lg) it.next()).F = true;
                }
            }
            List list2 = mnVar.b;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    a((mn) it2.next());
                }
            }
        }
    }

    private final void u() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        mn mnVar;
        if (this.d != null) {
            int i = 0;
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
            while (i < this.d.size()) {
                lg lgVar = (lg) this.d.valueAt(i);
                if (lgVar != null) {
                    if (lgVar.E) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(lgVar);
                        lgVar.k = lgVar.j != null ? lgVar.j.g : -1;
                    }
                    if (lgVar.v != null) {
                        lgVar.v.u();
                        mnVar = lgVar.v.l;
                    } else {
                        mnVar = lgVar.w;
                    }
                    if (arrayList2 == null && mnVar != null) {
                        arrayList2 = new ArrayList(this.d.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(mnVar);
                    }
                    if (arrayList == null && lgVar.x != null) {
                        arrayList = new ArrayList(this.d.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(lgVar.x);
                    }
                }
                i++;
                arrayList3 = arrayList3;
                arrayList2 = arrayList2;
                arrayList = arrayList;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.l = null;
        } else {
            this.l = new mn(arrayList3, arrayList2, arrayList);
        }
    }

    private final void j(lg lgVar) {
        if (lgVar.L != null) {
            if (this.B == null) {
                this.B = new SparseArray();
            } else {
                this.B.clear();
            }
            lgVar.L.saveHierarchyState(this.B);
            if (this.B.size() > 0) {
                lgVar.e = this.B;
                this.B = null;
            }
        }
    }

    final Parcelable i() {
        int[] iArr;
        int size;
        boolean z;
        Bundle bundle;
        Parcelable parcelableI;
        ld[] ldVarArr = null;
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                ((mm) this.C.remove(0)).c();
            }
        }
        int size2 = this.d == null ? 0 : this.d.size();
        for (int i = 0; i < size2; i++) {
            lg lgVar = (lg) this.d.valueAt(i);
            if (lgVar != null) {
                if (lgVar.G() != null) {
                    int I = lgVar.I();
                    View viewG = lgVar.G();
                    Animation animation = viewG.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        viewG.clearAnimation();
                    }
                    lgVar.a((View) null);
                    a(lgVar, I, 0, 0, false);
                } else if (lgVar.H() != null) {
                    lgVar.H().end();
                }
            }
        }
        g();
        this.v = true;
        this.l = null;
        if (this.d == null || this.d.size() <= 0) {
            return null;
        }
        int size3 = this.d.size();
        mq[] mqVarArr = new mq[size3];
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size3) {
            lg lgVar2 = (lg) this.d.valueAt(i2);
            if (lgVar2 != null) {
                if (lgVar2.g < 0) {
                    a(new IllegalStateException("Failure saving state: active " + lgVar2 + " has cleared index: " + lgVar2.g));
                }
                mq mqVar = new mq(lgVar2);
                mqVarArr[i2] = mqVar;
                if (lgVar2.c > 0 && mqVar.k == null) {
                    if (this.A == null) {
                        this.A = new Bundle();
                    }
                    Bundle bundle2 = this.A;
                    lgVar2.d(bundle2);
                    if (lgVar2.v != null && (parcelableI = lgVar2.v.i()) != null) {
                        bundle2.putParcelable("android:support:fragments", parcelableI);
                    }
                    d(lgVar2, this.A, false);
                    if (this.A.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = this.A;
                        this.A = null;
                    }
                    if (lgVar2.K != null) {
                        j(lgVar2);
                    }
                    if (lgVar2.e != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", lgVar2.e);
                    }
                    if (!lgVar2.N) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", lgVar2.N);
                    }
                    mqVar.k = bundle;
                    if (lgVar2.j != null) {
                        if (lgVar2.j.g < 0) {
                            a(new IllegalStateException("Failure saving state: " + lgVar2 + " has target not in fragment manager: " + lgVar2.j));
                        }
                        if (mqVar.k == null) {
                            mqVar.k = new Bundle();
                        }
                        Bundle bundle3 = mqVar.k;
                        lg lgVar3 = lgVar2.j;
                        if (lgVar3.g < 0) {
                            a(new IllegalStateException("Fragment " + lgVar3 + " is not currently in the FragmentManager"));
                        }
                        bundle3.putInt("android:target_state", lgVar3.g);
                        if (lgVar2.l != 0) {
                            mqVar.k.putInt("android:target_req_state", lgVar2.l);
                            z = true;
                        }
                    }
                } else {
                    mqVar.k = lgVar2.d;
                }
                z = true;
            } else {
                z = z2;
            }
            i2++;
            z2 = z;
        }
        if (!z2) {
            return null;
        }
        int size4 = this.c.size();
        if (size4 > 0) {
            iArr = new int[size4];
            for (int i3 = 0; i3 < size4; i3++) {
                iArr[i3] = ((lg) this.c.get(i3)).g;
                if (iArr[i3] < 0) {
                    a(new IllegalStateException("Failure saving state: active " + this.c.get(i3) + " has cleared index: " + iArr[i3]));
                }
            }
        } else {
            iArr = null;
        }
        if (this.e != null && (size = this.e.size()) > 0) {
            ldVarArr = new ld[size];
            for (int i4 = 0; i4 < size; i4++) {
                ldVarArr[i4] = new ld((lb) this.e.get(i4));
            }
        }
        mo moVar = new mo();
        moVar.a = mqVarArr;
        moVar.b = iArr;
        moVar.c = ldVarArr;
        if (this.i != null) {
            moVar.d = this.i.g;
        }
        moVar.e = this.n;
        u();
        return moVar;
    }

    final void a(Parcelable parcelable, mn mnVar) {
        List list;
        List list2;
        mn mnVar2;
        if (parcelable != null) {
            mo moVar = (mo) parcelable;
            if (moVar.a != null) {
                if (mnVar == null) {
                    list = null;
                    list2 = null;
                } else {
                    List list3 = mnVar.a;
                    List list4 = mnVar.b;
                    List list5 = mnVar.c;
                    int size = list3 != null ? list3.size() : 0;
                    for (int i = 0; i < size; i++) {
                        lg lgVar = (lg) list3.get(i);
                        int i2 = 0;
                        while (i2 < moVar.a.length && moVar.a[i2].b != lgVar.g) {
                            i2++;
                        }
                        if (i2 == moVar.a.length) {
                            a(new IllegalStateException("Could not find active fragment with index " + lgVar.g));
                        }
                        mq mqVar = moVar.a[i2];
                        mqVar.l = lgVar;
                        lgVar.e = null;
                        lgVar.s = 0;
                        lgVar.p = false;
                        lgVar.m = false;
                        lgVar.j = null;
                        if (mqVar.k != null) {
                            mqVar.k.setClassLoader(this.g.b.getClassLoader());
                            lgVar.e = mqVar.k.getSparseParcelableArray("android:view_state");
                            lgVar.d = mqVar.k;
                        }
                    }
                    list2 = list5;
                    list = list4;
                }
                this.d = new SparseArray(moVar.a.length);
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 >= moVar.a.length) {
                        break;
                    }
                    mq mqVar2 = moVar.a[i4];
                    if (mqVar2 != null) {
                        if (list == null || i4 >= list.size()) {
                            mnVar2 = null;
                        } else {
                            mnVar2 = (mn) list.get(i4);
                        }
                        bl blVar = null;
                        if (list2 != null && i4 < list2.size()) {
                            blVar = (bl) list2.get(i4);
                        }
                        lt ltVar = this.g;
                        lr lrVar = this.h;
                        lg lgVar2 = this.s;
                        if (mqVar2.l == null) {
                            Context context = ltVar.b;
                            if (mqVar2.i != null) {
                                mqVar2.i.setClassLoader(context.getClassLoader());
                            }
                            if (lrVar != null) {
                                mqVar2.l = lrVar.a(context, mqVar2.a, mqVar2.i);
                            } else {
                                mqVar2.l = lg.a(context, mqVar2.a, mqVar2.i);
                            }
                            if (mqVar2.k != null) {
                                mqVar2.k.setClassLoader(context.getClassLoader());
                                mqVar2.l.d = mqVar2.k;
                            }
                            mqVar2.l.a(mqVar2.b, lgVar2);
                            mqVar2.l.o = mqVar2.c;
                            mqVar2.l.q = true;
                            mqVar2.l.z = mqVar2.d;
                            mqVar2.l.A = mqVar2.e;
                            mqVar2.l.B = mqVar2.f;
                            mqVar2.l.E = mqVar2.g;
                            mqVar2.l.D = mqVar2.h;
                            mqVar2.l.C = mqVar2.j;
                            mqVar2.l.t = ltVar.d;
                        }
                        mqVar2.l.w = mnVar2;
                        mqVar2.l.x = blVar;
                        lg lgVar3 = mqVar2.l;
                        this.d.put(lgVar3.g, lgVar3);
                        mqVar2.l = null;
                    }
                    i3 = i4 + 1;
                }
                if (mnVar != null) {
                    List list6 = mnVar.a;
                    int size2 = list6 != null ? list6.size() : 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        lg lgVar4 = (lg) list6.get(i5);
                        if (lgVar4.k >= 0) {
                            lgVar4.j = (lg) this.d.get(lgVar4.k);
                            if (lgVar4.j == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + lgVar4 + " target no longer exists: " + lgVar4.k);
                            }
                        }
                    }
                }
                this.c.clear();
                if (moVar.b != null) {
                    for (int i6 = 0; i6 < moVar.b.length; i6++) {
                        lg lgVar5 = (lg) this.d.get(moVar.b[i6]);
                        if (lgVar5 == null) {
                            a(new IllegalStateException("No instantiated fragment for index #" + moVar.b[i6]));
                        }
                        lgVar5.m = true;
                        if (this.c.contains(lgVar5)) {
                            throw new IllegalStateException("Already added!");
                        }
                        synchronized (this.c) {
                            this.c.add(lgVar5);
                        }
                    }
                }
                if (moVar.c != null) {
                    this.e = new ArrayList(moVar.c.length);
                    for (int i7 = 0; i7 < moVar.c.length; i7++) {
                        ld ldVar = moVar.c[i7];
                        lb lbVar = new lb(this);
                        int i8 = 0;
                        while (i8 < ldVar.a.length) {
                            lc lcVar = new lc();
                            int i9 = i8 + 1;
                            lcVar.a = ldVar.a[i8];
                            int i10 = i9 + 1;
                            int i11 = ldVar.a[i9];
                            if (i11 >= 0) {
                                lcVar.b = (lg) this.d.get(i11);
                            } else {
                                lcVar.b = null;
                            }
                            int i12 = i10 + 1;
                            lcVar.c = ldVar.a[i10];
                            int i13 = i12 + 1;
                            lcVar.d = ldVar.a[i12];
                            int i14 = i13 + 1;
                            lcVar.e = ldVar.a[i13];
                            i8 = i14 + 1;
                            lcVar.f = ldVar.a[i14];
                            lbVar.c = lcVar.c;
                            lbVar.d = lcVar.d;
                            lbVar.e = lcVar.e;
                            lbVar.f = lcVar.f;
                            lbVar.a(lcVar);
                        }
                        lbVar.g = ldVar.b;
                        lbVar.h = ldVar.c;
                        lbVar.j = ldVar.d;
                        lbVar.l = ldVar.e;
                        lbVar.i = true;
                        lbVar.m = ldVar.f;
                        lbVar.n = ldVar.g;
                        lbVar.o = ldVar.h;
                        lbVar.p = ldVar.i;
                        lbVar.q = ldVar.j;
                        lbVar.r = ldVar.k;
                        lbVar.s = ldVar.l;
                        lbVar.a(1);
                        this.e.add(lbVar);
                        if (lbVar.l >= 0) {
                            int i15 = lbVar.l;
                            synchronized (this) {
                                if (this.p == null) {
                                    this.p = new ArrayList();
                                }
                                int size3 = this.p.size();
                                if (i15 < size3) {
                                    this.p.set(i15, lbVar);
                                } else {
                                    while (size3 < i15) {
                                        this.p.add(null);
                                        if (this.q == null) {
                                            this.q = new ArrayList();
                                        }
                                        this.q.add(Integer.valueOf(size3));
                                        size3++;
                                    }
                                    this.p.add(lbVar);
                                }
                            }
                        }
                    }
                } else {
                    this.e = null;
                }
                if (moVar.d >= 0) {
                    this.i = (lg) this.d.get(moVar.d);
                }
                this.n = moVar.e;
            }
        }
    }

    final void j() {
        if (this.d != null) {
            for (int size = this.d.size() - 1; size >= 0; size--) {
                if (this.d.valueAt(size) == null) {
                    this.d.delete(this.d.keyAt(size));
                }
            }
        }
    }

    public final void a(lt ltVar, lr lrVar, lg lgVar) {
        if (this.g != null) {
            throw new IllegalStateException("Already attached");
        }
        this.g = ltVar;
        this.h = lrVar;
        this.s = lgVar;
    }

    public final void k() {
        this.l = null;
        this.v = false;
        this.w = false;
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            lg lgVar = (lg) this.c.get(i);
            if (lgVar != null && lgVar.v != null) {
                lgVar.v.k();
            }
        }
    }

    public final void l() {
        this.v = false;
        this.w = false;
        b(1);
    }

    public final void m() {
        this.v = false;
        this.w = false;
        b(2);
    }

    public final void n() {
        this.v = false;
        this.w = false;
        b(3);
    }

    public final void o() {
        this.v = false;
        this.w = false;
        b(4);
    }

    public final void p() {
        this.w = true;
        b(2);
    }

    public final void q() {
        this.x = true;
        g();
        b(0);
        this.g = null;
        this.h = null;
        this.s = null;
    }

    final void b(int i) {
        try {
            this.b = true;
            a(i, false);
            this.b = false;
            g();
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void b(boolean z) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            lg lgVar = (lg) this.c.get(size);
            if (lgVar != null && lgVar.v != null) {
                lgVar.v.b(z);
            }
        }
    }

    public final void c(boolean z) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            lg lgVar = (lg) this.c.get(size);
            if (lgVar != null && lgVar.v != null) {
                lgVar.v.c(z);
            }
        }
    }

    public final void a(Configuration configuration) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.c.size()) {
                lg lgVar = (lg) this.c.get(i2);
                if (lgVar != null) {
                    lgVar.onConfigurationChanged(configuration);
                    if (lgVar.v != null) {
                        lgVar.v.a(configuration);
                    }
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public final void r() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.c.size()) {
                lg lgVar = (lg) this.c.get(i2);
                if (lgVar != null) {
                    lgVar.onLowMemory();
                    if (lgVar.v != null) {
                        lgVar.v.r();
                    }
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public final boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.f <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        int i = 0;
        boolean z = false;
        while (i < this.c.size()) {
            lg lgVar = (lg) this.c.get(i);
            if (lgVar != null) {
                if ((lgVar.C || lgVar.v == null) ? false : lgVar.v.a(menu, menuInflater) | false) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(lgVar);
                }
            }
            i++;
            z = z;
        }
        if (this.o != null) {
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                lg lgVar2 = (lg) this.o.get(i2);
                if (arrayList == null || !arrayList.contains(lgVar2)) {
                    lg.s();
                }
            }
        }
        this.o = arrayList;
        return z;
    }

    public final boolean a(Menu menu) {
        if (this.f <= 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.c.size(); i++) {
            lg lgVar = (lg) this.c.get(i);
            if (lgVar != null) {
                if ((lgVar.C || lgVar.v == null) ? false : lgVar.v.a(menu) | false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean a(MenuItem menuItem) {
        if (this.f <= 0) {
            return false;
        }
        for (int i = 0; i < this.c.size(); i++) {
            lg lgVar = (lg) this.c.get(i);
            if (lgVar != null) {
                if ((lgVar.C || lgVar.v == null || !lgVar.v.a(menuItem)) ? false : true) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(MenuItem menuItem) {
        if (this.f <= 0) {
            return false;
        }
        for (int i = 0; i < this.c.size(); i++) {
            lg lgVar = (lg) this.c.get(i);
            if (lgVar != null) {
                if ((lgVar.C || lgVar.v == null || !lgVar.v.b(menuItem)) ? false : true) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(Menu menu) {
        if (this.f > 0) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.c.size()) {
                    lg lgVar = (lg) this.c.get(i2);
                    if (lgVar != null && !lgVar.C && lgVar.v != null) {
                        lgVar.v.b(menu);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(lg lgVar) {
        if (lgVar != null && (this.d.get(lgVar.g) != lgVar || (lgVar.u != null && lgVar.t != this))) {
            throw new IllegalArgumentException("Fragment " + lgVar + " is not an active fragment of FragmentManager " + this);
        }
        this.i = lgVar;
    }

    @Override // flm.lu
    public final void a(lv lvVar, boolean z) {
        this.r.add(new mi(lvVar, true));
    }

    private final void a(lg lgVar, Context context, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.a(lgVar, context, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void b(lg lgVar, Context context, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.b(lgVar, context, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void a(lg lgVar, Bundle bundle, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.a(lgVar, bundle, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void b(lg lgVar, Bundle bundle, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.b(lgVar, bundle, true);
            }
        }
        for (mi miVar : this.r) {
            if (!z || miVar.b) {
                miVar.a.a(lgVar);
            }
        }
    }

    private final void c(lg lgVar, Bundle bundle, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.c(lgVar, bundle, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void a(lg lgVar, View view, Bundle bundle, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.a(lgVar, view, bundle, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void b(lg lgVar, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.b(lgVar, true);
            }
        }
        for (mi miVar : this.r) {
            if (!z || miVar.b) {
                miVar.a.b(lgVar);
            }
        }
    }

    private final void c(lg lgVar, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.c(lgVar, true);
            }
        }
        for (mi miVar : this.r) {
            if (!z || miVar.b) {
                miVar.a.c(lgVar);
            }
        }
    }

    private final void d(lg lgVar, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.d(lgVar, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void e(lg lgVar, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.e(lgVar, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void d(lg lgVar, Bundle bundle, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.d(lgVar, bundle, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void f(lg lgVar, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.f(lgVar, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void g(lg lgVar, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.g(lgVar, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void h(lg lgVar, boolean z) {
        if (this.s != null) {
            lw lwVar = this.s.t;
            if (lwVar instanceof lw) {
                lwVar.h(lgVar, true);
            }
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static int c(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        lg lgVar;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mj.a);
        String string = attributeValue == null ? typedArrayObtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string2 = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (!lg.a(this.g.b, string)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        lg lgVarA = resourceId != -1 ? a(resourceId) : null;
        if (lgVarA == null && string2 != null) {
            lgVarA = a(string2);
        }
        if (lgVarA == null && id != -1) {
            lgVarA = a(id);
        }
        if (lgVarA == null) {
            lg lgVarA2 = this.h.a(context, string, null);
            lgVarA2.o = true;
            lgVarA2.z = resourceId != 0 ? resourceId : id;
            lgVarA2.A = id;
            lgVarA2.B = string2;
            lgVarA2.p = true;
            lgVarA2.t = this;
            lgVarA2.u = this.g;
            lgVarA2.a(attributeSet, lgVarA2.d);
            a(lgVarA2, true);
            lgVar = lgVarA2;
        } else {
            if (lgVarA.p) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
            }
            lgVarA.p = true;
            lgVarA.u = this.g;
            if (!lgVarA.F) {
                lgVarA.a(attributeSet, lgVarA.d);
            }
            lgVar = lgVarA;
        }
        if (this.f <= 0 && lgVar.o) {
            a(lgVar, 1, 0, 0, false);
        } else {
            i(lgVar);
        }
        if (lgVar.K == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            lgVar.K.setId(resourceId);
        }
        if (lgVar.K.getTag() == null) {
            lgVar.K.setTag(string2);
        }
        return lgVar.K;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }
}
