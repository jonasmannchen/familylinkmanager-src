package flm;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bbr implements bak {
    public final /* synthetic */ atr val$callbacks;

    bbr(atr atrVar) {
        this.val$callbacks = atrVar;
    }

    @Override // flm.bak
    public final void onConnected(Bundle bundle) {
        this.val$callbacks.a(bundle);
    }

    @Override // flm.bak
    public final void onConnectionSuspended(int i) {
        this.val$callbacks.a(i);
    }
}
