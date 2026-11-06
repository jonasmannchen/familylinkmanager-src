package flm;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class cos implements dvm {
    public static final dvm a = new cos();

    private cos() {
    }

    @Override // flm.dvm
    public final boolean a(Object obj) {
        exj exjVar = (exj) obj;
        exq exqVarA = exq.a(exjVar.c);
        if (exqVarA == null) {
            exqVarA = exq.UNKNOWN_FAMILY_ROLE;
        }
        if (exqVarA != exq.HEAD_OF_HOUSEHOLD) {
            exq exqVarA2 = exq.a(exjVar.c);
            if (exqVarA2 == null) {
                exqVarA2 = exq.UNKNOWN_FAMILY_ROLE;
            }
            if (exqVarA2 != exq.PARENT) {
                return false;
            }
        }
        return true;
    }
}
