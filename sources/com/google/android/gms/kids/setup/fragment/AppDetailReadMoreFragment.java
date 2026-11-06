package com.google.android.gms.kids.setup.fragment;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.aja;
import flm.chu;
import flm.dvl;
import flm.eta;
import flm.ete;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class AppDetailReadMoreFragment extends KidSetupFragment {
    private String a;
    private chu o;

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getString("package_name");
        dvl.a(!TextUtils.isEmpty(this.a));
        this.o = (chu) dvl.a((chu) this.e.d.get(this.a));
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ete eteVar;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        eta etaVar = this.o.a;
        if (etaVar.c == null) {
            eteVar = ete.t;
        } else {
            eteVar = etaVar.c;
        }
        if (this.d) {
            this.c.a(R.layout.kid_setup_content_app_detail_read_more);
            this.c.e();
            ((aja) this.c.b.a(aja.class)).a(eteVar.c);
            this.c.b().setVisibility(8);
        } else {
            h(R.layout.kidsetup_content_app_detail_read_more);
            a(eteVar.c);
            this.n.setVisibility(8);
        }
        ((TextView) this.g.findViewById(R.id.kidsetup_app_detail_read_more_promotion)).setText(eteVar.h);
        ((TextView) this.g.findViewById(R.id.kidsetup_app_detail_read_more_description)).setText(Html.fromHtml(eteVar.g.replace("\n", "<br>")));
        return this.g;
    }
}
