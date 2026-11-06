package flm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wo extends BroadcastReceiver {
    private final /* synthetic */ wn a;

    wo(wn wnVar) {
        this.a = wnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        wn wnVar = this.a;
        boolean zA = wnVar.a.a();
        if (zA != wnVar.b) {
            wnVar.b = zA;
            wnVar.e.k();
        }
    }
}
