package flm;

import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqm {
    public final GoogleHelp a;

    public bqm(GoogleHelp googleHelp) {
        this.a = googleHelp;
    }

    public final bqm a(List list) {
        this.a.d = bnq.a(list);
        return this;
    }

    public final TogglingData a() {
        return this.a.x;
    }
}
