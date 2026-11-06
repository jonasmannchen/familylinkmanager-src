package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gil implements fwm {
    private final /* synthetic */ gij a;

    gil(gij gijVar) {
        this.a = gijVar;
    }

    @Override // flm.fwm
    public final void a(ftv ftvVar, byte[] bArr) {
        String strValueOf = String.valueOf(this.a.b.b);
        String strConcat = strValueOf.length() != 0 ? "/".concat(strValueOf) : new String("/");
        if (bArr != null) {
            this.a.i = true;
            String strValueOf2 = String.valueOf(strConcat);
            String strA = eex.a.a(bArr);
            strConcat = new StringBuilder(String.valueOf(strValueOf2).length() + 1 + String.valueOf(strA).length()).append(strValueOf2).append("?").append(strA).toString();
        }
        synchronized (this.a.h.a) {
            gim gimVar = this.a.h;
            gimVar.b = gic.a(ftvVar, strConcat, gimVar.h.e, gimVar.h.c, gimVar.h.i);
            gin ginVar = gimVar.g;
            gij gijVar = gimVar.h;
            if (ginVar.n != null) {
                gijVar.h.a(ginVar.n, dp.aL, true, new ftv());
            } else if (ginVar.i.size() >= ginVar.s) {
                ginVar.t.add(gijVar);
                ginVar.c(gijVar);
            } else {
                ginVar.a(gijVar);
            }
        }
    }

    @Override // flm.fwm
    public final void a(ghm ghmVar, boolean z, boolean z2, int i) {
        guc gucVar;
        if (ghmVar == null) {
            gucVar = gij.a;
        } else {
            gucVar = ((gix) ghmVar).a;
            int i2 = (int) gucVar.c;
            if (i2 > 0) {
                this.a.d(i2);
            }
        }
        synchronized (this.a.h.a) {
            gim gimVar = this.a.h;
            if (!gimVar.d) {
                if (gimVar.c != null) {
                    gimVar.c.add(new gik(gucVar, z, z2));
                } else {
                    dvl.b(gimVar.h.g != -1, "streamId should be set");
                    gimVar.f.a(z, gimVar.h.g, gucVar, z2);
                }
            }
            ghk ghkVar = this.a.q;
            if (i != 0) {
                ghkVar.g += (long) i;
                ghkVar.b.a();
            }
        }
    }

    @Override // flm.fwm
    public final void a(int i) {
        synchronized (this.a.h.a) {
            this.a.h.b(i);
        }
    }

    @Override // flm.fwm
    public final void a(fvc fvcVar) {
        synchronized (this.a.h.a) {
            this.a.h.c(fvcVar, true, null);
        }
    }
}
