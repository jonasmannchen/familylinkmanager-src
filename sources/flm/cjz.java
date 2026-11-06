package flm;

import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.HideAppFailedFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjz extends cqg {
    private final /* synthetic */ HideAppFailedFragment a;

    public cjz(HideAppFailedFragment hideAppFailedFragment) {
        this.a = hideAppFailedFragment;
    }

    @Override // flm.cqg
    public final void b() {
        cce.a(this.a).c(R.id.kidsetup_action_account_removed);
    }
}
