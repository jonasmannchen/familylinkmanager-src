package flm;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fgn implements fke {
    public int D = 0;

    @Override // flm.fke
    public final fgy a() {
        try {
            fhg fhgVarC = fgy.c(g());
            a(fhgVarC.a);
            return fhgVarC.a();
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("ByteString").length()).append("Serializing ").append(name).append(" to a ").append("ByteString").append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    @Override // flm.fke
    public final byte[] b() {
        try {
            byte[] bArr = new byte[g()];
            fhp fhpVarA = fhp.a(bArr);
            a(fhpVarA);
            fhpVarA.j();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("byte array").length()).append("Serializing ").append(name).append(" to a ").append("byte array").append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    @Override // flm.fke
    public final void a(OutputStream outputStream) {
        fhp fhpVarA = fhp.a(outputStream, fhp.a(g()));
        a(fhpVarA);
        fhpVarA.h();
    }

    int c() {
        throw new UnsupportedOperationException();
    }

    void a(int i) {
        throw new UnsupportedOperationException();
    }
}
