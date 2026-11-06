package com.google.android.gms.kids.setup.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.AccountRemovalFragment;
import com.google.android.gms.kids.setup.widget.AccountView;
import flm.aja;
import flm.as;
import flm.bg;
import flm.cce;
import flm.cfh;
import flm.cij;
import flm.cin;
import flm.cio;
import flm.ciq;
import flm.ckp;
import flm.coo;
import flm.cox;
import flm.dvi;
import flm.epf;
import flm.exj;
import flm.exm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class AccountRemovalFragment extends KidSetupFragment {
    public boolean a = false;

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        as asVar = ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a;
        asVar.a(this, new ciq(this));
        if (bundle == null) {
            new cfh(this.e, false).a(asVar);
        }
        this.e.a(cio.a).a(this, new cox(this) { // from class: flm.cip
            private final AccountRemovalFragment a;

            {
                this.a = this;
            }

            @Override // flm.cox
            public final void a(Object obj) {
                this.a.a((exj) obj);
            }
        });
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        exj exjVar;
        int i;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            ckp ckpVar = this.c;
            if (this.c.d) {
                i = R.layout.kid_setup_content_account_removal_glif;
            } else {
                i = R.layout.kid_setup_content_account_removal_material;
            }
            ckpVar.a(i);
            ((aja) this.c.b.a(aja.class)).a(R.string.account_removal_title);
            Button buttonB = this.c.b();
            buttonB.setText(R.string.account_removal_button_confirm);
            buttonB.setCompoundDrawablesRelative(null, null, null, null);
        } else {
            h(R.layout.kidsetup_content_account_removal);
            c(R.string.account_removal_title);
            this.n.b.setText(R.string.account_removal_button_confirm);
            this.n.b.setCompoundDrawablesRelative(null, null, null, null);
        }
        cij cijVarD = this.e.d();
        if (cijVarD.h == null) {
            exjVar = exj.g;
        } else {
            exjVar = cijVarD.h;
        }
        a(exjVar);
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.ACCOUNT_REMOVAL);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
        k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void a(Bundle bundle) {
        if (this.a) {
            cce.a(this).c(R.id.kidsetup_action_local_unlock);
        } else {
            super.a(bundle);
        }
    }

    public final void a(exj exjVar) {
        exm exmVar;
        exm exmVar2;
        AccountView accountView = (AccountView) this.g.findViewById(R.id.kidsetup_account_removal_account_view);
        String str = this.e.d().e;
        if (exjVar.d == null) {
            exmVar = exm.h;
        } else {
            exmVar = exjVar.d;
        }
        String str2 = exmVar.c;
        if (exjVar.d == null) {
            exmVar2 = exm.h;
        } else {
            exmVar2 = exjVar.d;
        }
        accountView.a(str, str2, exmVar2.d);
    }
}
