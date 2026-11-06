package flm;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.LockScreenAccountInterceptorPostAckFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bye implements LoaderManager.LoaderCallbacks {
    public final /* synthetic */ LockScreenAccountInterceptorPostAckFragment a;

    public bye(LockScreenAccountInterceptorPostAckFragment lockScreenAccountInterceptorPostAckFragment) {
        this.a = lockScreenAccountInterceptorPostAckFragment;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new byk(this.a.getActivity());
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Boolean bool = (Boolean) obj;
        btv.b("TimeLimit", "AccountInterceptor: addAccountLoadFinished:%s", bool);
        if (bool == null) {
            this.a.c.showInterstitial(true);
            return;
        }
        this.a.c.showInterstitial(false);
        this.a.getLoaderManager().destroyLoader(2);
        if (bool.booleanValue()) {
            this.a.getActivity().getApplicationContext().startActivity(new Intent("android.settings.ADD_ACCOUNT_SETTINGS").setFlags(268435456).putExtra("account_types", new String[]{"com.google"}));
        } else {
            this.a.c.showInterstitial(false);
            new vx(this.a.getActivity()).a(R.string.kids_time_limit_remove_supervision_failed).b(R.string.close_button_label, byf.a).a(R.string.common_retry, new DialogInterface.OnClickListener(this) { // from class: flm.byg
                private final bye a;

                {
                    this.a = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    bye byeVar = this.a;
                    byeVar.a.getLoaderManager().restartLoader(2, (Bundle) null, byeVar.a.b);
                }
            }).b();
        }
    }
}
