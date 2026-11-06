package flm;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mm implements lm {
    public final boolean a;
    public final lb b;
    public int c;

    mm(lb lbVar, boolean z) {
        this.a = z;
        this.b = lbVar;
    }

    @Override // flm.lm
    public final void a() {
        this.c--;
        if (this.c == 0) {
            this.b.a.e();
        }
    }

    @Override // flm.lm
    public final void b() {
        this.c++;
    }

    public final void c() {
        boolean z = this.c > 0;
        lw lwVar = this.b.a;
        int size = lwVar.c.size();
        for (int i = 0; i < size; i++) {
            lg lgVar = (lg) lwVar.c.get(i);
            lgVar.a((lm) null);
            if (z && lgVar.J()) {
                if (lgVar.t == null || lgVar.t.g == null) {
                    lgVar.A().o = false;
                } else if (Looper.myLooper() != lgVar.t.g.c.getLooper()) {
                    lgVar.t.g.c.postAtFrontOfQueue(new lh(lgVar));
                } else {
                    lgVar.z();
                }
            }
        }
        this.b.a.a(this.b, this.a, z ? false : true, true);
    }

    public final void d() {
        this.b.a.a(this.b, this.a, false, false);
    }
}
