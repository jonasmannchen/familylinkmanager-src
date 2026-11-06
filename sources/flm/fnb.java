package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fnb {
    public volatile int h = -1;

    public abstract fnb a(fms fmsVar);

    public final int d() {
        int iA = a();
        this.h = iA;
        return iA;
    }

    public int a() {
        return 0;
    }

    public void a(fmt fmtVar) {
    }

    public static final byte[] a(fnb fnbVar) {
        byte[] bArr = new byte[fnbVar.d()];
        try {
            fmt fmtVarA = fmt.a(bArr, 0, bArr.length);
            fnbVar.a(fmtVarA);
            if (fmtVarA.a.remaining() != 0) {
                throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(fmtVarA.a.remaining())));
            }
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final fnb a(fnb fnbVar, byte[] bArr) {
        return a(fnbVar, bArr, 0, bArr.length);
    }

    private static final fnb a(fnb fnbVar, byte[] bArr, int i, int i2) throws fna {
        try {
            fms fmsVarA = fms.a(bArr, 0, i2);
            fnbVar.a(fmsVarA);
            fmsVarA.a(0);
            return fnbVar;
        } catch (fna e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public String toString() {
        return fnc.a(this);
    }

    @Override // 
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fnb clone() {
        return (fnb) super.clone();
    }
}
