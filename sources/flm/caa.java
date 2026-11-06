package flm;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitLockdownFragment;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class caa implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ MemberSvExitLockdownFragment a;

    public caa(MemberSvExitLockdownFragment memberSvExitLockdownFragment) {
        this.a = memberSvExitLockdownFragment;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new bzx(this.a.getActivity());
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i;
        String strConcat;
        bzg bzgVar = (bzg) obj;
        MemberSvExitLockdownFragment memberSvExitLockdownFragment = this.a;
        boolean z = bzgVar.e;
        memberSvExitLockdownFragment.b.findViewById(R.id.member_sv_exit_lockdown_time_remaining).setVisibility(z ? 8 : 0);
        memberSvExitLockdownFragment.b.findViewById(R.id.member_sv_exit_lockdown_time_remaining_subtitle).setVisibility(z ? 8 : 0);
        memberSvExitLockdownFragment.b.findViewById(R.id.member_sv_exit_lockdown_progress_bar).setVisibility(z ? 8 : 0);
        memberSvExitLockdownFragment.b.findViewById(R.id.member_sv_exit_lockdown_lock_image).setVisibility(z ? 8 : 0);
        long j = bzgVar.b;
        long j2 = j < 0 ? 0L : j;
        long jCeil = (long) Math.ceil(j2 / 1000.0d);
        if (!z) {
            long j3 = jCeil / 60;
            ((TextView) memberSvExitLockdownFragment.b.findViewById(R.id.member_sv_exit_lockdown_time_remaining)).setText(memberSvExitLockdownFragment.getString(R.string.member_sv_exit_lockdown_remaining_time_format, new Object[]{String.format(Locale.getDefault(), "%02d", Long.valueOf(j3 / 60)), String.format(Locale.getDefault(), "%02d", Long.valueOf(j3 % 60)), String.format(Locale.getDefault(), "%02d", Long.valueOf(jCeil % 60))}));
            ((ProgressBar) memberSvExitLockdownFragment.b.findViewById(R.id.member_sv_exit_lockdown_progress_bar)).setProgress((int) ((100 * j2) / bzgVar.c));
        }
        if (j2 == 0) {
            cbt cbtVarA = cce.a(memberSvExitLockdownFragment);
            ccc cccVar = null;
            cbw cbwVar = cbtVarA.d.isEmpty() ? cbtVarA.b : (cbw) cbtVarA.d.peekLast();
            if (cbwVar == null) {
                throw new IllegalStateException("no current navigation node");
            }
            cbs cbsVarA = cbwVar.a(R.id.member_sv_exit_complete_destination);
            if (cbsVarA != null) {
                cccVar = cbsVarA.b;
                if (cbsVarA.a == 0 && cccVar != null && cccVar.b != 0) {
                    cbtVarA.a(cccVar.b, cccVar.c);
                    return;
                }
                i = cbsVarA.a;
            } else {
                i = R.id.member_sv_exit_complete_destination;
            }
            cbw cbwVarB = cbtVarA.b(i);
            if (cbwVarB == null) {
                String resourceName = cbtVarA.a.getResources().getResourceName(i);
                if (cbsVarA != null) {
                    String strValueOf = String.valueOf(cbtVarA.a.getResources().getResourceName(R.id.member_sv_exit_complete_destination));
                    strConcat = strValueOf.length() != 0 ? " referenced from action ".concat(strValueOf) : new String(" referenced from action ");
                } else {
                    strConcat = "";
                }
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(resourceName).length() + 56 + String.valueOf(strConcat).length()).append("navigation destination ").append(resourceName).append(strConcat).append(" is unknown to this NavController").toString());
            }
            if (cccVar != null && cccVar.b != 0) {
                cbtVarA.a(cccVar.b, cccVar.c);
            }
            cbwVarB.a((Bundle) null, cccVar);
        }
    }
}
