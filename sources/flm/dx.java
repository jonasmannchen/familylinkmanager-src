package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dx extends dr {
    public ArrayList af = new ArrayList();

    @Override // flm.dr
    public void a() {
        this.af.clear();
        super.a();
    }

    public final void a(dr drVar) {
        this.af.remove(drVar);
        drVar.o = null;
    }

    @Override // flm.dr
    public final void a(int i, int i2) {
        super.a(i, i2);
        int size = this.af.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((dr) this.af.get(i3)).a(this.t + this.x, this.u + this.y);
        }
    }

    @Override // flm.dr
    public final void m() {
        super.m();
        if (this.af != null) {
            int size = this.af.size();
            for (int i = 0; i < size; i++) {
                dr drVar = (dr) this.af.get(i);
                drVar.a(g(), h());
                if (!(drVar instanceof ds)) {
                    drVar.m();
                }
            }
        }
    }

    public void n() {
        m();
        if (this.af != null) {
            int size = this.af.size();
            for (int i = 0; i < size; i++) {
                dr drVar = (dr) this.af.get(i);
                if (drVar instanceof dx) {
                    ((dx) drVar).n();
                }
            }
        }
    }

    @Override // flm.dr
    public final void a(dj djVar) {
        super.a(djVar);
        int size = this.af.size();
        for (int i = 0; i < size; i++) {
            ((dr) this.af.get(i)).a(djVar);
        }
    }
}
