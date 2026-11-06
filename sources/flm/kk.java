package flm;

import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kk {
    static void a(ViewGroup viewGroup, boolean z) {
        kl.a();
        if (kl.a != null) {
            try {
                kl.a.invoke(viewGroup, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
            }
        }
    }
}
