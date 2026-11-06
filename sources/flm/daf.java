package flm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class daf {
    public static ScheduledExecutorService l;
    public final PowerManager.WakeLock b;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final Context j;
    private WorkSource q;
    private String r;
    private int u;
    private static final long n = TimeUnit.DAYS.toMillis(366);
    public static volatile dai m = new dag();
    public final Object a = this;
    public int c = 0;
    private final Map o = new HashMap();
    public final Set d = new HashSet();
    private boolean p = true;
    public big e = bij.a;
    private final Map s = new HashMap();
    private final Set t = Collections.synchronizedSet(new HashSet());
    public AtomicInteger k = new AtomicInteger(0);

    @SuppressLint({"UnwrappedWakeLock"})
    public daf(Context context, int i, String str, String str2, String str3, String str4) {
        bdi.checkNotNull(context, "WakeLock: context must not be null");
        bdi.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.f = 1;
        this.h = null;
        this.i = str4;
        this.j = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.g = str;
        } else {
            String strValueOf = String.valueOf("*gcore*:");
            String strValueOf2 = String.valueOf(str);
            this.g = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        }
        this.b = ((PowerManager) context.getSystemService("power")).newWakeLock(1, str);
        if (bjd.a(context)) {
            if (biy.b(str3)) {
                if (bav.IS_PACKAGE_SIDE && azl.a()) {
                    Log.w("WakeLock", new StringBuilder(String.valueOf(str).length() + 57).append("callingPackage is not supposed to be empty for wakelock ").append(str).append("!").toString(), new IllegalArgumentException());
                    str3 = "com.google.android.gms";
                } else {
                    str3 = context.getPackageName();
                }
            }
            this.q = bjd.a(context, str3);
            WorkSource workSource = this.q;
            if (workSource != null && bjd.a(this.j)) {
                if (this.q != null) {
                    this.q.add(workSource);
                } else {
                    this.q = workSource;
                }
                a(this.q);
            }
        }
        if (l == null) {
            l = bfc.a().a();
        }
    }

    final List a() {
        List listA = bjd.a(this.q);
        if (this.r != null) {
            ArrayList arrayList = new ArrayList(listA);
            arrayList.add(this.r);
            return arrayList;
        }
        return listA;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a A[Catch: all -> 0x006a, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:14:0x0022, B:15:0x0043, B:19:0x0049, B:21:0x0051, B:22:0x0058, B:10:0x001a, B:12:0x001e), top: B:26:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0022 A[Catch: all -> 0x006a, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:14:0x0022, B:15:0x0043, B:19:0x0049, B:21:0x0051, B:22:0x0058, B:10:0x001a, B:12:0x001e), top: B:26:0x0009 }] */
    public final void a(String str, int i) {
        boolean z;
        String strA = a(str);
        synchronized (this.a) {
            if (this.p) {
                Integer[] numArr = (Integer[]) this.s.get(strA);
                if (numArr == null) {
                    z = false;
                } else if (numArr[0].intValue() == 1) {
                    this.s.remove(strA);
                    z = true;
                } else {
                    numArr[0] = Integer.valueOf(numArr[0].intValue() - 1);
                    z = false;
                }
                if (z) {
                    bgl bglVar = bgl.a;
                    bgl.a(this.j, bgj.a(this.b, strA), 8, this.g, strA, this.i, this.f, a(), 0L);
                    this.u--;
                } else if (!this.p) {
                    bgl bglVar2 = bgl.a;
                    bgl.a(this.j, bgj.a(this.b, strA), 8, this.g, strA, this.i, this.f, a(), 0L);
                    this.u--;
                }
            } else if (!this.p && this.u == 1) {
                bgl bglVar3 = bgl.a;
                bgl.a(this.j, bgj.a(this.b, strA), 8, this.g, strA, this.i, this.f, a(), 0L);
                this.u--;
            }
        }
        a(i);
    }

    final void a(int i) {
        if (this.b.isHeld()) {
            try {
                if (i > 0) {
                    this.b.release(i);
                } else {
                    this.b.release();
                }
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.g).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            if (!this.b.isHeld()) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[Catch: all -> 0x007f, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0011, B:11:0x0025, B:13:0x0029, B:15:0x0033, B:21:0x004e, B:22:0x006b, B:24:0x006d, B:17:0x0046, B:19:0x004a, B:8:0x0015, B:10:0x001d), top: B:28:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x004e A[Catch: all -> 0x007f, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0011, B:11:0x0025, B:13:0x0029, B:15:0x0033, B:21:0x004e, B:22:0x006b, B:24:0x006d, B:17:0x0046, B:19:0x004a, B:8:0x0015, B:10:0x001d), top: B:28:0x0009 }] */
    public final void a(String str, long j) {
        boolean z;
        String strA = a(str);
        synchronized (this.a) {
            if ((!this.s.isEmpty() || this.u > 0) && !this.b.isHeld()) {
                this.s.clear();
                this.u = 0;
            }
            if (this.p) {
                Integer[] numArr = (Integer[]) this.s.get(strA);
                if (numArr == null) {
                    this.s.put(strA, new Integer[]{1});
                    z = true;
                } else {
                    numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                    z = false;
                }
                if (z) {
                    bgl.a(this.j, bgj.a(this.b, strA), 7, this.g, strA, this.i, this.f, a(), j);
                    this.u++;
                } else if (!this.p) {
                    bgl.a(this.j, bgj.a(this.b, strA), 7, this.g, strA, this.i, this.f, a(), j);
                    this.u++;
                }
            } else if (!this.p && this.u == 0) {
                bgl.a(this.j, bgj.a(this.b, strA), 7, this.g, strA, this.i, this.f, a(), j);
                this.u++;
            }
        }
    }

    private final String a(String str) {
        return (!this.p || TextUtils.isEmpty(str)) ? this.h : str;
    }

    private final void a(WorkSource workSource) {
        try {
            this.b.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }
}
