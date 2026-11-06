package flm;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Debug;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgt implements Runnable {
    private final long a;
    private final /* synthetic */ dgr b;

    dgt(dgr dgrVar, long j) {
        this.b = dgrVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    @TargetApi(21)
    public final void run() {
        long jA = this.b.j.a();
        if (this.a <= jA) {
            this.b.g();
            return;
        }
        Intent intentRegisterReceiver = this.b.a.registerReceiver(null, this.b.i);
        dgr dgrVar = this.b;
        gpn gpnVar = (gpn) ((fio) gpm.e.a(dp.au, (Object) null));
        gpo gpoVarA = dgrVar.a(intentRegisterReceiver);
        gpnVar.c();
        gpm gpmVar = (gpm) gpnVar.a;
        if (gpoVarA == null) {
            throw new NullPointerException();
        }
        gpmVar.b = gpoVarA;
        gpmVar.a |= 1;
        gpm gpmVar2 = (gpm) ((fin) gpnVar.h());
        File fileH = this.b.h();
        if (fileH == null) {
            dkm.a(5, "CpuProfilingService", "Can't create file, aborting method sampling", new Object[0]);
            return;
        }
        this.b.i();
        Debug.startMethodTracingSampling(fileH.getAbsolutePath(), this.b.d, this.b.e);
        dgr dgrVar2 = this.b;
        ScheduledExecutorService scheduledExecutorServiceC = this.b.c();
        dgr dgrVar3 = this.b;
        dgr dgrVar4 = this.b;
        dgrVar2.k = scheduledExecutorServiceC.schedule(new dgs(dgrVar3, fileH, gpmVar2, Float.valueOf(intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1)), Long.valueOf(this.a), Long.valueOf(jA)), this.a - jA, TimeUnit.MILLISECONDS);
    }
}
