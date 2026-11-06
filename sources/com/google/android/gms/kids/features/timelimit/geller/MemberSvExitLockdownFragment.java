package com.google.android.gms.kids.features.timelimit.geller;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Fragment;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.features.timelimit.LockScreenChimeraActivity;
import flm.byt;
import flm.byu;
import flm.caa;
import flm.cac;
import flm.cbs;
import flm.cbt;
import flm.cbw;
import flm.ccc;
import flm.cce;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class MemberSvExitLockdownFragment extends Fragment implements View.OnClickListener, byu {
    public static final long a = TimeUnit.SECONDS.toMillis(1) / 2;
    public View b;
    private final caa c = new caa(this);
    private final cac d = new cac(this);

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b = layoutInflater.inflate(R.layout.member_sv_exit_lockdown, viewGroup, false);
        this.b.findViewById(R.id.member_sv_exit_lockdown_parent_access_button).setOnClickListener(this);
        String strA = byt.a((Context) getActivity());
        Button button = (Button) this.b.findViewById(R.id.member_sv_exit_lockdown_emergency_button);
        button.setVisibility(strA == null ? 4 : 0);
        button.setOnClickListener(this);
        getLoaderManager().initLoader(1, new Bundle(), this.d);
        getLoaderManager().initLoader(2, new Bundle(), this.c);
        return this.b;
    }

    public final void onStart() {
        super.onStart();
        getLoaderManager().getLoader(1).forceLoad();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        ccc cccVar;
        String strConcat;
        int id = view.getId();
        LockScreenChimeraActivity lockScreenChimeraActivity = (LockScreenChimeraActivity) getActivity();
        if (id == R.id.member_sv_exit_lockdown_parent_access_button) {
            cbt cbtVarA = cce.a(this);
            cbw cbwVar = cbtVarA.d.isEmpty() ? cbtVarA.b : (cbw) cbtVarA.d.peekLast();
            if (cbwVar == null) {
                throw new IllegalStateException("no current navigation node");
            }
            cbs cbsVarA = cbwVar.a(R.id.member_sv_exit_unlock_destination);
            if (cbsVarA != null) {
                cccVar = cbsVarA.b;
                if (cbsVarA.a == 0 && cccVar != null && cccVar.b != 0) {
                    cbtVarA.a(cccVar.b, cccVar.c);
                    return;
                }
                i = cbsVarA.a;
            } else {
                i = R.id.member_sv_exit_unlock_destination;
                cccVar = null;
            }
            cbw cbwVarB = cbtVarA.b(i);
            if (cbwVarB == null) {
                String resourceName = cbtVarA.a.getResources().getResourceName(i);
                if (cbsVarA != null) {
                    String strValueOf = String.valueOf(cbtVarA.a.getResources().getResourceName(R.id.member_sv_exit_unlock_destination));
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
        if (id == R.id.member_sv_exit_lockdown_emergency_button) {
            lockScreenChimeraActivity.onEmergencyButtonClicked();
        }
    }

    @Override // flm.byu
    public final boolean a() {
        return true;
    }
}
