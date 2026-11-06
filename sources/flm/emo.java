package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emo extends fio implements fkg {
    emo() {
        super(emn.c);
    }

    public final emo a(String str) {
        c();
        emn emnVar = (emn) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        emnVar.a |= 1;
        emnVar.b = str;
        return this;
    }
}
