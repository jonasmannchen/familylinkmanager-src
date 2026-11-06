package flm;

import android.app.Notification;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nt extends nv {
    public CharSequence a;

    @Override // flm.nv
    public final void a(nq nqVar) {
        new Notification.BigTextStyle(nqVar.a()).setBigContentTitle(null).bigText(this.a);
    }
}
