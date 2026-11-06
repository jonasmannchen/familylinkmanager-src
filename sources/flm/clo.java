package flm;

import android.content.DialogInterface;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.SupervisionConfirmationFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class clo extends cgw {
    public final /* synthetic */ SupervisionConfirmationFragment a;

    public clo(SupervisionConfirmationFragment supervisionConfirmationFragment) {
        this.a = supervisionConfirmationFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        if (!this.a.d) {
            this.a.i(11);
            return;
        }
        ((aja) this.a.c.b.a(aja.class)).a(R.string.please_wait);
        this.a.c.a(true);
        this.a.c.b(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.clp
            private final clo a;

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
        if (this.a.d) {
            ((aja) this.a.c.b.a(aja.class)).a(R.string.supervision_confirmation_title);
            this.a.c.a(false);
            this.a.c.b(true);
            return;
        }
        this.a.j(11);
    }
}
