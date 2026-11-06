package com.google.android.gms.kids.setup.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.SecondaryAccountConsentFragment;
import com.google.android.gms.kids.setup.widget.NonScrollableListView;
import com.google.android.libraries.material.baselinetextview.BaselineTextView;
import flm.as;
import flm.bg;
import flm.cce;
import flm.cfe;
import flm.cin;
import flm.clk;
import flm.clm;
import flm.cox;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class SecondaryAccountConsentFragment extends KidSetupFragment {

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new clm(this));
        this.e.a(clk.a).a(this, new cox(this) { // from class: flm.cll
            private final SecondaryAccountConsentFragment a;

            {
                this.a = this;
            }

            @Override // flm.cox
            public final void a(Object obj) {
                SecondaryAccountConsentFragment secondaryAccountConsentFragment = this.a;
                evl evlVar = (evl) obj;
                if (secondaryAccountConsentFragment.d) {
                    ((aja) secondaryAccountConsentFragment.c.b.a(aja.class)).a(evlVar.b);
                    secondaryAccountConsentFragment.c.a(evlVar.c);
                } else {
                    secondaryAccountConsentFragment.a(evlVar.b);
                    secondaryAccountConsentFragment.b(evlVar.c);
                }
                LinearLayout linearLayout = (LinearLayout) secondaryAccountConsentFragment.g.findViewById(R.id.kidsetup_secondary_account_consent_list);
                linearLayout.removeAllViews();
                for (evp evpVar : evlVar.d) {
                    cpx cpxVar = new cpx(secondaryAccountConsentFragment.getActivity());
                    cpxVar.a.a(evpVar.b == null ? fec.f : evpVar.b);
                    cpxVar.c.removeAllViews();
                    cpxVar.b.setVisibility(evpVar.c.size() != 0 ? 0 : 8);
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(cpxVar.getContext());
                    for (evr evrVar : evpVar.c) {
                        LinearLayout linearLayout2 = (LinearLayout) layoutInflaterFrom.inflate(R.layout.view_secondary_account_consent_subsection_header, (ViewGroup) cpxVar.c, false);
                        BaselineTextView baselineTextView = (BaselineTextView) linearLayout2.findViewById(R.id.title);
                        if ((evrVar.a & 1) == 1) {
                            baselineTextView.setText(evrVar.b);
                        } else if ((evrVar.a & 4) == 4) {
                            baselineTextView.setText(evrVar.e);
                        }
                        if ((evrVar.a & 2) == 2) {
                            TextView textView = (TextView) linearLayout2.findViewById(R.id.subtitle);
                            textView.setText(evrVar.c);
                            textView.setVisibility(0);
                        }
                        cpxVar.c.addView(linearLayout2);
                        NonScrollableListView nonScrollableListView = (NonScrollableListView) layoutInflaterFrom.inflate(R.layout.non_scrollable_list_view, (ViewGroup) cpxVar.c, false);
                        nonScrollableListView.setAdapter((ListAdapter) new cqb(cpxVar.getContext(), evrVar.d));
                        cpxVar.c.addView(nonScrollableListView);
                    }
                    cpxVar.a(false);
                    linearLayout.addView(cpxVar);
                }
            }
        });
        if (bundle == null) {
            i();
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            this.c.a(R.layout.kid_setup_content_secondary_account_consent);
        } else {
            h(R.layout.kidsetup_content_secondary_account_consent);
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
        cce.a(this).c(R.id.kidsetup_action_back_to_parent_picker);
    }

    public final void i() {
        new cfe(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }
}
