package flm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class drf {
    private final drn e;
    private final String f;
    private final Object g;
    private volatile int h = -1;
    private volatile Object i;
    private static final Object b = new Object();

    @SuppressLint({"StaticFieldLeak"})
    private static Context c = null;
    private static boolean d = false;
    public static final AtomicInteger a = new AtomicInteger();

    public static void a(Context context) {
        synchronized (b) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (c != context) {
                synchronized (dqu.class) {
                    dqu.a.clear();
                }
                synchronized (dro.class) {
                    dro.a.clear();
                }
                synchronized (drb.class) {
                    drb.a = null;
                }
                a.incrementAndGet();
                c = context;
            }
        }
    }

    abstract Object a(Object obj);

    public static void b(Context context) {
        if (c == null) {
            a(context);
        }
    }

    drf(drn drnVar, String str, Object obj) {
        if (drnVar.a == null && drnVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (drnVar.a != null && drnVar.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.e = drnVar;
        this.f = str;
        this.g = obj;
    }

    private final String a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f;
        }
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(this.f);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    public final String a() {
        return a(this.e.d);
    }

    public final Object b() {
        Object objC;
        int i = a.get();
        if (this.h < i) {
            synchronized (this) {
                if (this.h < i) {
                    if (c == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    if (!this.e.f ? !((objC = c()) != null || (objC = d()) != null) : !((objC = d()) != null || (objC = c()) != null)) {
                        objC = this.g;
                    }
                    this.i = objC;
                    this.h = i;
                }
            }
        }
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    private final Object c() {
        boolean z;
        dqy dqyVarA;
        Object objA;
        if (this.e.g) {
            z = false;
        } else {
            String str = (String) drb.a(c).a("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
            if (str != null && dfc.b.matcher(str).matches()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            if (this.e.b != null) {
                dqyVarA = dqu.a(c.getContentResolver(), this.e.b);
            } else {
                dqyVarA = dro.a(c, this.e.a);
            }
            if (dqyVarA != null && (objA = dqyVarA.a(a())) != null) {
                return a(objA);
            }
        } else {
            String strValueOf = String.valueOf(a());
            Log.w("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new String("Bypass reading Phenotype values for flag: "));
        }
        return null;
    }

    private final Object d() {
        if (this.e.e) {
            return null;
        }
        Object objA = drb.a(c).a(this.e.e ? null : a(this.e.c));
        if (objA != null) {
            return a(objA);
        }
        return null;
    }

    public static drf a(drn drnVar, String str, long j) {
        return new drg(drnVar, str, Long.valueOf(j));
    }

    public static drf a(drn drnVar, String str, int i) {
        return new drh(drnVar, str, Integer.valueOf(i));
    }

    public static drf a(drn drnVar, String str, boolean z) {
        return new dri(drnVar, str, Boolean.valueOf(z));
    }

    static drf a(drn drnVar, String str, double d2) {
        return new drj(drnVar, str, Double.valueOf(d2));
    }

    public static drf a(drn drnVar, String str, String str2) {
        return new drk(drnVar, str, str2);
    }

    public static drf a(drn drnVar, String str, Object obj, drm drmVar) {
        return new drl(drnVar, str, obj, drmVar);
    }
}
