package flm;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cih {
    public static volatile cih a;
    public final Context b;
    public boolean c = false;
    public boolean d = false;
    public WeakReference e;
    public cii f;

    public static cih a(Context context) {
        if (a == null) {
            synchronized (cih.class) {
                if (a == null) {
                    a = new cih(context);
                }
            }
        }
        return a;
    }

    private cih(Context context) {
        this.b = context.getApplicationContext();
    }

    public final void a() {
        this.e = null;
        bek.a(this.b).a(1);
        if (this.f != null) {
            this.b.unregisterReceiver(this.f);
            this.f = null;
        }
    }
}
