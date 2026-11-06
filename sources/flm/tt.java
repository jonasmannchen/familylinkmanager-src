package flm;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tt {
    public WeakReference a;
    public Runnable b = null;
    public Runnable c = null;
    public int d = -1;

    tt(View view) {
        this.a = new WeakReference(view);
    }

    public final tt a(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final tt a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final tt b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final void a() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final tt a(tw twVar) {
        View view = (View) this.a.get();
        if (view != null) {
            if (twVar != null) {
                view.animate().setListener(new tu(this, twVar, view));
            } else {
                view.animate().setListener(null);
            }
        }
        return this;
    }

    public final tt a(ty tyVar) {
        View view = (View) this.a.get();
        if (view != null) {
            tv tvVar = null;
            if (tyVar != null) {
                tvVar = new tv(this, tyVar, view);
            }
            view.animate().setUpdateListener(tvVar);
        }
        return this;
    }
}
