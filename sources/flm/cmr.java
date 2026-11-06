package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.kids.setup.fragment.geller.FinishingUpFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmr extends cgw {
    public final /* synthetic */ FinishingUpFragment a;

    public cmr(FinishingUpFragment finishingUpFragment) {
        this.a = finishingUpFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cms
            private final cmr a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FinishingUpFragment finishingUpFragment = this.a.a;
                new cgg(finishingUpFragment.e).a(((FinishingUpFragment.FragmentViewModel) cin.a(finishingUpFragment).a(FinishingUpFragment.FragmentViewModel.class)).b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        this.a.a(new Bundle());
    }
}
