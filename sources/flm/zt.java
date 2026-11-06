package flm;

import android.content.Context;
import android.view.ActionProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class zt extends zo {
    zt(Context context, qj qjVar) {
        super(context, qjVar);
    }

    @Override // flm.zo
    final zp a(ActionProvider actionProvider) {
        return new zu(this, this.a, actionProvider);
    }
}
