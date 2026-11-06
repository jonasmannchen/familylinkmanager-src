package flm;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitCompleteFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzo implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ MemberSvExitCompleteFragment a;

    public bzo(MemberSvExitCompleteFragment memberSvExitCompleteFragment) {
        this.a = memberSvExitCompleteFragment;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new bzn(this.a.getActivity());
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.a.startActivity(new Intent().setAction("android.intent.action.MAIN").addCategory("android.intent.category.HOME").addFlags(268435456));
    }
}
