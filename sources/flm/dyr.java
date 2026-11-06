package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dyr extends dwj {
    public static final eav a = new dyr(new Object[0], 0, 0, 0);
    private final Object[] b;
    private final int c;

    private dyr(Object[] objArr, int i, int i2, int i3) {
        super(0, 0);
        this.b = objArr;
        this.c = 0;
    }

    @Override // flm.dwj
    protected final Object a(int i) {
        return this.b[this.c + i];
    }
}
