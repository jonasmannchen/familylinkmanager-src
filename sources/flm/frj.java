package flm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frj {
    public static final frj a = new frj();
    public fsl b;
    public Executor c;
    public String d;
    public frh e;
    public String f;
    public List g;
    public boolean h;
    public Integer i;
    public Integer j;
    private Object[][] k;

    public final frj a(String str) {
        frj frjVar = new frj(this);
        frjVar.f = str;
        return frjVar;
    }

    public final frj a(fsl fslVar) {
        frj frjVar = new frj(this);
        frjVar.b = fslVar;
        return frjVar;
    }

    public final frj a(fru fruVar) {
        frj frjVar = new frj(this);
        ArrayList arrayList = new ArrayList(this.g.size() + 1);
        arrayList.addAll(this.g);
        arrayList.add(fruVar);
        frjVar.g = Collections.unmodifiableList(arrayList);
        return frjVar;
    }

    public final frj a(frk frkVar, Object obj) {
        int i;
        dvl.a(frkVar, "key");
        dvl.a(obj, "value");
        frj frjVar = new frj(this);
        int i2 = 0;
        while (true) {
            if (i2 >= this.k.length) {
                i = -1;
                break;
            }
            if (frkVar.equals(this.k[i2][0])) {
                i = i2;
                break;
            }
            i2++;
        }
        frjVar.k = (Object[][]) Array.newInstance((Class<?>) Object.class, (i == -1 ? 1 : 0) + this.k.length, 2);
        System.arraycopy(this.k, 0, frjVar.k, 0, this.k.length);
        if (i == -1) {
            frjVar.k[this.k.length] = new Object[]{frkVar, obj};
        } else {
            frjVar.k[i][1] = obj;
        }
        return frjVar;
    }

    public final Object a(frk frkVar) {
        dvl.a(frkVar, "key");
        for (int i = 0; i < this.k.length; i++) {
            if (frkVar.equals(this.k[i][0])) {
                return this.k[i][1];
            }
        }
        return frkVar.a;
    }

    private frj() {
        this.k = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        this.g = Collections.emptyList();
    }

    public final frj a(int i) {
        dvl.a(i >= 0, "invalid maxsize %s", i);
        frj frjVar = new frj(this);
        frjVar.i = Integer.valueOf(i);
        return frjVar;
    }

    public final frj b(int i) {
        dvl.a(i >= 0, "invalid maxsize %s", i);
        frj frjVar = new frj(this);
        frjVar.j = Integer.valueOf(i);
        return frjVar;
    }

    public frj(frj frjVar) {
        this.k = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        this.g = Collections.emptyList();
        this.b = frjVar.b;
        this.d = frjVar.d;
        this.e = frjVar.e;
        this.c = frjVar.c;
        this.f = frjVar.f;
        this.k = frjVar.k;
        this.h = frjVar.h;
        this.i = frjVar.i;
        this.j = frjVar.j;
        this.g = frjVar.g;
    }

    public final String toString() {
        return dve.a(this).a("deadline", this.b).a("authority", this.d).a("callCredentials", this.e).a("executor", this.c != null ? this.c.getClass() : null).a("compressorName", this.f).a("customOptions", Arrays.deepToString(this.k)).a("waitForReady", this.h).a("maxInboundMessageSize", this.i).a("maxOutboundMessageSize", this.j).a("streamTracerFactories", this.g).toString();
    }
}
