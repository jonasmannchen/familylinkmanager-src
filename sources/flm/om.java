package flm;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class om extends op {
    public volatile on a;
    public long b;
    private final Executor k;
    private volatile on l;

    public om(Context context) {
        this(context, or.b);
    }

    public abstract Object d();

    private om(Context context, Executor executor) {
        super(context);
        this.b = -10000L;
        this.k = executor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.op
    public final void a() {
        super.a();
        b();
        this.a = new on(this);
        c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.op
    public final boolean b() {
        Handler handler = null;
        boolean zCancel = false;
        if (this.a != null) {
            if (!this.f) {
                this.i = true;
            }
            if (this.l != null) {
                if (this.a.a) {
                    this.a.a = false;
                    handler.removeCallbacks(this.a);
                }
                this.a = null;
            } else if (this.a.a) {
                this.a.a = false;
                handler.removeCallbacks(this.a);
                this.a = null;
            } else {
                on onVar = this.a;
                onVar.f.set(true);
                zCancel = onVar.d.cancel(false);
                if (zCancel) {
                    this.l = this.a;
                }
                this.a = null;
            }
        }
        return zCancel;
    }

    final void c() {
        Handler handler = null;
        if (this.l == null && this.a != null) {
            if (this.a.a) {
                this.a.a = false;
                handler.removeCallbacks(this.a);
            }
            if (0 > 0 && SystemClock.uptimeMillis() < this.b) {
                this.a.a = true;
                handler.postAtTime(this.a, this.b);
                return;
            }
            on onVar = this.a;
            Executor executor = this.k;
            if (onVar.e != dp.B) {
                switch (onVar.e - 1) {
                    case 1:
                        throw new IllegalStateException("Cannot execute task: the task is already running.");
                    case 2:
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    default:
                        throw new IllegalStateException("We should never reach this state");
                }
            } else {
                onVar.e = dp.C;
                onVar.c.a = null;
                executor.execute(onVar.d);
            }
        }
    }

    final void a(on onVar, Object obj) {
        if (this.l == onVar) {
            this.b = SystemClock.uptimeMillis();
            this.l = null;
            c();
        }
    }

    @Override // flm.op
    @Deprecated
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            printWriter.println(this.a.a);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.l);
            printWriter.print(" waiting=");
            printWriter.println(this.l.a);
        }
        if (0 != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            sq.a(0L, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            sq.a(this.b, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
