package com.google.android.gms.kids.setup.sentinel;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Fragment;
import com.google.android.gms.kids.setup.fragment.KidSetupFragment;
import com.google.android.gms.kids.setup.sentinel.CancelFragment;
import com.google.android.gms.kids.setup.sentinel.DoneFragment;
import com.google.android.gms.kids.setup.sentinel.StartFragment;
import flm.aja;
import flm.as;
import flm.bg;
import flm.cca;
import flm.cgp;
import flm.cin;
import flm.coa;
import flm.coc;
import flm.cox;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class StartFragment extends KidSetupFragment {
    private int a = R.id.content;

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e.a(coa.a).a(this, new cox(this) { // from class: flm.cob
            private final StartFragment a;

            {
                this.a = this;
            }

            @Override // flm.cox
            public final void a(Object obj) {
                StartFragment startFragment = this.a;
                cia ciaVar = (cia) obj;
                if (ciaVar != cia.UNSPECIFIED) {
                    btv.c("KidSetup", "Starting flow: %S.", ciaVar);
                    switch (ciaVar.ordinal()) {
                        case 2:
                            startFragment.a(new DoneFragment());
                            break;
                        case 3:
                        case 6:
                            startFragment.k(com.google.android.chimeraresources.R.xml.kid_setup_add_account_navigation);
                            break;
                        case 4:
                            startFragment.k(com.google.android.chimeraresources.R.xml.kid_setup_out_of_box_navigation);
                            break;
                        case 5:
                            startFragment.k(com.google.android.chimeraresources.R.xml.kid_setup_sync_tail_navigation);
                            break;
                        case 7:
                            startFragment.k(com.google.android.chimeraresources.R.xml.kid_setup_sign_out_navigation);
                            break;
                        case 8:
                            new chj(startFragment.e, eoi.FLOW_STARTED, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(((emi) ((fio) emh.h.a(dp.au, (Object) null))).a(epd.MEMBER_SV_ONBOARDING).a(startFragment.e.d().d)).h())).a((as) null);
                            startFragment.k(com.google.android.chimeraresources.R.xml.kid_setup_onboarding_navigation);
                            break;
                        case 9:
                            startFragment.k(com.google.android.chimeraresources.R.xml.kid_setup_about_navigation);
                            break;
                        case 10:
                            startFragment.k(com.google.android.chimeraresources.R.xml.kid_setup_secondary_sign_in_navigation);
                            break;
                        case 11:
                            startFragment.k(com.google.android.chimeraresources.R.xml.kid_setup_secondary_sign_out_navigation);
                            break;
                        case 12:
                            startFragment.k(com.google.android.chimeraresources.R.xml.kid_setup_auth_add_account_hook_navigation);
                            break;
                        default:
                            startFragment.a(new CancelFragment());
                            break;
                    }
                }
            }
        });
        as asVar = ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a;
        asVar.a(this, new coc(this));
        if (bundle == null) {
            new cgp(this.e).a(asVar);
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.a = viewGroup == null ? R.id.content : viewGroup.getId();
        if (this.d) {
            ((aja) this.c.b.a(aja.class)).a(com.google.android.chimeraresources.R.string.please_wait);
            this.c.a(true);
            this.c.b(false);
        } else {
            i(-1);
            this.n.b.setVisibility(8);
            this.n.a.setVisibility(8);
        }
        return this.g;
    }

    public final void a(Fragment fragment) {
        getFragmentManager().beginTransaction().replace(this.a, fragment).commit();
    }

    public final void k(int i) {
        a(cca.a(i));
    }
}
