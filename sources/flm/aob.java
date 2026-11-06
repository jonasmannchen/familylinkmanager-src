package flm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aob {
    public final Context b;
    public final String c;
    public final int d;
    public String e;
    public int f;
    public String g;
    public String h;
    public final boolean i;
    public fnk j;
    public final aok k;
    public final big l;
    public aoj m;
    public final aoh n;
    public final List p;
    private static final atf q = new atf();
    private static final asx r = new aoe();

    @Deprecated
    public static final asw a = new asw("ClearcutLogger.API", r, q);
    private static final cyt[] s = new cyt[0];
    private static final String[] t = new String[0];
    private static final byte[][] u = new byte[0][];
    private static final cza[] v = new cza[0];
    public static final List o = new CopyOnWriteArrayList();

    public aob(Context context, String str, String str2) {
        this(context, -1, str, null, null, false, new ape(context), bij.a, null, new apo(context));
    }

    private aob(Context context, int i, String str, String str2, String str3, boolean z, aok aokVar, big bigVar, aoj aojVar, aoh aohVar) {
        this.f = -1;
        this.j = fnk.DEFAULT;
        this.p = new CopyOnWriteArrayList();
        this.b = context.getApplicationContext();
        this.c = context.getPackageName();
        this.d = a(context);
        this.f = -1;
        this.e = str;
        this.g = str2;
        this.h = null;
        this.i = false;
        this.k = aokVar;
        this.l = bigVar;
        this.m = new aoj();
        this.j = fnk.DEFAULT;
        this.n = aohVar;
    }

    private static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
            return 0;
        }
    }

    public final aob a(fnk fnkVar) {
        if (fnkVar == null) {
            fnkVar = fnk.DEFAULT;
        }
        this.j = fnkVar;
        return this;
    }

    public final aog a(final fnb fnbVar) {
        return new aog(this, new aoi(fnbVar) { // from class: flm.aoc
            private final fnb a;

            {
                this.a = fnbVar;
            }

            @Override // flm.aoi
            public final byte[] a() {
                return fnb.a(this.a);
            }
        });
    }

    public final aog a(final fke fkeVar) {
        return new aog(this, new aoi(fkeVar) { // from class: flm.aod
            private final fke a;

            {
                this.a = fkeVar;
            }

            @Override // flm.aoi
            public final byte[] a() {
                return this.a.b();
            }
        });
    }

    public final aog a(byte[] bArr) {
        return new aog(this, bArr);
    }

    public static int[] a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            iArr[i2] = ((Integer) obj).intValue();
            i2++;
        }
        return iArr;
    }

    static String a(Iterable iterable) {
        return iterable == null ? "null" : dvd.a(", ").a(iterable);
    }

    static List a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Arrays.toString((byte[]) it.next()));
        }
        return arrayList;
    }
}
