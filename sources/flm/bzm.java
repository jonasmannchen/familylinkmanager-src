package flm;

import android.os.Bundle;
import android.widget.TextView;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitCompleteFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzm implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ MemberSvExitCompleteFragment a;

    public bzm(MemberSvExitCompleteFragment memberSvExitCompleteFragment) {
        this.a = memberSvExitCompleteFragment;
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        buh buhVar = (buh) obj;
        TextView textView = (TextView) this.a.a.findViewById(R.id.member_sv_exit_complete_description);
        if (buhVar == null) {
            textView.setText(R.string.member_sv_exit_complete_description_no_account);
        } else {
            textView.setText(this.a.getString(R.string.member_sv_exit_complete_description, new Object[]{buhVar.b}));
        }
    }

    public final /* synthetic */ Loader onCreateLoader(int i, Bundle bundle) {
        return new bzk(this.a.getActivity());
    }
}
