package com.google.android.gms.kids.features.timelimit.geller;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.geller.MemberSvExitCooldownFragment;
import flm.bsq;
import flm.bsr;
import flm.btv;
import flm.bxi;
import flm.byu;
import flm.bzq;
import flm.bzs;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class MemberSvExitCooldownFragment extends Fragment implements byu {
    public static final long a = TimeUnit.SECONDS.toMillis(1) / 2;
    private final bzq b = new bzq(this);
    private final bzs c = new bzs(this);

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.member_sv_exit_cooldown, viewGroup, false);
        viewInflate.findViewById(R.id.member_sv_exit_cooldown_cancel_button).setOnClickListener(new View.OnClickListener(this) { // from class: flm.bzp
            private final MemberSvExitCooldownFragment a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i;
                ccc cccVar;
                String strConcat;
                MemberSvExitCooldownFragment memberSvExitCooldownFragment = this.a;
                view.setEnabled(false);
                cbt cbtVarA = cce.a(memberSvExitCooldownFragment);
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
                if (cbwVarB != null) {
                    if (cccVar != null && cccVar.b != 0) {
                        cbtVarA.a(cccVar.b, cccVar.c);
                    }
                    cbwVarB.a((Bundle) null, cccVar);
                    return;
                }
                String resourceName = cbtVarA.a.getResources().getResourceName(i);
                if (cbsVarA != null) {
                    String strValueOf = String.valueOf(cbtVarA.a.getResources().getResourceName(R.id.member_sv_exit_cancel_destination));
                    strConcat = strValueOf.length() != 0 ? " referenced from action ".concat(strValueOf) : new String(" referenced from action ");
                } else {
                    strConcat = "";
                }
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(resourceName).length() + 56 + String.valueOf(strConcat).length()).append("navigation destination ").append(resourceName).append(strConcat).append(" is unknown to this NavController").toString());
            }
        });
        getLoaderManager().initLoader(2, new Bundle(), this.b);
        getLoaderManager().initLoader(3, new Bundle(), this.c);
        return viewInflate;
    }

    @Override // flm.byu
    public final boolean a() {
        return true;
    }

    public static void a(Context context, int i) {
        bsr bsrVarA = bsq.a(context);
        try {
            try {
                bsrVarA.a().setMemberSvExitState(i);
            } catch (RemoteException | bxi e) {
                btv.c("MemberSpvsn", e, "Error setting member supervision exit state", new Object[0]);
                bsq.a(context, bsrVarA);
            }
        } finally {
            bsq.a(context, bsrVarA);
        }
    }
}
