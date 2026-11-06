package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gts extends fio implements fkg {
    gts() {
        super(gtr.y);
    }

    public final gts a(String str) {
        c();
        gtr gtrVar = (gtr) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        gtrVar.a |= 4;
        gtrVar.d = str;
        return this;
    }

    public final gts a() {
        c();
        gtr gtrVar = (gtr) this.a;
        gtrVar.a &= -5;
        gtrVar.d = gtr.y.d;
        return this;
    }

    public final gqf i() {
        gtr gtrVar = (gtr) this.a;
        if (gtrVar.g == null) {
            return gqf.c;
        }
        return gtrVar.g;
    }

    public final gts a(gti gtiVar) {
        c();
        gtr gtrVar = (gtr) this.a;
        gtrVar.i = (gth) ((fin) gtiVar.h());
        gtrVar.a |= 128;
        return this;
    }

    public final gst j() {
        gtr gtrVar = (gtr) this.a;
        if (gtrVar.j == null) {
            return gst.k;
        }
        return gtrVar.j;
    }

    public final gts a(gsu gsuVar) {
        c();
        gtr gtrVar = (gtr) this.a;
        gtrVar.j = (gst) ((fin) gsuVar.h());
        gtrVar.a |= 256;
        return this;
    }

    public final gom k() {
        gtr gtrVar = (gtr) this.a;
        if (gtrVar.k == null) {
            return gom.c;
        }
        return gtrVar.k;
    }

    public final gts a(gon gonVar) {
        c();
        gtr gtrVar = (gtr) this.a;
        gtrVar.k = (gom) ((fin) gonVar.h());
        gtrVar.a |= 512;
        return this;
    }

    public final gts a(gso gsoVar) {
        c();
        gtr gtrVar = (gtr) this.a;
        gtrVar.m = (gsn) ((fin) gsoVar.h());
        gtrVar.a |= 4096;
        return this;
    }

    public final gts a(gpr gprVar) {
        c();
        gtr gtrVar = (gtr) this.a;
        if (gprVar == null) {
            throw new NullPointerException();
        }
        gtrVar.n = gprVar;
        gtrVar.a |= 8192;
        return this;
    }

    public final grh l() {
        gtr gtrVar = (gtr) this.a;
        if (gtrVar.p == null) {
            return grh.d;
        }
        return gtrVar.p;
    }

    public final gts a(grh grhVar) {
        c();
        gtr gtrVar = (gtr) this.a;
        if (grhVar == null) {
            throw new NullPointerException();
        }
        gtrVar.p = grhVar;
        gtrVar.a |= 32768;
        return this;
    }

    public final gts n() {
        c();
        gtr gtrVar = (gtr) this.a;
        gtrVar.a &= -65537;
        gtrVar.q = gtr.y.q;
        return this;
    }

    public final gts a(gru gruVar) {
        c();
        gtr gtrVar = (gtr) this.a;
        gtrVar.t = (grt) ((fin) gruVar.h());
        gtrVar.a |= 1048576;
        return this;
    }
}
