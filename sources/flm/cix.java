package flm;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.kids.setup.fragment.AddSecondaryAccountFragment;
import com.google.android.gms.kids.setup.sentinel.DoneFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cix extends cgw {
    public final /* synthetic */ AddSecondaryAccountFragment a;

    public cix(AddSecondaryAccountFragment addSecondaryAccountFragment) {
        this.a = addSecondaryAccountFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.ciy
            private final cix a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        this.a.a(DoneFragment.a((Intent) obj));
    }
}
