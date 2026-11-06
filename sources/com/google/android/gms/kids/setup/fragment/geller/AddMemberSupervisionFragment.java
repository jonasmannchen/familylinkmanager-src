package com.google.android.gms.kids.setup.fragment.geller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.as;
import flm.bg;
import flm.cce;
import flm.ced;
import flm.cin;
import flm.cmd;
import flm.epf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class AddMemberSupervisionFragment extends BaseOnboardingFragment {

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new cmd(this));
        if (bundle == null) {
            i();
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.n.a.setVisibility(8);
        this.n.b.setVisibility(8);
        c(R.string.one_moment);
        h(R.layout.kidsetup_content_progress_bar_only);
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment, com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void k() {
        cce.a(this).c(R.id.kidsetup_action_account_removed);
    }

    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment
    protected final epf j() {
        return epf.ADDING_MEMBER_SUPERVISION;
    }

    public final void i() {
        new ced(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }
}
