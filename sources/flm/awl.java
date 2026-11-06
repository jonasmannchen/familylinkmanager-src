package flm;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awl implements bbu {
    private final /* synthetic */ awk a;

    awl(awk awkVar) {
        this.a = awkVar;
    }

    @Override // flm.bbu
    public final boolean isConnected() {
        awk awkVar = this.a;
        return awkVar.b != null && awkVar.b.d();
    }

    @Override // flm.bbu
    public final Bundle getConnectionHint() {
        return null;
    }
}
