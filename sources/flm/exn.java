package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exn extends fio implements fkg {
    exn() {
        super(exm.h);
    }

    public final exn a(String str) {
        c();
        exm exmVar = (exm) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        exmVar.a |= 16;
        exmVar.d = str;
        return this;
    }
}
