package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.LocalUnlockFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckr extends cgw {
    public final /* synthetic */ LocalUnlockFragment a;

    public ckr(LocalUnlockFragment localUnlockFragment) {
        this.a = localUnlockFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        if (this.a.d) {
            ((aje) this.a.c.b.a(aje.class)).a(true);
            this.a.c.b(false);
            this.a.o.setEnabled(false);
        } else {
            this.a.i(16);
            this.a.o.setEnabled(false);
            this.a.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cks
            private final ckr a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.a.a((Bundle) null);
        } else {
            if (this.a.d) {
                ((aje) this.a.c.b.a(aje.class)).a(false);
                this.a.c.b(true);
            } else {
                this.a.j(16);
            }
            this.a.o.setText("");
            this.a.o.a(true);
            this.a.a.b(this.a.getString(R.string.local_unlock_error_message));
            this.a.o.setEnabled(true);
            this.a.i();
        }
        ((LocalUnlockFragment.FragmentViewModel) cin.a(this.a).a(LocalUnlockFragment.FragmentViewModel.class)).a.b((Object) null);
    }
}
