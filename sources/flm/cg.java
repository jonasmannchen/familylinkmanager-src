package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cg extends ct {
    public cg(cn cnVar) {
        super(cnVar);
    }

    public abstract void a(bw bwVar, Object obj);

    public final int a(Object obj) {
        bw bwVarB = b();
        try {
            a(bwVarB, obj);
            return bwVarB.c();
        } finally {
            a(bwVarB);
        }
    }

    public final int a(Object[] objArr) {
        bw bwVarB = b();
        try {
            int iC = 0;
            for (Object obj : objArr) {
                a(bwVarB, obj);
                iC += bwVarB.c();
            }
            a(bwVarB);
            return iC;
        } catch (Throwable th) {
            a(bwVarB);
            throw th;
        }
    }
}
