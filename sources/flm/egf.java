package flm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class egf extends ega {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    egf(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // flm.ega
    final void a(egm egmVar, Thread thread) {
        this.a.lazySet(egmVar, thread);
    }

    @Override // flm.ega
    final void a(egm egmVar, egm egmVar2) {
        this.b.lazySet(egmVar, egmVar2);
    }

    @Override // flm.ega
    final boolean a(efz efzVar, egm egmVar, egm egmVar2) {
        return this.c.compareAndSet(efzVar, egmVar, egmVar2);
    }

    @Override // flm.ega
    final boolean a(efz efzVar, ege egeVar, ege egeVar2) {
        return this.d.compareAndSet(efzVar, egeVar, egeVar2);
    }

    @Override // flm.ega
    final boolean a(efz efzVar, Object obj, Object obj2) {
        return this.e.compareAndSet(efzVar, obj, obj2);
    }
}
