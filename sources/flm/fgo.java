package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fgo implements fkf {
    protected abstract fgo a(fgn fgnVar);

    public abstract fgo a(fhk fhkVar, fib fibVar);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract fgo clone();

    public final fgo a(byte[] bArr, fib fibVar) {
        return a(bArr, 0, bArr.length, fibVar);
    }

    private final fgo a(byte[] bArr, int i, int i2, fib fibVar) throws fjg {
        try {
            fhk fhkVarA = fhk.a(bArr, 0, i2, false);
            a(fhkVarA, fibVar);
            fhkVarA.a(0);
            return this;
        } catch (fjg e) {
            throw e;
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf("byte array").length()).append("Reading ").append(name).append(" from a ").append("byte array").append(" threw an IOException (should never happen).").toString(), e2);
        }
    }

    @Override // flm.fkf
    public final /* synthetic */ fkf a(fke fkeVar) {
        if (!m().getClass().isInstance(fkeVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return a((fgn) fkeVar);
    }
}
