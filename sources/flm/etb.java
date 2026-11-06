package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etb extends fio implements fkg {
    etb() {
        super(eta.f);
    }

    public final etb a(String str) {
        c();
        eta etaVar = (eta) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        etaVar.a |= 1;
        etaVar.b = str;
        return this;
    }

    public final etb a(eti etiVar) {
        c();
        eta etaVar = (eta) this.a;
        etaVar.c = (ete) ((fin) etiVar.h());
        etaVar.a |= 2;
        return this;
    }
}
