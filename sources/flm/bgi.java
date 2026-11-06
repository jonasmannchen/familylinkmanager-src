package flm;

import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionEvent;
import com.google.android.gms.common.stats.WakeLockEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface bgi {
    int a(int i);

    void a(ConnectionEvent connectionEvent);

    void a(WakeLockEvent wakeLockEvent);

    Bundle b();
}
