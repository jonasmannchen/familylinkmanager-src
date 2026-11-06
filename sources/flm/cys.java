package flm;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cys {
    public static final cys a = new cys();
    private Pattern[] b = new Pattern[0];
    private String[] c = new String[0];

    private cys() {
    }

    public final synchronized void a(String[] strArr, String[] strArr2) {
        synchronized (this) {
            bdi.checkArgument(strArr.length == strArr2.length);
            this.b = new Pattern[strArr.length];
            this.c = strArr2;
            for (int i = 0; i < strArr.length; i++) {
                this.b[i] = Pattern.compile(strArr[i]);
            }
        }
    }

    public final synchronized String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            int i = 0;
            while (true) {
                int i2 = i;
                str2 = str;
                if (i2 >= this.b.length) {
                    break;
                }
                str = this.b[i2].matcher(str2).replaceAll(this.c[i2]);
                i = i2 + 1;
            }
        }
        return str2;
    }
}
