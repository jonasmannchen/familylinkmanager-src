package flm;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class avj implements axk {
    private final /* synthetic */ avi a;

    avj(avi aviVar) {
        this.a = aviVar;
    }

    @Override // flm.axk
    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            avi aviVar = this.a;
            if (aviVar.c == null) {
                aviVar.c = bundle;
            } else if (bundle != null) {
                aviVar.c.putAll(bundle);
            }
            this.a.d = apx.a;
            this.a.f();
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // flm.axk
    public final void a(apx apxVar) {
        this.a.g.lock();
        try {
            this.a.d = apxVar;
            this.a.f();
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // flm.axk
    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (this.a.f || this.a.e == null || !this.a.e.b()) {
                this.a.f = false;
                this.a.a(i, z);
            } else {
                this.a.f = true;
                this.a.b.a(i);
            }
        } finally {
            this.a.g.unlock();
        }
    }
}
