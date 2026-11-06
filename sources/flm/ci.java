package flm;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ci {
    public static final String[] a = {"UPDATE", "DELETE", "INSERT"};
    public String[] b;
    public long[] c;
    public final cn f;
    public volatile bw i;
    public cl j;
    public Object[] d = new Object[1];
    public long e = 0;
    public AtomicBoolean g = new AtomicBoolean(false);
    public volatile boolean h = false;
    public final g k = new g();
    public Runnable l = new cj(this);
    public Runnable m = new ck(this);
    private rt n = new rt();

    public ci(cn cnVar, String... strArr) {
        this.f = cnVar;
        this.j = new cl(strArr.length);
        int length = strArr.length;
        this.b = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.n.put(lowerCase, Integer.valueOf(i));
            this.b[i] = lowerCase;
        }
        this.c = new long[strArr.length];
        Arrays.fill(this.c, 0L);
    }

    static void a(StringBuilder sb, String str, String str2) {
        sb.append("`room_table_modification_trigger_").append(str).append("_").append(str2).append("`");
    }
}
