package flm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahv extends Resources {
    private static boolean a = false;
    private final WeakReference b;

    public static boolean a() {
        return false;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i) {
        Context context = (Context) this.b.get();
        return context != null ? abo.a().a(context, this, i) : super.getDrawable(i);
    }

    final Drawable a(int i) {
        return super.getDrawable(i);
    }
}
