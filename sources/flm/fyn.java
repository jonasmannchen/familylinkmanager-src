package flm;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyn extends ArrayDeque {
    private final /* synthetic */ int a;
    private final /* synthetic */ fym b;

    fyn(fym fymVar, int i) {
        this.b = fymVar;
        this.a = i;
    }

    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public final /* synthetic */ boolean add(Object obj) {
        fta ftaVar = (fta) obj;
        if (size() == this.a) {
            removeFirst();
        }
        this.b.a++;
        return super.add(ftaVar);
    }
}
