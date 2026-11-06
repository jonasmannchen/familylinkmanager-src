package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gij extends fwk {
    public static final guc a = new guc();
    public final fuf b;
    public final String c;
    public final ghd d;
    public String e;
    public Object f;
    public volatile int g;
    public final gim h;
    public boolean i;
    private final gil j;

    gij(fuf fufVar, ftv ftvVar, gho ghoVar, gin ginVar, giz gizVar, Object obj, int i, int i2, String str, String str2, ghd ghdVar, ghk ghkVar, frj frjVar) {
        super(new giy(), ghdVar, ghkVar, ftvVar, frjVar, fufVar.f);
        this.g = -1;
        this.j = new gil(this);
        this.i = false;
        this.d = (ghd) dvl.a(ghdVar, "statsTraceCtx");
        this.b = fufVar;
        this.e = str;
        this.c = str2;
        frd frdVar = ginVar.m;
        this.h = new gim(this, i, ghdVar, obj, ghoVar, gizVar, ginVar, i2);
    }

    public final fuh g() {
        return this.b.a;
    }

    @Override // flm.fyz
    public final void a(String str) {
        this.e = (String) dvl.a(str, "authority");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fwk
    public final /* synthetic */ fwm a() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fwk
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fwn c() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fwk, flm.fwt
    public final /* synthetic */ fwu c() {
        return this.h;
    }
}
