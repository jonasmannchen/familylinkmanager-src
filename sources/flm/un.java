package flm;

import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface un {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT >= 27;
    }
}
