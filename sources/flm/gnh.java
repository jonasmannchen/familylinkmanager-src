package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnh implements Comparable {
    public static final gnh a = new gnh(new byte[16]);
    private final byte[] b;

    private gnh(byte[] bArr) {
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gnh)) {
            return false;
        }
        return Arrays.equals(this.b, ((gnh) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        String strA = eex.b.a().a(this.b);
        return new StringBuilder(String.valueOf(strA).length() + 17).append("TraceId{traceId=").append(strA).append("}").toString();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        gnh gnhVar = (gnh) obj;
        for (int i = 0; i < 16; i++) {
            if (this.b[i] != gnhVar.b[i]) {
                return this.b[i] < gnhVar.b[i] ? -1 : 1;
            }
        }
        return 0;
    }
}
