package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.setup.fragment.HandOverDeviceFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjv extends cgw {
    public final /* synthetic */ HandOverDeviceFragment a;

    public cjv(HandOverDeviceFragment handOverDeviceFragment) {
        this.a = handOverDeviceFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        if (!this.a.d) {
            this.a.i(12);
            return;
        }
        ((aja) this.a.c.b.a(aja.class)).a(R.string.please_wait);
        this.a.c.a(true);
        this.a.c.b(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cjw
            private final cjv a;

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
        ((HandOverDeviceFragment.FragmentViewModel) cin.a(this.a).a(HandOverDeviceFragment.FragmentViewModel.class)).a.b((Object) null);
        this.a.a((Bundle) null);
    }
}
