package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elg extends fio implements fkg {
    elg() {
        super(elf.c);
    }

    public final elg a(epf epfVar) {
        c();
        elf elfVar = (elf) this.a;
        if (epfVar == null) {
            throw new NullPointerException();
        }
        elfVar.a |= 1;
        elfVar.b = epfVar.L;
        return this;
    }
}
