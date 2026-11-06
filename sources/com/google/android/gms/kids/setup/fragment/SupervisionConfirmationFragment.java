package com.google.android.gms.kids.setup.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.KidSetupChimeraActivity;
import flm.aja;
import flm.as;
import flm.bg;
import flm.btm;
import flm.btr;
import flm.btv;
import flm.cgg;
import flm.cid;
import flm.cif;
import flm.cij;
import flm.cin;
import flm.clo;
import flm.coi;
import flm.coo;
import flm.cqd;
import flm.dvi;
import flm.epf;
import flm.exj;
import flm.exm;
import flm.exo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public class SupervisionConfirmationFragment extends KidSetupFragment {

    /* JADX INFO: compiled from: PG */
    public final class FragmentViewModel extends bg {
        public final as a = new as();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a.a(this, new clo(this));
        if (bundle == null) {
            i();
        }
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
        String string = getString(coi.a(exoVarA, R.string.supervision_confirmation_description_male, R.string.supervision_confirmation_description_female, R.string.supervision_confirmation_description_other), new Object[]{exmVar.c});
        if (this.d) {
            ((aja) this.c.b.a(aja.class)).a(R.string.supervision_confirmation_title);
            this.c.b(R.string.supervision_confirmation_subheading);
            this.c.b(string);
            this.c.e();
            this.c.a(btr.a(getActivity(), R.drawable.kidsetup_devices_connected, this.c.g()));
            this.c.c().setVisibility(8);
        } else {
            c(R.string.supervision_confirmation_title);
            d(R.string.supervision_confirmation_subheading);
            this.l.setText(string);
            this.l.setVisibility(0);
            cid cidVarA = cid.a(this.e.d().c);
            if (cidVarA == null) {
                cidVarA = cid.UNDEFINED;
            }
            if (cif.a(cidVarA)) {
                g(R.drawable.kidsetup_devices_connected);
            } else {
                ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = btm.a(176);
                this.k.setLayoutParams(layoutParams);
                this.k.setScaleType(ImageView.ScaleType.FIT_CENTER);
                f(R.drawable.kidsetup_devices_connected);
            }
            this.n.a.setVisibility(8);
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
        cqd.a(this).b(R.string.supervision_confirmation_dialog_message).c(R.string.common_got_it).a(false).a();
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e_() {
        if (getActivity() instanceof KidSetupChimeraActivity) {
            btv.c("KidSetup", "Finishing the activity as the user has left the last device setup screen.", new Object[0]);
            getActivity().scheduleImmediateSafetyNetJobAndFinish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        return coo.a(this.e.d(), epf.SUPERVISION_CONFIRMATION);
    }

    public final void i() {
        new cgg(this.e).a(((FragmentViewModel) cin.a(this).a(FragmentViewModel.class)).a);
    }
}
