package flm;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avv implements awo {
    public final awp a;
    public boolean b = false;

    public avv(awp awpVar) {
        this.a = awpVar;
    }

    @Override // flm.awo
    public final void a() {
    }

    @Override // flm.awo
    public final auv a(auv auvVar) {
        return b(auvVar);
    }

    @Override // flm.awo
    public final auv b(auv auvVar) {
        try {
            this.a.m.g.a(auvVar);
            awk awkVar = this.a.m;
            ate ateVar = (ate) awkVar.d.get(auvVar.getClientKey());
            bdi.checkNotNull(ateVar, "Appropriate Api was not requested.");
            if (!ateVar.isConnected() && this.a.g.containsKey(auvVar.getClientKey())) {
                auvVar.setFailedResult(new Status(17));
            } else {
                boolean z = ateVar instanceof bdr;
                asy client = ateVar;
                if (z) {
                    client = ((bdr) ateVar).getClient();
                }
                auvVar.run(client);
            }
        } catch (DeadObjectException e) {
            this.a.a(new avw(this, this));
        }
        return auvVar;
    }

    @Override // flm.awo
    public final boolean b() {
        if (this.b) {
            return false;
        }
        if (this.a.m.h()) {
            this.b = true;
            Iterator it = this.a.m.f.iterator();
            while (it.hasNext()) {
                ((ayl) it.next()).c = null;
            }
            return false;
        }
        this.a.a((apx) null);
        return true;
    }

    @Override // flm.awo
    public final void c() {
        if (this.b) {
            this.b = false;
            this.a.a(new avx(this, this));
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
        this.a.a((apx) null);
        this.a.n.a(i, this.b);
    }
}
