package flm;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class azc {
    private final ddv a;
    private boolean b;

    azc(Context context) {
        if (ddo.a(context)) {
            this.b = true;
            this.a = ddo.b(context);
        } else {
            this.b = false;
            this.a = null;
        }
    }

    final boolean a() {
        if (!this.b) {
            return false;
        }
        try {
            ddv ddvVar = this.a;
            this.b = ((ddu) ((ddn) dbp.a(bda.toResponseTask(ddvVar.g.a(ddvVar.e), new ddn()), bbx.DEFAULT_UNBIND_DELAY_MILLIS, TimeUnit.MILLISECONDS)).a).a();
            return this.b;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return false;
        }
    }
}
