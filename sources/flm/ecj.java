package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecj extends eci {
    public static final ecj a = new ecj();

    private ecj() {
    }

    @Override // flm.eci
    public final int a() {
        return 0;
    }

    @Override // flm.eci
    public final ebs a(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // flm.eci
    public final Object b(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // flm.eci
    public final Object b(ebs ebsVar) {
        return null;
    }
}
