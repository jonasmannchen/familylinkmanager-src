package flm;

import android.app.Activity;
import android.app.Fragment;
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
public final class axn extends Fragment implements axm {
    private static WeakHashMap c = new WeakHashMap();
    public Bundle b;
    private Map d = new rt();
    public int a = 0;

    public static axn a(Activity activity) {
        axn axnVar;
        WeakReference weakReference = (WeakReference) c.get(activity);
        if (weakReference == null || (axnVar = (axn) weakReference.get()) == null) {
            try {
                axnVar = (axn) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (axnVar == null || axnVar.isRemoving()) {
                    axnVar = new axn();
                    activity.getFragmentManager().beginTransaction().add(axnVar, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                c.put(activity, new WeakReference(axnVar));
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        return axnVar;
    }

    @Override // flm.axm
    public final LifecycleCallback a(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.d.get(str));
    }

    @Override // flm.axm
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.d.containsKey(str)) {
            this.d.put(str, lifecycleCallback);
            if (this.a > 0) {
                new cqr(Looper.getMainLooper()).post(new axo(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
    }

    @Override // flm.axm
    public final Activity a() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = 1;
        this.b = bundle;
        for (Map.Entry entry : this.d.entrySet()) {
            ((LifecycleCallback) entry.getValue()).a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.a = 2;
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.a = 3;
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.d.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.a = 4;
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).b();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a = 5;
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
