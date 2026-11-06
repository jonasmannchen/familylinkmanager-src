package flm;

import android.view.View;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cce {
    public static cbt a(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof cca) {
                return ((cca) parentFragment).a;
            }
        }
        return a(fragment.getView());
    }

    public static cbt a(View view) {
        cbt cbtVar;
        if (view == null) {
            return null;
        }
        while (view != null) {
            Object tag = view.getTag(R.id.nav_controller_view_tag);
            if (tag instanceof WeakReference) {
                cbtVar = (cbt) ((WeakReference) tag).get();
            } else {
                cbtVar = tag instanceof cbt ? (cbt) tag : null;
            }
            if (cbtVar != null) {
                return cbtVar;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }
}
