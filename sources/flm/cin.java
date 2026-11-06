package flm;

import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.kids.setup.compat.LifecycleActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cin {
    public static bh a(Activity activity) {
        dvl.a(activity instanceof LifecycleActivity);
        return (bh) dvl.a(((LifecycleActivity) activity).getViewModelHolderFragment().a);
    }

    public static bh a(Fragment fragment) {
        dvl.a(fragment instanceof cil);
        return (bh) dvl.a(((cil) fragment).a().a);
    }
}
