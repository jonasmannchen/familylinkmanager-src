package flm;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbh implements cat {
    @Override // flm.cat
    public final void a(Bundle bundle) throws bxj {
        bxn.a(bundle.getBoolean("key_full_report", false), euz.a(bundle.getInt("key_sync_trigger", 0)), false);
    }
}
