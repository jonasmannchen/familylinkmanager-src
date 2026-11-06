package flm;

import android.os.SystemClock;
import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class zc implements aey {
    public final /* synthetic */ yz a;

    zc(yz yzVar) {
        this.a = yzVar;
    }

    @Override // flm.aey
    public final void a(zi ziVar, MenuItem menuItem) {
        this.a.a.removeCallbacksAndMessages(ziVar);
    }

    @Override // flm.aey
    public final void b(zi ziVar, MenuItem menuItem) {
        int i;
        this.a.a.removeCallbacksAndMessages(null);
        int i2 = 0;
        int size = this.a.b.size();
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            } else {
                if (ziVar == ((ze) this.a.b.get(i2)).b) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (i != -1) {
            int i3 = i + 1;
            this.a.a.postAtTime(new zd(this, i3 < this.a.b.size() ? (ze) this.a.b.get(i3) : null, menuItem, ziVar), ziVar, SystemClock.uptimeMillis() + 200);
        }
    }
}
