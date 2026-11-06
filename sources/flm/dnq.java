package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnq extends dnt {
    public final dnp a;

    protected dnq(int i, dnp dnpVar) {
        super(i);
        this.a = (dnp) dse.a(dnpVar);
    }

    @Override // flm.dnt
    public final int a(dod dodVar) {
        return this.a.h;
    }

    @Override // flm.dnt
    public final int a(dod dodVar, int i) {
        String strA;
        dnp dnpVar = this.a;
        int i2 = dnpVar.h;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strA = dse.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
                }
                strA = dse.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strA);
        }
        return dnpVar.a(dodVar, this.k + dodVar.b + 4 + dodVar.b + 4, i);
    }

    @Override // flm.dnt
    public final String b(dod dodVar, int i) {
        return this.a.d(dodVar, i);
    }

    @Override // flm.dnt
    public final String c(dod dodVar, int i) {
        if (i >= 0 && i < this.a.h) {
            dnp dnpVarA = this.a.a(i);
            if (dnpVarA == this.a) {
                String strC = this.a.c(dodVar);
                String strB = b(dodVar, i);
                return new StringBuilder(String.valueOf(strC).length() + 1 + String.valueOf(strB).length()).append(strC).append('#').append(strB).toString();
            }
            String strC2 = this.a.c(dodVar);
            String strC3 = dnpVarA.c(dodVar);
            String strB2 = b(dodVar, i);
            return new StringBuilder(String.valueOf(strC2).length() + 2 + String.valueOf(strC3).length() + String.valueOf(strB2).length()).append(strC2).append(':').append(strC3).append('#').append(strB2).toString();
        }
        return this.a.c(dodVar);
    }

    @Override // flm.dnt
    public final int b(dod dodVar) {
        return this.a.i;
    }
}
