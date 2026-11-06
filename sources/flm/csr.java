package flm;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class csr extends crn {
    private final axp a;

    csr(axp axpVar) {
        this.a = axpVar;
    }

    @Override // flm.crm
    public final void a(LocationResult locationResult) {
        this.a.a(new css(locationResult));
    }

    @Override // flm.crm
    public final void a(LocationAvailability locationAvailability) {
        this.a.a(new cst(locationAvailability));
    }

    public final synchronized void a() {
        this.a.a = null;
    }
}
