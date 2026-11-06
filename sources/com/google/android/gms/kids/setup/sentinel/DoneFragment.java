package com.google.android.gms.kids.setup.sentinel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimera.Activity;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.KidSetupFragment;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import flm.aja;
import flm.as;
import flm.bg;
import flm.cgt;
import flm.chi;
import flm.chj;
import flm.cia;
import flm.cij;
import flm.cin;
import flm.cnz;
import flm.dp;
import flm.dvl;
import flm.elz;
import flm.ema;
import flm.emh;
import flm.emi;
import flm.emn;
import flm.emo;
import flm.eoi;
import flm.epd;
import flm.fin;
import flm.fio;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class DoneFragment extends KidSetupFragment {

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
        public final as b = new as();
        public final as c = new as();
    }

    public static Bundle a(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("intent_to_start", (Parcelable) dvl.a(intent));
        return bundle;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentViewModel fragmentViewModel = (FragmentViewModel) cin.a(this).a(FragmentViewModel.class);
        cnz cnzVar = new cnz(this);
        fragmentViewModel.a.a(this, cnzVar);
        fragmentViewModel.b.a(this, cnzVar);
        fragmentViewModel.c.a(this, cnzVar);
        if (bundle == null) {
            cia ciaVarA = cia.a(this.e.d().b);
            if (ciaVarA == null) {
                ciaVarA = cia.UNSPECIFIED;
            }
            switch (ciaVarA.ordinal()) {
                case 4:
                    new cgt(this.e).a(fragmentViewModel.a);
                    break;
                case 5:
                    new chi(this.e, false).a(fragmentViewModel.b);
                    break;
                case 6:
                case 7:
                default:
                    i();
                    break;
                case 8:
                    KidSetupViewModel kidSetupViewModel = this.e;
                    eoi eoiVar = eoi.FLOW_COMPLETED;
                    cij cijVarD = this.e.d();
                    emi emiVarA = ((emi) ((fio) emh.h.a(dp.au, (Object) null))).a(epd.MEMBER_SV_ONBOARDING).a(cijVarD.d);
                    if ((cijVarD.a & 16384) == 16384) {
                        emiVarA.a(((emo) ((fio) emn.c.a(dp.au, (Object) null))).a(cijVarD.p));
                    }
                    new chj(kidSetupViewModel, eoiVar, (elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(emiVarA).h())).a(fragmentViewModel.c);
                    break;
            }
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            ((aja) this.c.b.a(aja.class)).a(R.string.please_wait);
            this.c.a(true);
            this.c.b(false);
        } else {
            i(-1);
            this.n.b.setVisibility(8);
            this.n.a.setVisibility(8);
        }
        return this.g;
    }

    public final void i() {
        Activity activity = getActivity();
        if (this.e.b.a() != null && Objects.equals(((Intent) this.e.b.a()).getAction(), "com.google.android.gms.auth.removeaccount.DM_PRE_REMOVE_ACCOUNT")) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            activity.startActivity(intent);
            activity.setResult(0);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null && arguments.containsKey("intent_to_start")) {
                activity.startActivity((Intent) arguments.getParcelable("intent_to_start"));
            }
            activity.setResult(-1);
        }
        activity.finish();
    }
}
