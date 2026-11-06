package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chq extends cep {
    private final String c;

    public chq(KidSetupViewModel kidSetupViewModel, String str) {
        super(kidSetupViewModel);
        this.c = str;
    }

    @Override // flm.cep
    protected final String a() {
        return "VerifyParentAccessCodeTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        return Boolean.valueOf(this.b.b().verifyParentAccessCode(this.c));
    }
}
