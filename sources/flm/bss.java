package flm;

import android.os.Build;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bss {
    public static void a(TextView textView) {
        if (Build.VERSION.SDK_INT < 26) {
            ti.a(textView, new aji(textView));
        }
    }
}
