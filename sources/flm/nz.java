package flm;

import android.app.Notification;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nz implements od {
    private final String a;
    private final int b;
    private final String c;
    private final Notification d;

    nz(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    @Override // flm.od
    public final void a(ni niVar) {
        niVar.a(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[");
        sb.append("packageName:").append(this.a);
        sb.append(", id:").append(this.b);
        sb.append(", tag:").append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
