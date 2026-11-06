package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.kids.setup.fragment.RemoveSecondaryAccountFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class clg extends cgw {
    public final /* synthetic */ RemoveSecondaryAccountFragment a;

    public clg(RemoveSecondaryAccountFragment removeSecondaryAccountFragment) {
        this.a = removeSecondaryAccountFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.clh
            private final clg a;

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
        this.a.a((Bundle) null);
    }
}
