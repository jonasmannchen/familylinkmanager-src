package flm;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aop implements Comparator {
    aop() {
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException("what are you doing?");
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr == null && bArr2 == null) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            if (bArr[i] != bArr2[i]) {
                return bArr[i] - bArr2[i];
            }
        }
        return bArr.length - bArr2.length;
    }
}
