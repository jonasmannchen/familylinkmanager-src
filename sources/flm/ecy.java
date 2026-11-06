package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ecy extends ecg {
    public final String a;

    public ecy(String str) {
        this.a = str;
    }

    @Override // flm.ecg
    public String a() {
        return this.a;
    }

    @Override // flm.ecg
    public void a(RuntimeException runtimeException, ecf ecfVar) {
        a(new ecz(runtimeException, ecfVar));
    }
}
