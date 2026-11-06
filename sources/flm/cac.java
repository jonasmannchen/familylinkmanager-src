package flm;

import android.os.Bundle;
import android.widget.TextView;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitLockdownFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cac implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ MemberSvExitLockdownFragment a;

    public cac(MemberSvExitLockdownFragment memberSvExitLockdownFragment) {
        this.a = memberSvExitLockdownFragment;
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        dvi dviVar = (dvi) obj;
        dvl.a(dviVar);
        if (dviVar.a()) {
            TextView textView = (TextView) this.a.b.findViewById(R.id.member_sv_exit_lockdown_subheading);
            TextView textView2 = (TextView) this.a.b.findViewById(R.id.member_sv_exit_lockdown_description);
            textView.setText(this.a.getString(R.string.member_sv_exit_lockdown_subheading, new Object[]{dviVar.b()}));
            textView2.setText(this.a.getString(R.string.member_sv_exit_lockdown_description, new Object[]{dviVar.b()}));
        }
    }

    public final /* synthetic */ Loader onCreateLoader(int i, Bundle bundle) {
        return new cab(this.a.getActivity());
    }
}
