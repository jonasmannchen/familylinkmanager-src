package flm;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwa extends fwk {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);
    public final String b;
    public final String c;
    public final ghd d;
    public final Executor e;
    public final ftv f;
    public final fwf g;
    public final Runnable h;
    public final boolean i;
    public BidirectionalStream j;
    public final boolean k;
    public final Object l;
    public final Collection m;
    public final fwe n;
    public fvy o;
    private final fwd s;

    fwa(String str, String str2, Executor executor, ftv ftvVar, fwf fwfVar, Runnable runnable, Object obj, int i, boolean z, fuf fufVar, ghd ghdVar, frj frjVar, ghk ghkVar) {
        super(new fwj(), ghdVar, ghkVar, ftvVar, frjVar, fufVar.f);
        this.s = new fwd(this);
        this.b = (String) dvl.a(str, "url");
        this.c = (String) dvl.a(str2, "userAgent");
        this.d = (ghd) dvl.a(ghdVar, "statsTraceCtx");
        this.e = (Executor) dvl.a(executor, "executor");
        this.f = (ftv) dvl.a(ftvVar, "headers");
        this.g = (fwf) dvl.a(fwfVar, "transport");
        this.h = (Runnable) dvl.a(runnable, "startCallback");
        this.i = fufVar.e || z;
        this.k = fufVar.a == fuh.UNARY;
        this.l = frjVar.a(fvv.a);
        this.m = (Collection) frjVar.a(fvv.b);
        this.n = new fwe(this, i, ghdVar, obj, ghkVar);
    }

    @Override // flm.fyz
    public final void a(String str) {
        throw new UnsupportedOperationException("Cronet does not support overriding authority");
    }

    final void a(fvc fvcVar) {
        this.g.a(this, fvcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fwk
    public final /* synthetic */ fwm a() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fwk
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fwn c() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fwk, flm.fwt
    public final /* synthetic */ fwu c() {
        return this.n;
    }
}
