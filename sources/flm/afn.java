package flm;

import android.database.Observable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afn extends Observable {
    afn() {
    }

    public final boolean a() {
        return !this.mObservers.isEmpty();
    }

    public final void b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((afo) this.mObservers.get(size)).a();
        }
    }
}
