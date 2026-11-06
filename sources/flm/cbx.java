package flm;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.chimera.Activity;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbx extends cbw implements Iterable {
    public final sp a;
    public int b;

    cbx(ccf ccfVar) {
        super(ccfVar);
        this.a = new sp();
    }

    @Override // flm.cbw
    public final void a(Activity activity, AttributeSet attributeSet) {
        super.a(activity, attributeSet);
        TypedArray typedArrayObtainAttributes = activity.getResources().obtainAttributes(attributeSet, alg.w);
        this.b = typedArrayObtainAttributes.getResourceId(alg.x, 0);
        typedArrayObtainAttributes.recycle();
    }

    public final void a(cbw cbwVar) {
        if (cbwVar.e == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        }
        cbw cbwVar2 = (cbw) this.a.a(cbwVar.e, null);
        if (cbwVar2 != cbwVar) {
            if (cbwVar.d != null) {
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            if (cbwVar2 != null) {
                cbwVar2.d = null;
            }
            cbwVar.d = this;
            this.a.b(cbwVar.e, cbwVar);
        }
    }

    final cbw a(int i, boolean z) {
        cbw cbwVar = (cbw) this.a.a(i, null);
        if (cbwVar == null) {
            if (!z || this.d == null) {
                return null;
            }
            return this.d.a(i, true);
        }
        return cbwVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new cby(this);
    }
}
