package flm;

import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tz {
    public final Object a;

    public tz(Object obj) {
        this.a = obj;
    }

    public final int a() {
        return ((WindowInsets) this.a).getSystemWindowInsetLeft();
    }

    public final int b() {
        return ((WindowInsets) this.a).getSystemWindowInsetTop();
    }

    public final int c() {
        return ((WindowInsets) this.a).getSystemWindowInsetRight();
    }

    public final int d() {
        return ((WindowInsets) this.a).getSystemWindowInsetBottom();
    }

    public final boolean e() {
        return ((WindowInsets) this.a).isConsumed();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tz tzVar = (tz) obj;
        if (this.a == null) {
            return tzVar.a == null;
        }
        return this.a.equals(tzVar.a);
    }

    public final int hashCode() {
        if (this.a == null) {
            return 0;
        }
        return this.a.hashCode();
    }

    static tz a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new tz(obj);
    }

    static Object a(tz tzVar) {
        if (tzVar == null) {
            return null;
        }
        return tzVar.a;
    }
}
