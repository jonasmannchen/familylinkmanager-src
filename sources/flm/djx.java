package flm;

import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class djx implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ djw b;

    djx(djw djwVar, Runnable runnable) {
        this.b = djwVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a != 0) {
            Process.setThreadPriority(this.b.a);
        }
        this.a.run();
    }
}
