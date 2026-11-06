package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.kids.setup.fragment.SavePartialConsentForSecondaryAccountSignInFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cli extends cgw {
    public final /* synthetic */ SavePartialConsentForSecondaryAccountSignInFragment a;

    public cli(SavePartialConsentForSecondaryAccountSignInFragment savePartialConsentForSecondaryAccountSignInFragment) {
        this.a = savePartialConsentForSecondaryAccountSignInFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.clj
            private final cli a;

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
