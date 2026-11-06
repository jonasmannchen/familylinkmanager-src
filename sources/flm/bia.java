package flm;

import android.app.ActivityManager;
import android.util.Log;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bia implements Appendable, AutoCloseable {
    public final ScheduledExecutorService a;
    public final long b;
    public final long c;
    public final TimeUnit d;
    public final FileOutputStream f;
    public final PrintStream g;
    public long h;
    public long i;
    public ScheduledFuture j;
    public final Object e = new Object();
    public final Runnable k = new bib(this);

    public bia(File file, ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit, int i) {
        FileOutputStream fileOutputStream;
        FileNotFoundException e;
        PrintStream printStream;
        ActivityManager activityManager;
        if (i < 0) {
            Log.w("CachingFileWriter", "buffer size should be >= 0");
        }
        bdi.checkArgument(i >= 0, "bufferSize must be >= 0");
        BaseApplicationContext baseApplicationContextA = ayt.a();
        if (bik.a == null && (activityManager = (ActivityManager) baseApplicationContextA.getSystemService("activity")) != null) {
            bik.a = Boolean.valueOf(activityManager.isLowRamDevice());
        }
        if (bcx.equal(bik.a, Boolean.TRUE)) {
            if (i > 20480) {
                i = 20480;
            }
        } else if (i > 102400) {
            i = 102400;
        }
        this.b = i;
        this.h = 0L;
        this.a = scheduledExecutorService;
        this.c = j;
        this.d = timeUnit;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            try {
                fileOutputStream.getChannel().force(true);
            } catch (FileNotFoundException e2) {
                e = e2;
                Log.e("CachingFileWriter", "Couldn't open stats file for appending", e);
            } catch (IOException e3) {
                Log.w("CachingFileWriter", "Couldn't set force on the output channel.");
            }
        } catch (FileNotFoundException e4) {
            e = e4;
            fileOutputStream = null;
        } catch (IOException e5) {
            fileOutputStream = null;
        }
        this.f = fileOutputStream;
        if (this.f != null) {
            try {
                printStream = i > 0 ? new PrintStream((OutputStream) new BufferedOutputStream(this.f, i), false, "UTF-8") : new PrintStream((OutputStream) this.f, true, "UTF-8");
            } catch (UnsupportedEncodingException e6) {
                Log.e("CachingFileWriter", "Couldn't open print stats files for writing", e6);
                printStream = null;
            }
        } else {
            printStream = null;
        }
        this.g = printStream;
    }

    final FileLock a() throws IOException {
        try {
            return this.f.getChannel().lock();
        } catch (OverlappingFileLockException e) {
            throw new IOException("Unable to lock file exclusively", e);
        }
    }

    public final void b() {
        synchronized (this.e) {
            if (this.h != 0) {
                FileLock fileLockA = a();
                try {
                    if (this.g != null) {
                        this.g.flush();
                        this.i++;
                        this.h = 0L;
                    }
                    fileLockA.release();
                } catch (Throwable th) {
                    fileLockA.release();
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        synchronized (this.e) {
            if (this.g != null) {
                a(charSequence.toString().getBytes("UTF-8"));
            }
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        synchronized (this.e) {
            if (this.g != null) {
                a(charSequence.subSequence(i, i2).toString().getBytes("UTF-8"));
            }
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        synchronized (this.e) {
            if (this.g != null) {
                a(String.valueOf(c).getBytes("UTF-8"));
            }
        }
        return this;
    }

    private final void a(byte[] bArr) {
        if (this.g != null) {
            this.a.execute(new bic(this, bArr));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            if (this.g != null) {
                this.g.close();
            }
        }
    }
}
