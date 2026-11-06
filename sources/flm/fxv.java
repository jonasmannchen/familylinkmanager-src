package flm;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxv {
    public static final Logger a = Logger.getLogger(fxv.class.getName());
    public static final double b = TimeUnit.MILLISECONDS.toNanos(1);
    public static final fxy c = new fxy();
    public final glz d;
    public final glk e;
    public final dvz f;
    public final fuc g;
    public final boolean h;

    fxv(dvz dvzVar, boolean z) {
        this(gma.a.a(), gma.a.b().a(), gli.a.a(), dvzVar, true);
    }

    private fxv(glz glzVar, gmc gmcVar, glk glkVar, dvz dvzVar, boolean z) {
        this.d = (glz) dvl.a(glzVar, "tagger");
        this.e = (glk) dvl.a(glkVar, "statsRecorder");
        dvl.a(gmcVar, "tagCtxSerializer");
        this.f = (dvz) dvl.a(dvzVar, "stopwatchSupplier");
        this.h = z;
        this.g = fuc.a("grpc-tags-bin", new fxw(gmcVar, glzVar));
    }
}
