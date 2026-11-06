package flm;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class egs extends egu {
    public static Object a(Future future) {
        dvl.b(future.isDone(), "Future was expected to be done: %s", future);
        return ehf.a(future);
    }
}
