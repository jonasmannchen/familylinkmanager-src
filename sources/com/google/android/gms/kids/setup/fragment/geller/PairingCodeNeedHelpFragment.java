package com.google.android.gms.kids.setup.fragment.geller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.btm;
import flm.epf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class PairingCodeNeedHelpFragment extends BaseOnboardingFragment {
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        a(btm.b(getActivity(), R.drawable.quantum_ic_help_black_24));
        c(R.string.need_help_button_label);
        e(R.string.need_help_description);
        this.n.a.setVisibility(8);
        this.n.b.setText(R.string.close_button_label);
        this.n.b.setVisibility(0);
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment, com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
        d();
    }

    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment
    protected final epf j() {
        return epf.NEED_HELP;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
        d();
    }
}
