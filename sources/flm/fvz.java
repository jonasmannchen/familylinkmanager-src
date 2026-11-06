package flm;

import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalBidirectionalStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvz extends fvy {
    private final CronetEngine a;
    private final boolean b;
    private final int c;
    private final boolean d;
    private final int e;

    fvz(CronetEngine cronetEngine, boolean z, int i, boolean z2, int i2) {
        this.a = cronetEngine;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = i2;
    }

    @Override // flm.fvy
    public final BidirectionalStream.Builder a(String str, BidirectionalStream.Callback callback, Executor executor) {
        ExperimentalBidirectionalStream.Builder builderNewBidirectionalStreamBuilder = this.a.newBidirectionalStreamBuilder(str, callback, executor);
        if (this.b) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsTag(this.c);
        }
        if (this.d) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsUid(this.e);
        }
        return builderNewBidirectionalStreamBuilder;
    }
}
