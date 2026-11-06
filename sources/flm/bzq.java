package flm;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitCooldownFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzq implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ MemberSvExitCooldownFragment a;

    public bzq(MemberSvExitCooldownFragment memberSvExitCooldownFragment) {
        this.a = memberSvExitCooldownFragment;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new bzr(this.a.getActivity());
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i;
        ccc cccVar;
        String strConcat;
        this.a.getLoaderManager().destroyLoader(2);
        cbt cbtVarA = cce.a(this.a);
        cbw cbwVar = cbtVarA.d.isEmpty() ? cbtVarA.b : (cbw) cbtVarA.d.peekLast();
        if (cbwVar == null) {
            throw new IllegalStateException("no current navigation node");
        }
        cbs cbsVarA = cbwVar.a(R.id.member_sv_exit_request_destination);
        if (cbsVarA != null) {
            cccVar = cbsVarA.b;
            if (cbsVarA.a == 0 && cccVar != null && cccVar.b != 0) {
                cbtVarA.a(cccVar.b, cccVar.c);
                return;
            }
            i = cbsVarA.a;
        } else {
            i = R.id.member_sv_exit_request_destination;
            cccVar = null;
        }
        cbw cbwVarB = cbtVarA.b(i);
        if (cbwVarB == null) {
            String resourceName = cbtVarA.a.getResources().getResourceName(i);
            if (cbsVarA != null) {
                String strValueOf = String.valueOf(cbtVarA.a.getResources().getResourceName(R.id.member_sv_exit_request_destination));
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
