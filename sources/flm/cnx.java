package flm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.kids.setup.fragment.geller.WaitingForParentFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnx extends bpo {
    private final /* synthetic */ WaitingForParentFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnx(WaitingForParentFragment waitingForParentFragment) {
        super("kids");
        this.a = waitingForParentFragment;
    }

    @Override // flm.bpo
    public final void a(Context context, Intent intent) {
        this.a.i();
    }
}
