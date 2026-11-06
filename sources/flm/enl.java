package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enl extends fio implements fkg {
    enl() {
        super(enk.e);
    }

    public final enl a(boolean z) {
        c();
        enk enkVar = (enk) this.a;
        enkVar.b = 2;
        enkVar.c = Boolean.valueOf(z);
        return this;
    }

    public final enl a(eni eniVar) {
        c();
        enk enkVar = (enk) this.a;
        if (eniVar == null) {
            throw new NullPointerException();
        }
        enkVar.c = eniVar;
        enkVar.b = 6;
        return this;
    }
}
