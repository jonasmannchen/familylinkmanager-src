package flm;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dz {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new uh();
    public static final TimeInterpolator c = new ug();
    public static final TimeInterpolator d = new ui();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }
}
