package flm;

import android.content.DialogInterface;
import com.google.android.gms.kids.setup.fragment.ParentPickerFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckz extends cgw {
    public final /* synthetic */ ParentPickerFragment a;

    public ckz(ParentPickerFragment parentPickerFragment) {
        this.a = parentPickerFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        if (!this.a.d) {
            this.a.i(14);
        } else {
            ((aje) this.a.c.b.a(aje.class)).a(true);
            this.a.c.b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cla
            private final ckz a;

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
            ((aje) this.a.c.b.a(aje.class)).a(false);
            this.a.c.b(true);
        } else {
            this.a.j(14);
        }
    }
}
