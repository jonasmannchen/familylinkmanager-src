package flm;

import android.content.Intent;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface ate extends asy {
    void connect(bao baoVar);

    void disconnect();

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    aqb[] getAvailableFeatures();

    String getEndpointPackageName();

    int getMinApkVersion();

    void getRemoteService(bcd bcdVar, Set set);

    IBinder getServiceBrokerBinder();

    Intent getSignInIntent();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(bau bauVar);

    boolean providesSignIn();

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
