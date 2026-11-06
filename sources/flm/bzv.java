package flm;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitInitialFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzv implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ MemberSvExitInitialFragment a;

    public bzv(MemberSvExitInitialFragment memberSvExitInitialFragment) {
        this.a = memberSvExitInitialFragment;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new bzw(this.a.getActivity());
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i;
        ccc cccVar;
        String strConcat;
        int i2;
        ccc cccVar2;
        String strConcat2;
        int i3;
        ccc cccVar3;
        String strConcat3;
        int i4;
        ccc cccVar4;
        String strConcat4;
        Integer num = (Integer) obj;
        this.a.getLoaderManager().destroyLoader(1);
        switch (((Integer) dvl.a(num)).intValue()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                cbt cbtVarA = cce.a(this.a);
                cbw cbwVar = cbtVarA.d.isEmpty() ? cbtVarA.b : (cbw) cbtVarA.d.peekLast();
                if (cbwVar == null) {
                    throw new IllegalStateException("no current navigation node");
                }
                cbs cbsVarA = cbwVar.a(R.id.member_sv_exit_cancel_destination);
                if (cbsVarA != null) {
                    cccVar = cbsVarA.b;
                    if (cbsVarA.a == 0 && cccVar != null && cccVar.b != 0) {
                        cbtVarA.a(cccVar.b, cccVar.c);
                        return;
                    }
                    i = cbsVarA.a;
                } else {
                    i = R.id.member_sv_exit_cancel_destination;
                    cccVar = null;
                }
                cbw cbwVarB = cbtVarA.b(i);
                if (cbwVarB == null) {
                    String resourceName = cbtVarA.a.getResources().getResourceName(i);
                    if (cbsVarA != null) {
                        String strValueOf = String.valueOf(cbtVarA.a.getResources().getResourceName(R.id.member_sv_exit_cancel_destination));
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
            case 1:
                cbt cbtVarA2 = cce.a(this.a);
                cbw cbwVar2 = cbtVarA2.d.isEmpty() ? cbtVarA2.b : (cbw) cbtVarA2.d.peekLast();
                if (cbwVar2 == null) {
                    throw new IllegalStateException("no current navigation node");
                }
                cbs cbsVarA2 = cbwVar2.a(R.id.member_sv_exit_cooldown_destination);
                if (cbsVarA2 != null) {
                    cccVar4 = cbsVarA2.b;
                    if (cbsVarA2.a == 0 && cccVar4 != null && cccVar4.b != 0) {
                        cbtVarA2.a(cccVar4.b, cccVar4.c);
                        return;
                    }
                    i4 = cbsVarA2.a;
                } else {
                    i4 = R.id.member_sv_exit_cooldown_destination;
                    cccVar4 = null;
                }
                cbw cbwVarB2 = cbtVarA2.b(i4);
                if (cbwVarB2 == null) {
                    String resourceName2 = cbtVarA2.a.getResources().getResourceName(i4);
                    if (cbsVarA2 != null) {
                        String strValueOf2 = String.valueOf(cbtVarA2.a.getResources().getResourceName(R.id.member_sv_exit_cooldown_destination));
                        strConcat4 = strValueOf2.length() != 0 ? " referenced from action ".concat(strValueOf2) : new String(" referenced from action ");
                    } else {
                        strConcat4 = "";
                    }
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(resourceName2).length() + 56 + String.valueOf(strConcat4).length()).append("navigation destination ").append(resourceName2).append(strConcat4).append(" is unknown to this NavController").toString());
                }
                if (cccVar4 != null && cccVar4.b != 0) {
                    cbtVarA2.a(cccVar4.b, cccVar4.c);
                }
                cbwVarB2.a((Bundle) null, cccVar4);
                return;
            case 2:
                cbt cbtVarA3 = cce.a(this.a);
                cbw cbwVar3 = cbtVarA3.d.isEmpty() ? cbtVarA3.b : (cbw) cbtVarA3.d.peekLast();
                if (cbwVar3 == null) {
                    throw new IllegalStateException("no current navigation node");
                }
                cbs cbsVarA3 = cbwVar3.a(R.id.member_sv_exit_request_destination);
                if (cbsVarA3 != null) {
                    cccVar3 = cbsVarA3.b;
                    if (cbsVarA3.a == 0 && cccVar3 != null && cccVar3.b != 0) {
                        cbtVarA3.a(cccVar3.b, cccVar3.c);
                        return;
                    }
                    i3 = cbsVarA3.a;
                } else {
                    i3 = R.id.member_sv_exit_request_destination;
                    cccVar3 = null;
                }
                cbw cbwVarB3 = cbtVarA3.b(i3);
                if (cbwVarB3 == null) {
                    String resourceName3 = cbtVarA3.a.getResources().getResourceName(i3);
                    if (cbsVarA3 != null) {
                        String strValueOf3 = String.valueOf(cbtVarA3.a.getResources().getResourceName(R.id.member_sv_exit_request_destination));
                        strConcat3 = strValueOf3.length() != 0 ? " referenced from action ".concat(strValueOf3) : new String(" referenced from action ");
                    } else {
                        strConcat3 = "";
                    }
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(resourceName3).length() + 56 + String.valueOf(strConcat3).length()).append("navigation destination ").append(resourceName3).append(strConcat3).append(" is unknown to this NavController").toString());
                }
                if (cccVar3 != null && cccVar3.b != 0) {
                    cbtVarA3.a(cccVar3.b, cccVar3.c);
                }
                cbwVarB3.a((Bundle) null, cccVar3);
                return;
            case 3:
                cbt cbtVarA4 = cce.a(this.a);
                cbw cbwVar4 = cbtVarA4.d.isEmpty() ? cbtVarA4.b : (cbw) cbtVarA4.d.peekLast();
                if (cbwVar4 == null) {
                    throw new IllegalStateException("no current navigation node");
                }
                cbs cbsVarA4 = cbwVar4.a(R.id.member_sv_exit_lockdown_destination);
                if (cbsVarA4 != null) {
                    cccVar2 = cbsVarA4.b;
                    if (cbsVarA4.a == 0 && cccVar2 != null && cccVar2.b != 0) {
                        cbtVarA4.a(cccVar2.b, cccVar2.c);
                        return;
                    }
                    i2 = cbsVarA4.a;
                } else {
                    i2 = R.id.member_sv_exit_lockdown_destination;
                    cccVar2 = null;
                }
                cbw cbwVarB4 = cbtVarA4.b(i2);
                if (cbwVarB4 == null) {
                    String resourceName4 = cbtVarA4.a.getResources().getResourceName(i2);
                    if (cbsVarA4 != null) {
                        String strValueOf4 = String.valueOf(cbtVarA4.a.getResources().getResourceName(R.id.member_sv_exit_lockdown_destination));
                        strConcat2 = strValueOf4.length() != 0 ? " referenced from action ".concat(strValueOf4) : new String(" referenced from action ");
                    } else {
                        strConcat2 = "";
                    }
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(resourceName4).length() + 56 + String.valueOf(strConcat2).length()).append("navigation destination ").append(resourceName4).append(strConcat2).append(" is unknown to this NavController").toString());
                }
                if (cccVar2 != null && cccVar2.b != 0) {
                    cbtVarA4.a(cccVar2.b, cccVar2.c);
                }
                cbwVarB4.a((Bundle) null, cccVar2);
                return;
            default:
                String strValueOf5 = String.valueOf(num);
                throw new AssertionError(new StringBuilder(String.valueOf(strValueOf5).length() + 44).append("Started geller fragment with invalid state: ").append(strValueOf5).toString());
        }
    }
}
