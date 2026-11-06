package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dno extends dnt {
    public final dnp a;

    dno(int i, dnp dnpVar) {
        super(i);
        this.a = dnpVar;
    }

    @Override // flm.dnt
    public final int a(dod dodVar) {
        return dodVar.a.getInt(this.k + dodVar.b + 4);
    }

    @Override // flm.dnt
    public final int a(dod dodVar, int i) {
        String strA;
        int iA = a(dodVar);
        if (i < 0 || i >= iA) {
            if (i < 0) {
                strA = dse.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (iA < 0) {
                    throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(iA).toString());
                }
                strA = dse.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(iA));
            }
            throw new IndexOutOfBoundsException(strA);
        }
        return dodVar.d(this.k + dodVar.b + 4 + 4 + dodVar.b + (dodVar.b * i));
    }

    @Override // flm.dnt
    public final String b(dod dodVar, int i) {
        String strA;
        int iA = a(dodVar);
        if (i < 0 || i >= iA) {
            if (i < 0) {
                strA = dse.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (iA < 0) {
                    throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(iA).toString());
                }
                strA = dse.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(iA));
            }
            throw new IndexOutOfBoundsException(strA);
        }
        return new StringBuilder(13).append("[").append(i).append("]").toString();
    }

    @Override // flm.dnt
    public final String c(dod dodVar, int i) {
        return new StringBuilder(31).append("Object[").append(i).append("/").append(a(dodVar)).append("]").toString();
    }

    @Override // flm.dnt
    public final int b(dod dodVar) {
        return dodVar.b * a(dodVar);
    }
}
