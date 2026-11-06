package flm;

import android.content.Context;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayt extends BaseApplicationContext {
    private static ayt a;
    private static volatile WeakReference b = new WeakReference(null);
    private static volatile WeakReference c = new WeakReference(null);

    public ayt(Context context, BaseApplicationContext baseApplicationContext) {
        super(context, baseApplicationContext);
        synchronized (ayt.class) {
            bah.checkNull(a);
            a = this;
        }
    }

    public static ayt a() {
        bah.checkNotNull(a);
        return a;
    }

    static {
        String[] strArr = {"com.google.android.gms.icing.", "com.google.android.gms.car.", "com.google.android.gms.carsetup."};
    }
}
