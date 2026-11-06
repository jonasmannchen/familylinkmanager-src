package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emi extends fio implements fkg {
    emi() {
        super(emh.h);
    }

    public final emi a(epd epdVar) {
        c();
        emh emhVar = (emh) this.a;
        if (epdVar == null) {
            throw new NullPointerException();
        }
        emhVar.a |= 1;
        emhVar.b = epdVar.j;
        return this;
    }

    public final emi a(String str) {
        c();
        emh emhVar = (emh) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        emhVar.a |= 2;
        emhVar.c = str;
        return this;
    }

    public final emi a(elg elgVar) {
        c();
        emh emhVar = (emh) this.a;
        emhVar.d = (elf) ((fin) elgVar.h());
        emhVar.a |= 4;
        return this;
    }

    public final emi a(ela elaVar) {
        c();
        emh emhVar = (emh) this.a;
        emhVar.e = (ekz) ((fin) elaVar.h());
        emhVar.a |= 8;
        return this;
    }

    public final emi a(emo emoVar) {
        c();
        emh emhVar = (emh) this.a;
        emhVar.f = (emn) ((fin) emoVar.h());
        emhVar.a |= 16;
        return this;
    }
}
