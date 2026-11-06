package flm;

import com.google.android.gms.kids.setup.fragment.AccountRemovalFragment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ciq extends cgw {
    private final /* synthetic */ AccountRemovalFragment a;

    public ciq(AccountRemovalFragment accountRemovalFragment) {
        this.a = accountRemovalFragment;
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
        this.a.a = true;
        if (this.a.d) {
            ((aje) this.a.c.b.a(aje.class)).a(false);
            this.a.c.b(true);
        } else {
            this.a.j(14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cgw
    public final /* synthetic */ void b(Object obj) {
        this.a.a = false;
        if (this.a.d) {
            ((aje) this.a.c.b.a(aje.class)).a(false);
            this.a.c.b(true);
        } else {
            this.a.j(14);
        }
    }
}
