package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bwa extends ct {
    bwa(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "DELETE FROM PartialConsentForSecondaryAccountSignIn WHERE reauthProofToken = ?";
    }
}
