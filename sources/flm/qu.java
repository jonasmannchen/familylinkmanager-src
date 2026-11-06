package flm;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qu {
    public static final sb a = new sb(16);
    private static final rc d = new rc("fonts", 10, 10000);
    public static final Object b = new Object();
    public static final so c = new so();
    private static final Comparator e = new qy();

    static rb a(Context context, qt qtVar, int i) throws Throwable {
        List listA;
        ProviderInfo providerInfo;
        qz qzVar;
        boolean z;
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String str = qtVar.a;
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(qtVar.b)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + qtVar.b);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, e);
            if (qtVar.d != null) {
                listA = qtVar.d;
            } else {
                listA = pb.a(resources, 0);
            }
            int i2 = 0;
            while (true) {
                if (i2 >= listA.size()) {
                    providerInfo = null;
                    break;
                }
                ArrayList arrayList2 = new ArrayList((Collection) listA.get(i2));
                Collections.sort(arrayList2, e);
                if (arrayList.size() == arrayList2.size()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            z = true;
                            break;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                            z = false;
                            break;
                        }
                        i3++;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    providerInfo = providerInfoResolveContentProvider;
                    break;
                }
                i2++;
            }
            if (providerInfo == null) {
                qzVar = new qz(1, null);
            } else {
                qzVar = new qz(0, a(context, qtVar, providerInfo.authority, null));
            }
            if (qzVar.a == 0) {
                Typeface typefaceA = ps.a.a(context, (CancellationSignal) null, qzVar.b, i);
                return new rb(typefaceA, typefaceA != null ? 0 : -3);
            }
            return new rb(null, qzVar.a == 1 ? -2 : -3);
        } catch (PackageManager.NameNotFoundException e2) {
            return new rb(null, -1);
        }
    }

    public static Typeface a(Context context, qt qtVar, pk pkVar, Handler handler, boolean z, int i, int i2) throws Throwable {
        String str = qtVar.e + "-" + i2;
        Typeface typeface = (Typeface) a.get(str);
        if (typeface != null) {
            if (pkVar != null) {
                pkVar.a(typeface);
            }
            return typeface;
        }
        if (z && i == -1) {
            rb rbVarA = a(context, qtVar, i2);
            if (pkVar != null) {
                if (rbVarA.b == 0) {
                    pkVar.a(rbVarA.a, handler);
                } else {
                    pkVar.a(rbVarA.b, handler);
                }
            }
            return rbVarA.a;
        }
        qv qvVar = new qv(context, qtVar, i2, str);
        if (z) {
            try {
                return ((rb) d.a(qvVar, i)).a;
            } catch (InterruptedException e2) {
                return null;
            }
        }
        qw qwVar = pkVar == null ? null : new qw(pkVar, handler);
        synchronized (b) {
            if (c.containsKey(str)) {
                if (qwVar != null) {
                    ((ArrayList) c.get(str)).add(qwVar);
                }
                return null;
            }
            if (qwVar != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(qwVar);
                c.put(str, arrayList);
            }
            rc rcVar = d;
            rcVar.a(new re(rcVar, qvVar, new Handler(), new qx(str)));
            return null;
        }
    }

    public static Map a(Context context, ra[] raVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (ra raVar : raVarArr) {
            if (raVar.e == 0) {
                Uri uri = raVar.a;
                if (!map.containsKey(uri)) {
                    map.put(uri, qb.a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    private static ra[] a(Context context, qt qtVar, String str, CancellationSignal cancellationSignal) throws Throwable {
        Cursor cursor;
        ArrayList arrayList;
        Uri uriWithAppendedId;
        ArrayList arrayList2 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        try {
            Cursor cursorQuery = context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{qtVar.c}, null, cancellationSignal);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            int i2 = columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0;
                            if (columnIndex3 == -1) {
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2));
                            } else {
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                            }
                            arrayList.add(new ra(uriWithAppendedId, i2, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } else {
                arrayList = arrayList2;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return (ra[]) arrayList.toArray(new ra[0]);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }
}
