package com.google.android.gms.kids.setup.fragment.geller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.as;
import flm.bg;
import flm.btm;
import flm.cfm;
import flm.cij;
import flm.cin;
import flm.cmh;
import flm.epf;
import flm.exj;
import flm.exm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class AllSetFragment extends BaseOnboardingFragment {

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new cmh(this));
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        exj exjVar;
        exm exmVar;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        a(btm.b(getActivity(), R.drawable.quantum_ic_check_black_24));
        c(R.string.hand_over_device_title);
        Object[] objArr = new Object[1];
        cij cijVarD = this.e.d();
        if (cijVarD.h == null) {
            exjVar = exj.g;
        } else {
            exjVar = cijVarD.h;
        }
        if (exjVar.d == null) {
            exmVar = exm.h;
        } else {
            exmVar = exjVar.d;
        }
        objArr[0] = exmVar.c;
        b(getString(R.string.all_set_description, objArr));
        f(R.drawable.kidsetup_all_set);
        this.n.a.setVisibility(8);
        this.n.b.setText(R.string.common_done);
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment, com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
    }

    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment
    protected final epf j() {
        return epf.ALL_SET;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
        i();
    }

    public final void i() {
        new cfm(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }
}
