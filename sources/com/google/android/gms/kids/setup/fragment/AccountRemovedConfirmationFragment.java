package com.google.android.gms.kids.setup.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.as;
import flm.bg;
import flm.cgy;
import flm.cin;
import flm.cir;
import flm.coo;
import flm.dvi;
import flm.epf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class AccountRemovedConfirmationFragment extends KidSetupFragment {

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new cir(this));
        if (bundle == null) {
            b_();
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            Button buttonB = this.c.b();
            buttonB.setText(R.string.common_exit);
            buttonB.setCompoundDrawablesRelative(null, null, null, null);
            buttonB.setVisibility(8);
            this.c.c().setVisibility(8);
        } else {
            c(R.string.account_removed_title);
            this.n.a.setVisibility(8);
            this.n.b.setVisibility(8);
            this.n.b.setText(R.string.common_exit);
            this.n.b.setCompoundDrawablesRelative(null, null, null, null);
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.ACCOUNT_REMOVED);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void d() {
    }

    public final void b_() {
        new cgy(this.e, true).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }
}
