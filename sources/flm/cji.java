package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.AppSelectorFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cji extends cgw {
    public final /* synthetic */ AppSelectorFragment a;

    public cji(AppSelectorFragment appSelectorFragment) {
        this.a = appSelectorFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        if (!this.a.d) {
            this.a.i(4);
        } else {
            this.a.c.a(true);
            this.a.c.b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cjj
            private final cji a;

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
        eyu eyuVar;
        ((AppSelectorFragment.FragmentViewModel) cin.a(this.a).a(AppSelectorFragment.FragmentViewModel.class)).b.b((Object) null);
        if (this.a.d) {
            this.a.c.a(false);
            this.a.c.b(true);
        } else {
            this.a.j(4);
        }
        cia ciaVarA = cia.a(this.a.e.d().b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        if (ciaVarA == cia.OUT_OF_BOX_FLOW) {
            cij cijVarD = this.a.e.d();
            if (cijVarD.t == null) {
                eyuVar = eyu.d;
            } else {
                eyuVar = cijVarD.t;
            }
            if (eyuVar.c) {
                cce.a(this.a).c(R.id.kidsetup_action_perma_lock);
                return;
            }
        }
        this.a.a((Bundle) null);
    }
}
