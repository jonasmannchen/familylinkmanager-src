package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhz {
    /* JADX WARN: Code duplicated, block: B:11:0x0012 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    public static boolean a(Object[] objArr, Object obj) {
        int i;
        int length = objArr != null ? objArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (bcx.equal(objArr[i2], obj)) {
                i = i2;
                if (i >= 0) {
                    return true;
                }
                return false;
            }
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }
}
