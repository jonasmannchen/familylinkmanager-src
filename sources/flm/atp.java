package flm;

import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class atp {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());

    public abstract apx a(long j, TimeUnit timeUnit);

    public abstract void a(ats atsVar);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void b();

    public abstract void b(ats atsVar);

    public abstract apx c();

    public abstract void d();

    public auv a(auv auvVar) {
        throw new UnsupportedOperationException();
    }

    public auv b(auv auvVar) {
        throw new UnsupportedOperationException();
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }

    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    public void a(ayl aylVar) {
        throw new UnsupportedOperationException();
    }

    public void b(ayl aylVar) {
        throw new UnsupportedOperationException();
    }
}
