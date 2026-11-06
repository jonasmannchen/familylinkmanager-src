package flm;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitCooldownFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzr extends AsyncTaskLoader {
    bzr(Context context) {
        super(context);
    }

    public final /* synthetic */ Object loadInBackground() {
        btv.c("MemberSpvsn", "enabling requesting", new Object[0]);
        MemberSvExitCooldownFragment.a(getContext(), 3);
        return null;
    }
}
