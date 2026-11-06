package flm;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class btq implements dvc {
    public static final dvc a = new btq();

    private btq() {
    }

    @Override // flm.dvc
    public final Object a(Object obj) {
        return ((Intent) obj).putExtra("force_refresh_dashboard", true);
    }
}
