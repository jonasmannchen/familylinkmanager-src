package flm;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class buh {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public buh(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        str2 = TextUtils.isEmpty(str3) || "null".equals(str3) ? str2 : str3;
        this.c = str2.contains("@") ? str2.substring(0, str2.indexOf(64)) : str2;
        this.d = TextUtils.isEmpty(str4) || "null".equals(str4) ? this.c : str4;
        this.e = str5;
    }
}
