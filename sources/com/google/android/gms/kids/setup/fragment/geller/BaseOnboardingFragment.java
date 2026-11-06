package com.google.android.gms.kids.setup.fragment.geller;

import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.KidSetupFragment;
import flm.as;
import flm.chj;
import flm.cia;
import flm.cij;
import flm.cmn;
import flm.coo;
import flm.cqd;
import flm.cqg;
import flm.cqh;
import flm.cqi;
import flm.dp;
import flm.dur;
import flm.dvi;
import flm.elf;
import flm.elg;
import flm.eln;
import flm.elz;
import flm.ema;
import flm.emh;
import flm.emi;
import flm.emn;
import flm.emo;
import flm.eoi;
import flm.epd;
import flm.epf;
import flm.fin;
import flm.fio;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection
public abstract class BaseOnboardingFragment extends KidSetupFragment implements cqi {
    protected abstract epf j();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public void c() {
        cqh cqhVarA = cqd.a(this).a(R.string.quit_dialog_title).b(R.string.quit_dialog_message).c(R.string.generic_error_start_over_label).d(R.string.common_back).a(true);
        cqhVarA.a.putBoolean("canceled_on_touch_outside", true);
        cqhVarA.a();
    }

    @Override // flm.cqi
    public final cqg f_() {
        return new cmn(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.kids.setup.fragment.KidSetupFragment
    public final dvi b() {
        cij cijVarD = this.e.d();
        cia ciaVarA = cia.a(cijVarD.b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        dvi dviVarA = coo.a(ciaVarA);
        if (!dviVarA.a()) {
            return dur.a;
        }
        emi emiVarA = ((emi) ((fio) emh.h.a(dp.au, (Object) null))).a((epd) dviVarA.b()).a(cijVarD.d).a(((elg) ((fio) elf.c.a(dp.au, (Object) null))).a(j()));
        if ((cijVarD.a & 16384) == 16384) {
            emiVarA.a(((emo) ((fio) emn.c.a(dp.au, (Object) null))).a(cijVarD.p));
        }
        return dvi.b((elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(emiVarA).h()));
    }

    protected final void a(eln elnVar) {
        emh emhVar;
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
            emi emiVar = (emi) fioVar;
            emiVar.c();
            emh emhVar2 = (emh) emiVar.a;
            if (elnVar == null) {
                throw new NullPointerException();
            }
            emhVar2.g = elnVar;
            emhVar2.a |= 32;
            emh emhVar3 = (emh) ((fin) emiVar.h());
            fio fioVar2 = (fio) elzVar.a(dp.au, (Object) null);
            fioVar2.a((fin) elzVar);
            new chj(this.e, eoi.EXTERNAL_INTENT, (elz) ((fin) ((ema) fioVar2).a(emhVar3).h())).a((as) null);
        }
    }
}
