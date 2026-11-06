package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfs extends cep {
    public cfs(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "GetSupervisedAccountInfoTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        final String str = this.b.d().e;
        return (buh) dyk.b(bug.a(this.a), new dvm(str) { // from class: flm.cft
            private final String a;

            {
                this.a = str;
            }

            @Override // flm.dvm
            public final boolean a(Object obj) {
                return ((buh) obj).b.equals(this.a);
            }
        });
    }
}
