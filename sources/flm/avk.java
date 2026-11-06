package flm;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class avk implements axk {
    private final /* synthetic */ avi a;

    avk(avi aviVar) {
        this.a = aviVar;
    }

    @Override // flm.axk
    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            this.a.e = apx.a;
            this.a.f();
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // flm.axk
    public final void a(apx apxVar) {
        this.a.g.lock();
        try {
            this.a.e = apxVar;
            this.a.f();
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // flm.axk
    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (this.a.f) {
                this.a.f = false;
                this.a.a(i, z);
            } else {
                this.a.f = true;
                this.a.a.a(i);
            }
        } finally {
            this.a.g.unlock();
        }
    }
}
