package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnc implements Comparable {
    public static final gnc a = new gnc(new byte[8]);
    private final byte[] b;

    private gnc(byte[] bArr) {
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gnc)) {
            return false;
        }
        return Arrays.equals(this.b, ((gnc) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        String strA = eex.b.a().a(this.b);
        return new StringBuilder(String.valueOf(strA).length() + 15).append("SpanId{spanId=").append(strA).append("}").toString();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        gnc gncVar = (gnc) obj;
        for (int i = 0; i < 8; i++) {
            if (this.b[i] != gncVar.b[i]) {
                return this.b[i] < gncVar.b[i] ? -1 : 1;
            }
        }
        return 0;
    }
}
