package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fgq implements fko {
    private static final fib a = fib.a();

    private final fke a(fke fkeVar) throws fjg {
        flp flpVar;
        if (fkeVar == null || fkeVar.f()) {
            return fkeVar;
        }
        if (fkeVar instanceof fgn) {
            flpVar = new flp();
        } else if (fkeVar instanceof fgp) {
            flpVar = new flp();
        } else {
            flpVar = new flp();
        }
        fjg fjgVarA = flpVar.a();
        if (fjgVarA == null) {
            throw null;
        }
        throw fjgVarA;
    }

    private final fke a(byte[] bArr, int i, int i2, fib fibVar) throws fjg {
        try {
            fhk fhkVarA = fhk.a(bArr, i, i2, false);
            fke fkeVar = (fke) b(fhkVarA, fibVar);
            try {
                fhkVarA.a(0);
                return fkeVar;
            } catch (fjg e) {
                throw e;
            }
        } catch (fjg e2) {
            throw e2;
        }
    }

    @Override // flm.fko
    public final /* synthetic */ Object a(byte[] bArr, int i, int i2) {
        return a(a(bArr, 1, i2, a));
    }

    @Override // flm.fko
    public final /* synthetic */ Object a(fhk fhkVar, fib fibVar) {
        return a((fke) b(fhkVar, fibVar));
    }
}
