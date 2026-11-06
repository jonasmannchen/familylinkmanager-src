package flm;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ato {
    public aye a;
    private Looper b;

    public final atn a() {
        if (this.a == null) {
            this.a = new auo();
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new atn(this.a, this.b);
    }
}
