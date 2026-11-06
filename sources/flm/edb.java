package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edb implements edc {
    private final String a;
    private final boolean b;

    private edb(String str, boolean z) {
        this.a = str;
        this.b = true;
    }

    public edb() {
        this("", true);
    }

    @Override // flm.edc
    public final ecg a(String str) {
        return new eda(this.a, str, this.b);
    }
}
