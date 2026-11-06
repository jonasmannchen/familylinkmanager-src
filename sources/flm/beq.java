package flm;

import android.content.pm.PackageManager;
import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class beq implements PackageManager.OnPermissionsChangedListener {
    private final /* synthetic */ bep a;

    public beq(bep bepVar) {
        this.a = bepVar;
    }

    public final void onPermissionsChanged(int i) {
        if (Process.myUid() == i) {
            this.a.b();
        }
    }
}
