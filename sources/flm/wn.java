package flm;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wn {
    public xe a;
    public boolean b;
    public BroadcastReceiver c;
    public IntentFilter d;
    public final /* synthetic */ wb e;

    wn(wb wbVar, xe xeVar) {
        this.e = wbVar;
        this.a = xeVar;
        this.b = xeVar.a();
    }

    final void a() {
        if (this.c != null) {
            this.e.b.unregisterReceiver(this.c);
            this.c = null;
        }
    }
}
