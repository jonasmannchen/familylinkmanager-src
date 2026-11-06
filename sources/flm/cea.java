package flm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.kids.setup.KidSetupChimeraActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cea extends bpo {
    private final /* synthetic */ KidSetupChimeraActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cea(KidSetupChimeraActivity kidSetupChimeraActivity, Context context) {
        super(context);
        this.a = kidSetupChimeraActivity;
    }

    @Override // flm.bpo
    public final void a(Context context, Intent intent) {
        cia ciaVarA = cia.a(this.a.a.d().b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        if (cic.b(ciaVarA)) {
            this.a.scheduleImmediateSafetyNetJobAndFinish();
        }
    }
}
