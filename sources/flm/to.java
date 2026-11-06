package flm;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class to {
    private final int a;
    private final Class b;
    private final int c;

    to(int i, Class cls, int i2) {
        this(i, cls, 0, i2);
    }

    abstract Object a(View view);

    to(int i, Class cls, int i2, int i3) {
        this.a = i;
        this.b = cls;
        this.c = i3;
    }

    final Object b(View view) {
        if (Build.VERSION.SDK_INT >= this.c) {
            return a(view);
        }
        Object tag = view.getTag(this.a);
        if (!this.b.isInstance(tag)) {
            return null;
        }
        return tag;
    }
}
