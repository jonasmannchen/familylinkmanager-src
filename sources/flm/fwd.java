package flm;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import org.chromium.net.ExperimentalBidirectionalStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwd implements fwm {
    private final /* synthetic */ fwa a;

    fwd(fwa fwaVar) {
        this.a = fwaVar;
    }

    @Override // flm.fwm
    public final void a(ftv ftvVar, byte[] bArr) {
        this.a.h.run();
        fwb fwbVar = new fwb(this.a);
        String string = this.a.b;
        if (bArr != null) {
            String strValueOf = String.valueOf(string);
            String strA = eex.a.a(bArr);
            string = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strA).length()).append(strValueOf).append("?").append(strA).toString();
        }
        ExperimentalBidirectionalStream.Builder builderA = this.a.o.a(string, fwbVar, this.a.e);
        if (bArr != null) {
            builderA.setHttpMethod("GET");
        } else if (this.a.i) {
            builderA.setHttpMethod("PUT");
        }
        if (this.a.k) {
            builderA.delayRequestHeadersUntilFirstFlush(true);
        }
        if (this.a.l != null) {
            builderA.addRequestAnnotation(this.a.l);
        }
        if (this.a.m != null) {
            Iterator it = this.a.m.iterator();
            while (it.hasNext()) {
                builderA.addRequestAnnotation(it.next());
            }
        }
        fwa fwaVar = this.a;
        builderA.addHeader(gbh.i.a, fwaVar.c);
        builderA.addHeader(gbh.g.a, "application/grpc");
        builderA.addHeader("te", "trailers");
        byte[][] bArrA = ghj.a(fwaVar.f);
        for (int i = 0; i < bArrA.length; i += 2) {
            String str = new String(bArrA[i], Charset.forName("UTF-8"));
            if ((gbh.g.a.equalsIgnoreCase(str) || gbh.i.a.equalsIgnoreCase(str) || gbh.h.a.equalsIgnoreCase(str)) ? false : true) {
                builderA.addHeader(str, new String(bArrA[i + 1], Charset.forName("UTF-8")));
            }
        }
        this.a.j = builderA.build();
        this.a.j.start();
    }

    @Override // flm.fwm
    public final void a(ghm ghmVar, boolean z, boolean z2, int i) {
        ByteBuffer byteBuffer;
        synchronized (this.a.n.a) {
            if (!this.a.n.d) {
                if (ghmVar != null) {
                    byteBuffer = ((fwi) ghmVar).a;
                    byteBuffer.flip();
                } else {
                    byteBuffer = fwa.a;
                }
                this.a.d(byteBuffer.remaining());
                if (!this.a.n.c) {
                    fwe fweVar = this.a.n;
                    fweVar.b.add(new fwc(byteBuffer, z, z2));
                } else {
                    fwa fwaVar = this.a;
                    fwaVar.j.write(byteBuffer, z);
                    if (z2) {
                        fwaVar.j.flush();
                    }
                }
            }
        }
    }

    @Override // flm.fwm
    public final void a(int i) {
        synchronized (this.a.n.a) {
            this.a.n.b(i);
        }
    }

    @Override // flm.fwm
    public final void a(fvc fvcVar) {
        synchronized (this.a.n.a) {
            if (!this.a.n.d) {
                this.a.n.d = true;
                this.a.n.e = fvcVar;
                fwe fweVar = this.a.n;
                Iterator it = fweVar.b.iterator();
                while (it.hasNext()) {
                    ((fwc) it.next()).a.clear();
                }
                fweVar.b.clear();
                if (this.a.j != null) {
                    this.a.j.cancel();
                } else {
                    this.a.g.a(this.a, fvcVar);
                }
            }
        }
    }
}
