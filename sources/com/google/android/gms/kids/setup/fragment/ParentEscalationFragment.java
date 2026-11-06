package com.google.android.gms.kids.setup.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.aja;
import flm.cia;
import flm.coo;
import flm.dvi;
import flm.epf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class ParentEscalationFragment extends KidSetupFragment {
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        cia ciaVarA = cia.a(this.e.d().b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        switch (ciaVarA.ordinal()) {
            case 11:
            case 13:
                i = R.string.parent_escalation_sign_out_description;
                break;
            case 12:
                i = R.string.parent_escalation_sign_in_description;
                break;
            default:
                throw new IllegalStateException("Unsupported flow type.");
        }
        if (this.d) {
            ((aja) this.c.b.a(aja.class)).a(R.string.parent_escalation_title);
            this.c.b(i);
            ImageView imageView = (ImageView) this.c.b.findViewById(R.id.kid_setup_illustration);
            imageView.setImageResource(R.drawable.spot_manage_account);
            imageView.setVisibility(0);
        } else {
            c(R.string.parent_escalation_title);
            d(i);
            f(R.drawable.spot_manage_account);
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
        k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.PARENT_ESCALATION);
    }
}
