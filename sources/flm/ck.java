package flm;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ck implements Runnable {
    private final /* synthetic */ ci a;

    ck(ci ciVar) {
        this.a = ciVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba A[Catch: all -> 0x00cd, TryCatch #6 {, blocks: (B:33:0x00ac, B:35:0x00ba, B:36:0x00cc, B:51:0x00e8), top: B:67:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8 A[Catch: all -> 0x00cd, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:33:0x00ac, B:35:0x00ba, B:36:0x00cc, B:51:0x00e8), top: B:67:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        ReentrantLock reentrantLock = this.a.f.e;
        try {
            try {
                reentrantLock.lock();
                ci ciVar = this.a;
                if (ciVar.f.b()) {
                    if (!ciVar.h) {
                        ciVar.f.b.a();
                    }
                    if (ciVar.h) {
                        z = true;
                    } else {
                        Log.e("ROOM", "database is not initialized even though it is open");
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    if (this.a.g.compareAndSet(true, false)) {
                        if (this.a.f.g()) {
                            return;
                        }
                        this.a.i.c();
                        this.a.d[0] = Long.valueOf(this.a.e);
                        Cursor cursorA = this.a.f.b.a().a(new bn("SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;", this.a.d));
                        while (cursorA.moveToNext()) {
                            try {
                                long j = cursorA.getLong(0);
                                this.a.c[cursorA.getInt(1)] = j;
                                try {
                                    this.a.e = j;
                                    z3 = true;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        cursorA.close();
                                        throw th;
                                    } catch (SQLiteException e) {
                                        e = e;
                                    } catch (IllegalStateException e2) {
                                        e = e2;
                                        z3 = z2;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z2 = z3;
                            }
                        }
                        cursorA.close();
                        if (z3) {
                            synchronized (this.a.k) {
                                it = this.a.k.iterator();
                                if (it.hasNext()) {
                                    ((Map.Entry) it.next()).getValue();
                                    long[] jArr = this.a.c;
                                    throw new NoSuchMethodError();
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } catch (SQLiteException e3) {
                e = e3;
                z2 = z3;
            } catch (IllegalStateException e4) {
                e = e4;
            }
            if (z3) {
                synchronized (this.a.k) {
                    it = this.a.k.iterator();
                    if (it.hasNext()) {
                        ((Map.Entry) it.next()).getValue();
                        long[] jArr2 = this.a.c;
                        throw new NoSuchMethodError();
                    }
                    return;
                }
            }
            return;
        } finally {
            reentrantLock.unlock();
        }
        z3 = z2;
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
    }
}
