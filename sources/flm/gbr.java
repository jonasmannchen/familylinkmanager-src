package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gbr {
    public final /* synthetic */ gbq a;

    gbr(gbq gbqVar) {
        this.a = gbqVar;
    }

    final int a() {
        int iB;
        if (this.a.f - this.a.e > 0) {
            iB = this.a.d[this.a.e] & 255;
            gbq.a(this.a, 1);
        } else {
            iB = this.a.a.b();
        }
        this.a.b.update(iB);
        gbq.b(this.a, 1);
        return iB;
    }

    final int b() {
        return (this.a.f - this.a.e) + this.a.a.a;
    }

    final int c() {
        return a() | (a() << 8);
    }
}
