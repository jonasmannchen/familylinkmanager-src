package flm;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitCooldownFragment;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzs implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ MemberSvExitCooldownFragment a;

    public bzs(MemberSvExitCooldownFragment memberSvExitCooldownFragment) {
        this.a = memberSvExitCooldownFragment;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new bzt(this.a.getActivity());
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        MemberSvExitCooldownFragment memberSvExitCooldownFragment = this.a;
        long jLongValue = ((Long) obj).longValue();
        long j = jLongValue < 0 ? 0L : jLongValue;
        long jCeil = (long) Math.ceil(j / 1000.0d);
        ((TextView) memberSvExitCooldownFragment.getView().findViewById(R.id.member_sv_exit_cooldown_time_remaining)).setText(memberSvExitCooldownFragment.getString(R.string.member_sv_exit_cooldown_remaining_time_format, new Object[]{String.format(Locale.getDefault(), "%02d", Long.valueOf(jCeil / 60)), String.format(Locale.getDefault(), "%02d", Long.valueOf(jCeil % 60))}));
        ((ProgressBar) memberSvExitCooldownFragment.getView().findViewById(R.id.member_sv_exit_cooldown_progress_bar)).setProgress((int) (((jCeil * 1000) * 100) / fqc.d()));
        if (j == 0) {
            memberSvExitCooldownFragment.getLoaderManager().getLoader(2).forceLoad();
        }
    }
}
