package com.google.android.gms.kids.setup.fragment;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.aja;
import flm.dvl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class MemberRejectionFragment extends KidSetupFragment {
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        String string = getString(R.string.member_rejection_action_subtext, new Object[]{((Account) dvl.a((Account) ((Intent) dvl.a((Intent) this.e.b.a())).getParcelableExtra("account"))).name});
        if (this.d) {
            this.c.a(this.c.d ? R.layout.kid_setup_content_member_rejection_glif : R.layout.kid_setup_content_member_rejection);
            ((TextView) this.g.findViewById(R.id.kid_setup_member_rejection_action_subtext)).setText(string);
            ((aja) this.c.b.a(aja.class)).a(R.string.member_rejection_title);
            this.c.b(R.string.member_rejection_subtext);
            this.c.b().setText(R.string.common_button_quit);
            this.c.b().setCompoundDrawablesRelative(null, null, null, null);
            this.c.c().setVisibility(8);
        } else {
            h(R.layout.kids_rejection_flow_content);
            c(R.string.member_rejection_title);
            ((TextView) this.g.findViewById(R.id.kid_setup_member_rejection_action_subtext)).setText(string);
            this.n.b.setText(R.string.common_button_quit);
            this.n.b.setCompoundDrawablesRelative(null, null, null, null);
            this.n.a.setVisibility(8);
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
    }
}
