package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.ParentPasswordFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckw extends cgw {
    public final /* synthetic */ ParentPasswordFragment a;

    public ckw(ParentPasswordFragment parentPasswordFragment) {
        this.a = parentPasswordFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        if (this.a.d) {
            ((aje) this.a.c.b.a(aje.class)).a(true);
            this.a.c.b(false);
        } else {
            this.a.i(15);
        }
        this.a.o.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.ckx
            private final ckw a;

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
        if (((dvi) obj).a()) {
            this.a.a((Bundle) null);
        } else {
            if (this.a.d) {
                ((aje) this.a.c.b.a(aje.class)).a(false);
                this.a.c.b(true);
            } else {
                this.a.j(15);
            }
            this.a.o.setText("");
            this.a.a.b(this.a.getString(R.string.parent_password_wrong));
            this.a.o.setEnabled(true);
        }
        ((ParentPasswordFragment.FragmentViewModel) cin.a(this.a).a(ParentPasswordFragment.FragmentViewModel.class)).a.b((Object) null);
    }
}
