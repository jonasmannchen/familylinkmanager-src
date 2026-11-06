package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ebh extends eci {
    public Object[] a = new Object[8];
    public int b = 0;

    ebh() {
    }

    @Override // flm.eci
    public final int a() {
        return this.b;
    }

    @Override // flm.eci
    public final ebs a(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return (ebs) this.a[i * 2];
    }

    @Override // flm.eci
    public final Object b(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return this.a[(i * 2) + 1];
    }

    final int a(ebs ebsVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i * 2].equals(ebsVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // flm.eci
    public final Object b(ebs ebsVar) {
        int iA = a(ebsVar);
        if (iA != -1) {
            return ebsVar.a(this.a[(iA * 2) + 1]);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < a(); i++) {
            sb.append(" '").append(a(i)).append("': ").append(b(i));
        }
        return sb.append(" }").toString();
    }
}
