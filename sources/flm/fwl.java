package flm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwl implements gbf {
    private ftv a;
    private boolean b;
    private final ghd c;
    private byte[] d;
    private final /* synthetic */ fwk e;

    public fwl(fwk fwkVar, ftv ftvVar, ghd ghdVar) {
        this.e = fwkVar;
        this.a = (ftv) dvl.a(ftvVar, "headers");
        this.c = (ghd) dvl.a(ghdVar, "statsTraceCtx");
    }

    @Override // flm.gbf
    public final void a(InputStream inputStream) {
        dvl.b(this.d == null, "writePayload should not be called multiple times");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            gcn.a(inputStream, byteArrayOutputStream);
            this.d = byteArrayOutputStream.toByteArray();
            this.c.a(0);
            this.c.a(0, this.d.length, this.d.length);
            this.c.a(this.d.length);
            this.c.b(this.d.length);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // flm.gbf
    public final void a() {
    }

    @Override // flm.gbf
    public final boolean b() {
        return this.b;
    }

    @Override // flm.gbf
    public final void c() {
        this.b = true;
        dvl.b(this.d != null, "Lack of request message. GET request is only supported for unary requests");
        this.e.a().a(this.a, this.d);
        this.d = null;
        this.a = null;
    }

    @Override // flm.gbf
    public final gbf a(fry fryVar) {
        return this;
    }

    @Override // flm.gbf
    public final void a(int i) {
    }
}
