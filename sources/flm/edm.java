package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edm implements edc {
    private final String a;
    private final boolean b;

    private edm(String str, boolean z) {
        this.a = str;
        this.b = true;
    }

    public edm() {
        this("", true);
    }

    @Override // flm.edc
    public final ecg a(String str) {
        return new edl(this.a, str, this.b);
    }
}
