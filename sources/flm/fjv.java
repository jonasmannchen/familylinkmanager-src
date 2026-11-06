package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fjv implements fkd {
    private fkd[] a;

    fjv(fkd... fkdVarArr) {
        this.a = fkdVarArr;
    }

    @Override // flm.fkd
    public final boolean a(Class cls) {
        for (fkd fkdVar : this.a) {
            if (fkdVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // flm.fkd
    public final fkc b(Class cls) {
        for (fkd fkdVar : this.a) {
            if (fkdVar.a(cls)) {
                return fkdVar.b(cls);
            }
        }
        String strValueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new String("No factory is available for message type: "));
    }
}
