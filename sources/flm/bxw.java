package flm;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.LocalUnlockConfirmedFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxw implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ LocalUnlockConfirmedFragment a;

    public bxw(LocalUnlockConfirmedFragment localUnlockConfirmedFragment) {
        this.a = localUnlockConfirmedFragment;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new bxv(this.a.getActivity());
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(final Loader loader, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this.a.getActivity()).setTitle(R.string.common_something_went_wrong).setPositiveButton(R.string.common_retry, new DialogInterface.OnClickListener(loader) { // from class: flm.bxx
                private final Loader a;

                {
                    this.a = loader;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.forceLoad();
                }
            }).setCancelable(false).create();
            alertDialogCreate.setCancelable(false);
            alertDialogCreate.setCanceledOnTouchOutside(false);
            alertDialogCreate.show();
            return;
        }
        this.a.getLoaderManager().destroyLoader(1);
    }
}
