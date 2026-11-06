package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cz implements Comparable {
    public final int a;
    public final String b;
    public final String c;
    private final int d;

    cz(int i, int i2, String str, String str2) {
        this.a = i;
        this.d = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        cz czVar = (cz) obj;
        int i = this.a - czVar.a;
        if (i == 0) {
            return this.d - czVar.d;
        }
        return i;
    }
}
