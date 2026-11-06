package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyd implements fub {
    private final /* synthetic */ gnu a;

    fyd(gnu gnuVar) {
        this.a = gnuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fub
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gnb a(byte[] bArr) {
        try {
            return this.a.a(bArr);
        } catch (Exception e) {
            fyc.a.logp(Level.FINE, "io.grpc.internal.CensusTracingModule$1", "parseBytes", "Failed to parse tracing header", (Throwable) e);
            return gnb.b;
        }
    }

    @Override // flm.fub
    public final /* synthetic */ byte[] a(Object obj) {
        return this.a.a((gnb) obj);
    }
}
