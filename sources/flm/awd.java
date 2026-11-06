package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awd extends awq {
    private final /* synthetic */ bao b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    awd(awo awoVar, bao baoVar) {
        super(awoVar);
        this.b = baoVar;
    }

    @Override // flm.awq
    public final void a() {
        this.b.onReportServiceBinding(new apx(16, null));
    }
}
