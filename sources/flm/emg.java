package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emg extends fio implements fkg {
    emg() {
        super(emf.e);
    }

    public final emg a(String str) {
        c();
        emf emfVar = (emf) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        emfVar.a |= 1;
        emfVar.b = str;
        return this;
    }
}
