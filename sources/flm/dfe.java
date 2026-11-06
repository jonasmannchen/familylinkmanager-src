package flm;

import android.content.ContentResolver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dfe {
    public static ContentResolver a = null;
    public final String b;
    public final Object c;

    protected dfe(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    protected abstract Object a(String str);

    public final Object a() {
        return a(this.b);
    }

    public static dfe a(String str, boolean z) {
        return new dff(str, false);
    }
}
