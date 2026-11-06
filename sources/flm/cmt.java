package flm;

import android.content.DialogInterface;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.HideAppFailedFragment;
import com.google.android.gms.kids.setup.fragment.geller.FinishingUpFragment;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmt extends cgw {
    public final /* synthetic */ FinishingUpFragment a;

    public cmt(FinishingUpFragment finishingUpFragment) {
        this.a = finishingUpFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cmu
            private final cmt a;

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
            FinishingUpFragment finishingUpFragment = this.a;
            new cgg(finishingUpFragment.e).a(((FinishingUpFragment.FragmentViewModel) cin.a(finishingUpFragment).a(FinishingUpFragment.FragmentViewModel.class)).b);
        } else {
            cce.a(this.a).a(R.id.kidsetup_action_hide_app_failed, HideAppFailedFragment.a(list));
        }
    }
}
