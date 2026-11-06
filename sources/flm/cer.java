package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cer extends cep {
    private final /* synthetic */ cep c;
    private final /* synthetic */ cep d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cer(cep cepVar, KidSetupViewModel kidSetupViewModel, cep cepVar2) {
        super(kidSetupViewModel);
        this.d = cepVar;
        this.c = cepVar2;
    }

    @Override // flm.cep
    protected final String a() {
        return String.format("%s -> %s", this.d.a(), this.c.a());
    }

    @Override // flm.cep
    protected final Object b() {
        this.d.b();
        return this.c.b();
    }
}
