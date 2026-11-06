package flm;

import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface gez extends Closeable {
    int a();

    void a(byte[] bArr, int i, int i2);

    int b();

    gez b(int i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
