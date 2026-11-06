package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitRequestFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class caf implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ MemberSvExitRequestFragment a;

    public caf(MemberSvExitRequestFragment memberSvExitRequestFragment) {
        this.a = memberSvExitRequestFragment;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new cag(this.a.getActivity());
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i;
        ccc cccVar;
        String strConcat;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            final MemberSvExitRequestFragment memberSvExitRequestFragment = this.a;
            vw vwVarA = new vx(memberSvExitRequestFragment.getActivity()).a(R.string.common_something_went_wrong).a(R.string.close_button_label, new DialogInterface.OnClickListener(memberSvExitRequestFragment) { // from class: flm.cad
                private final MemberSvExitRequestFragment a;

                {
                    this.a = memberSvExitRequestFragment;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3;
                    ccc cccVar2;
                    String strConcat2;
                    cbt cbtVarA = cce.a(this.a);
                    cbw cbwVar = cbtVarA.d.isEmpty() ? cbtVarA.b : (cbw) cbtVarA.d.peekLast();
                    if (cbwVar == null) {
                        throw new IllegalStateException("no current navigation node");
                    }
                    cbs cbsVarA = cbwVar.a(R.id.member_sv_exit_cancel_destination);
                    if (cbsVarA != null) {
                        cccVar2 = cbsVarA.b;
                        if (cbsVarA.a == 0 && cccVar2 != null && cccVar2.b != 0) {
                            cbtVarA.a(cccVar2.b, cccVar2.c);
                            return;
                        }
                        i3 = cbsVarA.a;
                    } else {
                        i3 = R.id.member_sv_exit_cancel_destination;
                        cccVar2 = null;
                    }
                    cbw cbwVarB = cbtVarA.b(i3);
                    if (cbwVarB != null) {
                        if (cccVar2 != null && cccVar2.b != 0) {
                            cbtVarA.a(cccVar2.b, cccVar2.c);
                        }
                        cbwVarB.a((Bundle) null, cccVar2);
                        return;
                    }
                    String resourceName = cbtVarA.a.getResources().getResourceName(i3);
                    if (cbsVarA != null) {
                        String strValueOf = String.valueOf(cbtVarA.a.getResources().getResourceName(R.id.member_sv_exit_cancel_destination));
                        strConcat2 = strValueOf.length() != 0 ? " referenced from action ".concat(strValueOf) : new String(" referenced from action ");
                    } else {
                        strConcat2 = "";
                    }
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(resourceName).length() + 56 + String.valueOf(strConcat2).length()).append("navigation destination ").append(resourceName).append(strConcat2).append(" is unknown to this NavController").toString());
                }
            }).b(R.string.common_retry, new DialogInterface.OnClickListener(memberSvExitRequestFragment) { // from class: flm.cae
                private final MemberSvExitRequestFragment a;

                {
                    this.a = memberSvExitRequestFragment;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.a.getLoaderManager().getLoader(1).forceLoad();
                }
            }).a();
            vwVarA.setCancelable(false);
            vwVarA.setCanceledOnTouchOutside(false);
            vwVarA.show();
            return;
        }
        cbt cbtVarA = cce.a(this.a);
        cbw cbwVar = cbtVarA.d.isEmpty() ? cbtVarA.b : (cbw) cbtVarA.d.peekLast();
        if (cbwVar == null) {
            throw new IllegalStateException("no current navigation node");
        }
        cbs cbsVarA = cbwVar.a(R.id.member_sv_exit_lockdown_destination);
        if (cbsVarA != null) {
            cccVar = cbsVarA.b;
            if (cbsVarA.a == 0 && cccVar != null && cccVar.b != 0) {
                cbtVarA.a(cccVar.b, cccVar.c);
                return;
            }
            i = cbsVarA.a;
        } else {
            i = R.id.member_sv_exit_lockdown_destination;
            cccVar = null;
        }
        cbw cbwVarB = cbtVarA.b(i);
        if (cbwVarB == null) {
            String resourceName = cbtVarA.a.getResources().getResourceName(i);
            if (cbsVarA != null) {
                String strValueOf = String.valueOf(cbtVarA.a.getResources().getResourceName(R.id.member_sv_exit_lockdown_destination));
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
