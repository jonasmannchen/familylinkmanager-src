package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dtg extends fio implements fkg {
    dtg() {
        super(dtf.i);
    }

    public final dtg a(String str) {
        c();
        dtf dtfVar = (dtf) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        dtfVar.a |= 1;
        dtfVar.b = str;
        return this;
    }

    public final dtg a(int i) {
        c();
        dtf dtfVar = (dtf) this.a;
        dtfVar.a |= 4;
        dtfVar.d = i;
        return this;
    }

    public final dtg a(long j) {
        c();
        dtf dtfVar = (dtf) this.a;
        dtfVar.a |= 8;
        dtfVar.e = j;
        return this;
    }

    public final dtg b(long j) {
        c();
        dtf dtfVar = (dtf) this.a;
        dtfVar.a |= 16;
        dtfVar.f = j;
        return this;
    }
}
