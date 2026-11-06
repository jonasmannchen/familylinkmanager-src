package flm;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gim extends gbv {
    public final Object a;
    public List b;
    public Queue c;
    public boolean d;
    public final gho e;
    public final giz f;
    public final gin g;
    public final /* synthetic */ gij h;
    private final int u;
    private int v;
    private int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gim(gij gijVar, int i, ghd ghdVar, Object obj, gho ghoVar, giz gizVar, gin ginVar, int i2) {
        super(i, ghdVar, gijVar.q);
        this.h = gijVar;
        this.c = new ArrayDeque();
        this.d = false;
        this.a = dvl.a(obj, "lock");
        this.e = ghoVar;
        this.f = gizVar;
        this.g = ginVar;
        this.v = i2;
        this.w = i2;
        this.u = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fwu
    public final void a() {
        super.a();
        ghk ghkVar = this.s;
        ghkVar.c++;
        ghkVar.b.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.gbv
    public final void a(fvc fvcVar, boolean z, ftv ftvVar) {
        c(fvcVar, z, ftvVar);
    }

    @Override // flm.gef
    public final void a(Throwable th) {
        a(fvc.a(th), true, new ftv());
    }

    @Override // flm.gef
    public final void a(int i) {
        this.w -= i;
        if (this.w <= this.u * 0.5f) {
            int i2 = this.u - this.w;
            this.v += i2;
            this.w += i2;
            this.e.a(this.h.g, i2);
        }
    }

    @Override // flm.fwn, flm.gef
    public final void a(boolean z) {
        if (!this.m) {
            this.g.a(this.h.g, null, dp.aK, false, gjv.CANCEL, null);
        } else {
            this.g.a(this.h.g, null, dp.aK, false, null, null);
        }
        super.a(z);
    }

    @Override // flm.fxf
    public final void a(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    public final void a(guc gucVar, boolean z) {
        this.v -= (int) gucVar.c;
        if (this.v < 0) {
            this.e.a(this.h.g, gjv.FLOW_CONTROL_ERROR);
            this.g.a(this.h.g, fvc.i.a("Received data size exceeded our receiving window size"), dp.aK, false, null, null);
        } else {
            super.a(new giv(gucVar), z);
        }
    }

    final void c(fvc fvcVar, boolean z, ftv ftvVar) {
        if (!this.d) {
            this.d = true;
            if (this.c != null) {
                gin ginVar = this.g;
                gij gijVar = this.h;
                ginVar.t.remove(gijVar);
                ginVar.b(gijVar);
                this.b = null;
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((gik) it.next()).a.i();
                }
                this.c = null;
                if (ftvVar == null) {
                    ftvVar = new ftv();
                }
                b(fvcVar, true, ftvVar);
                return;
            }
            this.g.a(this.h.g, fvcVar, dp.aK, z, gjv.CANCEL, ftvVar);
        }
    }
}
