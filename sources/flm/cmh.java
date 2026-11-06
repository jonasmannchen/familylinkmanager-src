package flm;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.kids.setup.fragment.geller.AllSetFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmh extends cgw {
    public final /* synthetic */ AllSetFragment a;

    public cmh(AllSetFragment allSetFragment) {
        this.a = allSetFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a() {
        this.a.i(12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final void a(Exception exc) {
        this.a.a(new DialogInterface.OnClickListener(this) { // from class: flm.cmi
            private final cmh a;

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
        ((AllSetFragment.FragmentViewModel) cin.a(this.a).a(AllSetFragment.FragmentViewModel.class)).a.b((Object) null);
        this.a.a((Bundle) null);
    }
}
