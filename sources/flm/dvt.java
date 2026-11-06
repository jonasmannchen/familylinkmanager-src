package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dvt implements Iterable {
    private final /* synthetic */ CharSequence a;
    private final /* synthetic */ dvo b;

    dvt(dvo dvoVar, CharSequence charSequence) {
        this.b = dvoVar;
        this.a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.b(this.a);
    }

    public final String toString() {
        return dvd.a(", ").a(new StringBuilder("["), iterator()).append(']').toString();
    }
}
