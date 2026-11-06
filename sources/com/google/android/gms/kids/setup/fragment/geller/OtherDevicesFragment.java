package com.google.android.gms.kids.setup.fragment.geller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.OtherDevicesFragment;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;
import flm.as;
import flm.bg;
import flm.btm;
import flm.cgm;
import flm.cin;
import flm.cnc;
import flm.cne;
import flm.cox;
import flm.epf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class OtherDevicesFragment extends BaseOnboardingFragment {
    public View a;
    public View o;

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new cne(this));
        if (bundle == null) {
            i();
        }
        this.e.a(cnc.a).a(this, new cox(this) { // from class: flm.cnd
            private final OtherDevicesFragment a;

            {
                this.a = this;
            }

            @Override // flm.cox
            public final void a(Object obj) {
                exj exjVar = (exj) obj;
                coj.a((EnhancedNetworkImageView) this.a.g.findViewById(R.id.other_devices_user_avatar), coj.a(coj.a((exjVar.d == null ? exm.h : exjVar.d).d)));
            }
        });
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        a(btm.b(getActivity(), R.drawable.quantum_ic_smartphone_black_24));
        c(R.string.other_devices_title);
        h(R.layout.kidsetup_content_other_devices);
        ((EnhancedNetworkImageView) this.g.findViewById(R.id.other_devices_user_avatar)).setDefaultImageResId(R.drawable.product_logo_avatar_circle_blue_color_48);
        ((TextView) this.g.findViewById(R.id.other_devices_user_email)).setText(this.e.d().e);
        this.a = this.g.findViewById(R.id.other_supervisable_devices_section);
        this.o = this.g.findViewById(R.id.unsupervisable_devices_section);
        this.n.a.setText(R.string.common_cancel);
        this.n.a.setVisibility(0);
        this.n.b.setText(R.string.common_next);
        this.n.b.setVisibility(0);
        return this.g;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.a = null;
        this.o = null;
    }

    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment
    protected final epf j() {
        return epf.OTHER_ALLOWED_DEVICES;
    }

    public final void i() {
        new cgm(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }
}
