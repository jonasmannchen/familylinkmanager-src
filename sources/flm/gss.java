package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gss extends fio implements fkg {
    gss() {
        super(gsr.g);
    }

    public final gss a(String str) {
        c();
        gsr gsrVar = (gsr) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        gsrVar.a |= 1;
        gsrVar.b = str;
        return this;
    }

    public final gss a(int i) {
        c();
        gsr gsrVar = (gsr) this.a;
        gsrVar.a |= 4;
        gsrVar.d = i;
        return this;
    }
}
