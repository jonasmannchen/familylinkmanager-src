package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class del extends dej {
    private final auw a;

    public del(auw auwVar) {
        this.a = auwVar;
    }

    @Override // flm.dej, flm.ddy
    public final void a(Status status, ddw ddwVar) {
        if (!status.a()) {
            this.a.setResult(new def(status, null));
        } else {
            this.a.setResult(new def(Status.a, ddwVar));
        }
    }
}
