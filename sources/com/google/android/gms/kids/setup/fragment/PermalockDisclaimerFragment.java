package com.google.android.gms.kids.setup.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.PermalockDisclaimerFragment;
import flm.aja;
import flm.com;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class PermalockDisclaimerFragment extends KidSetupFragment {
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            ((aja) this.c.b.a(aja.class)).a(R.string.perma_lock_heading);
            this.c.b(R.string.perma_lock_description_1);
            this.c.c(R.string.perma_lock_description_2);
            com.a(getActivity(), this.c.a(), new View.OnClickListener(this) { // from class: flm.cle
                private final PermalockDisclaimerFragment a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PermalockDisclaimerFragment permalockDisclaimerFragment = this.a;
                    permalockDisclaimerFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(permalockDisclaimerFragment.getString(R.string.stop_supervision_pixel_jp_learn_more_url))));
                }
            });
            this.c.b().setText(R.string.perma_lock_i_understand);
        } else {
            c(R.string.perma_lock_heading);
            d(R.string.perma_lock_description_1);
            e(R.string.perma_lock_description_2);
            com.a(getActivity(), this.l, new View.OnClickListener(this) { // from class: flm.clf
                private final PermalockDisclaimerFragment a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PermalockDisclaimerFragment permalockDisclaimerFragment = this.a;
                    permalockDisclaimerFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(permalockDisclaimerFragment.getString(R.string.stop_supervision_pixel_jp_learn_more_url))));
                }
            });
            this.n.b.setText(R.string.perma_lock_i_understand);
        }
        return this.g;
    }
}
