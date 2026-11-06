package flm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gjp extends gjk {
    private final Method d;
    private final Method e;

    gjp(Provider provider, Method method, Method method2) {
        super(provider);
        this.d = method;
        this.e = method2;
    }

    @Override // flm.gjk
    public final int a() {
        return dp.aV;
    }

    @Override // flm.gjk
    public final void a(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gjs gjsVar = (gjs) it.next();
            if (gjsVar != gjs.HTTP_1_0) {
                arrayList.add(gjsVar.toString());
            }
        }
        try {
            this.d.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // flm.gjk
    public final String b(SSLSocket sSLSocket) {
        try {
            return (String) this.e.invoke(sSLSocket, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
