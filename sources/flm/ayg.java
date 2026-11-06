package flm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayg extends lg implements axm {
    private static WeakHashMap Y = new WeakHashMap();
    public Bundle X;
    private Map Z = new rt();
    public int a = 0;

    public static ayg a(ln lnVar) {
        ayg aygVar;
        WeakReference weakReference = (WeakReference) Y.get(lnVar);
        if (weakReference == null || (aygVar = (ayg) weakReference.get()) == null) {
            try {
                aygVar = (ayg) lnVar.c().a("SupportLifecycleFragmentImpl");
                if (aygVar == null || aygVar.n) {
                    aygVar = new ayg();
                    lnVar.c().a().a(aygVar, "SupportLifecycleFragmentImpl").b();
                }
                Y.put(lnVar, new WeakReference(aygVar));
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        }
        return aygVar;
    }

    @Override // flm.axm
    public final LifecycleCallback a(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.Z.get(str));
    }

    @Override // flm.axm
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.Z.containsKey(str)) {
            this.Z.put(str, lifecycleCallback);
            if (this.a > 0) {
                new cqr(Looper.getMainLooper()).post(new ayh(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
    }

    @Override // flm.lg
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.a = 1;
        this.X = bundle;
        for (Map.Entry entry : this.Z.entrySet()) {
            ((LifecycleCallback) entry.getValue()).a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // flm.lg
    public final void g() {
        super.g();
        this.a = 2;
        Iterator it = this.Z.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a();
        }
    }

    @Override // flm.lg
    public final void r() {
        super.r();
        this.a = 3;
        Iterator it = this.Z.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e();
        }
    }

    @Override // flm.lg
    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        Iterator it = this.Z.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(i, i2, intent);
        }
    }

    @Override // flm.lg
    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.Z.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // flm.lg
    public final void i_() {
        super.i_();
        this.a = 4;
        Iterator it = this.Z.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).b();
        }
    }

    @Override // flm.lg
    public final void c() {
        super.c();
        this.a = 5;
        Iterator it = this.Z.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // flm.lg
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.Z.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // flm.axm
    public final /* synthetic */ Activity a() {
        return k();
    }
}
