package com.google.android.gms.kids.setup.fragment.geller;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import flm.as;
import flm.chj;
import flm.dp;
import flm.dvi;
import flm.elf;
import flm.elg;
import flm.elj;
import flm.ell;
import flm.eln;
import flm.elo;
import flm.elz;
import flm.ema;
import flm.emh;
import flm.emi;
import flm.eoi;
import flm.epf;
import flm.fin;
import flm.fio;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public final class ProfileOwnerHostFragment extends BaseOnboardingFragment {
    private boolean a = false;
    private String o;

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            i();
        } else {
            this.a = bundle.getBoolean("activity_started", false);
            this.o = bundle.getString("intent_id");
        }
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        b(R.drawable.quantum_ic_error_outline_grey600_24);
        c(R.string.quit_dialog_title);
        d(R.string.profile_owner_canceled_description);
        this.n.a.setVisibility(0);
        this.n.b.setVisibility(8);
        this.n.c.setText(R.string.generic_error_start_over_label);
        this.n.c.setVisibility(0);
        if (bundle == null) {
            this.g.setVisibility(8);
        }
        return this.g;
    }

    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment, flm.cil
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("activity_started", this.a);
        bundle.putString("intent_id", this.o);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            this.a = false;
            elo eloVarA = ((elo) ((fio) eln.f.a(dp.au, (Object) null))).a(ell.PROFILE_OWNER).a(elj.ON_RESULT).a(this.o);
            eloVarA.c();
            eln elnVar = (eln) eloVarA.a;
            elnVar.a |= 8;
            elnVar.e = i2;
            a((eln) ((fin) eloVarA.h()));
            if (i2 == -1) {
                a(new Bundle());
            } else {
                this.g.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment, com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void c() {
        i();
    }

    @Override // com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment
    protected final epf j() {
        return epf.PROFILE_OWNER_HOST;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final void e() {
        k();
    }

    private final void i() {
        emh emhVar;
        if (!this.a) {
            this.a = true;
            this.o = UUID.randomUUID().toString();
            startActivityForResult(new Intent("com.google.android.gms.kids.action.PROFILE_OWNER_CONSENT").setPackage("com.google.android.gms"), 1);
            a((eln) ((fin) ((elo) ((fio) eln.f.a(dp.au, (Object) null))).a(ell.PROFILE_OWNER).a(elj.STARTED).a(this.o).h()));
            dvi dviVarB = b();
            if (dviVarB.a()) {
                elz elzVar = (elz) dviVarB.b();
                if (elzVar.b == 6) {
                    emhVar = (emh) elzVar.c;
                } else {
                    emhVar = emh.h;
                }
                fio fioVar = (fio) emhVar.a(dp.au, (Object) null);
                fioVar.a((fin) emhVar);
                emh emhVar2 = (emh) ((fin) ((emi) fioVar).a(((elg) ((fio) elf.c.a(dp.au, (Object) null))).a(epf.PROFILE_OWNER)).h());
                fio fioVar2 = (fio) elzVar.a(dp.au, (Object) null);
                fioVar2.a((fin) elzVar);
                new chj(this.e, eoi.FRAGMENT_DISPLAYED, (elz) ((fin) ((ema) fioVar2).a(emhVar2).h())).a((as) null);
            }
        }
    }
}
