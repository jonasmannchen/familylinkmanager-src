package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cik extends fio implements fkg {
    cik() {
        super(cij.C);
    }

    public final cik a(cia ciaVar) {
        c();
        cij cijVar = (cij) this.a;
        if (ciaVar == null) {
            throw new NullPointerException();
        }
        cijVar.a |= 1;
        cijVar.b = ciaVar.o;
        return this;
    }

    public final cik a(cid cidVar) {
        c();
        cij cijVar = (cij) this.a;
        if (cidVar == null) {
            throw new NullPointerException();
        }
        cijVar.a |= 2;
        cijVar.c = cidVar.l;
        return this;
    }

    public final cik a(String str) {
        c();
        cij cijVar = (cij) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        cijVar.a |= 16;
        cijVar.f = str;
        return this;
    }

    public final cik a(exj exjVar) {
        c();
        cij cijVar = (cij) this.a;
        if (exjVar == null) {
            throw new NullPointerException();
        }
        cijVar.h = exjVar;
        cijVar.a |= 64;
        return this;
    }

    public final cik a(int i) {
        c();
        cij cijVar = (cij) this.a;
        cijVar.a |= 128;
        cijVar.i = i;
        return this;
    }

    public final cik b(int i) {
        c();
        cij cijVar = (cij) this.a;
        cijVar.a |= 256;
        cijVar.j = i;
        return this;
    }

    public final cik b(String str) {
        c();
        cij cijVar = (cij) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        cijVar.a |= 512;
        cijVar.k = str;
        return this;
    }

    public final cik a() {
        c();
        cij cijVar = (cij) this.a;
        cijVar.a &= -65537;
        cijVar.r = cij.C.r;
        return this;
    }

    public final cik a(fdl fdlVar) {
        c();
        cij cijVar = (cij) this.a;
        if (fdlVar == null) {
            throw new NullPointerException();
        }
        cijVar.s = fdlVar;
        cijVar.a |= 131072;
        return this;
    }

    public final cik a(eyu eyuVar) {
        c();
        cij cijVar = (cij) this.a;
        if (eyuVar == null) {
            throw new NullPointerException();
        }
        cijVar.t = eyuVar;
        cijVar.a |= 262144;
        return this;
    }
}
