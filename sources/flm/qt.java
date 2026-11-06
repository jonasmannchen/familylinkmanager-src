package flm;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qt {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    private final int f = 0;

    public qt(String str, String str2, String str3, List list) {
        this.a = (String) sn.a(str);
        this.b = (String) sn.a(str2);
        this.c = (String) sn.a(str3);
        this.d = (List) sn.a(list);
        this.e = this.a + "-" + this.b + "-" + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List list = (List) this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}
