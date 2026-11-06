package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.kids.setup.fragment.geller.AddMemberSupervisionFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmd extends cgw {
    public final /* synthetic */ AddMemberSupervisionFragment a;

    public cmd(AddMemberSupervisionFragment addMemberSupervisionFragment) {
        this.a = addMemberSupervisionFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cme
            private final cmd a;

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
        this.a.a(new Bundle());
    }
}
