package flm;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class beh extends blu {
    private static beh a;

    public final SSLSocketFactory a(Context context, KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, boolean z) {
        try {
            return (SSLSocketFactory) blt.a(((bec) getRemoteCreatorInstance(context)).a(blt.a(context), blt.a(keyManagerArr), blt.a(trustManagerArr), z));
        } catch (RemoteException | blv e) {
            throw new RuntimeException(e);
        }
    }

    public final SSLSocketFactory a(Context context, KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, String str) {
        try {
            return (SSLSocketFactory) blt.a(((bec) getRemoteCreatorInstance(context)).a(blt.a(context), blt.a(keyManagerArr), blt.a(trustManagerArr), str));
        } catch (RemoteException | blv e) {
            throw new RuntimeException(e);
        }
    }

    protected beh() {
        super("com.google.android.gms.common.net.SocketFactoryCreatorImpl");
    }

    public static beh a() {
        if (a == null) {
            a = new beh();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.blu
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        return bed.a(iBinder);
    }
}
