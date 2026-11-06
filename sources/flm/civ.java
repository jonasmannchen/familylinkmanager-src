package flm;

import android.content.DialogInterface;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.AccountRemovedFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class civ extends cgw {
    public final /* synthetic */ AccountRemovedFragment a;

    public civ(AccountRemovedFragment accountRemovedFragment) {
        this.a = accountRemovedFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.ciw
            private final civ a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a.c_();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        if (this.a.d) {
            this.a.c.a(false);
            this.a.c.b(true);
            ((aja) this.a.c.b.a(aja.class)).a(R.string.account_removed_title);
            if (this.a.c.d) {
                ((ajb) this.a.c.b.a(ajb.class)).a(R.drawable.quantum_ic_warning_amber_96);
            }
            this.a.c.c().setText(R.string.close_button_label);
            this.a.c.c().setVisibility(0);
            cia ciaVarA = cia.a(this.a.e.d().b);
            if (ciaVarA == null) {
                ciaVarA = cia.UNSPECIFIED;
            }
            if (ciaVarA == cia.GELLER_FLOW) {
                this.a.c.b().setVisibility(8);
                return;
            } else {
                this.a.c.b().setText(R.string.account_removed_add_account_button);
                this.a.c.b().setVisibility(0);
                return;
            }
        }
        this.a.j(17);
        this.a.c(R.string.account_removed_title);
        this.a.b(R.drawable.quantum_ic_warning_amber_96);
        this.a.n.a.setText(R.string.close_button_label);
        this.a.n.a.setVisibility(0);
        cia ciaVarA2 = cia.a(this.a.e.d().b);
        if (ciaVarA2 == null) {
            ciaVarA2 = cia.UNSPECIFIED;
        }
        if (ciaVarA2 == cia.GELLER_FLOW) {
            this.a.n.b.setVisibility(8);
        } else {
            this.a.n.b.setText(R.string.account_removed_add_account_button);
            this.a.n.b.setVisibility(0);
        }
    }
}
