package flm;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ccl implements AppOpsManager.OnOpChangedListener, t {
    private final AppOpsManager a;
    private final ApplicationInfo b;
    private final String c;

    public ccl(Context context) {
        this.a = (AppOpsManager) context.getSystemService("appops");
        this.b = context.getApplicationInfo();
        this.c = context.getPackageName();
    }

    @Override // flm.t
    public final void a(af afVar) {
    }

    @Override // flm.t
    public final void b(af afVar) {
    }

    @Override // flm.t
    public final void c(af afVar) {
    }

    @Override // flm.t
    public final void d(af afVar) {
    }

    @Override // flm.t
    public final void a() {
        bsu.a("Persistent", this.a, this.b.uid, this.c);
        this.a.startWatchingMode("android:get_usage_stats", this.c, this);
    }

    @Override // flm.t
    public final void b() {
        this.a.stopWatchingMode(this);
    }

    @Override // android.app.AppOpsManager.OnOpChangedListener
    public final void onOpChanged(String str, String str2) {
        int iCheckOpNoThrow = this.a.checkOpNoThrow(str, this.b.uid, str2);
        btv.a("Persistent", "AppOpChanged op:%s, packageName:%s, mode:%s", str, str2, Integer.valueOf(iCheckOpNoThrow));
        if ("android:get_usage_stats".equals(str) && iCheckOpNoThrow != 0) {
            bsu.a("Persistent", this.a, this.b.uid, str2);
        }
    }
}
