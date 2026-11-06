package flm;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bic implements Runnable {
    private final byte[] a;
    private final /* synthetic */ bia b;

    bic(bia biaVar, byte[] bArr) {
        this.b = biaVar;
        this.a = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.e) {
            if (((long) this.a.length) + this.b.h >= this.b.b) {
                try {
                    FileLock fileLockA = this.b.a();
                    try {
                        FileChannel channel = this.b.f.getChannel();
                        if (channel.size() < channel.position()) {
                            channel.position(channel.size());
                        }
                        this.b.g.write(this.a, 0, this.a.length);
                        this.b.g.flush();
                        this.b.h = 0L;
                        this.b.i++;
                        if (this.b.j != null) {
                            this.b.j.cancel(false);
                        }
                        fileLockA.release();
                    } catch (Throwable th) {
                        fileLockA.release();
                        throw th;
                    }
                } catch (IOException e) {
                    Log.w("CachingFileWriter", "Failed to write cache to disk.", e);
                }
            } else {
                this.b.g.write(this.a, 0, this.a.length);
                bia biaVar = this.b;
                biaVar.h = ((long) this.a.length) + biaVar.h;
                bia biaVar2 = this.b;
                if (biaVar2.j == null || biaVar2.j.isDone()) {
                    biaVar2.j = biaVar2.a.schedule(biaVar2.k, biaVar2.c, biaVar2.d);
                }
            }
        }
    }
}
