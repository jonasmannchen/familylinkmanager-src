package flm;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitUnlockFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cai implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ MemberSvExitUnlockFragment a;

    public cai(MemberSvExitUnlockFragment memberSvExitUnlockFragment) {
        this.a = memberSvExitUnlockFragment;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new caj(this.a.getActivity(), ((Editable) this.a.c.getText()).toString());
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i;
        ccc cccVar;
        String strConcat;
        Boolean bool = (Boolean) obj;
        btv.a("MemberSpvsn", "Verify PAC for Exit flow: result is %s", bool);
        View viewFindViewById = this.a.a.findViewById(R.id.member_sv_exit_unlock_progress_bar);
        if (bool == null) {
            viewFindViewById.setVisibility(0);
            this.a.c.setEnabled(false);
            this.a.c.clearFocus();
            return;
        }
        if (bool.booleanValue()) {
            this.a.getLoaderManager().destroyLoader(1);
            cbt cbtVarA = cce.a(this.a);
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
                cccVar = null;
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
            return;
        }
        viewFindViewById.setVisibility(8);
        this.a.c.setText("");
        this.a.b.b(this.a.getString(R.string.kids_time_limit_unlock_error_message));
        this.a.c.setEnabled(true);
        this.a.a();
        this.a.getLoaderManager().destroyLoader(1);
    }
}
