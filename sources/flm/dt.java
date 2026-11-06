package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dt extends dr {
    public float ac = -1.0f;
    public int ad = -1;
    public int ae = -1;
    private dq ag = this.j;
    public int af = 0;
    private boolean ah = false;

    public dt() {
        new du();
        this.n.clear();
        this.n.add(this.ag);
    }

    public final void h(int i) {
        if (this.af != i) {
            this.af = i;
            this.n.clear();
            if (this.af == 1) {
                this.ag = this.i;
            } else {
                this.ag = this.j;
            }
            this.n.add(this.ag);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // flm.dr
    public final dq e(int i) {
        switch (i - 1) {
            case 1:
            case 3:
                if (this.af == 1) {
                    return this.ag;
                }
                return null;
            case 2:
            case 4:
                if (this.af == 0) {
                    return this.ag;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // flm.dr
    public final ArrayList l() {
        return this.n;
    }

    @Override // flm.dr
    public final void a(dl dlVar, int i) {
        dq dqVarE;
        dq dqVarE2;
        ds dsVar = (ds) this.o;
        if (dsVar != null) {
            dq dqVarE3 = dsVar.e(dp.m);
            dq dqVarE4 = dsVar.e(dp.o);
            if (this.af == 0) {
                dqVarE2 = dsVar.e(dp.n);
                dqVarE = dsVar.e(dp.p);
            } else {
                dqVarE = dqVarE4;
                dqVarE2 = dqVarE3;
            }
            if (this.ad != -1) {
                dlVar.a(dl.a(dlVar, dlVar.a(this.ag), dlVar.a(dqVarE2), this.ad, false));
                return;
            }
            if (this.ae != -1) {
                dlVar.a(dl.a(dlVar, dlVar.a(this.ag), dlVar.a(dqVarE), -this.ae, false));
                return;
            }
            if (this.ac != -1.0f) {
                C0000do c0000doA = dlVar.a(this.ag);
                C0000do c0000doA2 = dlVar.a(dqVarE2);
                C0000do c0000doA3 = dlVar.a(dqVarE);
                float f = this.ac;
                di diVarB = dlVar.b();
                diVarB.c.a(c0000doA, -1.0f);
                diVarB.c.a(c0000doA2, 1.0f - f);
                diVarB.c.a(c0000doA3, f);
                dlVar.a(diVarB);
            }
        }
    }

    @Override // flm.dr
    public final void b(dl dlVar, int i) {
        if (this.o != null) {
            int iB = dl.b(this.ag);
            if (this.af == 1) {
                this.t = iB;
                this.u = 0;
                b(this.o.f());
                a(0);
                return;
            }
            this.t = 0;
            this.u = iB;
            a(this.o.c());
            b(0);
        }
    }
}
