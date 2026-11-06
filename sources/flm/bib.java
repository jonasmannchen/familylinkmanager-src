package flm;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bib implements Runnable {
    private final /* synthetic */ bia a;

    bib(bia biaVar) {
        this.a = biaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.b();
        } catch (IOException e) {
            Log.w("CachingFileWriter", "Failed to flush cache.", e);
        }
    }
}
