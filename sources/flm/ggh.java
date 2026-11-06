package flm;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ggh {
    public final int a;
    public final int b;
    public final int c;
    public final AtomicInteger d = new AtomicInteger();

    ggh(float f, float f2) {
        this.c = (int) (f2 * 1000.0f);
        this.a = (int) (f * 1000.0f);
        this.b = this.a / 2;
        this.d.set(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggh)) {
            return false;
        }
        ggh gghVar = (ggh) obj;
        return this.a == gghVar.a && this.c == gghVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }
}
