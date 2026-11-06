package flm;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aog {
    public final aob a;
    public final aoi b;
    public boolean c;
    public String d;
    public String e;
    public int f;
    public fnk g;
    public String h;
    public final fnh i;
    private ArrayList j;
    private ArrayList k;
    private ArrayList l;
    private ArrayList m;
    private ArrayList n;
    private ArrayList o;
    private boolean p;

    aog(aob aobVar, byte[] bArr) {
        this(aobVar, bArr != null ? fgy.a(bArr) : null);
    }

    private aog(aob aobVar, fgy fgyVar) {
        this(aobVar, fgyVar, null);
    }

    aog(aob aobVar, aoi aoiVar) {
        this(aobVar, null, aoiVar);
    }

    private aog(aob aobVar, fgy fgyVar, aoi aoiVar) {
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.c = true;
        this.i = (fnh) ((fio) fng.k.a(dp.au, (Object) null));
        this.p = false;
        this.a = aobVar;
        this.f = aobVar.f;
        this.e = aobVar.e;
        this.d = aobVar.g;
        this.h = aobVar.h;
        this.g = aobVar.j;
        this.i.a(aobVar.l.a());
        fnh fnhVar = this.i;
        aoj aojVar = aobVar.m;
        fnhVar.c(aoj.a(this.i.a()));
        if (dfj.a(aobVar.b)) {
            fnh fnhVar2 = this.i;
            boolean zA = dfj.a(aobVar.b);
            fnhVar2.c();
            fng fngVar = (fng) fnhVar2.a;
            fngVar.a |= 4194304;
            fngVar.j = zA;
        }
        if (aobVar.l.b() != 0) {
            this.i.b(aobVar.l.b());
        }
        if (fgyVar != null) {
            this.i.a(fgyVar);
        }
        this.b = aoiVar;
    }

    public final aog a(String str) {
        if (this.a.i) {
            throw new IllegalArgumentException("setUploadAccountName forbidden on anonymous logger");
        }
        this.d = str;
        return this;
    }

    public final aog a(int i) {
        fnh fnhVar = this.i;
        fnhVar.c();
        fng fngVar = (fng) fnhVar.a;
        fngVar.a |= 16;
        fngVar.e = i;
        return this;
    }

    @Deprecated
    public final att a() {
        if (this.p) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.p = true;
        return this.a.k.a(this);
    }

    public final String toString() {
        return "ClearcutLogger.LogEventBuilder[uploadAccount: " + this.d + ", logSourceName: " + this.e + ", logSource#: " + this.f + ", qosTier: " + this.g + ", loggingId: " + this.h + ", MessageProducer: " + this.b + ", veMessageProducer: " + ((Object) null) + ", testCodes: " + aob.a((Iterable) null) + ", dimensions: " + aob.a((Iterable) null) + ", mendelPackages: " + aob.a((Iterable) null) + ", experimentIds: " + aob.a((Iterable) null) + ", experimentTokens: " + aob.a((Iterable) null) + ", experimentTokensBytes: " + aob.a((Iterable) aob.a((List) null)) + ", addPhenotype: " + this.c + "]";
    }
}
