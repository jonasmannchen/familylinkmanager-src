package flm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cii extends bpo {
    private final /* synthetic */ cih a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cii(cih cihVar) {
        super("kids");
        this.a = cihVar;
    }

    @Override // flm.bpo
    public final void a(Context context, Intent intent) {
        if (this.a.e == null || this.a.e.get() == null) {
            this.a.a();
            return;
        }
        Activity activity = (Activity) this.a.e.get();
        Intent intentAddFlags = new Intent(activity.getIntent()).addFlags(603979776);
        btv.c("KidSetup", "Resuming device setup.", new Object[0]);
        activity.startActivity(intentAddFlags);
        this.a.a();
    }
}
