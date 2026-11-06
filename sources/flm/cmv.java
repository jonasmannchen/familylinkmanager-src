package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.ErrorFragment;
import com.google.android.gms.kids.setup.fragment.geller.JoinFamilyGroupFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmv extends cgw {
    public final /* synthetic */ JoinFamilyGroupFragment a;

    public cmv(JoinFamilyGroupFragment joinFamilyGroupFragment) {
        this.a = joinFamilyGroupFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cmw
            private final cmv a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        faw fawVar;
        dvi dviVar = (dvi) obj;
        if (!dviVar.a()) {
            JoinFamilyGroupFragment joinFamilyGroupFragment = this.a;
            cce.a(joinFamilyGroupFragment).a(R.id.kidsetup_action_error, new Bundle());
        }
        eyi eyiVar = (eyi) dviVar.b();
        fau fauVarA = fau.a(eyiVar.b);
        if (fauVarA == null) {
            fauVarA = fau.UNKNOWN_INITIATOR_STATE;
        }
        switch (fauVarA.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                JoinFamilyGroupFragment joinFamilyGroupFragment2 = this.a;
                cce.a(joinFamilyGroupFragment2).a(R.id.kidsetup_action_error, new Bundle());
                break;
            case 1:
                JoinFamilyGroupFragment joinFamilyGroupFragment3 = this.a;
                faq faqVarA = faq.a(eyiVar.e);
                if (faqVarA == null) {
                    faqVarA = faq.UNKNOWN_CANCELLATION_REASON;
                }
                if (eyiVar.c == null) {
                    fawVar = faw.f;
                } else {
                    fawVar = eyiVar.c;
                }
                cce.a(joinFamilyGroupFragment3).a(R.id.kidsetup_action_error, ErrorFragment.a(faqVarA, fawVar));
                break;
            case 2:
                cce.a(this.a).c(R.id.kidsetup_action_wait);
                break;
            case 3:
                super/*com.google.android.gms.kids.setup.fragment.geller.BaseOnboardingFragment*/.a(new Bundle());
                break;
        }
    }
}
