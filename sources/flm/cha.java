package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cha extends cep {
    private final boolean c;

    public cha(KidSetupViewModel kidSetupViewModel, boolean z) {
        super(kidSetupViewModel);
        this.c = z;
    }

    @Override // flm.cep
    protected final String a() {
        return "ScheduleSafetyNetJobTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        cij cijVarD = this.b.d();
        this.b.b().scheduleSafetyNetJob(cijVarD.j, cijVarD.e, cijVarD.f, cijVarD.k, this.c);
        return null;
    }
}
