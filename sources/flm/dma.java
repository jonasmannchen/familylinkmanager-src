package flm;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class dma implements Runnable {
    public static final Runnable a = new dma();

    private dma() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
    }
}
