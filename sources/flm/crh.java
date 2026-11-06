package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class crh extends csl {
    private final /* synthetic */ dbk a;

    crh(dbk dbkVar) {
        this.a = dbkVar;
    }

    @Override // flm.csk
    public final void a(csh cshVar) {
        Status status = cshVar.a;
        if (status == null) {
            this.a.b(new atj(new Status(8, "Got null status from location service")));
        } else if (status.h == 0) {
            this.a.a((Object) true);
        } else {
            this.a.b(bag.fromStatus(status));
        }
    }
}
