package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bol {
    public final int a = 42;
    private final String b;

    public bol(int i, String str) {
        this.b = str;
    }

    public abstract void a();

    final Status a(Exception exc) {
        throw new NoSuchMethodError();
    }

    public final String b() {
        int i = this.a;
        String str = this.b;
        return new StringBuilder(String.valueOf(str).length() + 12).append(i).append("-").append(str).toString();
    }
}
