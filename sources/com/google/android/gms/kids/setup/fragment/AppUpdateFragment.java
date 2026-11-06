package com.google.android.gms.kids.setup.fragment;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Activity;
import com.google.android.chimeraresources.R;
import flm.aja;
import flm.as;
import flm.bbz;
import flm.bg;
import flm.cce;
import flm.cfu;
import flm.cia;
import flm.cij;
import flm.cin;
import flm.cjk;
import flm.cjl;
import flm.cjn;
import flm.coi;
import flm.coo;
import flm.cqd;
import flm.cqg;
import flm.cqi;
import flm.dvi;
import flm.epf;
import flm.exj;
import flm.exm;
import flm.exo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class AppUpdateFragment extends KidSetupFragment implements cqi {
    private final cjk o = new cjk(this);
    public final Map a = new HashMap();
    private final cjn p = new cjn(this);

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new cjl(this));
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        exj exjVar;
        exm exmVar;
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
        exo exoVarA = exo.a(exmVar.g);
        if (exoVarA == null) {
            exoVarA = exo.UNKNOWN_GENDER;
        }
        String string = getString(coi.a(exoVarA, R.string.kidsetup_app_update_description_male, R.string.kidsetup_app_update_description_female, R.string.kidsetup_app_update_description_other), new Object[]{exmVar.c});
        if (this.d) {
            this.c.a(R.layout.kidsetup_content_app_update);
            this.c.e();
            ((aja) this.c.b.a(aja.class)).a(R.string.kidsetup_app_update_title);
            this.c.a(string);
            this.c.b().setText(R.string.common_button_continue);
            cia ciaVarA = cia.a(this.e.d().b);
            if (ciaVarA == null) {
                ciaVarA = cia.UNSPECIFIED;
            }
            if (ciaVarA == cia.SYNC_TAIL_FLOW) {
                this.c.c().setVisibility(8);
            }
            ((aja) this.c.b.a(aja.class)).a(R.string.please_wait);
            this.c.a(true);
            this.c.b(false);
        } else {
            h(R.layout.kidsetup_content_app_update);
            c(R.string.kidsetup_app_update_title);
            b(string);
            this.n.b.setText(R.string.common_button_continue);
            cia ciaVarA2 = cia.a(this.e.d().b);
            if (ciaVarA2 == null) {
                ciaVarA2 = cia.UNSPECIFIED;
            }
            if (ciaVarA2 == cia.SYNC_TAIL_FLOW) {
                this.n.a.setVisibility(8);
            }
            i(10);
        }
        this.a.clear();
        return this.g;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onStart() {
        super.onStart();
        Activity activity = getActivity();
        cjn cjnVar = this.p;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(bbz.PACKAGE_SCHEME);
        activity.registerReceiver(cjnVar, intentFilter);
        h();
    }

    @Override // flm.cil
    public void onStop() {
        getActivity().unregisterReceiver(this.p);
        super.onStop();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public void onDestroyView() {
        super.onDestroyView();
        this.a.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.UPDATING_APPS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void d() {
        cia ciaVarA = cia.a(this.e.d().b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        if (ciaVarA != cia.SYNC_TAIL_FLOW && ciaVarA != cia.GELLER_FLOW) {
            cce.a(this).a(R.id.kidsetup_destination_google_services, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
        cqd.a(this).b(R.string.kidsetup_app_update_confirmation_message).c(R.string.common_ok).d(R.string.common_back).a();
    }

    public final synchronized void h() {
        as asVar = ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a;
        if (asVar.a() == null) {
            new cfu(this.e).a(asVar);
        }
    }

    @Override // flm.cqi
    public final /* synthetic */ cqg f_() {
        return this.o;
    }
}
