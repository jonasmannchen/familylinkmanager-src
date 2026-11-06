package flm;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwj implements ghn {
    fwj() {
    }

    @Override // flm.ghn
    public final ghm a(int i) {
        return new fwi(ByteBuffer.allocateDirect(Math.min(1048576, i)));
    }
}
