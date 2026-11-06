package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bww extends cu {
    public bww() {
        super(12, 13);
    }

    @Override // flm.cu
    public final void a(bo boVar) {
        boVar.c("CREATE TABLE IF NOT EXISTS `PartialConsentForSecondaryAccountSignIn` (`key` INTEGER NOT NULL, `parentObfuscatedGaiaId` TEXT NOT NULL, `reauthProofToken` TEXT NOT NULL, `consentTextVersion` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`key`))");
    }
}
