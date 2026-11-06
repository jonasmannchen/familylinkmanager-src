package flm;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awh implements atr, ats {
    private final /* synthetic */ avy a;

    awh(avy avyVar) {
        this.a = avyVar;
    }

    @Override // flm.atr
    public final void a(Bundle bundle) {
        if (!this.a.k.isSignInClientDisconnectFixEnabled()) {
            this.a.e.a(new awf(this.a));
            return;
        }
        this.a.b.lock();
        try {
            if (this.a.e == null) {
                return;
            }
            this.a.e.a(new awf(this.a));
        } finally {
            this.a.b.unlock();
        }
    }

    @Override // flm.atr
    public final void a(int i) {
    }

    @Override // flm.ats
    public final void a(apx apxVar) {
        this.a.b.lock();
        try {
            if (this.a.a(apxVar)) {
                this.a.f();
                this.a.e();
            } else {
                this.a.b(apxVar);
            }
        } finally {
            this.a.b.unlock();
        }
    }
}
