package flm;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface gup extends Closeable, Flushable {
    void a_(guc gucVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
