package flm;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dtt {
    public ExecutorService a;
    public egz b;
    public dui e;
    public duh f;
    public Set c = new HashSet();
    private Set g = new HashSet();
    public boolean d = false;

    public final dtt a(dsz dszVar) {
        this.c.add(dszVar);
        return this;
    }

    public final dts a() {
        dtv dtbVar;
        drq drqVar = new drq();
        if (this.d) {
            dtbVar = new dtw(new dsh((ExecutorService) dvl.a(this.a)), drqVar, (egz) dvl.a(this.b), new goa(this) { // from class: flm.dtu
                private final dtt a;

                {
                    this.a = this;
                }

                @Override // flm.goa
                public final Object a() {
                    return this.a.c;
                }
            }, (dui) dvl.a(this.e), (duh) dvl.a(this.f), new dsw());
        } else {
            dtbVar = new dtb();
        }
        return new dts(drqVar, dtbVar, this.g);
    }
}
