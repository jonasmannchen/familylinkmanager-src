package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class feb extends fio implements fkg {
    feb() {
        super(fdz.b);
    }

    public final feb a(fdx fdxVar) {
        c();
        fdz fdzVar = (fdz) this.a;
        if (fdxVar == null) {
            throw new NullPointerException();
        }
        if (!fdzVar.a.a()) {
            fjb fjbVar = fdzVar.a;
            int size = fjbVar.size();
            fdzVar.a = fjbVar.a(size == 0 ? 10 : size << 1);
        }
        fdzVar.a.d(fdxVar.e);
        return this;
    }
}
