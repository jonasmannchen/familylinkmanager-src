package flm;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gko implements fug {
    private static final ThreadLocal a = new ThreadLocal();
    private final fko b;
    private final fke c;

    gko(fke fkeVar) {
        this.c = fkeVar;
        this.b = fkeVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fug
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fke a(InputStream inputStream) {
        byte[] bArr;
        if ((inputStream instanceof gkm) && ((gkm) inputStream).b == this.b) {
            try {
                gkm gkmVar = (gkm) inputStream;
                if (gkmVar.a == null) {
                    throw new IllegalStateException("message not available");
                }
                return gkmVar.a;
            } catch (IllegalStateException e) {
            }
        }
        fhk fhkVarA = null;
        try {
            if (inputStream instanceof ftl) {
                int iAvailable = inputStream.available();
                if (iAvailable > 0 && iAvailable <= 4194304) {
                    Reference reference = (Reference) a.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        a.set(new WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i2 = inputStream.read(bArr, iAvailable - i, i);
                        if (i2 == -1) {
                            break;
                        }
                        i -= i2;
                    }
                    if (i != 0) {
                        throw new RuntimeException(new StringBuilder(43).append("size inaccurate: ").append(iAvailable).append(" != ").append(iAvailable - i).toString());
                    }
                    fhkVarA = fhk.a(bArr, 0, iAvailable, false);
                } else if (iAvailable == 0) {
                    return this.c;
                }
            }
            if (fhkVarA == null) {
                fhkVarA = fhk.a(inputStream);
            }
            int i3 = fhkVarA.c;
            fhkVarA.c = Integer.MAX_VALUE;
            try {
                return a(fhkVarA);
            } catch (fjg e2) {
                throw fvc.i.a("Invalid protobuf byte sequence").b(e2).b();
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    private final fke a(fhk fhkVar) throws fjg {
        fke fkeVar = (fke) this.b.a(fhkVar, gkn.a);
        try {
            fhkVar.a(0);
            return fkeVar;
        } catch (fjg e) {
            throw e;
        }
    }

    @Override // flm.fug
    public final /* synthetic */ InputStream a(Object obj) {
        return new gkm((fke) obj, this.b);
    }
}
