package flm;

import java.io.File;
import java.io.FileInputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dod {
    public final ByteBuffer a;
    public final int b;
    public final doi c;
    private final int[] d;
    private final ByteBuffer e;

    private dod(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        this.a = byteBuffer;
        this.e = byteBuffer.duplicate();
        while (byteBuffer.get() != 0) {
        }
        this.b = byteBuffer.getInt();
        dse.b(this.b > 0);
        byteBuffer.getLong();
        this.d = new int[]{0, 0, this.b, 0, 1, 2, 4, 8, 1, 2, 4, 8};
        this.c = new doi();
        int i = this.b;
        doc docVar = new doc(this) { // from class: flm.doe
            private final dod a;

            {
                this.a = this;
            }

            @Override // flm.doc
            public final void a(int i2, int i3) {
                this.a.c.a(i2, i3);
            }
        };
        docVar.a(137, i);
        docVar.a(255, i);
        docVar.a(139, i);
        docVar.a(144, i);
        docVar.a(138, i);
        docVar.a(5, i);
        docVar.a(7, i);
        docVar.a(140, i);
        docVar.a(141, i);
        docVar.a(1, i + i);
        docVar.a(3, i + 8);
        docVar.a(2, i + 8);
        docVar.a(8, i + 8);
        docVar.a(142, i + 8);
        docVar.a(4, i + 4);
        docVar.a(6, i + 4);
    }

    public static dod a(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileChannel fileChannel = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream2.getChannel();
                try {
                    dod dodVar = new dod(channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()));
                    if (channel != null) {
                        channel.close();
                    }
                    fileInputStream2.close();
                    return dodVar;
                } catch (Throwable th) {
                    fileInputStream = fileInputStream2;
                    th = th;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public final String a(int i) {
        dse.a(i >= 0);
        byte[] bArr = new byte[this.e.getInt(i) - this.b];
        this.e.position(i + 4 + this.b);
        this.e.get(bArr);
        return new String(bArr, Charset.defaultCharset());
    }

    public final int b(int i) {
        int i2 = this.d[i];
        dse.b(i2 > 0);
        return i2;
    }

    public final void c(int i) {
        dse.a(i >= 0);
        int iPosition = this.a.position() + i;
        if (iPosition > this.a.limit()) {
            throw new BufferUnderflowException();
        }
        this.a.position(iPosition);
    }

    public final int a() {
        switch (this.b) {
            case 1:
                return this.a.get();
            case 2:
                return this.a.getShort();
            case 3:
            default:
                throw new IllegalStateException();
            case 4:
                return this.a.getInt();
        }
    }

    public final int d(int i) {
        switch (this.b) {
            case 1:
                return this.a.get(i);
            case 2:
                return this.a.getShort(i);
            case 3:
            default:
                throw new IllegalStateException();
            case 4:
                return this.a.getInt(i);
        }
    }

    public static boolean e(int i) {
        return i == 2;
    }
}
