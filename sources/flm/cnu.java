package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.ErrorFragment;
import com.google.android.gms.kids.setup.fragment.geller.WaitingForParentFragment;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnu extends cgw {
    public final /* synthetic */ WaitingForParentFragment a;

    public cnu(WaitingForParentFragment waitingForParentFragment) {
        this.a = waitingForParentFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cnw
            private final cnu a;

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
        ((WaitingForParentFragment.FragmentViewModel) cin.a(this.a).a(WaitingForParentFragment.FragmentViewModel.class)).a.b((Object) null);
        if (!dviVar.a()) {
            WaitingForParentFragment waitingForParentFragment = this.a;
            cce.a(waitingForParentFragment).a(R.id.kidsetup_action_error, new Bundle());
        }
        eyi eyiVar = (eyi) dviVar.b();
        fau fauVarA = fau.a(eyiVar.b);
        if (fauVarA == null) {
            fauVarA = fau.UNKNOWN_INITIATOR_STATE;
        }
        switch (fauVarA.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                WaitingForParentFragment waitingForParentFragment2 = this.a;
                cce.a(waitingForParentFragment2).a(R.id.kidsetup_action_error, new Bundle());
                break;
            case 1:
                WaitingForParentFragment waitingForParentFragment3 = this.a;
                faq faqVarA = faq.a(eyiVar.e);
                if (faqVarA == null) {
                    faqVarA = faq.UNKNOWN_CANCELLATION_REASON;
                }
                if (eyiVar.c == null) {
                    fawVar = faw.f;
                } else {
                    fawVar = eyiVar.c;
                }
                cce.a(waitingForParentFragment3).a(R.id.kidsetup_action_error, ErrorFragment.a(faqVarA, fawVar));
                break;
            case 2:
                WaitingForParentFragment waitingForParentFragment4 = this.a;
                final WaitingForParentFragment waitingForParentFragment5 = this.a;
                waitingForParentFragment4.o = new FutureTask(new Runnable(waitingForParentFragment5) { // from class: flm.cnv
                    private final WaitingForParentFragment a;

                    {
                        this.a = waitingForParentFragment5;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.i();
                    }
                }, null);
                this.a.getView().postDelayed(this.a.o, WaitingForParentFragment.a);
                break;
            case 3:
                this.a.a(new Bundle());
                break;
        }
    }
}
