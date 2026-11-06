package flm;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cw {
    private final String a;
    private final Map b;
    private final Set c;
    private final Set d;

    public cw(String str, Map map, Set set, Set set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cw cwVar = (cw) obj;
        if (this.a == null ? cwVar.a != null : !this.a.equals(cwVar.a)) {
            return false;
        }
        if (this.b == null ? cwVar.b != null : !this.b.equals(cwVar.b)) {
            return false;
        }
        if (this.c == null ? cwVar.c != null : !this.c.equals(cwVar.c)) {
            return false;
        }
        if (this.d == null || cwVar.d == null) {
            return true;
        }
        return this.d.equals(cwVar.d);
    }

    public final int hashCode() {
        return (((this.b != null ? this.b.hashCode() : 0) + ((this.a != null ? this.a.hashCode() : 0) * 31)) * 31) + (this.c != null ? this.c.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }

    public static cw a(bo boVar, String str) {
        return new cw(str, c(boVar, str), b(boVar, str), d(boVar, str));
    }

    private static Set b(bo boVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorB = boVar.b("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorB.getColumnIndex(bbz.MARKET_URI_PARAM_ID);
            int columnIndex2 = cursorB.getColumnIndex("seq");
            int columnIndex3 = cursorB.getColumnIndex("table");
            int columnIndex4 = cursorB.getColumnIndex("on_delete");
            int columnIndex5 = cursorB.getColumnIndex("on_update");
            int columnIndex6 = cursorB.getColumnIndex(bbz.MARKET_URI_PARAM_ID);
            int columnIndex7 = cursorB.getColumnIndex("seq");
            int columnIndex8 = cursorB.getColumnIndex("from");
            int columnIndex9 = cursorB.getColumnIndex("to");
            int count = cursorB.getCount();
            ArrayList<cz> arrayList = new ArrayList();
            for (int i = 0; i < count; i++) {
                cursorB.moveToPosition(i);
                arrayList.add(new cz(cursorB.getInt(columnIndex6), cursorB.getInt(columnIndex7), cursorB.getString(columnIndex8), cursorB.getString(columnIndex9)));
            }
            Collections.sort(arrayList);
            int count2 = cursorB.getCount();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < count2) {
                    cursorB.moveToPosition(i3);
                    if (cursorB.getInt(columnIndex2) == 0) {
                        int i4 = cursorB.getInt(columnIndex);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (cz czVar : arrayList) {
                            if (czVar.a == i4) {
                                arrayList2.add(czVar.b);
                                arrayList3.add(czVar.c);
                            }
                        }
                        hashSet.add(new cy(cursorB.getString(columnIndex3), cursorB.getString(columnIndex4), cursorB.getString(columnIndex5), arrayList2, arrayList3));
                    }
                    i2 = i3 + 1;
                } else {
                    return hashSet;
                }
            }
        } finally {
            cursorB.close();
        }
    }

    private static Map c(bo boVar, String str) {
        Cursor cursorB = boVar.b("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorB.getColumnCount() > 0) {
                int columnIndex = cursorB.getColumnIndex("name");
                int columnIndex2 = cursorB.getColumnIndex("type");
                int columnIndex3 = cursorB.getColumnIndex("notnull");
                int columnIndex4 = cursorB.getColumnIndex("pk");
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(columnIndex);
                    map.put(string, new cx(string, cursorB.getString(columnIndex2), cursorB.getInt(columnIndex3) != 0, cursorB.getInt(columnIndex4)));
                }
            }
            return map;
        } finally {
            cursorB.close();
        }
    }

    private static Set d(bo boVar, String str) {
        Cursor cursorB = boVar.b("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorB.getColumnIndex("name");
            int columnIndex2 = cursorB.getColumnIndex("origin");
            int columnIndex3 = cursorB.getColumnIndex("unique");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                cursorB.close();
                return null;
            }
            HashSet hashSet = new HashSet();
            while (cursorB.moveToNext()) {
                if ("c".equals(cursorB.getString(columnIndex2))) {
                    da daVarA = a(boVar, cursorB.getString(columnIndex), cursorB.getInt(columnIndex3) == 1);
                    if (daVarA == null) {
                        cursorB.close();
                        return null;
                    }
                    hashSet.add(daVarA);
                }
            }
            cursorB.close();
            return hashSet;
        } catch (Throwable th) {
            cursorB.close();
            throw th;
        }
    }

    private static da a(bo boVar, String str, boolean z) {
        Cursor cursorB = boVar.b("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorB.getColumnIndex("seqno");
            int columnIndex2 = cursorB.getColumnIndex("cid");
            int columnIndex3 = cursorB.getColumnIndex("name");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                return null;
            }
            TreeMap treeMap = new TreeMap();
            while (cursorB.moveToNext()) {
                if (cursorB.getInt(columnIndex2) >= 0) {
                    treeMap.put(Integer.valueOf(cursorB.getInt(columnIndex)), cursorB.getString(columnIndex3));
                }
            }
            ArrayList arrayList = new ArrayList(treeMap.size());
            arrayList.addAll(treeMap.values());
            return new da(str, z, arrayList);
        } finally {
            cursorB.close();
        }
    }
}
