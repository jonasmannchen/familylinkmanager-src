package flm;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cwu extends cwj {
    private final auw a;

    public cwu(auw auwVar) {
        this.a = auwVar;
    }

    @Override // flm.cwj, flm.cwk
    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        this.a.setResult(new cwv(cws.a(i, null, bundle), dataHolder != null ? new cxn(dataHolder) : null));
    }
}
