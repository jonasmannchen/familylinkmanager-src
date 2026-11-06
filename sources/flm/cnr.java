package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.kids.setup.fragment.geller.StopSupervisionWarningFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnr extends cgw {
    public final /* synthetic */ StopSupervisionWarningFragment a;

    public cnr(StopSupervisionWarningFragment stopSupervisionWarningFragment) {
        this.a = stopSupervisionWarningFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cns
            private final cnr a;

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
        this.a.a(new Bundle());
    }
}
