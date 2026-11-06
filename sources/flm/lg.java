package flm;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class lg implements ComponentCallbacks, View.OnCreateContextMenuListener, af, bm {
    private static final so a = new so();
    public static final Object b = new Object();
    public int A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean I;
    public ViewGroup J;
    public View K;
    public View L;
    public boolean M;
    public boolean O;
    public boolean P;
    public float Q;
    public LayoutInflater R;
    public boolean S;
    public ag U;
    public af V;
    private lk X;
    public Bundle d;
    public SparseArray e;
    public Boolean f;
    public String h;
    public Bundle i;
    public lg j;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public lw t;
    public lt u;
    public lw v;
    public mn w;
    public bl x;
    public lg y;
    public int z;
    public int c = 0;
    public int g = -1;
    public int k = -1;
    public boolean H = true;
    public boolean N = true;
    public ag T = new ag(this);
    public as W = new as();

    @Override // flm.af
    public x getLifecycle() {
        return this.T;
    }

    @Override // flm.bm
    public final bl d() {
        if (j() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.x == null) {
            this.x = new bl();
        }
        return this.x;
    }

    public static lg a(Context context, String str, Bundle bundle) {
        try {
            Class<?> clsLoadClass = (Class) a.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                a.put(str, clsLoadClass);
            }
            lg lgVar = (lg) clsLoadClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(lgVar.getClass().getClassLoader());
                lgVar.e(bundle);
            }
            return lgVar;
        } catch (ClassNotFoundException e) {
            throw new ll("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new ll("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new ll("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new ll("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new ll("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    static boolean a(Context context, String str) {
        try {
            Class<?> clsLoadClass = (Class) a.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                a.put(str, clsLoadClass);
            }
            return lg.class.isAssignableFrom(clsLoadClass);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    final void a(int i, lg lgVar) {
        this.g = i;
        if (lgVar != null) {
            this.h = lgVar.h + ":" + this.g;
        } else {
            this.h = "android:fragment:" + this.g;
        }
    }

    final boolean i() {
        return this.s > 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        ry.a(this, sb);
        if (this.g >= 0) {
            sb.append(" #");
            sb.append(this.g);
        }
        if (this.z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.z));
        }
        if (this.B != null) {
            sb.append(" ");
            sb.append(this.B);
        }
        sb.append('}');
        return sb.toString();
    }

    public final void e(Bundle bundle) {
        boolean zD;
        if (this.g >= 0) {
            if (this.t == null) {
                zD = false;
            } else {
                zD = this.t.d();
            }
            if (zD) {
                throw new IllegalStateException("Fragment already active and state has been saved");
            }
        }
        this.i = bundle;
    }

    public final Context j() {
        if (this.u == null) {
            return null;
        }
        return this.u.b;
    }

    public final ln k() {
        if (this.u == null) {
            return null;
        }
        return (ln) this.u.a;
    }

    public final lu l() {
        if (this.v == null) {
            f();
            if (this.c >= 4) {
                this.v.o();
            } else if (this.c >= 3) {
                this.v.n();
            } else if (this.c >= 2) {
                this.v.m();
            } else if (this.c > 0) {
                this.v.l();
            }
        }
        return this.v;
    }

    public static void m() {
    }

    public void startActivityForResult(Intent intent, int i) {
        if (this.u == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.u.a(this, intent, i, (Bundle) null);
    }

    public void a(int i, int i2, Intent intent) {
    }

    public static void n() {
    }

    public LayoutInflater b(Bundle bundle) {
        if (this.u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterC = this.u.c();
        l();
        tc.a(layoutInflaterC, this.v);
        return layoutInflaterC;
    }

    final LayoutInflater f(Bundle bundle) {
        this.R = b(bundle);
        return this.R;
    }

    public final void a(AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
        if ((this.u == null ? null : this.u.a) != null) {
            this.I = false;
            this.I = true;
        }
    }

    public static void o() {
    }

    public void a(Context context) {
        this.I = true;
        if ((this.u == null ? null : this.u.a) != null) {
            this.I = false;
            this.I = true;
        }
    }

    public static Animation p() {
        return null;
    }

    public static Animator q() {
        return null;
    }

    public void a(Bundle bundle) {
        this.I = true;
        g(bundle);
        if (this.v != null) {
            if (!(this.v.f > 0)) {
                this.v.l();
            }
        }
    }

    final void g(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.v == null) {
                f();
            }
            this.v.a(parcelable, this.w);
            this.w = null;
            this.v.l();
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void a(View view, Bundle bundle) {
    }

    public void c(Bundle bundle) {
        this.I = true;
    }

    public void g() {
        this.I = true;
    }

    public void r() {
        this.I = true;
    }

    public void d(Bundle bundle) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.I = true;
    }

    public void a_() {
        this.I = true;
    }

    public void i_() {
        this.I = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.I = true;
    }

    public void h() {
        this.I = true;
    }

    public void c() {
        this.I = true;
        ln lnVarK = k();
        boolean z = lnVarK != null && lnVarK.isChangingConfigurations();
        if (this.x != null && !z) {
            this.x.a();
        }
    }

    public void e() {
        this.I = true;
    }

    public static void s() {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        k().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final Object t() {
        if (this.X == null) {
        }
        return null;
    }

    public final Object u() {
        if (this.X == null) {
            return null;
        }
        return this.X.h == b ? t() : this.X.h;
    }

    public final Object v() {
        if (this.X == null) {
        }
        return null;
    }

    public final Object w() {
        if (this.X == null) {
            return null;
        }
        return this.X.j == b ? v() : this.X.j;
    }

    public final Object x() {
        if (this.X == null) {
        }
        return null;
    }

    public final Object y() {
        if (this.X == null) {
            return null;
        }
        return this.X.l == b ? x() : this.X.l;
    }

    final void z() {
        lm lmVar = null;
        if (this.X != null) {
            this.X.o = false;
            lm lmVar2 = this.X.p;
            this.X.p = null;
            lmVar = lmVar2;
        }
        if (lmVar != null) {
            lmVar.a();
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mTag=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.c);
        printWriter.print(" mIndex=");
        printWriter.print(this.g);
        printWriter.print(" mWho=");
        printWriter.print(this.h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.C);
        printWriter.print(" mDetached=");
        printWriter.print(this.D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.H);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.E);
        printWriter.print(" mRetaining=");
        printWriter.print(this.F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.N);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.t);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.u);
        }
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.y);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.i);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.d);
        }
        if (this.e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.e);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.j);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.l);
        }
        if (B() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(B());
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.K);
        }
        if (G() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(G());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(I());
        }
        if (j() != null) {
            nk.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.v + ":");
            this.v.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    private final void f() {
        if (this.u == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.v = new lw();
        this.v.a(this.u, new li(this), this);
    }

    final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.v != null) {
            this.v.k();
        }
        this.r = true;
        this.V = new lj(this);
        this.U = null;
        this.K = a(layoutInflater, viewGroup);
        if (this.K != null) {
            this.V.getLifecycle();
            this.W.b(this.V);
        } else {
            if (this.U != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.V = null;
        }
    }

    final void a(lm lmVar) {
        A();
        if (lmVar != this.X.p) {
            if (lmVar != null && this.X.p != null) {
                throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
            }
            if (lmVar != null) {
                lmVar.b();
            }
        }
    }

    final lk A() {
        if (this.X == null) {
            this.X = new lk();
        }
        return this.X;
    }

    final int B() {
        if (this.X == null) {
            return 0;
        }
        return this.X.d;
    }

    final void a(int i) {
        if (this.X != null || i != 0) {
            A().d = i;
        }
    }

    final int C() {
        if (this.X == null) {
            return 0;
        }
        return this.X.e;
    }

    final void a(int i, int i2) {
        if (this.X != null || i != 0 || i2 != 0) {
            A();
            this.X.e = i;
            this.X.f = i2;
        }
    }

    final int D() {
        if (this.X == null) {
            return 0;
        }
        return this.X.f;
    }

    final oh E() {
        if (this.X == null) {
        }
        return null;
    }

    final oh F() {
        if (this.X == null) {
        }
        return null;
    }

    final View G() {
        if (this.X == null) {
            return null;
        }
        return this.X.a;
    }

    final void a(View view) {
        A().a = view;
    }

    final void a(Animator animator) {
        A().b = animator;
    }

    final Animator H() {
        if (this.X == null) {
            return null;
        }
        return this.X.b;
    }

    final int I() {
        if (this.X == null) {
            return 0;
        }
        return this.X.c;
    }

    final void b(int i) {
        A().c = i;
    }

    final boolean J() {
        if (this.X == null) {
        }
        return false;
    }

    final boolean K() {
        if (this.X == null) {
            return false;
        }
        return this.X.q;
    }

    final void a(boolean z) {
        A().q = z;
    }
}
