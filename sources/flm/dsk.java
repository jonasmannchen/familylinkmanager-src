package flm;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dsk extends PhantomReference {
    public final dsj a;

    public dsk(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = new dsj(this);
    }
}
