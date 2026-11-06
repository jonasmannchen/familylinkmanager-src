package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gkt implements Comparable {
    gkt() {
    }

    public abstract long a();

    public abstract int b();

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        gkt gktVar = (gkt) obj;
        int iA = gks.a(a(), gktVar.a());
        return iA != 0 ? iA : gks.a(b(), gktVar.b());
    }
}
