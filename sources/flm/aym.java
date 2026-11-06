package flm;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aym implements Runnable {
    private final /* synthetic */ aty a;
    private final /* synthetic */ ayl b;

    aym(ayl aylVar, aty atyVar) {
        this.b = aylVar;
        this.a = atyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            BasePendingResult.sTransformRunning.set(true);
            this.b.g.sendMessage(this.b.g.obtainMessage(0, this.b.a.a()));
        } catch (RuntimeException e) {
            this.b.g.sendMessage(this.b.g.obtainMessage(1, e));
        } finally {
            BasePendingResult.sTransformRunning.set(false);
            ayl aylVar = this.b;
            ayl.b(this.a);
            atp atpVar = (atp) this.b.f.get();
            if (atpVar != null) {
                atpVar.b(this.b);
            }
        }
    }
}
