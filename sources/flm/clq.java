package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.HideAppFailedFragment;
import com.google.android.gms.kids.setup.fragment.SupervisionSyncFragment;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class clq extends cgw {
    public final /* synthetic */ SupervisionSyncFragment a;

    public clq(SupervisionSyncFragment supervisionSyncFragment) {
        this.a = supervisionSyncFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.clr
            private final clq a;

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
        List list = (List) obj;
        if (list.isEmpty()) {
            this.a.a((Bundle) null);
        } else {
            cce.a(this.a).a(R.id.kidsetup_action_hide_app_failed, HideAppFailedFragment.a(list));
        }
    }
}
