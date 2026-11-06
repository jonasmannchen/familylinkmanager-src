package flm;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbc {
    public final Set mScopes;

    public bbc(Set set) {
        bdi.checkNotNull(set);
        this.mScopes = Collections.unmodifiableSet(set);
    }
}
