package flm;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ccs extends ContentObserver implements t {
    private final ContentResolver a;
    private boolean b;

    public ccs(Context context) {
        super(null);
        this.a = context.getContentResolver();
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
        if (!this.b) {
            this.b = true;
            btv.c("Persistent", "Registering auto time zone content observer", new Object[0]);
            this.a.registerContentObserver(Settings.Global.getUriFor("auto_time_zone"), false, this);
            c();
        }
    }

    @Override // flm.t
    public final void b() {
        if (this.b) {
            this.a.unregisterContentObserver(this);
            this.b = false;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        btv.c("Persistent", "Time settings changed; selfChange = %s uri = %s", Boolean.valueOf(z), uri);
        if (!z) {
            c();
        }
    }

    private final void c() {
        Settings.Global.putInt(this.a, "auto_time_zone", 1);
    }
}
