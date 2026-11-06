package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvf {
    private final String b;
    private final dvg c = new dvg();
    private dvg d = this.c;
    public boolean a = false;

    dvf(String str) {
        this.b = (String) dvl.a(str);
    }

    public final dvf a(String str, boolean z) {
        return a(str, String.valueOf(z));
    }

    public final dvf a(String str, int i) {
        return a(str, String.valueOf(i));
    }

    public final dvf a(String str, long j) {
        return a(str, String.valueOf(j));
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sbAppend = new StringBuilder(32).append(this.b).append('{');
        String str = "";
        for (dvg dvgVar = this.c.c; dvgVar != null; dvgVar = dvgVar.c) {
            Object obj = dvgVar.b;
            if (!z || obj != null) {
                sbAppend.append(str);
                str = ", ";
                if (dvgVar.a != null) {
                    sbAppend.append(dvgVar.a).append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sbAppend.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                } else {
                    sbAppend.append(obj);
                }
            }
        }
        return sbAppend.append('}').toString();
    }

    public final dvg a() {
        dvg dvgVar = new dvg();
        this.d.c = dvgVar;
        this.d = dvgVar;
        return dvgVar;
    }

    public final dvf a(String str, Object obj) {
        dvg dvgVarA = a();
        dvgVarA.b = obj;
        dvgVarA.a = (String) dvl.a(str);
        return this;
    }
}
