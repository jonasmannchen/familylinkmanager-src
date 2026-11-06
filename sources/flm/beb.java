package flm;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class beb {
    private final String a;
    private final String b;

    /* JADX WARN: Illegal instructions before constructor call */
    public beb(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(bdp.WHITELIST_DELIMITER);
                }
                sb.append(str2);
            }
            sb.append(']').append(' ');
            string = sb.toString();
        }
        this(str, string);
    }

    private beb(String str, String str2) {
        this.b = str2;
        this.a = str;
        new bca(str);
    }

    public final void a(String str, Object... objArr) {
        Log.w(this.a, b(str, objArr));
    }

    public final String b(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }
}
