package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aur implements ats {
    public final int a;
    public final atp b;
    public final ats c;
    private final /* synthetic */ auq d;

    public aur(auq auqVar, int i, atp atpVar, ats atsVar) {
        this.d = auqVar;
        this.a = i;
        this.b = atpVar;
        this.c = atsVar;
        atpVar.a(this);
    }

    @Override // flm.ats
    public final void a(apx apxVar) {
        String strValueOf = String.valueOf(apxVar);
        new StringBuilder(String.valueOf(strValueOf).length() + 27).append("beginFailureResolution for ").append(strValueOf);
        this.d.b(apxVar, this.a);
    }
}
