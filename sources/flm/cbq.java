package flm;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbq extends cbw {
    public Class a;

    cbq(cbn cbnVar) {
        super(cbnVar);
    }

    @Override // flm.cbw
    public final void a(Activity activity, AttributeSet attributeSet) {
        super.a(activity, attributeSet);
        TypedArray typedArrayObtainAttributes = activity.getResources().obtainAttributes(attributeSet, alg.f);
        this.a = ((cbn) this.c).a(typedArrayObtainAttributes.getString(alg.g));
        typedArrayObtainAttributes.recycle();
    }

    final Fragment a(Bundle bundle) {
        Class cls = this.a;
        if (cls == null) {
            throw new IllegalStateException("fragment class not set");
        }
        try {
            Fragment fragment = (Fragment) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
