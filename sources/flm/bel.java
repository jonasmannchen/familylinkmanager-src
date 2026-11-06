package flm;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bel {
    private final ny a;
    private final bek b;

    private bel(ny nyVar, bek bekVar) {
        this.a = nyVar;
        this.b = bekVar;
    }

    public static bel a(Context context) {
        return new bel(new ny(context), bek.a(context));
    }

    public final void a(int i) {
        this.a.a(null, i);
        if (!bek.a()) {
            this.b.c.b();
        }
    }

    public final void a(String str, int i) {
        this.a.a(str, i);
        if (!bek.a()) {
            this.b.c.b();
        }
    }

    public final void a(int i, Notification notification) {
        if (bek.a()) {
            this.a.a(null, i, notification);
        } else {
            a(null, i, notification);
        }
    }

    public final void a(String str, int i, Notification notification) {
        if (bek.a()) {
            this.a.a(str, i, notification);
        } else {
            if (bej.a(this.b.b)) {
                this.a.a(str, i, this.b.a(notification));
                this.b.c.a();
                return;
            }
            this.b.c.c();
        }
    }
}
