package flm;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwe extends gbv {
    public final Object a;
    public Queue b;
    public boolean c;
    public boolean d;
    public fvc e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ fwa h;
    private int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwe(fwa fwaVar, int i, ghd ghdVar, Object obj, ghk ghkVar) {
        super(i, ghdVar, ghkVar);
        this.h = fwaVar;
        this.b = new LinkedList();
        this.d = false;
        this.a = dvl.a(obj, "lock");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fwu
    public final void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.gbv
    public final void a(fvc fvcVar, boolean z, ftv ftvVar) {
        this.h.j.cancel();
        b(fvcVar, z, ftvVar);
    }

    @Override // flm.gef
    public final void a(Throwable th) {
        a(fvc.a(th), true, new ftv());
    }

    @Override // flm.fxf
    public final void a(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    @Override // flm.gef
    public final void a(int i) {
        this.u -= i;
        if (this.u == 0 && !this.f) {
            this.h.j.read(ByteBuffer.allocateDirect(4096));
        }
    }

    final void a(ByteBuffer byteBuffer, boolean z) {
        this.u += byteBuffer.remaining();
        super.a(gfa.a(byteBuffer), z);
    }
}
