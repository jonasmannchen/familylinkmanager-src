package flm;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fuf {
    public final fuh a;
    public final String b;
    public final fug c;
    public final fug d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final Object h;

    @Deprecated
    public static fuf a(fuh fuhVar, String str, fug fugVar, fug fugVar2) {
        return new fuf(fuhVar, str, fugVar, fugVar2, null, false, false, false);
    }

    fuf(fuh fuhVar, String str, fug fugVar, fug fugVar2, Object obj, boolean z, boolean z2, boolean z3) {
        new AtomicReferenceArray(1);
        this.a = (fuh) dvl.a(fuhVar, "type");
        this.b = (String) dvl.a(str, "fullMethodName");
        this.c = (fug) dvl.a(fugVar, "requestMarshaller");
        this.d = (fug) dvl.a(fugVar2, "responseMarshaller");
        this.h = obj;
        this.e = z;
        this.f = z2;
        this.g = z3;
        dvl.a(!z2 || fuhVar == fuh.UNARY, "Only unary methods can be specified safe");
    }

    public final InputStream a(Object obj) {
        return this.c.a(obj);
    }

    public final String toString() {
        dvf dvfVarA = dve.a(this).a("fullMethodName", this.b).a("type", this.a).a("idempotent", this.e).a("safe", this.f).a("sampledToLocalTracing", this.g).a("requestMarshaller", this.c).a("responseMarshaller", this.d).a("schemaDescriptor", this.h);
        dvfVarA.a = true;
        return dvfVarA.toString();
    }
}
