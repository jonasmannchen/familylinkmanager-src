package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.geller.StartMemberSvOnboardingFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnl extends cgw {
    public final /* synthetic */ StartMemberSvOnboardingFragment a;

    public cnl(StartMemberSvOnboardingFragment startMemberSvOnboardingFragment) {
        this.a = startMemberSvOnboardingFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cnm
            private final cnl a;

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
        chf chfVar = (chf) obj;
        boolean z = chfVar.a > 1;
        boolean z2 = chfVar.b > 0 || chfVar.c > 0;
        boolean z3 = chfVar.d > 0;
        cbt cbtVarA = cce.a(this.a);
        if (z && z2 && z3) {
            cbtVarA.c(R.id.kid_setup_destination_additional_accounts_other_devices_and_not_allowed_devices);
            return;
        }
        if (z && z2) {
            cbtVarA.c(R.id.kid_setup_destination_additional_accounts_and_other_devices);
            return;
        }
        if (z && z3) {
            cbtVarA.c(R.id.kid_setup_destination_additional_accounts_and_not_allowed_devices);
            return;
        }
        if (z2 && z3) {
            cbtVarA.c(R.id.kid_setup_destination_other_devices_and_not_allowed_devices);
            return;
        }
        if (z) {
            cbtVarA.c(R.id.kid_setup_destination_additional_accounts_info);
            return;
        }
        if (z2) {
            cbtVarA.c(R.id.kid_setup_destination_other_devices);
        } else if (z3) {
            cbtVarA.c(R.id.kid_setup_destination_not_allowed_devices);
        } else {
            this.a.a(new Bundle());
        }
    }
}
