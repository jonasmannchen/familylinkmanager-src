package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gru extends fio implements fkg {
    gru() {
        super(grt.c);
    }

    public final String a() {
        return ((grt) this.a).b;
    }

    public final gru a(String str) {
        c();
        grt grtVar = (grt) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        grtVar.a |= 1;
        grtVar.b = str;
        return this;
    }
}
