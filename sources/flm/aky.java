package flm;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aky {
    private static akz a;
    private final String b;

    public aky(String str) {
        this.b = bdi.checkNotEmpty(str);
    }

    public final int hashCode() {
        return bcx.hashCode(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aky)) {
            return false;
        }
        return TextUtils.equals(this.b, ((aky) obj).b);
    }

    public final String toString() {
        return "#account#";
    }

    static {
        new aky("@@ContextManagerNullAccount@@");
        a = null;
    }
}
