package flm;

import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bjh implements Runnable {
    private final Runnable a;
    private final int b;

    public bjh(Runnable runnable, int i) {
        this.a = runnable;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.b);
        this.a.run();
    }
}
