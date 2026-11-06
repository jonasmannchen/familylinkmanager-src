package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyq extends fzl {
    private final /* synthetic */ frn a;
    private final /* synthetic */ String b;
    private final /* synthetic */ fyo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fyq(fyo fyoVar, frn frnVar, String str) {
        super(fyoVar.d);
        this.c = fyoVar;
        this.a = frnVar;
        this.b = str;
    }

    @Override // flm.fzl
    public final void a() {
        fyo fyoVar = this.c;
        fyo.a(this.a, fvc.i.a(String.format("Unable to find compressor by name %s", this.b)), new ftv());
    }
}
