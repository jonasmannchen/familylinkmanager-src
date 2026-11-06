package com.google.android.gms.kids.setup.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.widget.EnhancedNetworkImageView;
import flm.aja;
import flm.chu;
import flm.cja;
import flm.coj;
import flm.coo;
import flm.dvi;
import flm.dvl;
import flm.epf;
import flm.eta;
import flm.ete;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class AppPermissionFragment extends KidSetupFragment {
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
        int i;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            this.c.a(R.layout.kid_setup_content_app_permission);
            this.c.e();
            this.c.f();
            ((aja) this.c.b.a(aja.class)).a(R.string.kidsetup_app_permission_title);
            this.c.b().setVisibility(8);
        } else {
            h(R.layout.kidsetup_content_app_permission);
            c(R.string.kidsetup_app_permission_title);
            this.n.setVisibility(8);
        }
        eta etaVar = this.o.a;
        if (etaVar.c == null) {
            eteVar = ete.t;
        } else {
            eteVar = etaVar.c;
        }
        coj.a((EnhancedNetworkImageView) this.g.findViewById(R.id.kidsetup_app_permission_app_icon), this.o.a);
        ((TextView) this.g.findViewById(R.id.kidsetup_app_permission_app_title)).setText(eteVar.c);
        cja cjaVar = new cja(getActivity(), eteVar.s);
        TextView textView = (TextView) this.g.findViewById(R.id.kidsetup_app_permission_app_sub_title);
        if (cjaVar.getCount() == 0) {
            i = R.string.kidsetup_app_permission_does_not_require_permission;
        } else {
            i = R.string.kidsetup_app_permission_may_request_access;
        }
        textView.setText(i);
        ((ListView) this.g.findViewById(R.id.kidsetup_app_permission_list_view)).setAdapter((ListAdapter) cjaVar);
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.APP_PERMISSIONS);
    }
}
