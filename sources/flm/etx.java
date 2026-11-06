package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etx extends fio implements fkg {
    etx() {
        super(etw.x);
    }

    public final etx a(boolean z) {
        c();
        etw etwVar = (etw) this.a;
        etwVar.a |= 1;
        etwVar.b = z;
        return this;
    }

    public final etx a(esu esuVar) {
        c();
        etw etwVar = (etw) this.a;
        if (esuVar == null) {
            throw new NullPointerException();
        }
        etwVar.a |= 2;
        etwVar.c = esuVar.e;
        return this;
    }

    public final etx a(long j) {
        c();
        etw etwVar = (etw) this.a;
        etwVar.a |= 4;
        etwVar.d = j;
        return this;
    }

    public final etx a(ety etyVar) {
        c();
        etw etwVar = (etw) this.a;
        if (etyVar == null) {
            throw new NullPointerException();
        }
        etwVar.a |= 64;
        etwVar.h = etyVar.c;
        return this;
    }

    public final etx b(ety etyVar) {
        c();
        etw etwVar = (etw) this.a;
        if (etyVar == null) {
            throw new NullPointerException();
        }
        etwVar.a |= 32768;
        etwVar.q = etyVar.c;
        return this;
    }

    public final etx a(fei feiVar) {
        c();
        etw etwVar = (etw) this.a;
        if (feiVar == null) {
            throw new NullPointerException();
        }
        etwVar.v = feiVar;
        etwVar.a |= 1048576;
        return this;
    }
}
