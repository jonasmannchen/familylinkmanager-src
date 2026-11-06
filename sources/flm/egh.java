package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class egh extends ega {
    egh() {
    }

    @Override // flm.ega
    final void a(egm egmVar, Thread thread) {
        egmVar.thread = thread;
    }

    @Override // flm.ega
    final void a(egm egmVar, egm egmVar2) {
        egmVar.next = egmVar2;
    }

    @Override // flm.ega
    final boolean a(efz efzVar, egm egmVar, egm egmVar2) {
        boolean z;
        synchronized (efzVar) {
            if (efzVar.waiters == egmVar) {
                efzVar.waiters = egmVar2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // flm.ega
    final boolean a(efz efzVar, ege egeVar, ege egeVar2) {
        boolean z;
        synchronized (efzVar) {
            if (efzVar.listeners == egeVar) {
                efzVar.listeners = egeVar2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // flm.ega
    final boolean a(efz efzVar, Object obj, Object obj2) {
        boolean z;
        synchronized (efzVar) {
            if (efzVar.value == obj) {
                efzVar.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
