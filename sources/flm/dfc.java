package flm;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dfc {
    private static HashMap f;
    private static Object k;
    private static boolean l;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri e = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean d = new AtomicBoolean();
    private static final HashMap g = new HashMap();
    private static final HashMap h = new HashMap();
    private static final HashMap i = new HashMap();
    private static final HashMap j = new HashMap();
    private static String[] m = new String[0];

    private static void a(ContentResolver contentResolver) {
        if (f == null) {
            d.set(false);
            f = new HashMap();
            k = new Object();
            l = false;
            contentResolver.registerContentObserver(a, true, new dfd(null));
            return;
        }
        if (d.getAndSet(false)) {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            k = new Object();
            l = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0057 A[Catch: all -> 0x0054, DONT_GENERATE, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0006, B:6:0x0013, B:9:0x001e, B:11:0x0020, B:13:0x0026, B:15:0x002e, B:17:0x0032, B:29:0x0057, B:19:0x003a, B:21:0x0047, B:24:0x0052, B:31:0x0059, B:32:0x005c), top: B:57:0x0006 }] */
    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (dfc.class) {
            a(contentResolver);
            Object obj = k;
            if (f.containsKey(str)) {
                String str3 = (String) f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                for (String str4 : m) {
                    if (str.startsWith(str4)) {
                        if (!l || f.isEmpty()) {
                            c(contentResolver, m);
                            if (f.containsKey(str)) {
                                String str5 = (String) f.get(str);
                                if (str5 != null) {
                                    str2 = str5;
                                }
                            }
                        }
                    }
                }
                Cursor cursorQuery = contentResolver.query(a, null, null, new String[]{str}, null);
                if (cursorQuery == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            a(obj, str, (String) null);
                        } else {
                            String string = cursorQuery.getString(1);
                            if (string != null && string.equals(str2)) {
                                string = str2;
                            }
                            a(obj, str, string);
                            if (string != null) {
                                str2 = string;
                            }
                        }
                    } finally {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
            }
        }
        return str2;
    }

    private static void a(Object obj, String str, String str2) {
        synchronized (dfc.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }

    public static int a(ContentResolver contentResolver, String str, int i2) {
        Object objB = b(contentResolver);
        Integer numValueOf = (Integer) a(h, str, Integer.valueOf(i2));
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        String strA = a(contentResolver, str, (String) null);
        if (strA != null) {
            try {
                int i3 = Integer.parseInt(strA);
                numValueOf = Integer.valueOf(i3);
                i2 = i3;
            } catch (NumberFormatException e2) {
            }
        }
        a(objB, h, str, numValueOf);
        return i2;
    }

    public static long a(ContentResolver contentResolver, String str, long j2) {
        Object objB = b(contentResolver);
        Long lValueOf = (Long) a(i, str, Long.valueOf(j2));
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        String strA = a(contentResolver, str, (String) null);
        if (strA != null) {
            try {
                long j3 = Long.parseLong(strA);
                lValueOf = Long.valueOf(j3);
                j2 = j3;
            } catch (NumberFormatException e2) {
            }
        }
        a(objB, i, str, lValueOf);
        return j2;
    }

    public static boolean a(ContentResolver contentResolver, String str, boolean z) {
        Object objB = b(contentResolver);
        Boolean bool = (Boolean) a(g, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String strA = a(contentResolver, str, (String) null);
        if (strA != null && !strA.equals("")) {
            if (b.matcher(strA).matches()) {
                bool = true;
                z = true;
            } else if (c.matcher(strA).matches()) {
                bool = false;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + strA + "\") as boolean");
            }
        }
        a(objB, g, str, bool);
        return z;
    }

    private static Map b(ContentResolver contentResolver, String... strArr) {
        Cursor cursorQuery = contentResolver.query(e, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
        }
        return treeMap;
    }

    public static void a(ContentResolver contentResolver, String... strArr) {
        String[] strArr2;
        if (strArr.length != 0) {
            synchronized (dfc.class) {
                a(contentResolver);
                HashSet hashSet = new HashSet((((m.length + strArr.length) << 2) / 3) + 1);
                hashSet.addAll(Arrays.asList(m));
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (hashSet.add(str)) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.isEmpty()) {
                    strArr2 = new String[0];
                } else {
                    m = (String[]) hashSet.toArray(new String[hashSet.size()]);
                    strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (!l || f.isEmpty()) {
                    c(contentResolver, m);
                } else if (strArr2.length != 0) {
                    c(contentResolver, strArr2);
                }
            }
        }
    }

    private static void c(ContentResolver contentResolver, String[] strArr) {
        f.putAll(b(contentResolver, strArr));
        l = true;
    }

    private static Object b(ContentResolver contentResolver) {
        Object obj;
        synchronized (dfc.class) {
            a(contentResolver);
            obj = k;
        }
        return obj;
    }

    private static Object a(HashMap map, String str, Object obj) {
        synchronized (dfc.class) {
            if (map.containsKey(str)) {
                Object obj2 = map.get(str);
                if (obj2 == null) {
                    obj2 = obj;
                }
                return obj2;
            }
            return null;
        }
    }

    private static void a(Object obj, HashMap map, String str, Object obj2) {
        synchronized (dfc.class) {
            if (obj == k) {
                map.put(str, obj2);
                f.remove(str);
            }
        }
    }
}
