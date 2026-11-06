package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PoolingByteArrayOutputStream extends ByteArrayOutputStream {
    private final ByteArrayPool a;

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool, int i) {
        this.a = byteArrayPool;
        this.buf = this.a.getBuf(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.returnBuf(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.a.returnBuf(this.buf);
    }

    private final void a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] buf = this.a.getBuf((this.count + i) << 1);
            System.arraycopy(this.buf, 0, buf, 0, this.count);
            this.a.returnBuf(this.buf);
            this.buf = buf;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        a(1);
        super.write(i);
    }
}
