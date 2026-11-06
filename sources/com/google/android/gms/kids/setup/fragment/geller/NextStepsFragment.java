package com.google.android.gms.kids.setup.fragment.geller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.btm;
import flm.cij;
import flm.epf;
import flm.exj;
import flm.exm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class NextStepsFragment extends BaseOnboardingFragment {
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        a(btm.b(getActivity(), R.drawable.quantum_ic_supervisor_account_black_24));
        c(R.string.next_steps_title);
        Object[] objArr = new Object[1];
        cij cijVarD = this.e.d();
        exj exjVar = cijVarD.h == null ? exj.g : cijVarD.h;
        objArr[0] = (exjVar.d == null ? exm.h : exjVar.d).c;
        b(getString(R.string.next_steps_description, objArr));
        f(R.drawable.kidsetup_parent_child);
        this.n.a.setVisibility(8);
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment, com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
    }

    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment
    protected final epf j() {
        return epf.NEXT_STEPS;
    }
}
