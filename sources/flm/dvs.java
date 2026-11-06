package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dvs extends dvu {
    private final /* synthetic */ dvr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dvs(dvr dvrVar, dvo dvoVar, CharSequence charSequence) {
        super(dvoVar, charSequence);
        this.c = dvrVar;
    }

    @Override // flm.dvu
    public final int a(int i) {
        int length = this.c.a.length();
        int length2 = this.b.length() - length;
        for (int i2 = i; i2 <= length2; i2++) {
            for (int i3 = 0; i3 < length; i3++) {
                if (this.b.charAt(i3 + i2) == this.c.a.charAt(i3)) {
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // flm.dvu
    public final int b(int i) {
        return this.c.a.length() + i;
    }
}
