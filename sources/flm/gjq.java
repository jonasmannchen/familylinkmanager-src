package flm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gjq extends gjk {
    private final Method d;
    private final Method e;
    private final Method f;
    private final Class g;
    private final Class h;

    public gjq(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = cls;
        this.h = cls2;
    }

    @Override // flm.gjk
    public final int a() {
        return dp.aV;
    }

    @Override // flm.gjk
    public final void a(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gjs gjsVar = (gjs) list.get(i);
            if (gjsVar != gjs.HTTP_1_0) {
                arrayList.add(gjsVar.toString());
            }
        }
        try {
            this.d.invoke(null, sSLSocket, Proxy.newProxyInstance(gjk.class.getClassLoader(), new Class[]{this.g, this.h}, new gjr(arrayList)));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // flm.gjk
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError();
        } catch (InvocationTargetException e2) {
        }
    }

    @Override // flm.gjk
    public final String b(SSLSocket sSLSocket) {
        try {
            gjr gjrVar = (gjr) Proxy.getInvocationHandler(this.e.invoke(null, sSLSocket));
            if (!gjrVar.a && gjrVar.b == null) {
                a.logp(Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (gjrVar.a) {
                return null;
            }
            return gjrVar.b;
        } catch (IllegalAccessException e) {
            throw new AssertionError();
        } catch (InvocationTargetException e2) {
            throw new AssertionError();
        }
    }
}
