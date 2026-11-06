package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.HideAppFailedFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjx extends cgw {
    public final /* synthetic */ HideAppFailedFragment a;

    public cjx(HideAppFailedFragment hideAppFailedFragment) {
        this.a = hideAppFailedFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        this.a.g.findViewById(R.id.kid_setup_hide_app_failed_list).setVisibility(8);
        if (!this.a.d) {
            this.a.i(8);
            return;
        }
        ((aja) this.a.c.b.a(aja.class)).a(R.string.please_wait);
        this.a.c.a(true);
        this.a.c.b(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cjy
            private final cjx a;

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
        ((HideAppFailedFragment.FragmentViewModel) cin.a(this.a).a(HideAppFailedFragment.FragmentViewModel.class)).b.b((Object) null);
        this.a.a((Bundle) null);
    }
}
