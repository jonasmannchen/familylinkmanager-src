package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gop extends fio implements fkg {
    gop() {
        super(goo.d);
    }

    public final gop a(int i) {
        c();
        goo gooVar = (goo) this.a;
        gooVar.a |= 1;
        gooVar.b = i;
        return this;
    }

    public final gop a(goq goqVar) {
        c();
        goo gooVar = (goo) this.a;
        if (goqVar == null) {
            throw new NullPointerException();
        }
        gooVar.c = goqVar;
        gooVar.a |= 2;
        return this;
    }
}
