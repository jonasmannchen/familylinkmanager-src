package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dxt {
    public Object[] a;
    public int b;
    public boolean c;

    public dxt() {
        this(4);
    }

    dxt(int i) {
        this.a = new Object[i * 2];
        this.b = 0;
        this.c = false;
    }

    public dxt a(Object obj, Object obj2) {
        int i = this.b + 1;
        if ((i << 1) > this.a.length) {
            this.a = Arrays.copyOf(this.a, dxk.a(this.a.length, i << 1));
            this.c = false;
        }
        dwq.a(obj, obj2);
        this.a[this.b * 2] = obj;
        this.a[(this.b * 2) + 1] = obj2;
        this.b++;
        return this;
    }

    public dxs a() {
        this.c = true;
        return dzv.a(this.b, this.a);
    }
}
