package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mu implements Runnable {
    private final /* synthetic */ ArrayList a;

    mu(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mt.a(this.a, 4);
    }
}
