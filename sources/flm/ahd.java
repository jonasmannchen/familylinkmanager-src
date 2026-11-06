package flm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ahd extends agp {
    private final WeakReference a;

    public ahd(Context context, Resources resources) {
        super(resources);
        this.a = new WeakReference(context);
    }

    @Override // flm.agp, android.content.res.Resources
    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.a.get();
        if (drawable != null && context != null) {
            abo.a();
            abo.a(context, i, drawable);
        }
        return drawable;
    }
}
