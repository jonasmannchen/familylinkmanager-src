package flm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.chimera.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbm extends cbw {
    public Intent a;
    public String b;

    cbm(cbl cblVar) {
        super(cblVar);
    }

    @Override // flm.cbw
    public final void a(Activity activity, AttributeSet attributeSet) {
        super.a(activity, attributeSet);
        TypedArray typedArrayObtainAttributes = activity.getResources().obtainAttributes(attributeSet, alg.a);
        String string = typedArrayObtainAttributes.getString(alg.c);
        if (!TextUtils.isEmpty(string)) {
            ComponentName componentName = new ComponentName((Context) activity, string);
            if (this.a == null) {
                this.a = new Intent();
            }
            this.a.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(alg.b);
        if (this.a == null) {
            this.a = new Intent();
        }
        this.a.setAction(string2);
        String string3 = typedArrayObtainAttributes.getString(alg.d);
        if (string3 != null) {
            Uri uri = Uri.parse(string3);
            if (this.a == null) {
                this.a = new Intent();
            }
            this.a.setData(uri);
        }
        this.b = typedArrayObtainAttributes.getString(alg.e);
        typedArrayObtainAttributes.recycle();
    }
}
