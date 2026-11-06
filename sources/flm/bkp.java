package flm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bkp implements aty {
    private final /* synthetic */ DataHolder a;
    private final /* synthetic */ Status b;

    bkp(DataHolder dataHolder, Status status) {
        this.a = dataHolder;
        this.b = status;
        if (this.a != null) {
            new bjm(this.a);
        }
    }

    @Override // flm.aty
    public final Status b() {
        return this.b;
    }
}
