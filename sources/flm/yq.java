package flm;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class yq {
    public tw b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final tx f = new yr(this);
    public final ArrayList a = new ArrayList();

    public final yq a(tt ttVar) {
        if (!this.c) {
            this.a.add(ttVar);
        }
        return this;
    }

    public final void a() {
        if (!this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                tt ttVar = (tt) arrayList.get(i);
                if (this.d >= 0) {
                    ttVar.a(this.d);
                }
                if (this.e != null) {
                    Interpolator interpolator = this.e;
                    View view = (View) ttVar.a.get();
                    if (view != null) {
                        view.animate().setInterpolator(interpolator);
                    }
                }
                if (this.b != null) {
                    ttVar.a(this.f);
                }
                View view2 = (View) ttVar.a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
                i = i2;
            }
            this.c = true;
        }
    }

    public final void b() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((tt) obj).a();
            }
            this.c = false;
        }
    }

    public final yq a(long j) {
        if (!this.c) {
            this.d = 250L;
        }
        return this;
    }

    public final yq a(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
        return this;
    }

    public final yq a(tw twVar) {
        if (!this.c) {
            this.b = twVar;
        }
        return this;
    }
}
