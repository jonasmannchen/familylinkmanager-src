package flm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.kids.setup.fragment.AppUpdateFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjn extends bpo {
    private final /* synthetic */ AppUpdateFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjn(AppUpdateFragment appUpdateFragment) {
        super("kids");
        this.a = appUpdateFragment;
    }

    @Override // flm.bpo
    public final void a(Context context, Intent intent) {
        Uri data = intent.getData();
        if (data != null && bbz.PACKAGE_SCHEME.equals(data.getScheme())) {
            this.a.h();
        }
    }
}
