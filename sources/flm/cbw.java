package flm;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import com.google.android.chimera.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cbw {
    private Bundle a;
    public final ccf c;
    public cbx d;
    public int e;
    public sp f;

    public cbw(ccf ccfVar) {
        this.c = ccfVar;
    }

    public void a(Activity activity, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = activity.getResources().obtainAttributes(attributeSet, alg.D);
        this.e = typedArrayObtainAttributes.getResourceId(alg.F, 0);
        typedArrayObtainAttributes.getDrawable(alg.E);
        typedArrayObtainAttributes.getText(alg.G);
        int i = typedArrayObtainAttributes.getInt(alg.H, 0);
        if (i != 2 && i != 1 && i != 0) {
            throw new IllegalArgumentException(new StringBuilder(27).append("Invalid navType ").append(i).toString());
        }
        typedArrayObtainAttributes.recycle();
    }

    public final Bundle a() {
        if (this.a == null) {
            this.a = new Bundle();
        }
        return this.a;
    }

    public final cbs a(int i) {
        cbs cbsVar = this.f == null ? null : (cbs) this.f.a(i, null);
        if (cbsVar == null) {
            if (this.d != null) {
                return this.d.a(i);
            }
            return null;
        }
        return cbsVar;
    }

    public final void a(Bundle bundle, ccc cccVar) {
        Bundle bundle2 = null;
        Bundle bundleA = a();
        if (bundleA != null) {
            bundle2 = new Bundle();
            bundle2.putAll(bundleA);
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        this.c.a(this, bundle2, cccVar);
    }
}
