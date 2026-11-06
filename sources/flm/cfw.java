package flm;

import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class cfw implements dvc {
    public static final dvc a = new cfw();

    private cfw() {
    }

    @Override // flm.dvc
    public final Object a(Object obj) {
        return ((PackageInfo) obj).applicationInfo;
    }
}
