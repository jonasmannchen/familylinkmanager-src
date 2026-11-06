package flm;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ccp extends bpo {
    private final /* synthetic */ cco a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccp(cco ccoVar) {
        super("kids");
        this.a = ccoVar;
    }

    @Override // flm.bpo
    public final void a(Context context, Intent intent) {
        btv.a("TimeLimit", "Observer:event callback:%s", intent);
        this.a.b();
    }
}
