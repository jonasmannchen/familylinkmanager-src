package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aba implements zz {
    private final /* synthetic */ aat a;

    aba(aat aatVar) {
        this.a = aatVar;
    }

    @Override // flm.zz
    public final boolean a(zi ziVar) {
        if (ziVar == null) {
            return false;
        }
        ((aai) ziVar).getItem().getItemId();
        zz zzVar = this.a.d;
        if (zzVar != null) {
            return zzVar.a(ziVar);
        }
        return false;
    }

    @Override // flm.zz
    public final void a(zi ziVar, boolean z) {
        if (ziVar instanceof aai) {
            ziVar.l().a(false);
        }
        zz zzVar = this.a.d;
        if (zzVar != null) {
            zzVar.a(ziVar, z);
        }
    }
}
