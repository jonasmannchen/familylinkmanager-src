package flm;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fww implements fzm, gef {
    public final gef a;
    public final gee b;
    public final Queue c = new ArrayDeque();
    private final fxf d;

    fww(gef gefVar, fxf fxfVar, gee geeVar) {
        this.a = (gef) dvl.a(gefVar, "listener");
        this.d = (fxf) dvl.a(fxfVar, "transportExecutor");
        geeVar.a = this;
        this.b = geeVar;
    }

    @Override // flm.fzm
    public final void b(int i) {
        this.b.b = i;
    }

    @Override // flm.fzm
    public final void a(fso fsoVar) {
        this.b.a(fsoVar);
    }

    @Override // flm.fzm
    public final void a(gbq gbqVar) {
        this.b.a(gbqVar);
    }

    @Override // flm.fzm
    public final void c(int i) {
        this.a.a(new fxe(this, new fwx(this, i)));
    }

    @Override // flm.fzm
    public final void a(gez gezVar) {
        this.a.a(new fxe(this, new fwy(this, gezVar)));
    }

    @Override // flm.fzm
    public final void a() {
        this.a.a(new fxe(this, new fwz(this)));
    }

    @Override // flm.fzm
    public final void close() {
        this.b.c = true;
        this.a.a(new fxe(this, new fxa(this)));
    }

    @Override // flm.gef
    public final void a(int i) {
        this.d.a(new fxb(this, i));
    }

    @Override // flm.gef
    public final void a(ghg ghgVar) {
        while (true) {
            InputStream inputStreamA = ghgVar.a();
            if (inputStreamA != null) {
                this.c.add(inputStreamA);
            } else {
                return;
            }
        }
    }

    @Override // flm.gef
    public final void a(boolean z) {
        this.d.a(new fxc(this, z));
    }

    @Override // flm.gef
    public final void a(Throwable th) {
        this.d.a(new fxd(this, th));
    }
}
