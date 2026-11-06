package flm;

import android.content.DialogInterface;
import com.google.android.gms.kids.setup.fragment.geller.AboutSupervisionExitFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class clw extends cgw {
    public final /* synthetic */ AboutSupervisionExitFragment a;

    public clw(AboutSupervisionExitFragment aboutSupervisionExitFragment) {
        this.a = aboutSupervisionExitFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.clx
            private final clw a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.i();
            }
        });
    }
}
