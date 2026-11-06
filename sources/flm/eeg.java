package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class eeg {
    public final ecx a;
    public int b = 0;
    public int c = -1;

    public eeg(ecx ecxVar) {
        this.a = (ecx) eel.a(ecxVar, "context");
    }

    public abstract void a(int i, int i2, eeb eebVar);

    public abstract Object c();

    public final String d() {
        return this.a.b;
    }
}
