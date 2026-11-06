package flm;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jy {
    public static jq a = new it();
    private static ThreadLocal c = new ThreadLocal();
    public static ArrayList b = new ArrayList();

    static rt a() {
        rt rtVar;
        WeakReference weakReference = (WeakReference) c.get();
        if (weakReference != null && (rtVar = (rt) weakReference.get()) != null) {
            return rtVar;
        }
        rt rtVar2 = new rt();
        c.set(new WeakReference(rtVar2));
        return rtVar2;
    }

    static void a(ViewGroup viewGroup, jq jqVar) {
        if (jqVar != null && viewGroup != null) {
            jz jzVar = new jz(jqVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(jzVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(jzVar);
        }
    }
}
