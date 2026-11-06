package flm;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gej implements gbf {
    public final ghn a;
    private final gem b;
    private ghm d;
    private final ghd i;
    private boolean j;
    private int k;
    private long m;
    private int c = -1;
    private fry e = frx.a;
    private boolean f = true;
    private final gel g = new gel(this);
    private final byte[] h = new byte[5];
    private int l = -1;

    public gej(gem gemVar, ghn ghnVar, ghd ghdVar) {
        this.b = (gem) dvl.a(gemVar, "sink");
        this.a = (ghn) dvl.a(ghnVar, "bufferAllocator");
        this.i = (ghd) dvl.a(ghdVar, "statsTraceCtx");
    }

    @Override // flm.gbf
    public final void a(int i) {
        dvl.b(this.c == -1, "max size already set");
        this.c = i;
    }

    @Override // flm.gbf
    public final void a(InputStream inputStream) throws IOException {
        int iA;
        int iB;
        if (this.j) {
            throw new IllegalStateException("Framer already closed");
        }
        this.k++;
        this.l++;
        this.m = 0L;
        this.i.a(this.l);
        boolean z = this.f && this.e != frx.a;
        try {
            int iAvailable = ((inputStream instanceof ftl) || (inputStream instanceof ByteArrayInputStream)) ? inputStream.available() : -1;
            if (iAvailable != 0 && z) {
                iB = b(inputStream);
            } else {
                if (iAvailable != -1) {
                    this.m = iAvailable;
                    if (this.c >= 0 && iAvailable > this.c) {
                        throw fvc.h.a(String.format("message too large %d > %d", Integer.valueOf(iAvailable), Integer.valueOf(this.c))).b();
                    }
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.h);
                    byteBufferWrap.put((byte) 0);
                    byteBufferWrap.putInt(iAvailable);
                    if (this.d == null) {
                        this.d = this.a.a(byteBufferWrap.position() + iAvailable);
                    }
                    a(this.h, 0, byteBufferWrap.position());
                    iA = a(inputStream, this.g);
                } else {
                    gek gekVar = new gek(this);
                    iA = a(inputStream, gekVar);
                    if (this.c >= 0 && iA > this.c) {
                        throw fvc.h.a(String.format("message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(this.c))).b();
                    }
                    a(gekVar, false);
                }
                iB = iA;
            }
            if (iAvailable != -1 && iB != iAvailable) {
                throw fvc.i.a(String.format("Message length inaccurate %s != %s", Integer.valueOf(iB), Integer.valueOf(iAvailable))).b();
            }
            this.i.a(iB);
            this.i.b(this.m);
            this.i.a(this.l, this.m, iB);
        } catch (IOException e) {
            throw fvc.i.a("Failed to frame message").b(e).b();
        } catch (RuntimeException e2) {
            throw fvc.i.a("Failed to frame message").b(e2).b();
        }
    }

    private final int b(InputStream inputStream) throws IOException {
        gek gekVar = new gek(this);
        OutputStream outputStreamA = this.e.a(gekVar);
        try {
            int iA = a(inputStream, outputStreamA);
            outputStreamA.close();
            if (this.c >= 0 && iA > this.c) {
                throw fvc.h.a(String.format("message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(this.c))).b();
            }
            a(gekVar, true);
            return iA;
        } catch (Throwable th) {
            outputStreamA.close();
            throw th;
        }
    }

    private final void a(gek gekVar, boolean z) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.h);
        byteBufferWrap.put(z ? (byte) 1 : (byte) 0);
        Iterator it = gekVar.a.iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB = ((ghm) it.next()).b() + iB;
        }
        byteBufferWrap.putInt(iB);
        ghm ghmVarA = this.a.a(5);
        ghmVarA.a(this.h, 0, byteBufferWrap.position());
        if (iB == 0) {
            this.d = ghmVarA;
            return;
        }
        this.b.a(ghmVarA, false, false, this.k - 1);
        this.k = 1;
        List list = gekVar.a;
        for (int i = 0; i < list.size() - 1; i++) {
            this.b.a((ghm) list.get(i), false, false, 0);
        }
        this.d = (ghm) list.get(list.size() - 1);
        this.m = iB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof fsr) {
            return ((fsr) inputStream).a(outputStream);
        }
        long jA = gcn.a(inputStream, outputStream);
        dvl.a(jA <= 2147483647L, "Message size overflow: %s", jA);
        return (int) jA;
    }

    final void a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            if (this.d != null && this.d.a() == 0) {
                a(false, false);
            }
            if (this.d == null) {
                this.d = this.a.a(i2);
            }
            int iMin = Math.min(i2, this.d.a());
            this.d.a(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    @Override // flm.gbf
    public final void a() {
        if (this.d != null && this.d.b() > 0) {
            a(false, true);
        }
    }

    @Override // flm.gbf
    public final boolean b() {
        return this.j;
    }

    @Override // flm.gbf
    public final void c() {
        if (!this.j) {
            this.j = true;
            if (this.d != null && this.d.b() == 0 && this.d != null) {
                this.d.c();
                this.d = null;
            }
            a(true, true);
        }
    }

    private final void a(boolean z, boolean z2) {
        ghm ghmVar = this.d;
        this.d = null;
        this.b.a(ghmVar, z, z2, this.k);
        this.k = 0;
    }

    @Override // flm.gbf
    public final /* synthetic */ gbf a(fry fryVar) {
        this.e = (fry) dvl.a(fryVar, "Can't pass an empty compressor");
        return this;
    }
}
