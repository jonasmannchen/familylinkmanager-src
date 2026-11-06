package com.google.android.gms.kids.setup.fragment.geller;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;
import flm.as;
import flm.bg;
import flm.btm;
import flm.cfp;
import flm.cij;
import flm.cin;
import flm.cmv;
import flm.coj;
import flm.epf;
import flm.exj;
import flm.exm;
import flm.faw;
import flm.ik;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class JoinFamilyGroupFragment extends BaseOnboardingFragment {

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new cmv(this));
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        exj exjVar;
        exm exmVar;
        faw fawVar;
        super.onCreateView(layoutInflater, viewGroup, bundle);
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
        a(btm.a((Context) getActivity(), (Drawable) ik.a(getResources(), R.drawable.kidsetup_ic_loveshack, null)));
        a(getString(R.string.join_family_group_title, new Object[]{exmVar.c}));
        h(R.layout.kidsetup_content_join_family_group);
        EnhancedNetworkImageView enhancedNetworkImageView = (EnhancedNetworkImageView) this.g.findViewById(R.id.join_family_supervisee_avatar);
        enhancedNetworkImageView.setDefaultImageResId(R.drawable.product_logo_avatar_circle_blue_color_48);
        coj.a(enhancedNetworkImageView, coj.a(exmVar.d));
        ((TextView) this.g.findViewById(R.id.join_family_supervisee_email)).setText(this.e.d().e);
        cij cijVarD2 = this.e.d();
        if (cijVarD2.q == null) {
            fawVar = faw.f;
        } else {
            fawVar = cijVarD2.q;
        }
        ((TextView) this.g.findViewById(R.id.join_family_group_content)).setText(getString(R.string.join_family_group_description, new Object[]{fawVar.c}));
        ((TextView) this.g.findViewById(R.id.family_manager_name_view)).setText(fawVar.b);
        ((TextView) this.g.findViewById(R.id.family_manager_email_view)).setText(fawVar.d);
        EnhancedNetworkImageView enhancedNetworkImageView2 = (EnhancedNetworkImageView) this.g.findViewById(R.id.family_manager_avatar);
        enhancedNetworkImageView2.setDefaultImageResId(R.drawable.product_logo_avatar_circle_blue_color_48);
        coj.a(enhancedNetworkImageView2, coj.a(fawVar.e));
        this.n.a.setText(R.string.common_cancel);
        this.n.a.setVisibility(0);
        this.n.b.setText(R.string.join_button_label);
        this.n.b.setVisibility(0);
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void a(Bundle bundle) {
        this.n.setEnabled(false);
        i();
    }

    public final void i() {
        new cfp(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }

    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment
    protected final epf j() {
        return epf.JOIN_FAMILY;
    }
}
