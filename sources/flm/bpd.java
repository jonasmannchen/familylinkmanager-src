package flm;

import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bpd extends LruCache {
    bpd(int i) {
        super(50);
    }

    @Override // android.util.LruCache
    public final /* synthetic */ Object create(Object obj) {
        return new bpe();
    }
}
