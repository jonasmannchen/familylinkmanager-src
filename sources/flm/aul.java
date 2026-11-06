package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aul extends auj {
    private final axv b;
    private final ays c;

    public aul(axw axwVar, dbk dbkVar) {
        super(3, dbkVar);
        this.b = axwVar.a;
        this.c = axwVar.b;
    }

    @Override // flm.auj
    public final void d(awv awvVar) {
        this.b.a(awvVar.b, this.a);
        if (this.b.a.b != null) {
            awvVar.d.put(this.b.a.b, new axw(this.b, this.c));
        }
    }

    @Override // flm.aui
    public final aqb[] b(awv awvVar) {
        axv axvVar = this.b;
        return null;
    }

    @Override // flm.aui
    public final boolean c(awv awvVar) {
        axv axvVar = this.b;
        return false;
    }

    @Override // flm.auj, flm.auh
    public final /* bridge */ /* synthetic */ void a(avp avpVar, boolean z) {
    }

    @Override // flm.auj, flm.auh
    public final /* bridge */ /* synthetic */ void a(RuntimeException runtimeException) {
        super.a(runtimeException);
    }

    @Override // flm.auj, flm.auh
    public final /* bridge */ /* synthetic */ void a(Status status) {
        super.a(status);
    }
}
