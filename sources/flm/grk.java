package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grk extends fio implements fkg {
    grk() {
        super(grj.l);
    }

    public final grk a(String str) {
        c();
        grj grjVar = (grj) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        grjVar.a |= 1;
        grjVar.b = str;
        return this;
    }

    public final grk b(String str) {
        c();
        grj grjVar = (grj) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        grjVar.a |= 4;
        grjVar.d = str;
        return this;
    }

    public final grk a(long j) {
        c();
        grj grjVar = (grj) this.a;
        grjVar.a |= 8;
        grjVar.e = j;
        return this;
    }

    public final grk b(long j) {
        c();
        grj grjVar = (grj) this.a;
        grjVar.a |= 16;
        grjVar.f = j;
        return this;
    }

    public final grk c(long j) {
        c();
        grj grjVar = (grj) this.a;
        grjVar.a |= 32;
        grjVar.g = j;
        return this;
    }

    public final grk d(long j) {
        c();
        grj grjVar = (grj) this.a;
        grjVar.a |= 64;
        grjVar.h = j;
        return this;
    }
}
