package flm;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitCancelFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzi implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ MemberSvExitCancelFragment a;

    public bzi(MemberSvExitCancelFragment memberSvExitCancelFragment) {
        this.a = memberSvExitCancelFragment;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new bzj(this.a.getActivity());
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.a.getLoaderManager().destroyLoader(1);
        this.a.getActivity().setResult(0);
        this.a.getActivity().finish();
    }
}
