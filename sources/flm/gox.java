package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gox extends fio implements fkg {
    gox() {
        super(gow.e);
    }

    public final gox a(int i) {
        c();
        gow gowVar = (gow) this.a;
        gowVar.a |= 1;
        gowVar.b = i;
        return this;
    }

    public final gox b(int i) {
        c();
        gow gowVar = (gow) this.a;
        gowVar.a |= 2;
        gowVar.c = i;
        return this;
    }

    public final gox a(goq goqVar) {
        c();
        gow gowVar = (gow) this.a;
        if (goqVar == null) {
            throw new NullPointerException();
        }
        gowVar.d = goqVar;
        gowVar.a |= 4;
        return this;
    }
}
