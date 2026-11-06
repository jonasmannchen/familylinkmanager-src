package flm;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awj implements awo {
    private final awp a;

    public awj(awp awpVar) {
        this.a = awpVar;
    }

    @Override // flm.awo
    public final void a() {
        Iterator it = this.a.f.values().iterator();
        while (it.hasNext()) {
            ((ate) it.next()).disconnect();
        }
        this.a.m.e = Collections.emptySet();
    }

    @Override // flm.awo
    public final auv a(auv auvVar) {
        this.a.m.c.add(auvVar);
        return auvVar;
    }

    @Override // flm.awo
    public final auv b(auv auvVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // flm.awo
    public final boolean b() {
        return true;
    }

    @Override // flm.awo
    public final void c() {
        awp awpVar = this.a;
        awpVar.a.lock();
        try {
            awpVar.k = new avy(awpVar, awpVar.h, awpVar.i, awpVar.d, awpVar.j, awpVar.a, awpVar.c);
            awpVar.k.a();
            awpVar.b.signalAll();
        } finally {
            awpVar.a.unlock();
        }
    }

    @Override // flm.awo
    public final void a(Bundle bundle) {
    }

    @Override // flm.awo
    public final void a(apx apxVar, asw aswVar, boolean z) {
    }

    @Override // flm.awo
    public final void a(int i) {
    }
}
