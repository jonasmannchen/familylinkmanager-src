package flm;

import android.database.Cursor;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cn {
    public volatile bo a;
    public bp b;
    public boolean c;
    public List d;
    public final ReentrantLock e = new ReentrantLock();
    private final ci f = a();

    public abstract bp a(cf cfVar);

    public abstract ci a();

    public final boolean b() {
        bo boVar = this.a;
        return boVar != null && boVar.e();
    }

    public final void c() {
        if (!this.c && a.a().b()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final Cursor a(bv bvVar) {
        c();
        return this.b.a().a(bvVar);
    }

    public final bw a(String str) {
        c();
        return this.b.a().a(str);
    }

    public final void d() {
        c();
        this.f.l.run();
        this.b.a().a();
    }

    public final void e() {
        this.b.a().b();
        if (!g()) {
            ci ciVar = this.f;
            if (ciVar.g.compareAndSet(false, true)) {
                a.a().a(ciVar.m);
            }
        }
    }

    public final void f() {
        this.b.a().c();
    }

    public final void a(Runnable runnable) {
        d();
        try {
            runnable.run();
            f();
        } finally {
            e();
        }
    }

    public final Object a(Callable callable) {
        d();
        try {
            try {
                try {
                    Object objCall = callable.call();
                    f();
                    e();
                    return objCall;
                } catch (Exception e) {
                    throw new RuntimeException("Exception in transaction", e);
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    public final void a(bo boVar) {
        ci ciVar = this.f;
        synchronized (ciVar) {
            if (ciVar.h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            boVar.a();
            try {
                boVar.c("PRAGMA temp_store = MEMORY;");
                boVar.c("PRAGMA recursive_triggers='ON';");
                boVar.c("CREATE TEMP TABLE room_table_modification_log(version INTEGER PRIMARY KEY AUTOINCREMENT, table_id INTEGER)");
                boVar.c();
                boVar.b();
                ciVar.i = boVar.a("DELETE FROM room_table_modification_log WHERE version NOT IN( SELECT MAX(version) FROM room_table_modification_log GROUP BY table_id)");
                ciVar.h = true;
            } catch (Throwable th) {
                boVar.b();
                throw th;
            }
        }
    }

    public final boolean g() {
        return this.b.a().d();
    }
}
