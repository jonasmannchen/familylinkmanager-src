package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvz extends ch {
    bvz(cn cnVar) {
        super(cnVar);
    }

    @Override // flm.ct
    public final String a() {
        return "INSERT OR REPLACE INTO `PartialConsentForSecondaryAccountSignIn`(`key`,`parentObfuscatedGaiaId`,`reauthProofToken`,`consentTextVersion`,`timestamp`) VALUES (?,?,?,?,?)";
    }

    @Override // flm.ch
    public final /* synthetic */ void a(bw bwVar, Object obj) {
        bvw bvwVar = (bvw) obj;
        bwVar.a(1, bvwVar.a);
        if (bvwVar.b == null) {
            bwVar.a(2);
        } else {
            bwVar.a(2, bvwVar.b);
        }
        if (bvwVar.c == null) {
            bwVar.a(3);
        } else {
            bwVar.a(3, bvwVar.c);
        }
        if (bvwVar.d == null) {
            bwVar.a(4);
        } else {
            bwVar.a(4, bvwVar.d);
        }
        bwVar.a(5, bvwVar.e);
    }
}
