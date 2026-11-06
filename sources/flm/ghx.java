package flm;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghx extends gib {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ int c;
    private final /* synthetic */ int d;
    private final /* synthetic */ List e;
    private final /* synthetic */ gho f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ghx(gho ghoVar, boolean z, boolean z2, int i, int i2, List list) {
        super(ghoVar, (byte) 0);
        this.f = ghoVar;
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = list;
    }

    @Override // flm.gib
    public final void a() {
        this.f.b.a(this.a, this.b, this.c, this.d, this.e);
    }
}
