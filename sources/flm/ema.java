package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ema extends fio implements fkg {
    ema() {
        super(elz.e);
    }

    public final ema a(enk enkVar) {
        c();
        elz elzVar = (elz) this.a;
        if (enkVar == null) {
            throw new NullPointerException();
        }
        elzVar.c = enkVar;
        elzVar.b = 3;
        return this;
    }

    public final ema a(elw elwVar) {
        c();
        elz elzVar = (elz) this.a;
        if (elwVar == null) {
            throw new NullPointerException();
        }
        elzVar.c = elwVar;
        elzVar.b = 4;
        return this;
    }

    public final ema a(emh emhVar) {
        c();
        elz elzVar = (elz) this.a;
        if (emhVar == null) {
            throw new NullPointerException();
        }
        elzVar.c = emhVar;
        elzVar.b = 6;
        return this;
    }

    public final ema a(emi emiVar) {
        c();
        elz elzVar = (elz) this.a;
        elzVar.c = (fin) emiVar.h();
        elzVar.b = 6;
        return this;
    }

    public final ema a(elp elpVar) {
        c();
        elz elzVar = (elz) this.a;
        if (elpVar == null) {
            throw new NullPointerException();
        }
        elzVar.c = elpVar;
        elzVar.b = 7;
        return this;
    }

    public final ema a(emb embVar) {
        c();
        elz elzVar = (elz) this.a;
        if (embVar == null) {
            throw new NullPointerException();
        }
        elzVar.d = embVar;
        elzVar.a |= 64;
        return this;
    }
}
