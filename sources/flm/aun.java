package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aun extends auj {
    private final axr b;

    public aun(axr axrVar, dbk dbkVar) {
        super(4, dbkVar);
        this.b = axrVar;
    }

    @Override // flm.auj
    public final void d(awv awvVar) {
        axw axwVar = (axw) awvVar.d.remove(this.b);
        if (axwVar != null) {
            axwVar.b.a(awvVar.b, this.a);
            axwVar.a.a.a = null;
        } else {
            this.a.a.b((Object) false);
        }
    }

    @Override // flm.aui
    public final aqb[] b(awv awvVar) {
        axw axwVar = (axw) awvVar.d.get(this.b);
        if (axwVar != null) {
            axv axvVar = axwVar.a;
        }
        return null;
    }

    @Override // flm.aui
    public final boolean c(awv awvVar) {
        axw axwVar = (axw) awvVar.d.get(this.b);
        if (axwVar != null) {
            axv axvVar = axwVar.a;
            return false;
        }
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
