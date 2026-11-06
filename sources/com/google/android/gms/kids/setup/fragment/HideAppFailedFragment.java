package com.google.android.gms.kids.setup.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.aja;
import flm.as;
import flm.bg;
import flm.cey;
import flm.cfb;
import flm.cin;
import flm.cjx;
import flm.cjz;
import flm.cka;
import flm.coo;
import flm.cqd;
import flm.cqg;
import flm.cqi;
import flm.dvi;
import flm.dvl;
import flm.epf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class HideAppFailedFragment extends KidSetupFragment implements cqi {
    public List a;
    private final cjz o = new cjz(this);

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
        public final as b = new as();
    }

    public static Bundle a(Collection collection) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("failed_to_hide_apps", new ArrayList<>(collection));
        return bundle;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (List) dvl.a(((Bundle) dvl.a(getArguments())).getStringArrayList("failed_to_hide_apps"));
        dvl.a(!this.a.isEmpty());
        FragmentViewModel fragmentViewModel = (FragmentViewModel) cin.a(this).a(FragmentViewModel.class);
        fragmentViewModel.a.a(this, new cka(this));
        fragmentViewModel.b.a(this, new cjx(this));
        if (bundle == null) {
            i();
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            this.c.a(R.layout.kid_setup_content_hide_app_failed);
            ((aja) this.c.b.a(aja.class)).a(getResources().getQuantityString(R.plurals.hide_app_failed_headline, this.a.size()));
            this.c.a(getResources().getQuantityString(R.plurals.hide_app_failed_subheading, this.a.size()));
            this.c.b().setText(R.string.common_continue);
            this.c.c().setText(R.string.hide_app_failed_cancel_setup_button);
            this.c.c().setCompoundDrawablesRelative(null, null, null, null);
            this.c.c().setVisibility(0);
        } else {
            h(R.layout.kidsetup_content_hide_app_failed);
            a(getResources().getQuantityString(R.plurals.hide_app_failed_headline, this.a.size()));
            b(getResources().getQuantityString(R.plurals.hide_app_failed_subheading, this.a.size()));
            this.n.b.setText(R.string.common_continue);
            this.n.a.setText(R.string.hide_app_failed_cancel_setup_button);
            this.n.a.setCompoundDrawablesRelative(null, null, null, null);
            this.n.a.setVisibility(0);
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.HIDE_APP_FAILED);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
        cqd.a(this).a(R.string.hide_app_failed_cancel_setup_dialog_title).b(R.string.hide_app_failed_cancel_setup_dialog_message).c(R.string.common_button_yes).d(R.string.common_button_no).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
        j();
    }

    public final void i() {
        new cfb(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }

    public final void j() {
        new cey(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).b);
    }

    @Override // flm.cqi
    public final /* synthetic */ cqg f_() {
        return this.o;
    }
}
