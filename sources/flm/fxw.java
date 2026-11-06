package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxw implements fub {
    private final /* synthetic */ gmc a;
    private final /* synthetic */ glz b;

    fxw(gmc gmcVar, glz glzVar) {
        this.a = gmcVar;
        this.b = glzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fub
    public final byte[] a(glv glvVar) {
        try {
            return this.a.a(glvVar);
        } catch (gme e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fub
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final glv a(byte[] bArr) {
        try {
            return this.a.a(bArr);
        } catch (Exception e) {
            fxv.a.logp(Level.FINE, "io.grpc.internal.CensusStatsModule$1", "parseBytes", "Failed to parse stats header", (Throwable) e);
            return this.b.a();
        }
    }
}
