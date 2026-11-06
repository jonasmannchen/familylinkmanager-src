package flm;

import java.lang.reflect.Method;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gjo extends gjk {
    private final gjj d;
    private final gjj e;
    private final gjj f;
    private final gjj g;
    private final int h;

    public gjo(gjj gjjVar, gjj gjjVar2, Method method, Method method2, gjj gjjVar3, gjj gjjVar4, Provider provider, int i) {
        super(provider);
        this.d = gjjVar;
        this.e = gjjVar2;
        this.f = gjjVar3;
        this.g = gjjVar4;
        this.h = i;
    }

    @Override // flm.gjk
    public final int a() {
        return this.h;
    }

    @Override // flm.gjk
    public final void a(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.d.a(sSLSocket, true);
            this.e.a(sSLSocket, str);
        }
        if (this.g.a(sSLSocket)) {
            this.g.b(sSLSocket, a(list));
        }
    }

    @Override // flm.gjk
    public final String b(SSLSocket sSLSocket) {
        byte[] bArr;
        if (this.f.a(sSLSocket) && (bArr = (byte[]) this.f.b(sSLSocket, new Object[0])) != null) {
            return new String(bArr, gju.b);
        }
        return null;
    }
}
