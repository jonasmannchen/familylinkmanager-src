package flm;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@ccg(a = "fragment")
public final class cbn extends ccf {
    public FragmentManager a;
    public int b;
    private Activity d;
    private int e;
    private HashMap f = new HashMap();
    private final FragmentManager.OnBackStackChangedListener g = new cbo(this);

    public cbn(Activity activity, FragmentManager fragmentManager, int i) {
        this.d = activity;
        this.a = fragmentManager;
        this.e = i;
        this.b = this.a.getBackStackEntryCount();
        this.a.addOnBackStackChangedListener(this.g);
    }

    @Override // flm.ccf
    public final boolean a() {
        return this.a.popBackStackImmediate();
    }

    final Class a(String str) {
        Class cls = (Class) this.f.get(str);
        if (cls == null) {
            try {
                Class<?> cls2 = Class.forName(str, true, this.d.getClassLoader());
                this.f.put(str, cls2);
                return cls2;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return cls;
    }

    final cbr c() {
        return (cbr) this.a.findFragmentByTag("android-support-nav:FragmentNavigator.StateFragment");
    }

    @Override // flm.ccf
    public final /* synthetic */ void a(cbw cbwVar, Bundle bundle, ccc cccVar) {
        boolean z = false;
        cbq cbqVar = (cbq) cbwVar;
        Fragment fragmentA = cbqVar.a(bundle);
        FragmentTransaction fragmentTransactionBeginTransaction = this.a.beginTransaction();
        int i = cccVar != null ? cccVar.d : -1;
        int i2 = cccVar != null ? cccVar.e : -1;
        int i3 = cccVar != null ? cccVar.f : -1;
        int i4 = cccVar != null ? cccVar.g : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            if (i4 == -1) {
                i4 = 0;
            }
            fragmentTransactionBeginTransaction.setCustomAnimations(i, i2, i3, i4);
        } else {
            fragmentTransactionBeginTransaction.setTransition(4097);
        }
        fragmentTransactionBeginTransaction.replace(this.e, fragmentA);
        cbr cbrVarC = c();
        if (cbrVarC != null) {
            fragmentTransactionBeginTransaction.remove(cbrVarC);
        }
        int i5 = cbqVar.e;
        cbr cbrVar = new cbr();
        cbrVar.a = i5;
        fragmentTransactionBeginTransaction.add(cbrVar, "android-support-nav:FragmentNavigator.StateFragment");
        boolean zIsEmpty = this.a.getFragments().isEmpty();
        if (cccVar != null && cbrVarC != null && cccVar.a() && cbrVarC.a == i5) {
            z = true;
        }
        if (!zIsEmpty && !z) {
            String resourceName = this.d.getResources().getResourceName(i5);
            if (TextUtils.isEmpty(resourceName)) {
                resourceName = Integer.toString(i5);
            }
            fragmentTransactionBeginTransaction.addToBackStack(resourceName);
        } else {
            fragmentTransactionBeginTransaction.runOnCommit(new cbp(this, i5, z));
        }
        fragmentTransactionBeginTransaction.commit();
        try {
            this.a.executePendingTransactions();
        } catch (IllegalStateException e) {
        }
    }

    @Override // flm.ccf
    public final /* synthetic */ cbw b() {
        return new cbq(this);
    }
}
