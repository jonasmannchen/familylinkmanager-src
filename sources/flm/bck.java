package flm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface bck extends IInterface {
    void onAccountValidationComplete(int i, Bundle bundle);

    void onPostInitComplete(int i, IBinder iBinder, Bundle bundle);

    void onPostInitCompleteWithConnectionInfo(int i, IBinder iBinder, bbe bbeVar);
}
