package flm;

import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitUnlockFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cah extends cqg {
    private final /* synthetic */ MemberSvExitUnlockFragment a;

    public cah(MemberSvExitUnlockFragment memberSvExitUnlockFragment) {
        this.a = memberSvExitUnlockFragment;
    }

    @Override // flm.cqg
    public final CharSequence a() {
        return this.a.getString(R.string.local_unlock_need_help_dialog_message_v2, new Object[]{this.a.getString(R.string.parent_access_url)});
    }
}
