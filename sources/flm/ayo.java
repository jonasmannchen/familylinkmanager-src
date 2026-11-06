package flm;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayo {
    public static final Status a = new Status(8, "The connection to Google Play services was lost");
    public static final BasePendingResult[] b = new BasePendingResult[0];
    public final Set c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final ayr d = new ayp(this);
    private final Map e;

    public ayo(Map map) {
        this.e = map;
    }

    final void a(BasePendingResult basePendingResult) {
        this.c.add(basePendingResult);
        basePendingResult.setResultConsumedCallback(this.d);
    }

    public final void a() {
        aub aubVar = null;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.c.toArray(b)) {
            basePendingResult.setResultConsumedCallback(null);
            if (basePendingResult.getResultId() == null) {
                if (basePendingResult.cancelUnlessTransform()) {
                    this.c.remove(basePendingResult);
                }
            } else {
                basePendingResult.clearResultCallback();
                IBinder serviceBrokerBinder = ((ate) this.e.get(((auv) basePendingResult).getClientKey())).getServiceBrokerBinder();
                if (basePendingResult.isReady()) {
                    basePendingResult.setResultConsumedCallback(new ayq(basePendingResult, null, serviceBrokerBinder));
                } else if (serviceBrokerBinder != null && serviceBrokerBinder.isBinderAlive()) {
                    ayq ayqVar = new ayq(basePendingResult, null, serviceBrokerBinder);
                    basePendingResult.setResultConsumedCallback(ayqVar);
                    try {
                        serviceBrokerBinder.linkToDeath(ayqVar, 0);
                    } catch (RemoteException e) {
                        basePendingResult.cancel();
                        basePendingResult.getResultId().intValue();
                        aubVar.b();
                    }
                } else {
                    basePendingResult.setResultConsumedCallback(null);
                    basePendingResult.cancel();
                    basePendingResult.getResultId().intValue();
                    aubVar.b();
                }
                this.c.remove(basePendingResult);
            }
        }
    }
}
